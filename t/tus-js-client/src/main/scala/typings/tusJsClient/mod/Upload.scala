package typings.tusJsClient.mod

import typings.std.Blob
import typings.std.File
import typings.tusJsClient.anon.PickReadableStreamDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tus-js-client", "Upload")
@js.native
class Upload protected () extends js.Object {
  def this(file: Blob, options: UploadOptions) = this()
  def this(file: File, options: UploadOptions) = this()
  def this(file: PickReadableStreamDefault, options: UploadOptions) = this()
  
  def abort(): js.Promise[Unit] = js.native
  def abort(shouldTerminate: Boolean): js.Promise[Unit] = js.native
  
  var file: File | Blob | PickReadableStreamDefault = js.native
  
  def findPreviousUploads(): js.Promise[js.Array[PreviousUpload]] = js.native
  
  var options: UploadOptions = js.native
  
  def resumeFromPreviousUpload(previousUpload: PreviousUpload): Unit = js.native
  
  def start(): Unit = js.native
  
  var url: String | Null = js.native
}
/* static members */
@JSImport("tus-js-client", "Upload")
@js.native
object Upload extends js.Object {
  
  def terminate(url: String): js.Promise[Unit] = js.native
  def terminate(url: String, options: UploadOptions): js.Promise[Unit] = js.native
}
