package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when a list row is moved to a different location by the user.
  */
@js.native
trait ListViewMoveEvent extends ListViewBaseEvent {
  
  /**
    * false. This event does not bubble.
    */
  var bubbles: Boolean = js.native
  
  /**
    * The item ID bound to the list item that generated the event.
    */
  var itemId: String = js.native
  
  /**
    * Item index.
    */
  var itemIndex: Double = js.native
  
  /**
    * List section from which the item is moved.
    */
  var section: ListSection = js.native
  
  /**
    * Section index.
    */
  var sectionIndex: Double = js.native
  
  /**
    * Position within the `targetSection`.
    */
  var targetItemIndex: Double = js.native
  
  /**
    * List section to which the item is moved. Might be the same as `section` property.
    */
  var targetSection: ListSection = js.native
  
  /**
    * Section index.
    */
  var targetSectionIndex: Double = js.native
}
object ListViewMoveEvent {
  
  @scala.inline
  def apply(
    bubbles: Boolean,
    itemId: String,
    itemIndex: Double,
    section: ListSection,
    sectionIndex: Double,
    source: ListView,
    targetItemIndex: Double,
    targetSection: ListSection,
    targetSectionIndex: Double
  ): ListViewMoveEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], sectionIndex = sectionIndex.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], targetItemIndex = targetItemIndex.asInstanceOf[js.Any], targetSection = targetSection.asInstanceOf[js.Any], targetSectionIndex = targetSectionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewMoveEvent]
  }
  
  @scala.inline
  implicit class ListViewMoveEventOps[Self <: ListViewMoveEvent] (val x: Self) extends AnyVal {
    
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
    def setBubbles(value: Boolean): Self = this.set("bubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemId(value: String): Self = this.set("itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIndex(value: Double): Self = this.set("itemIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSection(value: ListSection): Self = this.set("section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionIndex(value: Double): Self = this.set("sectionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetItemIndex(value: Double): Self = this.set("targetItemIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSection(value: ListSection): Self = this.set("targetSection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSectionIndex(value: Double): Self = this.set("targetSectionIndex", value.asInstanceOf[js.Any])
  }
}
