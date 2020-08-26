package typings.winrtUwp.Windows.Media.Import

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a sidecar file or a sibling file to a PhotoImportItem . */
@js.native
trait PhotoImportSidecar extends js.Object {
  /** Gets the date of the sidecar or sibling file. */
  var date: Date = js.native
  /** Gets the name of the sidecar or sibling file. */
  var name: String = js.native
  /** Gets the size of the sidecar or sibling file, in bytes. */
  var sizeInBytes: Double = js.native
}

object PhotoImportSidecar {
  @scala.inline
  def apply(date: Date, name: String, sizeInBytes: Double): PhotoImportSidecar = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sizeInBytes = sizeInBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoImportSidecar]
  }
  @scala.inline
  implicit class PhotoImportSidecarOps[Self <: PhotoImportSidecar] (val x: Self) extends AnyVal {
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
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizeInBytes(value: Double): Self = this.set("sizeInBytes", value.asInstanceOf[js.Any])
  }
  
}

