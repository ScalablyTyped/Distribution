package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
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
  implicit class ListViewMoveEventMutableBuilder[Self <: ListViewMoveEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSection(value: ListSection): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionIndex(value: Double): Self = StObject.set(x, "sectionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetItemIndex(value: Double): Self = StObject.set(x, "targetItemIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSection(value: ListSection): Self = StObject.set(x, "targetSection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSectionIndex(value: Double): Self = StObject.set(x, "targetSectionIndex", value.asInstanceOf[js.Any])
  }
}
