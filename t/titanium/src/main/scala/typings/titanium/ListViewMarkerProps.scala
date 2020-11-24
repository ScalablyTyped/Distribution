package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The parameter for [setMarker](Titanium.UI.ListView.setMarker) and [addMarker](Titanium.UI.ListView.addMarker) methods.
  */
@js.native
trait ListViewMarkerProps extends js.Object {
  
  /**
    * The itemIndex of the reference item.
    */
  var itemIndex: js.UndefOr[Double] = js.native
  
  /**
    * The sectionIndex of the reference item.
    */
  var sectionIndex: js.UndefOr[Double] = js.native
}
object ListViewMarkerProps {
  
  @scala.inline
  def apply(): ListViewMarkerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListViewMarkerProps]
  }
  
  @scala.inline
  implicit class ListViewMarkerPropsOps[Self <: ListViewMarkerProps] (val x: Self) extends AnyVal {
    
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
    def setItemIndex(value: Double): Self = this.set("itemIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemIndex: Self = this.set("itemIndex", js.undefined)
    
    @scala.inline
    def setSectionIndex(value: Double): Self = this.set("sectionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSectionIndex: Self = this.set("sectionIndex", js.undefined)
  }
}
