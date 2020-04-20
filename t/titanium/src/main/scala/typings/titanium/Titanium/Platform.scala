package typings.titanium.Titanium

import typings.titanium.CPU
import typings.titanium.OpenURLOptions
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import typings.titanium.titaniumStrings.battery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The top-level Platform module.  The Platform module is used to access the device's platform-related
	 * functionality.
	 */
@JSGlobal("Titanium.Platform")
@js.native
class Platform () extends Module

/**
	 * The top-level Platform module.  The Platform module is used to access the device's platform-related
	 * functionality.
	 */
/* static members */
@JSGlobal("Titanium.Platform")
@js.native
object Platform extends js.Object {
  /**
  		 * The Android-specific Platform module, used to access the device's platform-related functionality.
  		 */
  @js.native
  class Android () extends Module
  
  /**
  		 * The Display Caps object returned by the <Titanium.Platform.displayCaps> property.
  		 */
  @js.native
  class DisplayCaps () extends Proxy {
    /**
    			 * Logical density of the display.
    			 */
    val density: String = js.native
    /**
    			 * Display density expressed as dots-per-inch.
    			 */
    val dpi: Double = js.native
    /**
    			 * Logical density of the display, as a scaling factor for the Density Independent Pixel (dip)
    			 * unit.
    			 */
    val logicalDensityFactor: Double = js.native
    /**
    			 * Absolute height of the display in relation to UI orientation. Measured in platform-specific
    			 * units; pixels on Android and density-independent pixels (dip) on iOS.
    			 */
    val platformHeight: Double = js.native
    /**
    			 * Absolute width of the display in relation to UI orientation. Measured in platform-specific
    			 * units; pixels on Android and density-independent pixels (dip) on iOS.
    			 */
    val platformWidth: Double = js.native
    /**
    			 * Physical pixels per inch of the display in the X dimension.
    			 */
    val xdpi: Double = js.native
    /**
    			 * Physical pixels per inch of the display in the Y dimension.
    			 */
    val ydpi: Double = js.native
    /**
    			 * Gets the value of the <Titanium.Platform.DisplayCaps.density> property.
    			 * @deprecated Access <Titanium.Platform.DisplayCaps.density> instead.
    			 */
    def getDensity(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Platform.DisplayCaps.dpi> property.
    			 * @deprecated Access <Titanium.Platform.DisplayCaps.dpi> instead.
    			 */
    def getDpi(): Double = js.native
    /**
    			 * Gets the value of the <Titanium.Platform.DisplayCaps.logicalDensityFactor> property.
    			 * @deprecated Access <Titanium.Platform.DisplayCaps.logicalDensityFactor> instead.
    			 */
    def getLogicalDensityFactor(): Double = js.native
    /**
    			 * Gets the value of the <Titanium.Platform.DisplayCaps.platformHeight> property.
    			 * @deprecated Access <Titanium.Platform.DisplayCaps.platformHeight> instead.
    			 */
    def getPlatformHeight(): Double = js.native
    /**
    			 * Gets the value of the <Titanium.Platform.DisplayCaps.platformWidth> property.
    			 * @deprecated Access <Titanium.Platform.DisplayCaps.platformWidth> instead.
    			 */
    def getPlatformWidth(): Double = js.native
    /**
    			 * Gets the value of the <Titanium.Platform.DisplayCaps.xdpi> property.
    			 * @deprecated Access <Titanium.Platform.DisplayCaps.xdpi> instead.
    			 */
    def getXdpi(): Double = js.native
    /**
    			 * Gets the value of the <Titanium.Platform.DisplayCaps.ydpi> property.
    			 * @deprecated Access <Titanium.Platform.DisplayCaps.ydpi> instead.
    			 */
    def getYdpi(): Double = js.native
  }
  
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
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
  		 * Adds the specified callback as an event listener for the named event.
  		 */
  @JSName("addEventListener")
  def addEventListener_battery(
    name: battery,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ PlatformBatteryEvent, Unit]
  ): Unit = js.native
  /**
  		 * Applies the properties to the proxy.
  		 */
  def applyProperties(props: js.Any): Unit = js.native
  /**
  		 * Returns whether the system is configured with a default application to handle the URL's protocol/scheme.
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
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  @JSName("fireEvent")
  def fireEvent_battery(name: battery): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_battery(name: battery, event: PlatformBatteryEvent): Unit = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.address> property.
  		 * @deprecated Access <Titanium.Platform.address> instead.
  		 */
  def getAddress(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.apiName> property.
  		 * @deprecated Access <Titanium.Platform.apiName> instead.
  		 */
  def getApiName(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.architecture> property.
  		 * @deprecated Access <Titanium.Platform.architecture> instead.
  		 */
  def getArchitecture(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.availableMemory> property.
  		 * @deprecated Access <Titanium.Platform.availableMemory> instead.
  		 */
  def getAvailableMemory(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.batteryLevel> property.
  		 * @deprecated Access <Titanium.Platform.batteryLevel> instead.
  		 */
  def getBatteryLevel(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.batteryMonitoring> property.
  		 * @deprecated Access <Titanium.Platform.batteryMonitoring> instead.
  		 */
  def getBatteryMonitoring(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.batteryState> property.
  		 * @deprecated Access <Titanium.Platform.batteryState> instead.
  		 */
  def getBatteryState(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.bubbleParent> property.
  		 * @deprecated Access <Titanium.Platform.bubbleParent> instead.
  		 */
  def getBubbleParent(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.displayCaps> property.
  		 * @deprecated Access <Titanium.Platform.displayCaps> instead.
  		 */
  def getDisplayCaps(): DisplayCaps = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.id> property.
  		 * @deprecated Access <Titanium.Platform.id> instead.
  		 */
  def getId(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.identifierForAdvertising> property.
  		 * @deprecated Access <Titanium.Platform.identifierForAdvertising> instead.
  		 */
  def getIdentifierForAdvertising(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.identifierForVendor> property.
  		 * @deprecated Access <Titanium.Platform.identifierForVendor> instead.
  		 */
  def getIdentifierForVendor(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.isAdvertisingTrackingEnabled> property.
  		 * @deprecated Access <Titanium.Platform.isAdvertisingTrackingEnabled> instead.
  		 */
  def getIsAdvertisingTrackingEnabled(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.lifecycleContainer> property.
  		 * @deprecated Access <Titanium.Platform.lifecycleContainer> instead.
  		 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.locale> property.
  		 * @deprecated Access <Titanium.Platform.locale> instead.
  		 */
  def getLocale(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.macaddress> property.
  		 * @deprecated Access <Titanium.Platform.macaddress> instead.
  		 */
  def getMacaddress(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.manufacturer> property.
  		 * @deprecated Access <Titanium.Platform.manufacturer> instead.
  		 */
  def getManufacturer(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.model> property.
  		 * @deprecated Access <Titanium.Platform.model> instead.
  		 */
  def getModel(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.name> property.
  		 * @deprecated Access <Titanium.Platform.name> instead.
  		 */
  def getName(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.netmask> property.
  		 * @deprecated Access <Titanium.Platform.netmask> instead.
  		 */
  def getNetmask(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.osname> property.
  		 * @deprecated Access <Titanium.Platform.osname> instead.
  		 */
  def getOsname(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.ostype> property.
  		 * @deprecated Access <Titanium.Platform.ostype> instead.
  		 */
  def getOstype(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.processorCount> property.
  		 * @deprecated Access <Titanium.Platform.processorCount> instead.
  		 */
  def getProcessorCount(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.runtime> property.
  		 * @deprecated Access <Titanium.Platform.runtime> instead.
  		 */
  def getRuntime(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.totalMemory> property.
  		 * @deprecated Access <Titanium.Platform.totalMemory> instead.
  		 */
  def getTotalMemory(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.uptime> property.
  		 * @deprecated Access <Titanium.Platform.uptime> instead.
  		 */
  def getUptime(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.username> property.
  		 * @deprecated Access <Titanium.Platform.username> instead.
  		 */
  def getUsername(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Platform.version> property.
  		 * @deprecated Access <Titanium.Platform.version> instead.
  		 */
  def getVersion(): String = js.native
  /**
  		 * Returns whether the system settings are configured to show times in 24-hour format.
  		 */
  def is24HourTimeFormat(): Boolean = js.native
  /**
  		 * Opens this URL using the system's default application for its protocol/scheme.
  		 */
  def openURL(url: String): Boolean = js.native
  def openURL(url: String, options: OpenURLOptions): Boolean = js.native
  def openURL(url: String, options: OpenURLOptions, callback: js.Function1[/* repeated */ js.Any, Unit]): Boolean = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  @JSName("removeEventListener")
  def removeEventListener_battery(
    name: battery,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ PlatformBatteryEvent, Unit]
  ): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Platform.batteryMonitoring> property.
  		 * @deprecated Set the value using <Titanium.Platform.batteryMonitoring> instead.
  		 */
  def setBatteryMonitoring(batteryMonitoring: Boolean): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Platform.bubbleParent> property.
  		 * @deprecated Set the value using <Titanium.Platform.bubbleParent> instead.
  		 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Platform.identifierForAdvertising> property.
  		 * @deprecated Set the value using <Titanium.Platform.identifierForAdvertising> instead.
  		 */
  def setIdentifierForAdvertising(identifierForAdvertising: String): Unit = js.native
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Platform.lifecycleContainer> property.
  		 * @deprecated Set the value using <Titanium.Platform.lifecycleContainer> instead.
  		 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  /* static members */
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
    def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
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
    			 * Gets the value of the <Titanium.Platform.Android.apiName> property.
    			 * @deprecated Access <Titanium.Platform.Android.apiName> instead.
    			 */
    def getApiName(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Platform.Android.bubbleParent> property.
    			 * @deprecated Access <Titanium.Platform.Android.bubbleParent> instead.
    			 */
    def getBubbleParent(): Boolean = js.native
    /**
    			 * Gets the value of the <Titanium.Platform.Android.lifecycleContainer> property.
    			 * @deprecated Access <Titanium.Platform.Android.lifecycleContainer> instead.
    			 */
    def getLifecycleContainer(): Window | TabGroup = js.native
    /**
    			 * Gets the value of the <Titanium.Platform.Android.physicalSizeCategory> property.
    			 * @deprecated Access <Titanium.Platform.Android.physicalSizeCategory> instead.
    			 */
    def getPhysicalSizeCategory(): Double = js.native
    /**
    			 * Removes the specified callback as an event listener for the named event.
    			 */
    def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Platform.Android.bubbleParent> property.
    			 * @deprecated Set the value using <Titanium.Platform.Android.bubbleParent> instead.
    			 */
    def setBubbleParent(bubbleParent: Boolean): Unit = js.native
    def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Platform.Android.lifecycleContainer> property.
    			 * @deprecated Set the value using <Titanium.Platform.Android.lifecycleContainer> instead.
    			 */
    def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  }
  
}

