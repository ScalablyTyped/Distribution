package typings.webgme.global

import typings.webgme.Blobs.BlobClientParamters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Blobs")
@js.native
object Blobs extends js.Object {
  @js.native
  class BlobClient protected ()
    extends typings.webgme.Blobs.BlobClient {
    /**
      * @param paramters
      */
    def this(parameters: BlobClientParamters) = this()
  }
  
}

