package typings.winrtUwp.Windows.Media.Import

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an imported video segment. */
@JSGlobal("Windows.Media.Import.PhotoImportVideoSegment")
@js.native
abstract class PhotoImportVideoSegment () extends js.Object {
  /** Gets the date of the imported video segment. */
  var date: Date = js.native
  /** Gets the name of the imported video segment. */
  var name: String = js.native
  /** Gets the sibling file associated with the imported video segment. */
  var sibling: PhotoImportSidecar = js.native
  /** Gets the sidecar file associated with the imported video segment. */
  var sidecars: IVectorView[PhotoImportSidecar] = js.native
  /** Gets the size of the imported video segment, in bytes. */
  var sizeInBytes: Double = js.native
}

