package typings.winrtDashUwp.Windows.Media.Import

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a sidecar file or a sibling file to a PhotoImportItem . */
@JSGlobal("Windows.Media.Import.PhotoImportSidecar")
@js.native
abstract class PhotoImportSidecar () extends js.Object {
  /** Gets the date of the sidecar or sibling file. */
  var date: Date = js.native
  /** Gets the name of the sidecar or sibling file. */
  var name: String = js.native
  /** Gets the size of the sidecar or sibling file, in bytes. */
  var sizeInBytes: Double = js.native
}

