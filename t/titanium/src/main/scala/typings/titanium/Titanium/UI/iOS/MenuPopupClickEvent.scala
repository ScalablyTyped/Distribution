package typings.titanium.Titanium.UI.iOS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the user clicks at one of the menu popup items.
  */
@js.native
trait MenuPopupClickEvent extends MenuPopupBaseEvent {
  
  /**
    * The index of the clicked item.
    */
  var index: Double = js.native
  
  /**
    * The title of the clicked item.
    */
  var title: String = js.native
}
object MenuPopupClickEvent {
  
  @scala.inline
  def apply(index: Double, source: MenuPopup, title: String): MenuPopupClickEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuPopupClickEvent]
  }
  
  @scala.inline
  implicit class MenuPopupClickEventMutableBuilder[Self <: MenuPopupClickEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
