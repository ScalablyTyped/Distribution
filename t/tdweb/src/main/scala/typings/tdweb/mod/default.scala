package typings.tdweb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TDLib in a browser
  *
  * TDLib can be compiled to WebAssembly or asm.js using Emscripten compiler and used in a browser from JavaScript.
  * This is a convenient wrapper for TDLib in a browser which controls TDLib instance creation, handles interaction
  * with TDLib and manages a filesystem for persistent TDLib data.
  * TDLib instance is created in a Web Worker to run it in a separate thread.
  * TdClient just sends queries to the Web Worker and receives updates and results from it.
  *
  *
  * Differences from the TDLib JSON API:
  * 1. Added the update `updateFatalError error:string = Update;` which is sent whenever TDLib encounters a fatal error.
  * 2. Added the method `setJsLogVerbosityLevel new_verbosity_level:string = Ok;`,
  * which allows to change the verbosity level of tdweb logging.
  * 3. Added the possibility to use blobs as input files via the constructor `inputFileBlob data:<JavaScript blob> = InputFile;`.
  * 4. The class `filePart` contains data as a JavaScript blob instead of a base64-encoded string.
  * 5. The method `readFilePart` supports only `offset == count == 0`.
  * 6. The methods `getStorageStatistics`, `getStorageStatisticsFast`, `optimizeStorage`, `addProxy` and
  * `getFileDownloadedPrefixSize` are not supported.
  */
@JSImport("tdweb", JSImport.Default)
@js.native
class default protected () extends TdClient {
  /**
    * Create TdClient.
    */
  def this(options: TdOptions) = this()
  /**
    * Send a query to TDLib.
    * If the query contains the field '@extra', the same field will be added into the result.
    * @link https://github.com/tdlib/td/blob/master/td/generate/scheme/td_api.tl - td_api.tl scheme
    * @link https://core.telegram.org/tdlib/docs/td__api_8h.html - HTML documentation
    * @link https://core.telegram.org/tdlib/docs/classtd_1_1td__api_1_1_function.html - a list of all available TDLib methods
    * @link https://core.telegram.org/tdlib/docs/classtd_1_1td__api_1_1_object.html - a list of all available TDLib classes
    */
  /* CompleteClass */
  override def send(query: TdObject): js.Promise[TdError | TdObject] = js.native
}

