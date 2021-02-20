package typings.titanium.global.Titanium

import typings.titanium.Titanium.Event
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The top-level API module, containing methods to output messages to the system log.
  */
@JSGlobal("Titanium.API")
@js.native
class API ()
  extends typings.titanium.Titanium.Proxy
object API {
  
  @JSGlobal("Titanium.API")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.API.addEventListener")
  @js.native
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  /* static member */
  @JSGlobal("Titanium.API.apiName")
  @js.native
  val apiName: String = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.API.applyProperties")
  @js.native
  def applyProperties(props: js.Any): Unit = js.native
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  /* static member */
  @JSGlobal("Titanium.API.bubbleParent")
  @js.native
  def bubbleParent: Boolean = js.native
  @scala.inline
  def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
  
  @JSGlobal("Titanium.API.debug")
  @js.native
  def debug(message: String): Unit = js.native
  /**
    * Logs messages with a `debug` severity-level.
    */
  /* static member */
  @JSGlobal("Titanium.API.debug")
  @js.native
  def debug(message: js.Array[String]): Unit = js.native
  
  @JSGlobal("Titanium.API.error")
  @js.native
  def error(message: String): Unit = js.native
  /**
    * Logs messages with an `error` severity-level.
    */
  /* static member */
  @JSGlobal("Titanium.API.error")
  @js.native
  def error(message: js.Array[String]): Unit = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  /* static member */
  @JSGlobal("Titanium.API.fireEvent")
  @js.native
  def fireEvent(name: String): Unit = js.native
  @JSGlobal("Titanium.API.fireEvent")
  @js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.API.apiName> property.
    * @deprecated Access <Titanium.API.apiName> instead.
    */
  /* static member */
  @JSGlobal("Titanium.API.getApiName")
  @js.native
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.API.bubbleParent> property.
    * @deprecated Access <Titanium.API.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.API.getBubbleParent")
  @js.native
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.API.lifecycleContainer> property.
    * @deprecated Access <Titanium.API.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.API.getLifecycleContainer")
  @js.native
  def getLifecycleContainer(): Window | TabGroup = js.native
  
  @JSGlobal("Titanium.API.info")
  @js.native
  def info(message: String): Unit = js.native
  /**
    * Logs messages with an `info` severity-level.
    */
  /* static member */
  @JSGlobal("Titanium.API.info")
  @js.native
  def info(message: js.Array[String]): Unit = js.native
  
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.API.lifecycleContainer")
  @js.native
  def lifecycleContainer: Window | TabGroup = js.native
  @scala.inline
  def lifecycleContainer_=(x: Window | TabGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lifecycleContainer")(x.asInstanceOf[js.Any])
  
  @JSGlobal("Titanium.API.log")
  @js.native
  def log(level: String, message: String): Unit = js.native
  /**
    * Logs messages with the specified severity-level.
    */
  /* static member */
  @JSGlobal("Titanium.API.log")
  @js.native
  def log(level: String, message: js.Array[String]): Unit = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.API.removeEventListener")
  @js.native
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.API.bubbleParent> property.
    * @deprecated Set the value using <Titanium.API.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.API.setBubbleParent")
  @js.native
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  @JSGlobal("Titanium.API.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.API.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.API.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.API.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  
  @JSGlobal("Titanium.API.timestamp")
  @js.native
  def timestamp(message: String): Unit = js.native
  /**
    * Logs messages with a `timestamp` severity-level, prefixed with a timestamp float number
    * representing the number of seconds since January 1st, 2001.
    */
  /* static member */
  @JSGlobal("Titanium.API.timestamp")
  @js.native
  def timestamp(message: js.Array[String]): Unit = js.native
  
  @JSGlobal("Titanium.API.trace")
  @js.native
  def trace(message: String): Unit = js.native
  /**
    * Logs messages with a `trace` severity-level.
    */
  /* static member */
  @JSGlobal("Titanium.API.trace")
  @js.native
  def trace(message: js.Array[String]): Unit = js.native
  
  @JSGlobal("Titanium.API.warn")
  @js.native
  def warn(message: String): Unit = js.native
  /**
    * Logs messages with a `warn` severity-level.
    */
  /* static member */
  @JSGlobal("Titanium.API.warn")
  @js.native
  def warn(message: js.Array[String]): Unit = js.native
}
