package typings.titanium.Titanium.UI.Android

import typings.titanium.Dictionary
import typings.titanium.Titanium.Event
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.UI.Android")
@js.native
object ^ extends js.Object {
  /**
  			 * The name of the API that this proxy corresponds to.
  			 */
  val apiName: String = js.native
  /**
  			 * Indicates if the proxy will bubble an event to its parent.
  			 */
  var bubbleParent: Boolean = js.native
  /**
  			 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  			 */
  var lifecycleContainer: Window | TabGroup = js.native
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
  			 * Applies the properties to the proxy.
  			 */
  def applyProperties(props: js.Any): Unit = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.Android.CardView>.
  			 */
  def createCardView(): CardView = js.native
  def createCardView(parameters: Dictionary[CardView]): CardView = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.Android.DrawerLayout>.
  			 */
  def createDrawerLayout(): DrawerLayout = js.native
  def createDrawerLayout(parameters: Dictionary[DrawerLayout]): DrawerLayout = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.Android.ProgressIndicator>.
  			 */
  def createProgressIndicator(): ProgressIndicator = js.native
  def createProgressIndicator(parameters: Dictionary[ProgressIndicator]): ProgressIndicator = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.Android.SearchView>.
  			 */
  def createSearchView(): SearchView = js.native
  def createSearchView(parameters: Dictionary[SearchView]): SearchView = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Android.apiName> property.
  			 * @deprecated Access <Titanium.UI.Android.apiName> instead.
  			 */
  def getApiName(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Android.bubbleParent> property.
  			 * @deprecated Access <Titanium.UI.Android.bubbleParent> instead.
  			 */
  def getBubbleParent(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Android.lifecycleContainer> property.
  			 * @deprecated Access <Titanium.UI.Android.lifecycleContainer> instead.
  			 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  			 * Hides the soft keyboard.
  			 */
  def hideSoftKeyboard(): Unit = js.native
  /**
  			 * Opens an application preferences dialog, using the native Android system settings interface,
  			 * defined by the platform-specific `preferences.xml` and `array.xml` files.
  			 */
  def openPreferences(): Unit = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Android.bubbleParent> property.
  			 * @deprecated Set the value using <Titanium.UI.Android.bubbleParent> instead.
  			 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Android.lifecycleContainer> property.
  			 * @deprecated Set the value using <Titanium.UI.Android.lifecycleContainer> instead.
  			 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
}

