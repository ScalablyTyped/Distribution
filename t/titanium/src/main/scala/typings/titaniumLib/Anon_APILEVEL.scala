package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_APILEVEL extends js.Object {
  /**
  			 * Android API level identifier of the Operating System.
  			 */
  val API_LEVEL: scala.Double = js.native
  /**
  			 * Constant to indicate that the physical size category of the current device/emulator is large
  			 */
  val PHYSICAL_SIZE_CATEGORY_LARGE: scala.Double = js.native
  /**
  			 * Constant to indicate that the physical size category of the current device/emulator is normal
  			 */
  val PHYSICAL_SIZE_CATEGORY_NORMAL: scala.Double = js.native
  /**
  			 * Constant to indicate that the physical size category of the current device/emulator is small
  			 */
  val PHYSICAL_SIZE_CATEGORY_SMALL: scala.Double = js.native
  /**
  			 * Constant to indicate that the physical size category of the current device/emulator is undefined
  			 */
  val PHYSICAL_SIZE_CATEGORY_UNDEFINED: scala.Double = js.native
  /**
  			 * Constant to indicate that the physical size category of the current device/emulator is extra large
  			 */
  val PHYSICAL_SIZE_CATEGORY_XLARGE: scala.Double = js.native
  /**
  			 * The name of the API that this proxy corresponds to.
  			 */
  val apiName: java.lang.String = js.native
  /**
  			 * Indicates if the proxy will bubble an event to its parent.
  			 */
  var bubbleParent: scala.Boolean = js.native
  /**
  			 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  			 */
  var lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  			 * The physical size category of the Android device or emulator.
  			 */
  val physicalSizeCategory: scala.Double = js.native
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Applies the properties to the proxy.
  			 */
  def applyProperties(props: js.Any): scala.Unit = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit = js.native
  /**
  			 * Gets the value of the <Titanium.Platform.Android.apiName> property.
  			 */
  def getApiName(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Platform.Android.bubbleParent> property.
  			 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Platform.Android.lifecycleContainer> property.
  			 */
  def getLifecycleContainer(): titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  			 * Gets the value of the <Titanium.Platform.Android.physicalSizeCategory> property.
  			 */
  def getPhysicalSizeCategory(): scala.Double = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Platform.Android.bubbleParent> property.
  			 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Platform.Android.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.TabGroup): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Platform.Android.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window): scala.Unit = js.native
}

