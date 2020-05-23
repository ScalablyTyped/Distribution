package typings.winrtUwp.Windows.Media.Import

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a sidecar file or a sibling file to a PhotoImportItem . */
trait PhotoImportSidecar extends js.Object {
  /** Gets the date of the sidecar or sibling file. */
  var date: Date
  /** Gets the name of the sidecar or sibling file. */
  var name: String
  /** Gets the size of the sidecar or sibling file, in bytes. */
  var sizeInBytes: Double
}

object PhotoImportSidecar {
  @scala.inline
  def apply(date: Date, name: String, sizeInBytes: Double): PhotoImportSidecar = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sizeInBytes = sizeInBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoImportSidecar]
  }
}

