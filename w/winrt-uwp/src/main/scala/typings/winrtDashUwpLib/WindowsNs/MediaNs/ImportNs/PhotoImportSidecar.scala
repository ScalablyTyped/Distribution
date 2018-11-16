package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ImportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a sidecar file or a sibling file to a PhotoImportItem . */
@JSGlobal("Windows.Media.Import.PhotoImportSidecar")
@js.native
abstract class PhotoImportSidecar () extends js.Object {
  /** Gets the date of the sidecar or sibling file. */
  var date: stdLib.Date = js.native
  /** Gets the name of the sidecar or sibling file. */
  var name: java.lang.String = js.native
  /** Gets the size of the sidecar or sibling file, in bytes. */
  var sizeInBytes: scala.Double = js.native
}

