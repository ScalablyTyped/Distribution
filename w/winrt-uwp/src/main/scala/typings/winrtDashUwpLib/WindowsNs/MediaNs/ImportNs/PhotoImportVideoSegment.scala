package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ImportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an imported video segment. */
@JSGlobal("Windows.Media.Import.PhotoImportVideoSegment")
@js.native
abstract class PhotoImportVideoSegment () extends js.Object {
  /** Gets the date of the imported video segment. */
  var date: stdLib.Date = js.native
  /** Gets the name of the imported video segment. */
  var name: java.lang.String = js.native
  /** Gets the sibling file associated with the imported video segment. */
  var sibling: PhotoImportSidecar = js.native
  /** Gets the sidecar file associated with the imported video segment. */
  var sidecars: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PhotoImportSidecar] = js.native
  /** Gets the size of the imported video segment, in bytes. */
  var sizeInBytes: scala.Double = js.native
}

