package typings.titanium

import typings.titanium.Titanium.Platform.DisplayCaps
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofPlatform extends js.Object {
  /**
  		 * The Android-specific Platform module, used to access the device's platform-related functionality.
  		 */
  val Android: TypeofAndroidAPILEVEL = js.native
  /**
  		 * Constant to indicate that the system is plugged in and currently being charged.
  		 */
  val BATTERY_STATE_CHARGING: Double = js.native
  /**
  		 * Constant to indicate that the battery is fully charged.
  		 */
  val BATTERY_STATE_FULL: Double = js.native
  /**
  		 * Constant to indicate that the battery state is not known or monitoring is disabled.
  		 */
  val BATTERY_STATE_UNKNOWN: Double = js.native
  /**
  		 * Constant to indicate that the system is unplugged.
  		 */
  val BATTERY_STATE_UNPLUGGED: Double = js.native
  /**
  		 * System's WIFI IP address. No other network types are supported.
  		 */
  val address: String = js.native
  /**
  		 * The name of the API that this proxy corresponds to.
  		 */
  val apiName: String = js.native
  /**
  		 * System's processor architecture.
  		 */
  val architecture: String = js.native
  /**
  		 * System's unused memory, measured in bytes.
  		 */
  val availableMemory: Double = js.native
  /**
  		 * Battery level in percent, accessible only when `batteryMonitoring` is enabled. Measured
  		 * in 5% increments on iPhone/iPad.
  		 */
  val batteryLevel: Double = js.native
  /**
  		 * Determines whether battery monitoring is enabled.
  		 */
  var batteryMonitoring: Boolean = js.native
  /**
  		 * Indicates the state of the battery. Accessible only when `batteryMonitoring` is enabled.
  		 */
  val batteryState: Double = js.native
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: Boolean = js.native
  /**
  		 * Returns the DisplayCaps object.
  		 */
  val displayCaps: DisplayCaps = js.native
  /**
  		 * Applications's globally-unique ID (UUID).
  		 */
  val id: String = js.native
  /**
  		 * An alphanumeric string unique to each device, used only for serving advertisements.
  		 */
  var identifierForAdvertising: String = js.native
  /**
  		 * An alphanumeric string that uniquely identifies a device to the app's vendor.
  		 */
  val identifierForVendor: String = js.native
  /**
  		 * A Boolean value that indicates whether the user has limited ad tracking.
  		 */
  val isAdvertisingTrackingEnabled: Boolean = js.native
  /**
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: Window | TabGroup = js.native
  /**
  		 * System's default language.
  		 */
  val locale: String = js.native
  /**
  		 * System's network interface mac address, or app UUID.
  		 */
  val macaddress: String = js.native
  /**
  		 * Manufacturer of the device.
  		 */
  val manufacturer: String = js.native
  /**
  		 * Model of the device.
  		 */
  val model: String = js.native
  /**
  		 * Name of the platform. Returns `android` for the Android platform, `iPhone OS` for the iOS
  		 * platform (iPhone, iPad, or iPod Touch), and `windows` for the Windows platform.
  		 * Since iOS 10 this property returns `iOS` for for the iOS platform (iPhone, iPad, or iPod Touch).
  		 */
  val name: String = js.native
  /**
  		 * System's WIFI network mask. No other network types are supported.
  		 */
  val netmask: String = js.native
  /**
  		 * Short name of the system's Operating System. Returns `android` for the Android platfrom,
  		 * `iphone` for the iPhone or iPod Touch, `ipad` for the iPad, `windowsphone` for Windows Phone, and `windowsstore` for Windows Store
  		 * platform.
  		 */
  val osname: String = js.native
  /**
  		 * Operating System architecture. On Android, this is `32bit`.
  		 */
  val ostype: String = js.native
  /**
  		 * Number of logical processing cores.
  		 */
  val processorCount: Double = js.native
  /**
  		 * Short name of the JavaScript runtime in use.
  		 */
  val runtime: String = js.native
  /**
  		 * System's total memory, measured in bytes.
  		 */
  val totalMemory: Double = js.native
  /**
  		 * System uptime since last boot in seconds.
  		 */
  val uptime: Double = js.native
  /**
  		 * System name, if set. On iOS, this can be found in Settings > General > About > Name.
  		 */
  val username: String = js.native
  /**
  		 * System's OS version.
  		 */
  val version: String = js.native
  /**
  		 * Adds the specified callback as an event listener for the named event.
  		 */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  		 * Applies the properties to the proxy.
  		 */
  def applyProperties(props: js.Any): Unit = js.native
  /**
  		 * Returns whether the system is configured with a default application to handle the URL's protocol.
  		 */
  def canOpenURL(url: String): Boolean = js.native
  /**
  		 * Returns an array of basic cpu information for all logical processors
  		 */
  def cpus(): js.Array[CPU] = js.native
  /**
  		 * Creates a globally-unique identifier.
  		 */
  def createUUID(): String = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.address> property.
  		 */
  def getAddress(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.apiName> property.
  		 */
  def getApiName(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.architecture> property.
  		 */
  def getArchitecture(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.availableMemory> property.
  		 */
  def getAvailableMemory(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.batteryLevel> property.
  		 */
  def getBatteryLevel(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.batteryMonitoring> property.
  		 */
  def getBatteryMonitoring(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.batteryState> property.
  		 */
  def getBatteryState(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.bubbleParent> property.
  		 */
  def getBubbleParent(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.displayCaps> property.
  		 */
  def getDisplayCaps(): DisplayCaps = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.id> property.
  		 */
  def getId(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.identifierForAdvertising> property.
  		 */
  def getIdentifierForAdvertising(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.identifierForVendor> property.
  		 */
  def getIdentifierForVendor(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.isAdvertisingTrackingEnabled> property.
  		 */
  def getIsAdvertisingTrackingEnabled(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.lifecycleContainer> property.
  		 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.locale> property.
  		 */
  def getLocale(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.macaddress> property.
  		 */
  def getMacaddress(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.manufacturer> property.
  		 */
  def getManufacturer(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.model> property.
  		 */
  def getModel(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.name> property.
  		 */
  def getName(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.netmask> property.
  		 */
  def getNetmask(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.osname> property.
  		 */
  def getOsname(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.ostype> property.
  		 */
  def getOstype(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.processorCount> property.
  		 */
  def getProcessorCount(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.runtime> property.
  		 */
  def getRuntime(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.totalMemory> property.
  		 */
  def getTotalMemory(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.uptime> property.
  		 */
  def getUptime(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.username> property.
  		 */
  def getUsername(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.version> property.
  		 */
  def getVersion(): String = js.native
  /**
  		 * Returns whether the system settings are configured to show times in 24-hour format.
  		 */
  def is24HourTimeFormat(): Boolean = js.native
  /**
  		 * Opens this URL using the system's default application for its protocol.
  		 */
  def openURL(url: String, options: js.Any, callback: js.Function0[_]): Boolean = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Platform.batteryMonitoring> property.
  		 */
  def setBatteryMonitoring(batteryMonitoring: Boolean): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Platform.bubbleParent> property.
  		 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Platform.identifierForAdvertising> property.
  		 */
  def setIdentifierForAdvertising(identifierForAdvertising: String): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Platform.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Platform.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
}

