package typings.titanium.Titanium.App

import typings.titanium.Titanium.Android.Intent
import typings.titanium.Titanium.Event
import typings.titanium.Titanium.Module
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import typings.titanium.titaniumStrings.shortcutitemclick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A module used to access Android application resources.
		 */
@JSGlobal("Titanium.App.Android")
@js.native
class Android () extends Module

/* static members */
@JSGlobal("Titanium.App.Android")
@js.native
object Android extends js.Object {
  /**
  			 * The `R` namespace for application resources.
  			 */
  val R: typings.titanium.Titanium.Android.R = js.native
  /**
  			 * The name of the API that this proxy corresponds to.
  			 */
  val apiName: String = js.native
  /**
  			 * The version number of the application.
  			 */
  val appVersionCode: Double = js.native
  /**
  			 * The version name of the application.
  			 */
  val appVersionName: String = js.native
  /**
  			 * Indicates if the proxy will bubble an event to its parent.
  			 */
  var bubbleParent: Boolean = js.native
  /**
  			 * Return the intent that was used to launch the application.
  			 */
  val launchIntent: Intent = js.native
  /**
  			 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  			 */
  var lifecycleContainer: Window | TabGroup = js.native
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  @JSName("addEventListener")
  def addEventListener_shortcutitemclick(
    name: shortcutitemclick,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AndroidShortcutitemclickEvent, Unit]
  ): Unit = js.native
  /**
  			 * Applies the properties to the proxy.
  			 */
  def applyProperties(props: js.Any): Unit = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  @JSName("fireEvent")
  def fireEvent_shortcutitemclick(name: shortcutitemclick): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_shortcutitemclick(name: shortcutitemclick, event: AndroidShortcutitemclickEvent): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.App.Android.apiName> property.
  			 * @deprecated Access <Titanium.App.Android.apiName> instead.
  			 */
  def getApiName(): String = js.native
  /**
  			 * Gets the value of the <Titanium.App.Android.appVersionCode> property.
  			 * @deprecated Access <Titanium.App.Android.appVersionCode> instead.
  			 */
  def getAppVersionCode(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.App.Android.appVersionName> property.
  			 * @deprecated Access <Titanium.App.Android.appVersionName> instead.
  			 */
  def getAppVersionName(): String = js.native
  /**
  			 * Gets the value of the <Titanium.App.Android.bubbleParent> property.
  			 * @deprecated Access <Titanium.App.Android.bubbleParent> instead.
  			 */
  def getBubbleParent(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.App.Android.launchIntent> property.
  			 * @deprecated Access <Titanium.App.Android.launchIntent> instead.
  			 */
  def getLaunchIntent(): Intent = js.native
  /**
  			 * Gets the value of the <Titanium.App.Android.lifecycleContainer> property.
  			 * @deprecated Access <Titanium.App.Android.lifecycleContainer> instead.
  			 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  @JSName("removeEventListener")
  def removeEventListener_shortcutitemclick(
    name: shortcutitemclick,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AndroidShortcutitemclickEvent, Unit]
  ): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.App.Android.bubbleParent> property.
  			 * @deprecated Set the value using <Titanium.App.Android.bubbleParent> instead.
  			 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.App.Android.lifecycleContainer> property.
  			 * @deprecated Set the value using <Titanium.App.Android.lifecycleContainer> instead.
  			 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
}

