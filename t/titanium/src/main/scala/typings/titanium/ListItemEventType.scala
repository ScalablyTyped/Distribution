package typings.titanium

import typings.titanium.Titanium.UI.ListSection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The arguments for the <Titanium.UI.ListView.prefetch> and <Titanium.UI.ListView.cancelprefetch> events.
  */
@js.native
trait ListItemEventType extends js.Object {
  
  /**
    * The item ID bound to the list item that generated the event.
    */
  var itemId: js.UndefOr[String] = js.native
  
  /**
    * Item index.
    */
  var itemIndex: js.UndefOr[Double] = js.native
  
  /**
    * List section if the item is contained in a list section.
    */
  var section: js.UndefOr[ListSection] = js.native
  
  /**
    * Section index.
    */
  var sectionIndex: js.UndefOr[Double] = js.native
}
object ListItemEventType {
  
  @scala.inline
  def apply(): ListItemEventType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemEventType]
  }
  
  @scala.inline
  implicit class ListItemEventTypeOps[Self <: ListItemEventType] (val x: Self) extends AnyVal {
    
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
    def setItemId(value: String): Self = this.set("itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemId: Self = this.set("itemId", js.undefined)
    
    @scala.inline
    def setItemIndex(value: Double): Self = this.set("itemIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemIndex: Self = this.set("itemIndex", js.undefined)
    
    @scala.inline
    def setSection(value: ListSection): Self = this.set("section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSection: Self = this.set("section", js.undefined)
    
    @scala.inline
    def setSectionIndex(value: Double): Self = this.set("sectionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSectionIndex: Self = this.set("sectionIndex", js.undefined)
  }
}
