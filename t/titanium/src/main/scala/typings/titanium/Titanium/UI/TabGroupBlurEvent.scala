package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when this tab group loses focus. On Android, fired when a tab in this tab group
  * loses focus.
  */
@js.native
trait TabGroupBlurEvent extends TabGroupBaseEvent {
  
  /**
    * Index of the current active tab. On iOS, a value of `undefined` indicates that the
    * **More** tab was the active tab.
    */
  var index: Double = js.native
  
  /**
    * Index of the previous active tab. On iOS, a value of `undefined` indicates that the
    * **More** tab was the previous tab.
    */
  var previousIndex: Double = js.native
  
  /**
    * Previous active tab. On iOS, a value of `undefined` indicates that the **More** tab was
    * the previous tab.
    */
  var previousTab: Tab = js.native
  
  /**
    * Active tab.
    */
  var tab: Tab = js.native
}
object TabGroupBlurEvent {
  
  @scala.inline
  def apply(index: Double, previousIndex: Double, previousTab: Tab, source: TabGroup, tab: Tab): TabGroupBlurEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], previousIndex = previousIndex.asInstanceOf[js.Any], previousTab = previousTab.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabGroupBlurEvent]
  }
  
  @scala.inline
  implicit class TabGroupBlurEventMutableBuilder[Self <: TabGroupBlurEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousIndex(value: Double): Self = StObject.set(x, "previousIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousTab(value: Tab): Self = StObject.set(x, "previousTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTab(value: Tab): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
  }
}
