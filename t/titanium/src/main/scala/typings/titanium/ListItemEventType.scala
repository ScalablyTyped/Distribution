package typings.titanium

import typings.titanium.Titanium.UI.ListSection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The arguments for the <Titanium.UI.ListView.prefetch> and <Titanium.UI.ListView.cancelprefetch> events.
  */
@js.native
trait ListItemEventType extends StObject {
  
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
  implicit class ListItemEventTypeMutableBuilder[Self <: ListItemEventType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
    
    @scala.inline
    def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIndexUndefined: Self = StObject.set(x, "itemIndex", js.undefined)
    
    @scala.inline
    def setSection(value: ListSection): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionIndex(value: Double): Self = StObject.set(x, "sectionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionIndexUndefined: Self = StObject.set(x, "sectionIndex", js.undefined)
    
    @scala.inline
    def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
  }
}
