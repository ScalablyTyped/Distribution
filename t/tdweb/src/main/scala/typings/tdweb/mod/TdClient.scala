package typings.tdweb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait TdClient extends js.Object {
  
  /**
    * Send a query to TDLib.
    * If the query contains the field '@extra', the same field will be added into the result.
    * @link https://github.com/tdlib/td/blob/master/td/generate/scheme/td_api.tl - td_api.tl scheme
    * @link https://core.telegram.org/tdlib/docs/td__api_8h.html - HTML documentation
    * @link https://core.telegram.org/tdlib/docs/classtd_1_1td__api_1_1_function.html - a list of all available TDLib methods
    * @link https://core.telegram.org/tdlib/docs/classtd_1_1td__api_1_1_object.html - a list of all available TDLib classes
    */
  def send(query: TdObject): js.Promise[TdError | TdObject] = js.native
}
object TdClient {
  
  @scala.inline
  def apply(send: TdObject => js.Promise[TdError | TdObject]): TdClient = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[TdClient]
  }
  
  @scala.inline
  implicit class TdClientOps[Self <: TdClient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSend(value: TdObject => js.Promise[TdError | TdObject]): Self = this.set("send", js.Any.fromFunction1(value))
  }
}
