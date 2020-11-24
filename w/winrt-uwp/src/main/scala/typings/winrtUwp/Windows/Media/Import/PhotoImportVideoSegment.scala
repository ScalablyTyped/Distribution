package typings.winrtUwp.Windows.Media.Import

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an imported video segment. */
@js.native
trait PhotoImportVideoSegment extends js.Object {
  
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
  
  @scala.inline
  implicit class PhotoImportVideoSegmentOps[Self <: PhotoImportVideoSegment] (val x: Self) extends AnyVal {
    
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
    def setSibling(value: PhotoImportSidecar): Self = this.set("sibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSidecars(value: IVectorView[PhotoImportSidecar]): Self = this.set("sidecars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeInBytes(value: Double): Self = this.set("sizeInBytes", value.asInstanceOf[js.Any])
  }
}
