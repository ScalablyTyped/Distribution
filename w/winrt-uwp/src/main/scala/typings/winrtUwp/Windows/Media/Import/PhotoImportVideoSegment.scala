package typings.winrtUwp.Windows.Media.Import

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an imported video segment. */
trait PhotoImportVideoSegment extends js.Object {
  /** Gets the date of the imported video segment. */
  var date: Date
  /** Gets the name of the imported video segment. */
  var name: String
  /** Gets the sibling file associated with the imported video segment. */
  var sibling: PhotoImportSidecar
  /** Gets the sidecar file associated with the imported video segment. */
  var sidecars: IVectorView[PhotoImportSidecar]
  /** Gets the size of the imported video segment, in bytes. */
  var sizeInBytes: Double
}

object PhotoImportVideoSegment {
  @scala.inline
  def apply(
    date: Date,
    name: String,
    sibling: PhotoImportSidecar,
    sidecars: IVectorView[PhotoImportSidecar],
    sizeInBytes: Double
  ): PhotoImportVideoSegment = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sibling = sibling.asInstanceOf[js.Any], sidecars = sidecars.asInstanceOf[js.Any], sizeInBytes = sizeInBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoImportVideoSegment]
  }
}

