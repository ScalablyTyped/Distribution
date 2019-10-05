package typings.titanium

import typings.titanium.Titanium.Android.Intent
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofAndroidAddEventListener extends js.Object {
  /**
  			 * The `R` namespace for application resources.
  			 */
  val R: typings.titanium.Titanium.App.Android.R = js.native
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
  def addEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Applies the properties to the proxy.
  			 */
  def applyProperties(props: js.Any): Unit = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.App.Android.apiName> property.
  			 */
  def getApiName(): String = js.native
  /**
  			 * Gets the value of the <Titanium.App.Android.appVersionCode> property.
  			 */
  def getAppVersionCode(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.App.Android.appVersionName> property.
  			 */
  def getAppVersionName(): String = js.native
  /**
  			 * Gets the value of the <Titanium.App.Android.bubbleParent> property.
  			 */
  def getBubbleParent(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.App.Android.launchIntent> property.
  			 */
  def getLaunchIntent(): Intent = js.native
  /**
  			 * Gets the value of the <Titanium.App.Android.lifecycleContainer> property.
  			 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.App.Android.bubbleParent> property.
  			 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.App.Android.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.App.Android.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
}

