package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the user interacts with one of the custom edit actions defined by <Titanium.UI.ListItem.editActions>.
  */
@js.native
trait ListViewEditactionEvent extends ListViewBaseEvent {
  
  /**
    * The [title](RowActionType.title) as defined in the row action object.
    */
  var action: String = js.native
  
  /**
    * false. This event does not bubble.
    */
  var bubbles: Boolean = js.native
  
  /**
    * The [identifier](RowActionType. identifier) of the row action. Only included in the event
    * if previously defined. Available in Titanium 6.0.0 and later.
    */
  var identifier: String = js.native
  
  /**
    * The item ID bound to the list item that generated the event.
    */
  var itemId: String = js.native
  
  /**
    * Item index.
    */
  var itemIndex: Double = js.native
  
  /**
    * List section from which the event was generated.
    */
  var section: ListSection = js.native
  
  /**
    * Section index.
    */
  var sectionIndex: Double = js.native
}
object ListViewEditactionEvent {
  
  @scala.inline
  def apply(
    action: String,
    bubbles: Boolean,
    identifier: String,
    itemId: String,
    itemIndex: Double,
    section: ListSection,
    sectionIndex: Double,
    source: ListView
  ): ListViewEditactionEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], sectionIndex = sectionIndex.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewEditactionEvent]
  }
  
  @scala.inline
  implicit class ListViewEditactionEventMutableBuilder[Self <: ListViewEditactionEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSection(value: ListSection): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionIndex(value: Double): Self = StObject.set(x, "sectionIndex", value.asInstanceOf[js.Any])
  }
}
