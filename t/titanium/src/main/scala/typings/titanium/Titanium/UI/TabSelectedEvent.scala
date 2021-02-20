package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the tab is selected.
  */
@js.native
trait TabSelectedEvent extends TabBaseEvent {
  
  /**
    * Index of the current active tab.
    */
  var index: Double = js.native
  
  /**
    * Index of the previous active tab.
    */
  var previousIndex: Double = js.native
  
  /**
    * Previous active tab object.
    */
  var previousTab: Tab = js.native
  
  /**
    * Current active tab object.
    */
  var tab: Tab = js.native
}
object TabSelectedEvent {
  
  @scala.inline
  def apply(index: Double, previousIndex: Double, previousTab: Tab, source: Tab, tab: Tab): TabSelectedEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], previousIndex = previousIndex.asInstanceOf[js.Any], previousTab = previousTab.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabSelectedEvent]
  }
  
  @scala.inline
  implicit class TabSelectedEventMutableBuilder[Self <: TabSelectedEvent] (val x: Self) extends AnyVal {
    
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
