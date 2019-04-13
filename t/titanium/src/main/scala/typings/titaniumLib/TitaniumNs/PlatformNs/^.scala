package typings
package titaniumLib.TitaniumNs.PlatformNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.Platform")
@js.native
object ^ extends js.Object {
  /**
  		 * Constant to indicate that the system is plugged in and currently being charged.
  		 */
  val BATTERY_STATE_CHARGING: scala.Double = js.native
  /**
  		 * Constant to indicate that the battery is fully charged.
  		 */
  val BATTERY_STATE_FULL: scala.Double = js.native
  /**
  		 * Constant to indicate that the battery state is not known or monitoring is disabled.
  		 */
  val BATTERY_STATE_UNKNOWN: scala.Double = js.native
  /**
  		 * Constant to indicate that the system is unplugged.
  		 */
  val BATTERY_STATE_UNPLUGGED: scala.Double = js.native
  /**
  		 * System's WIFI IP address. No other network types are supported.
  		 */
  val address: java.lang.String = js.native
  /**
  		 * The name of the API that this proxy corresponds to.
  		 */
  val apiName: java.lang.String = js.native
  /**
  		 * System's processor architecture.
  		 */
  val architecture: java.lang.String = js.native
  /**
  		 * System's unused memory, measured in bytes.
  		 */
  val availableMemory: scala.Double = js.native
  /**
  		 * Battery level in percent, accessible only when `batteryMonitoring` is enabled. Measured
  		 * in 5% increments on iPhone/iPad.
  		 */
  val batteryLevel: scala.Double = js.native
  /**
  		 * Determines whether battery monitoring is enabled.
  		 */
  var batteryMonitoring: scala.Boolean = js.native
  /**
  		 * Indicates the state of the battery. Accessible only when `batteryMonitoring` is enabled.
  		 */
  val batteryState: scala.Double = js.native
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: scala.Boolean = js.native
  /**
  		 * Returns the DisplayCaps object.
  		 */
  val displayCaps: DisplayCaps = js.native
  /**
  		 * Applications's globally-unique ID (UUID).
  		 */
  val id: java.lang.String = js.native
  /**
  		 * An alphanumeric string unique to each device, used only for serving advertisements.
  		 */
  var identifierForAdvertising: java.lang.String = js.native
  /**
  		 * An alphanumeric string that uniquely identifies a device to the app's vendor.
  		 */
  val identifierForVendor: java.lang.String = js.native
  /**
  		 * A Boolean value that indicates whether the user has limited ad tracking.
  		 */
  val isAdvertisingTrackingEnabled: scala.Boolean = js.native
  /**
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * System's default language.
  		 */
  val locale: java.lang.String = js.native
  /**
  		 * System's network interface mac address, or app UUID.
  		 */
  val macaddress: java.lang.String = js.native
  /**
  		 * Manufacturer of the device.
  		 */
  val manufacturer: java.lang.String = js.native
  /**
  		 * Model of the device.
  		 */
  val model: java.lang.String = js.native
  /**
  		 * Name of the platform. Returns `android` for the Android platform, `iPhone OS` for the iOS
  		 * platform (iPhone, iPad, or iPod Touch), and `windows` for the Windows platform.
  		 * Since iOS 10 this property returns `iOS` for for the iOS platform (iPhone, iPad, or iPod Touch).
  		 */
  val name: java.lang.String = js.native
  /**
  		 * System's WIFI network mask. No other network types are supported.
  		 */
  val netmask: java.lang.String = js.native
  /**
  		 * Short name of the system's Operating System. Returns `android` for the Android platfrom,
  		 * `iphone` for the iPhone or iPod Touch, `ipad` for the iPad, `windowsphone` for Windows Phone, and `windowsstore` for Windows Store
  		 * platform.
  		 */
  val osname: java.lang.String = js.native
  /**
  		 * Operating System architecture. On Android, this is `32bit`.
  		 */
  val ostype: java.lang.String = js.native
  /**
  		 * Number of logical processing cores.
  		 */
  val processorCount: scala.Double = js.native
  /**
  		 * Short name of the JavaScript runtime in use.
  		 */
  val runtime: java.lang.String = js.native
  /**
  		 * System's total memory, measured in bytes.
  		 */
  val totalMemory: scala.Double = js.native
  /**
  		 * System uptime since last boot in seconds.
  		 */
  val uptime: scala.Double = js.native
  /**
  		 * System name, if set. On iOS, this can be found in Settings > General > About > Name.
  		 */
  val username: java.lang.String = js.native
  /**
  		 * System's OS version.
  		 */
  val version: java.lang.String = js.native
  /**
  		 * Adds the specified callback as an event listener for the named event.
  		 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Applies the properties to the proxy.
  		 */
  def applyProperties(props: js.Any): scala.Unit = js.native
  /**
  		 * Returns whether the system is configured with a default application to handle the URL's protocol.
  		 */
  def canOpenURL(url: java.lang.String): scala.Boolean = js.native
  /**
  		 * Returns an array of basic cpu information for all logical processors
  		 */
  def cpus(): js.Array[titaniumLib.CPU] = js.native
  /**
  		 * Creates a globally-unique identifier.
  		 */
  def createUUID(): java.lang.String = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.address> property.
  		 */
  def getAddress(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.apiName> property.
  		 */
  def getApiName(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.architecture> property.
  		 */
  def getArchitecture(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.availableMemory> property.
  		 */
  def getAvailableMemory(): scala.Double = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.batteryLevel> property.
  		 */
  def getBatteryLevel(): scala.Double = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.batteryMonitoring> property.
  		 */
  def getBatteryMonitoring(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.batteryState> property.
  		 */
  def getBatteryState(): scala.Double = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.bubbleParent> property.
  		 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.displayCaps> property.
  		 */
  def getDisplayCaps(): DisplayCaps = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.id> property.
  		 */
  def getId(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.identifierForAdvertising> property.
  		 */
  def getIdentifierForAdvertising(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.identifierForVendor> property.
  		 */
  def getIdentifierForVendor(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.isAdvertisingTrackingEnabled> property.
  		 */
  def getIsAdvertisingTrackingEnabled(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.lifecycleContainer> property.
  		 */
  def getLifecycleContainer(): titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.locale> property.
  		 */
  def getLocale(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.macaddress> property.
  		 */
  def getMacaddress(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.manufacturer> property.
  		 */
  def getManufacturer(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.model> property.
  		 */
  def getModel(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.name> property.
  		 */
  def getName(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.netmask> property.
  		 */
  def getNetmask(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.osname> property.
  		 */
  def getOsname(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.ostype> property.
  		 */
  def getOstype(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.processorCount> property.
  		 */
  def getProcessorCount(): scala.Double = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.runtime> property.
  		 */
  def getRuntime(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.totalMemory> property.
  		 */
  def getTotalMemory(): scala.Double = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.uptime> property.
  		 */
  def getUptime(): scala.Double = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.username> property.
  		 */
  def getUsername(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.version> property.
  		 */
  def getVersion(): java.lang.String = js.native
  /**
  		 * Returns whether the system settings are configured to show times in 24-hour format.
  		 */
  def is24HourTimeFormat(): scala.Boolean = js.native
  /**
  		 * Opens this URL using the system's default application for its protocol.
  		 */
  def openURL(url: java.lang.String, options: js.Any, callback: js.Function0[_]): scala.Boolean = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Platform.batteryMonitoring> property.
  		 */
  def setBatteryMonitoring(batteryMonitoring: scala.Boolean): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Platform.bubbleParent> property.
  		 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Platform.identifierForAdvertising> property.
  		 */
  def setIdentifierForAdvertising(identifierForAdvertising: java.lang.String): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Platform.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.TabGroup): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Platform.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window): scala.Unit = js.native
}

