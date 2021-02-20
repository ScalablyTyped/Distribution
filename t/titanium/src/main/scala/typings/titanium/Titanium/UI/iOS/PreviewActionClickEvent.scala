package typings.titanium.Titanium.UI.iOS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the device detects a click against a preview action.
  */
@js.native
trait PreviewActionClickEvent extends PreviewActionBaseEvent {
  
  /**
    * The index of the clicked action.
    */
  var index: Double = js.native
  
  /**
    * The item ID of cell, if the `previewContext` property of the <Titanium.UI.iOS.PreviewContext>
    * is a <Titanium.UI.ListView>.
    */
  var itemId: String = js.native
  
  /**
    * The index of the clicked row, if the `previewContext` property of the <Titanium.UI.iOS.PreviewContext>
    * is a <Titanium.UI.ListView>.
    */
  var itemIndex: Double = js.native
  
  /**
    * The index of the clicked section, if the `previewContext` property of the <Titanium.UI.iOS.PreviewContext>
    * is a <Titanium.UI.ListView>.
    */
  var sectionIndex: Double = js.native
}
object PreviewActionClickEvent {
  
  @scala.inline
  def apply(index: Double, itemId: String, itemIndex: Double, sectionIndex: Double, source: PreviewAction): PreviewActionClickEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], sectionIndex = sectionIndex.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewActionClickEvent]
  }
  
  @scala.inline
  implicit class PreviewActionClickEventMutableBuilder[Self <: PreviewActionClickEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionIndex(value: Double): Self = StObject.set(x, "sectionIndex", value.asInstanceOf[js.Any])
  }
}
