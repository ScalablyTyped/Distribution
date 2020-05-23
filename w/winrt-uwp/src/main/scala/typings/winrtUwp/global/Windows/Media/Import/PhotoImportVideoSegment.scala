package typings.winrtUwp.global.Windows.Media.Import

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an imported video segment. */
@JSGlobal("Windows.Media.Import.PhotoImportVideoSegment")
@js.native
abstract class PhotoImportVideoSegment ()
  extends typings.winrtUwp.Windows.Media.Import.PhotoImportVideoSegment {
  /** Gets the date of the imported video segment. */
  /* CompleteClass */
  override var date: Date = js.native
  /** Gets the name of the imported video segment. */
  /* CompleteClass */
  override var name: String = js.native
  /** Gets the sibling file associated with the imported video segment. */
  /* CompleteClass */
  override var sibling: typings.winrtUwp.Windows.Media.Import.PhotoImportSidecar = js.native
  /** Gets the sidecar file associated with the imported video segment. */
  /* CompleteClass */
  override var sidecars: IVectorView[typings.winrtUwp.Windows.Media.Import.PhotoImportSidecar] = js.native
  /** Gets the size of the imported video segment, in bytes. */
  /* CompleteClass */
  override var sizeInBytes: Double = js.native
}

