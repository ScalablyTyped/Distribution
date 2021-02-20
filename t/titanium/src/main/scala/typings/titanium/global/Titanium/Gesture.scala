package typings.titanium.global.Titanium

import typings.titanium.Titanium.Event
import typings.titanium.Titanium.GestureOrientationchangeEvent
import typings.titanium.Titanium.GestureShakeEvent
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import typings.titanium.titaniumStrings.orientationchange
import typings.titanium.titaniumStrings.shake
import org.scalablytyped.runtime.StObject
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
object Gesture {
  
  @JSGlobal("Titanium.Gesture")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Gesture.addEventListener")
  @js.native
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Gesture.addEventListener")
  @js.native
  def addEventListener_orientationchange(
    name: orientationchange,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.Gesture, 
      /* event */ GestureOrientationchangeEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.Gesture.addEventListener")
  @js.native
  def addEventListener_shake(
    name: shake,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.Gesture, /* event */ GestureShakeEvent, Unit]
  ): Unit = js.native
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  /* static member */
  @JSGlobal("Titanium.Gesture.apiName")
  @js.native
  val apiName: String = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Gesture.applyProperties")
  @js.native
  def applyProperties(props: js.Any): Unit = js.native
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  /* static member */
  @JSGlobal("Titanium.Gesture.bubbleParent")
  @js.native
  def bubbleParent: Boolean = js.native
  @scala.inline
  def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  /* static member */
  @JSGlobal("Titanium.Gesture.fireEvent")
  @js.native
  def fireEvent(name: String): Unit = js.native
  @JSGlobal("Titanium.Gesture.fireEvent")
  @js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
    * Fires a synthesized event to any registered listeners.
    */
  /* static member */
  @JSGlobal("Titanium.Gesture.fireEvent")
  @js.native
  def fireEvent_orientationchange(name: orientationchange): Unit = js.native
  @JSGlobal("Titanium.Gesture.fireEvent")
  @js.native
  def fireEvent_orientationchange(name: orientationchange, event: GestureOrientationchangeEvent): Unit = js.native
  @JSGlobal("Titanium.Gesture.fireEvent")
  @js.native
  def fireEvent_shake(name: shake): Unit = js.native
  @JSGlobal("Titanium.Gesture.fireEvent")
  @js.native
  def fireEvent_shake(name: shake, event: GestureShakeEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.Gesture.apiName> property.
    * @deprecated Access <Titanium.Gesture.apiName> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Gesture.getApiName")
  @js.native
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Gesture.bubbleParent> property.
    * @deprecated Access <Titanium.Gesture.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Gesture.getBubbleParent")
  @js.native
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Gesture.lifecycleContainer> property.
    * @deprecated Access <Titanium.Gesture.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Gesture.getLifecycleContainer")
  @js.native
  def getLifecycleContainer(): Window | TabGroup = js.native
  
  /**
    * Gets the value of the <Titanium.Gesture.orientation> property.
    * @deprecated Access <Titanium.Gesture.orientation> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Gesture.getOrientation")
  @js.native
  def getOrientation(): Double = js.native
  
  /**
    * Returns whether or not the device is currently held in landscape form.
    * @deprecated Use [Titanium.Gesture.landscape](Titanium.Gesture.landscape) for parity instead. Removed in 7.0.0 on Android, 8.1.0 on iOS.
    */
  /* static member */
  @JSGlobal("Titanium.Gesture.isLandscape")
  @js.native
  def isLandscape: scala.Nothing = js.native
  @scala.inline
  def isLandscape_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isLandscape")(x.asInstanceOf[js.Any])
  
  /**
    * Returns whether or not the device is currently held in portrait form.
    * @deprecated Use [Titanium.Gesture.portrait](Titanium.Gesture.portrait) for parity instead. Removed in 7.0.0 on Android, 8.1.0 on iOS.
    */
  /* static member */
  @JSGlobal("Titanium.Gesture.isPortrait")
  @js.native
  def isPortrait: scala.Nothing = js.native
  @scala.inline
  def isPortrait_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isPortrait")(x.asInstanceOf[js.Any])
  
  /**
    * Indicates if the device is currently held in landscape form.
    */
  /* static member */
  @JSGlobal("Titanium.Gesture.landscape")
  @js.native
  val landscape: Boolean = js.native
  
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Gesture.lifecycleContainer")
  @js.native
  def lifecycleContainer: Window | TabGroup = js.native
  @scala.inline
  def lifecycleContainer_=(x: Window | TabGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lifecycleContainer")(x.asInstanceOf[js.Any])
  
  /**
    * Orientation of the device.
    */
  /* static member */
  @JSGlobal("Titanium.Gesture.orientation")
  @js.native
  val orientation: Double = js.native
  
  /**
    * Indicates if the device is currently held in portrait form.
    */
  /* static member */
  @JSGlobal("Titanium.Gesture.portrait")
  @js.native
  val portrait: Boolean = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Gesture.removeEventListener")
  @js.native
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Gesture.removeEventListener")
  @js.native
  def removeEventListener_orientationchange(
    name: orientationchange,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.Gesture, 
      /* event */ GestureOrientationchangeEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.Gesture.removeEventListener")
  @js.native
  def removeEventListener_shake(
    name: shake,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.Gesture, /* event */ GestureShakeEvent, Unit]
  ): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Gesture.bubbleParent> property.
    * @deprecated Set the value using <Titanium.Gesture.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Gesture.setBubbleParent")
  @js.native
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  @JSGlobal("Titanium.Gesture.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.Gesture.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.Gesture.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Gesture.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
}
