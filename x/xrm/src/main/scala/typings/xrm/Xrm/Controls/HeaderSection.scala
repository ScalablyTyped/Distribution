package typings.xrm.Xrm.Controls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderSection extends StObject {
  
  /**
    * Returns the header's body visibility.
    * @remarks Available only for Unified Interface.
    * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/formcontext-ui-headersection/getbodyvisible External Link: getBodyVisible (Client API reference)}
    */
  def getBodyVisible(): Boolean
  
  /**
    * Returns the command bar visibility.
    * @remarks Available only for Unified Interface.
    * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/formcontext-ui-headersection/getcommandbarvisible External Link: getCommandBarVisible (Client API reference)}
    */
  def getCommandBarVisible(): Boolean
  
  /**
    * Returns the tab navigator visibility.
    * @remarks Available only for Unified Interface.
    * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/formcontext-ui-headersection/gettabnavigatorvisible External Link: getTabNavigatorVisible (Client API reference)}
    */
  def getTabNavigatorVisible(): Boolean
  
  /**
    * Sets the header's body visibility.
    * @arg bool Specify true to show the body; false to hide the body.
    * @remarks Available only for Unified Interface.
    * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/formcontext-ui-headersection/setbodyvisible External Link: setBodyVisible (Client API reference)}
    */
  def setBodyVisible(bool: Boolean): Unit
  
  /**
    * Sets the command bar visibility.
    * @arg bool Specify true to show the command bar; false to hide the command bar.
    * @remarks Available only for Unified Interface.
    * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/formcontext-ui-headersection/setcommandbarvisible External Link: setCommandBarVisible (Client API reference)}
    */
  def setCommandBarVisible(bool: Boolean): Unit
  
  /**
    * Sets the tab navigator visibility.
    * @arg bool Specify true to show the tab navigator; false to hide the tab navigator.
    * @remarks Available only for Unified Interface.
    * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/formcontext-ui-headersection/settabnavigatorvisible External Link: setTabNavigatorVisible (Client API reference)}
    */
  def setTabNavigatorVisible(bool: Boolean): Unit
}
object HeaderSection {
  
  inline def apply(
    getBodyVisible: () => Boolean,
    getCommandBarVisible: () => Boolean,
    getTabNavigatorVisible: () => Boolean,
    setBodyVisible: Boolean => Unit,
    setCommandBarVisible: Boolean => Unit,
    setTabNavigatorVisible: Boolean => Unit
  ): HeaderSection = {
    val __obj = js.Dynamic.literal(getBodyVisible = js.Any.fromFunction0(getBodyVisible), getCommandBarVisible = js.Any.fromFunction0(getCommandBarVisible), getTabNavigatorVisible = js.Any.fromFunction0(getTabNavigatorVisible), setBodyVisible = js.Any.fromFunction1(setBodyVisible), setCommandBarVisible = js.Any.fromFunction1(setCommandBarVisible), setTabNavigatorVisible = js.Any.fromFunction1(setTabNavigatorVisible))
    __obj.asInstanceOf[HeaderSection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeaderSection] (val x: Self) extends AnyVal {
    
    inline def setGetBodyVisible(value: () => Boolean): Self = StObject.set(x, "getBodyVisible", js.Any.fromFunction0(value))
    
    inline def setGetCommandBarVisible(value: () => Boolean): Self = StObject.set(x, "getCommandBarVisible", js.Any.fromFunction0(value))
    
    inline def setGetTabNavigatorVisible(value: () => Boolean): Self = StObject.set(x, "getTabNavigatorVisible", js.Any.fromFunction0(value))
    
    inline def setSetBodyVisible(value: Boolean => Unit): Self = StObject.set(x, "setBodyVisible", js.Any.fromFunction1(value))
    
    inline def setSetCommandBarVisible(value: Boolean => Unit): Self = StObject.set(x, "setCommandBarVisible", js.Any.fromFunction1(value))
    
    inline def setSetTabNavigatorVisible(value: Boolean => Unit): Self = StObject.set(x, "setTabNavigatorVisible", js.Any.fromFunction1(value))
  }
}
