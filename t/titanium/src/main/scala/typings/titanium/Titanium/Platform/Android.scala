package typings.titanium.Titanium.Platform

import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The Android-specific Platform module, used to access the device's platform-related functionality.
		 */
@JSGlobal("Titanium.Platform.Android")
@js.native
object Android extends js.Object {
  /**
  			 * Android API level identifier of the Operating System.
  			 */
  val API_LEVEL: Double = js.native
  /**
  			 * Constant to indicate that the physical size category of the current device/emulator is large
  			 */
  val PHYSICAL_SIZE_CATEGORY_LARGE: Double = js.native
  /**
  			 * Constant to indicate that the physical size category of the current device/emulator is normal
  			 */
  val PHYSICAL_SIZE_CATEGORY_NORMAL: Double = js.native
  /**
  			 * Constant to indicate that the physical size category of the current device/emulator is small
  			 */
  val PHYSICAL_SIZE_CATEGORY_SMALL: Double = js.native
  /**
  			 * Constant to indicate that the physical size category of the current device/emulator is undefined
  			 */
  val PHYSICAL_SIZE_CATEGORY_UNDEFINED: Double = js.native
  /**
  			 * Constant to indicate that the physical size category of the current device/emulator is extra large
  			 */
  val PHYSICAL_SIZE_CATEGORY_XLARGE: Double = js.native
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
  			 * The physical size category of the Android device or emulator.
  			 */
  val physicalSizeCategory: Double = js.native
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
  			 * Gets the value of the <Titanium.Platform.Android.apiName> property.
  			 */
  def getApiName(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Platform.Android.bubbleParent> property.
  			 */
  def getBubbleParent(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Platform.Android.lifecycleContainer> property.
  			 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  			 * Gets the value of the <Titanium.Platform.Android.physicalSizeCategory> property.
  			 */
  def getPhysicalSizeCategory(): Double = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Platform.Android.bubbleParent> property.
  			 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Platform.Android.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Platform.Android.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
}

