package typings.tusDashJsDashClient.tusDashJsDashClientMod

import typings.std.Blob
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tus-js-client", "Upload")
@js.native
class Upload protected () extends js.Object {
  def this(file: Blob, options: UploadOptions) = this()
  def this(file: File, options: UploadOptions) = this()
  var file: File | Blob = js.native
  var options: UploadOptions = js.native
  var url: String | Null = js.native
  def abort(): Unit = js.native
  def start(): Unit = js.native
}

