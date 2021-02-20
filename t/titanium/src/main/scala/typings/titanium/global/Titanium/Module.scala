package typings.titanium.global.Titanium

import typings.titanium.Titanium.Event
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base type for all Titanium modules.
  */
@JSGlobal("Titanium.Module")
@js.native
class Module ()
  extends typings.titanium.Titanium.Proxy
object Module {
  
  @JSGlobal("Titanium.Module")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Module.addEventListener")
  @js.native
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  /* static member */
  @JSGlobal("Titanium.Module.apiName")
  @js.native
  val apiName: String = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Module.applyProperties")
  @js.native
  def applyProperties(props: js.Any): Unit = js.native
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  /* static member */
  @JSGlobal("Titanium.Module.bubbleParent")
  @js.native
  def bubbleParent: Boolean = js.native
  @scala.inline
  def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  /* static member */
  @JSGlobal("Titanium.Module.fireEvent")
  @js.native
  def fireEvent(name: String): Unit = js.native
  @JSGlobal("Titanium.Module.fireEvent")
  @js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.Module.apiName> property.
    * @deprecated Access <Titanium.Module.apiName> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Module.getApiName")
  @js.native
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Module.bubbleParent> property.
    * @deprecated Access <Titanium.Module.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Module.getBubbleParent")
  @js.native
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Module.lifecycleContainer> property.
    * @deprecated Access <Titanium.Module.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Module.getLifecycleContainer")
  @js.native
  def getLifecycleContainer(): Window | TabGroup = js.native
  
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Module.lifecycleContainer")
  @js.native
  def lifecycleContainer: Window | TabGroup = js.native
  @scala.inline
  def lifecycleContainer_=(x: Window | TabGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lifecycleContainer")(x.asInstanceOf[js.Any])
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Module.removeEventListener")
  @js.native
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Module.bubbleParent> property.
    * @deprecated Set the value using <Titanium.Module.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Module.setBubbleParent")
  @js.native
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  @JSGlobal("Titanium.Module.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.Module.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.Module.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Module.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
}
