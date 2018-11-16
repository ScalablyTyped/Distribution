package typings
package tusDashJsDashClientLib.tusDashJsDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tus-js-client", "Upload")
@js.native
class Upload protected () extends js.Object {
  def this(file: stdLib.Blob, options: UploadOptions) = this()
  def this(file: stdLib.File, options: UploadOptions) = this()
  var file: stdLib.File | stdLib.Blob = js.native
  var options: UploadOptions = js.native
  var url: java.lang.String | scala.Null = js.native
  def abort(): scala.Unit = js.native
  def start(): scala.Unit = js.native
}

