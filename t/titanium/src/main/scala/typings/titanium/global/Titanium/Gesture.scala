package typings.titanium.global.Titanium

import typings.titanium.Titanium.Event
import typings.titanium.Titanium.GestureOrientationchangeEvent
import typings.titanium.Titanium.GestureShakeEvent
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import typings.titanium.titaniumStrings.orientationchange
import typings.titanium.titaniumStrings.shake
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Gesture module is responsible for high-level device gestures such as orientation changes
  * and shake gestures.
  */
@JSGlobal("Titanium.Gesture")
@js.native
class Gesture ()
  extends typings.titanium.Titanium.Proxy
/* static members */
@JSGlobal("Titanium.Gesture")
@js.native
object Gesture extends js.Object {
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    name: orientationchange,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ GestureOrientationchangeEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shake(name: shake, callback: js.ThisFunction1[/* this */ this.type, /* event */ GestureShakeEvent, Unit]): Unit = js.native
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  val apiName: String = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  def applyProperties(props: js.Any): Unit = js.native
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  var bubbleParent: Boolean = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
    * Fires a synthesized event to any registered listeners.
    */
  @JSName("fireEvent")
  def fireEvent_orientationchange(name: orientationchange): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_orientationchange(name: orientationchange, event: GestureOrientationchangeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_shake(name: shake): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_shake(name: shake, event: GestureShakeEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.Gesture.apiName> property.
    * @deprecated Access <Titanium.Gesture.apiName> instead.
    */
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Gesture.bubbleParent> property.
    * @deprecated Access <Titanium.Gesture.bubbleParent> instead.
    */
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Gesture.lifecycleContainer> property.
    * @deprecated Access <Titanium.Gesture.lifecycleContainer> instead.
    */
  def getLifecycleContainer(): Window | TabGroup = js.native
  
  /**
    * Gets the value of the <Titanium.Gesture.orientation> property.
    * @deprecated Access <Titanium.Gesture.orientation> instead.
    */
  def getOrientation(): Double = js.native
  
  /**
    * Indicates if the device is currently held in landscape form.
    */
  val landscape: Boolean = js.native
  
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  var lifecycleContainer: Window | TabGroup = js.native
  
  /**
    * Orientation of the device.
    */
  val orientation: Double = js.native
  
  /**
    * Indicates if the device is currently held in portrait form.
    */
  val portrait: Boolean = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    name: orientationchange,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ GestureOrientationchangeEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shake(name: shake, callback: js.ThisFunction1[/* this */ this.type, /* event */ GestureShakeEvent, Unit]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Gesture.bubbleParent> property.
    * @deprecated Set the value using <Titanium.Gesture.bubbleParent> instead.
    */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.Gesture.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.Gesture.lifecycleContainer> instead.
    */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
}
