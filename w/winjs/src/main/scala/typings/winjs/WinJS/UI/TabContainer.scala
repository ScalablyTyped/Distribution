package typings.winjs.WinJS.UI

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Prevents a DOM sub-tree from receiving tab navigations and focus.
  **/
@js.native
trait TabContainer extends StObject {
  
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets the child DOM element that receives tab focus.
    **/
  var childFocus: HTMLElement = js.native
  
  //#endregion Constructors
  //#region Methods
  /**
    * Releases resources held by this TabContainer. Call this method when the TabContainer is no longer needed. After calling this method, the TabContainer becomes unusable.
    **/
  def dispose(): Unit = js.native
  
  /**
    * Gets or sets the tab index of this container.
    **/
  var tabIndex: Double = js.native
}
object TabContainer {
  
  @scala.inline
  def apply(childFocus: HTMLElement, dispose: () => Unit, tabIndex: Double): TabContainer = {
    val __obj = js.Dynamic.literal(childFocus = childFocus.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabContainer]
  }
  
  @scala.inline
  implicit class TabContainerMutableBuilder[Self <: TabContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildFocus(value: HTMLElement): Self = StObject.set(x, "childFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
  }
}
