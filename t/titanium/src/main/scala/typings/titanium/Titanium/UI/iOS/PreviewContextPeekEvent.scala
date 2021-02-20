package typings.titanium.Titanium.UI.iOS

import typings.titanium.Titanium.UI.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the user peeks the preview. You can configure the preview
  */
@js.native
trait PreviewContextPeekEvent extends PreviewContextBaseEvent {
  
  /**
    * The item ID bound to the list item that generated the event.
    */
  var itemId: String = js.native
  
  /**
    * The item index of the ListView to identify the selected item.
    * Note: This property is only available if the preview context is assigned to a <Titanium.UI.ListView>.
    */
  var itemIndex: Double = js.native
  
  /**
    * The view to be previewed.
    */
  var preview: View = js.native
  
  /**
    * The section index of the ListView to identify the selected section.
    * Note: This property is only available if the preview context is assigned to a <Titanium.UI.ListView>.
    */
  var sectionIndex: Double = js.native
}
object PreviewContextPeekEvent {
  
  @scala.inline
  def apply(itemId: String, itemIndex: Double, preview: View, sectionIndex: Double, source: PreviewContext): PreviewContextPeekEvent = {
    val __obj = js.Dynamic.literal(itemId = itemId.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], sectionIndex = sectionIndex.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewContextPeekEvent]
  }
  
  @scala.inline
  implicit class PreviewContextPeekEventMutableBuilder[Self <: PreviewContextPeekEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreview(value: View): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionIndex(value: Double): Self = StObject.set(x, "sectionIndex", value.asInstanceOf[js.Any])
  }
}
