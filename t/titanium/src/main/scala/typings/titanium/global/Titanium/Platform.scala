package typings.titanium.global.Titanium

import typings.titanium.CPU
import typings.titanium.OpenURLOptions
import typings.titanium.Titanium.Event
import typings.titanium.Titanium.Platform.DisplayCaps
import typings.titanium.Titanium.PlatformBatteryEvent
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import typings.titanium.titaniumStrings.battery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The top-level Platform module.  The Platform module is used to access the device's platform-related
  * functionality.
  */
@JSGlobal("Titanium.Platform")
@js.native
class Platform ()
  extends typings.titanium.Titanium.Proxy
/**
  * The top-level Platform module.  The Platform module is used to access the device's platform-related
  * functionality.
  */
object Platform {
  
  @JSGlobal("Titanium.Platform")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The Android-specific Platform module, used to access the device's platform-related functionality.
    */
  @JSGlobal("Titanium.Platform.Android")
  @js.native
  class Android ()
    extends typings.titanium.Titanium.Proxy
  object Android {
    
    @JSGlobal("Titanium.Platform.Android")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Android API level identifier of the Operating System.
      */
    /* static member */
    @JSGlobal("Titanium.Platform.Android.API_LEVEL")
    @js.native
    val API_LEVEL: Double = js.native
    
    /**
      * Constant to indicate that the physical size category of the current device/emulator is large
      */
    /* static member */
    @JSGlobal("Titanium.Platform.Android.PHYSICAL_SIZE_CATEGORY_LARGE")
    @js.native
    val PHYSICAL_SIZE_CATEGORY_LARGE: Double = js.native
    
    /**
      * Constant to indicate that the physical size category of the current device/emulator is normal
      */
    /* static member */
    @JSGlobal("Titanium.Platform.Android.PHYSICAL_SIZE_CATEGORY_NORMAL")
    @js.native
    val PHYSICAL_SIZE_CATEGORY_NORMAL: Double = js.native
    
    /**
      * Constant to indicate that the physical size category of the current device/emulator is small
      */
    /* static member */
    @JSGlobal("Titanium.Platform.Android.PHYSICAL_SIZE_CATEGORY_SMALL")
    @js.native
    val PHYSICAL_SIZE_CATEGORY_SMALL: Double = js.native
    
    /**
      * Constant to indicate that the physical size category of the current device/emulator is undefined
      */
    /* static member */
    @JSGlobal("Titanium.Platform.Android.PHYSICAL_SIZE_CATEGORY_UNDEFINED")
    @js.native
    val PHYSICAL_SIZE_CATEGORY_UNDEFINED: Double = js.native
    
    /**
      * Constant to indicate that the physical size category of the current device/emulator is extra large
      */
    /* static member */
    @JSGlobal("Titanium.Platform.Android.PHYSICAL_SIZE_CATEGORY_XLARGE")
    @js.native
    val PHYSICAL_SIZE_CATEGORY_XLARGE: Double = js.native
    
    /**
      * Adds the specified callback as an event listener for the named event.
      */
    /* static member */
    @JSGlobal("Titanium.Platform.Android.addEventListener")
    @js.native
    def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    
    /**
      * The name of the API that this proxy corresponds to.
      */
    /* static member */
    @JSGlobal("Titanium.Platform.Android.apiName")
    @js.native
    val apiName: String = js.native
    
    /**
      * Applies the properties to the proxy.
      */
    /* static member */
    @JSGlobal("Titanium.Platform.Android.applyProperties")
    @js.native
    def applyProperties(props: js.Any): Unit = js.native
    
    /**
      * Indicates if the proxy will bubble an event to its parent.
      */
    /* static member */
    @JSGlobal("Titanium.Platform.Android.bubbleParent")
    @js.native
    def bubbleParent: Boolean = js.native
    @scala.inline
    def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
    
    /**
      * Fires a synthesized event to any registered listeners.
      */
    /* static member */
    @JSGlobal("Titanium.Platform.Android.fireEvent")
    @js.native
    def fireEvent(name: String): Unit = js.native
    @JSGlobal("Titanium.Platform.Android.fireEvent")
    @js.native
    def fireEvent(name: String, event: js.Any): Unit = js.native
    
    /**
      * Gets the value of the <Titanium.Platform.Android.apiName> property.
      * @deprecated Access <Titanium.Platform.Android.apiName> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Platform.Android.getApiName")
    @js.native
    def getApiName(): String = js.native
    
    /**
      * Gets the value of the <Titanium.Platform.Android.bubbleParent> property.
      * @deprecated Access <Titanium.Platform.Android.bubbleParent> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Platform.Android.getBubbleParent")
    @js.native
    def getBubbleParent(): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.Platform.Android.lifecycleContainer> property.
      * @deprecated Access <Titanium.Platform.Android.lifecycleContainer> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Platform.Android.getLifecycleContainer")
    @js.native
    def getLifecycleContainer(): Window | TabGroup = js.native
    
    /**
      * Gets the value of the <Titanium.Platform.Android.physicalSizeCategory> property.
      * @deprecated Access <Titanium.Platform.Android.physicalSizeCategory> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Platform.Android.getPhysicalSizeCategory")
    @js.native
    def getPhysicalSizeCategory(): Double = js.native
    
    /**
      * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
      */
    /* static member */
    @JSGlobal("Titanium.Platform.Android.lifecycleContainer")
    @js.native
    def lifecycleContainer: Window | TabGroup = js.native
    @scala.inline
    def lifecycleContainer_=(x: Window | TabGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lifecycleContainer")(x.asInstanceOf[js.Any])
    
    /**
      * The physical size category of the Android device or emulator.
      */
    /* static member */
    @JSGlobal("Titanium.Platform.Android.physicalSizeCategory")
    @js.native
    val physicalSizeCategory: Double = js.native
    
    /**
      * Removes the specified callback as an event listener for the named event.
      */
    /* static member */
    @JSGlobal("Titanium.Platform.Android.removeEventListener")
    @js.native
    def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Platform.Android.bubbleParent> property.
      * @deprecated Set the value using <Titanium.Platform.Android.bubbleParent> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Platform.Android.setBubbleParent")
    @js.native
    def setBubbleParent(bubbleParent: Boolean): Unit = js.native
    
    @JSGlobal("Titanium.Platform.Android.setLifecycleContainer")
    @js.native
    def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
    /**
      * Sets the value of the <Titanium.Platform.Android.lifecycleContainer> property.
      * @deprecated Set the value using <Titanium.Platform.Android.lifecycleContainer> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Platform.Android.setLifecycleContainer")
    @js.native
    def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  }
  
  /**
    * Constant to indicate that the system is plugged in and currently being charged.
    */
  @JSGlobal("Titanium.Platform.BATTERY_STATE_CHARGING")
  @js.native
  val BATTERY_STATE_CHARGING: Double = js.native
  
  /**
    * Constant to indicate that the battery is fully charged.
    */
  @JSGlobal("Titanium.Platform.BATTERY_STATE_FULL")
  @js.native
  val BATTERY_STATE_FULL: Double = js.native
  
  /**
    * Constant to indicate that the battery state is not known or monitoring is disabled.
    */
  @JSGlobal("Titanium.Platform.BATTERY_STATE_UNKNOWN")
  @js.native
  val BATTERY_STATE_UNKNOWN: Double = js.native
  
  /**
    * Constant to indicate that the system is unplugged.
    */
  @JSGlobal("Titanium.Platform.BATTERY_STATE_UNPLUGGED")
  @js.native
  val BATTERY_STATE_UNPLUGGED: Double = js.native
  
  /**
    * The Display Caps object returned by the <Titanium.Platform.displayCaps> property.
    */
  @JSGlobal("Titanium.Platform.DisplayCaps")
  @js.native
  class DisplayCaps_ () extends DisplayCaps
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.addEventListener")
  @js.native
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.addEventListener")
  @js.native
  def addEventListener_battery(
    name: battery,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.Platform, 
      /* event */ PlatformBatteryEvent, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * System's WIFI IP address. No other network types are supported.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.address")
  @js.native
  val address: String = js.native
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.apiName")
  @js.native
  val apiName: String = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.applyProperties")
  @js.native
  def applyProperties(props: js.Any): Unit = js.native
  
  /**
    * System's processor architecture.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.architecture")
  @js.native
  val architecture: String = js.native
  
  /**
    * System's unused memory, measured in bytes.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.availableMemory")
  @js.native
  val availableMemory: Double = js.native
  
  /**
    * Battery level in percent, accessible only when `batteryMonitoring` is enabled. Measured
    * in 5% increments on iPhone/iPad.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.batteryLevel")
  @js.native
  val batteryLevel: Double = js.native
  
  /**
    * Determines whether battery monitoring is enabled.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.batteryMonitoring")
  @js.native
  def batteryMonitoring: Boolean = js.native
  @scala.inline
  def batteryMonitoring_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("batteryMonitoring")(x.asInstanceOf[js.Any])
  
  /**
    * Indicates the state of the battery. Accessible only when `batteryMonitoring` is enabled.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.batteryState")
  @js.native
  val batteryState: Double = js.native
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.bubbleParent")
  @js.native
  def bubbleParent: Boolean = js.native
  @scala.inline
  def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
  
  /**
    * Returns whether the system is configured with a default application to handle the URL's protocol/scheme.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.canOpenURL")
  @js.native
  def canOpenURL(url: String): Boolean = js.native
  
  /**
    * Returns an array of basic cpu information for all logical processors
    */
  /* static member */
  @JSGlobal("Titanium.Platform.cpus")
  @js.native
  def cpus(): js.Array[CPU] = js.native
  
  /**
    * Creates a globally-unique identifier.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.createUUID")
  @js.native
  def createUUID(): String = js.native
  
  /**
    * Returns the DisplayCaps object.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.displayCaps")
  @js.native
  val displayCaps: DisplayCaps = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.fireEvent")
  @js.native
  def fireEvent(name: String): Unit = js.native
  @JSGlobal("Titanium.Platform.fireEvent")
  @js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
    * Fires a synthesized event to any registered listeners.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.fireEvent")
  @js.native
  def fireEvent_battery(name: battery): Unit = js.native
  @JSGlobal("Titanium.Platform.fireEvent")
  @js.native
  def fireEvent_battery(name: battery, event: PlatformBatteryEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.Platform.address> property.
    * @deprecated Access <Titanium.Platform.address> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.getAddress")
  @js.native
  def getAddress(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Platform.apiName> property.
    * @deprecated Access <Titanium.Platform.apiName> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.getApiName")
  @js.native
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Platform.architecture> property.
    * @deprecated Access <Titanium.Platform.architecture> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.getArchitecture")
  @js.native
  def getArchitecture(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Platform.availableMemory> property.
    * @deprecated Access <Titanium.Platform.availableMemory> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.getAvailableMemory")
  @js.native
  def getAvailableMemory(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Platform.batteryLevel> property.
    * @deprecated Access <Titanium.Platform.batteryLevel> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.getBatteryLevel")
  @js.native
  def getBatteryLevel(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Platform.batteryMonitoring> property.
    * @deprecated Access <Titanium.Platform.batteryMonitoring> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.getBatteryMonitoring")
  @js.native
  def getBatteryMonitoring(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Platform.batteryState> property.
    * @deprecated Access <Titanium.Platform.batteryState> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.getBatteryState")
  @js.native
  def getBatteryState(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Platform.bubbleParent> property.
    * @deprecated Access <Titanium.Platform.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.getBubbleParent")
  @js.native
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Platform.displayCaps> property.
    * @deprecated Access <Titanium.Platform.displayCaps> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.getDisplayCaps")
  @js.native
  def getDisplayCaps(): DisplayCaps = js.native
  
  /**
    * Gets the value of the <Titanium.Platform.id> property.
    * @deprecated Access <Titanium.Platform.id> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.getId")
  @js.native
  def getId(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Platform.identifierForAdvertising> property.
    * @deprecated Access <Titanium.Platform.identifierForAdvertising> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.getIdentifierForAdvertising")
  @js.native
  def getIdentifierForAdvertising(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Platform.identifierForVendor> property.
    * @deprecated Access <Titanium.Platform.identifierForVendor> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.getIdentifierForVendor")
  @js.native
  def getIdentifierForVendor(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Platform.isAdvertisingTrackingEnabled> property.
    * @deprecated Access <Titanium.Platform.isAdvertisingTrackingEnabled> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.getIsAdvertisingTrackingEnabled")
  @js.native
  def getIsAdvertisingTrackingEnabled(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Platform.lifecycleContainer> property.
    * @deprecated Access <Titanium.Platform.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.getLifecycleContainer")
  @js.native
  def getLifecycleContainer(): Window | TabGroup = js.native
  
  /**
    * Gets the value of the <Titanium.Platform.locale> property.
    * @deprecated Access <Titanium.Platform.locale> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.getLocale")
  @js.native
  def getLocale(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Platform.macaddress> property.
    * @deprecated Access <Titanium.Platform.macaddress> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.getMacaddress")
  @js.native
  def getMacaddress(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Platform.manufacturer> property.
    * @deprecated Access <Titanium.Platform.manufacturer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.getManufacturer")
  @js.native
  def getManufacturer(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Platform.model> property.
    * @deprecated Access <Titanium.Platform.model> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.getModel")
  @js.native
  def getModel(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Platform.name> property.
    * @deprecated Access <Titanium.Platform.name> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.getName")
  @js.native
  def getName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Platform.netmask> property.
    * @deprecated Access <Titanium.Platform.netmask> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.getNetmask")
  @js.native
  def getNetmask(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Platform.osname> property.
    * @deprecated Access <Titanium.Platform.osname> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.getOsname")
  @js.native
  def getOsname(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Platform.ostype> property.
    * @deprecated Access <Titanium.Platform.ostype> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.getOstype")
  @js.native
  def getOstype(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Platform.processorCount> property.
    * @deprecated Access <Titanium.Platform.processorCount> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.getProcessorCount")
  @js.native
  def getProcessorCount(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Platform.runtime> property.
    * @deprecated Access <Titanium.Platform.runtime> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.getRuntime")
  @js.native
  def getRuntime(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Platform.totalMemory> property.
    * @deprecated Access <Titanium.Platform.totalMemory> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.getTotalMemory")
  @js.native
  def getTotalMemory(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Platform.uptime> property.
    * @deprecated Access <Titanium.Platform.uptime> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.getUptime")
  @js.native
  def getUptime(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Platform.username> property.
    * @deprecated Access <Titanium.Platform.username> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.getUsername")
  @js.native
  def getUsername(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Platform.version> property.
    * @deprecated Access <Titanium.Platform.version> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.getVersion")
  @js.native
  def getVersion(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Platform.versionMajor> property.
    * @deprecated Access <Titanium.Platform.versionMajor> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.getVersionMajor")
  @js.native
  def getVersionMajor(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Platform.versionMinor> property.
    * @deprecated Access <Titanium.Platform.versionMinor> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.getVersionMinor")
  @js.native
  def getVersionMinor(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Platform.versionPatch> property.
    * @deprecated Access <Titanium.Platform.versionPatch> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.getVersionPatch")
  @js.native
  def getVersionPatch(): Double = js.native
  
  /**
    * Applications's globally-unique ID (UUID).
    */
  /* static member */
  @JSGlobal("Titanium.Platform.id")
  @js.native
  val id: String = js.native
  
  /**
    * An alphanumeric string unique to each device, used only for serving advertisements.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.identifierForAdvertising")
  @js.native
  def identifierForAdvertising: String = js.native
  @scala.inline
  def identifierForAdvertising_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identifierForAdvertising")(x.asInstanceOf[js.Any])
  
  /**
    * An alphanumeric string that uniquely identifies a device to the app's vendor.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.identifierForVendor")
  @js.native
  val identifierForVendor: String = js.native
  
  /**
    * Returns whether the system settings are configured to show times in 24-hour format.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.is24HourTimeFormat")
  @js.native
  def is24HourTimeFormat(): Boolean = js.native
  
  /**
    * A Boolean value that indicates whether the user has limited ad tracking.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.isAdvertisingTrackingEnabled")
  @js.native
  val isAdvertisingTrackingEnabled: Boolean = js.native
  
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.lifecycleContainer")
  @js.native
  def lifecycleContainer: Window | TabGroup = js.native
  @scala.inline
  def lifecycleContainer_=(x: Window | TabGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lifecycleContainer")(x.asInstanceOf[js.Any])
  
  /**
    * System's default language.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.locale")
  @js.native
  val locale: String = js.native
  
  /**
    * System's network interface mac address, or app UUID.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.macaddress")
  @js.native
  val macaddress: String = js.native
  
  /**
    * Manufacturer of the device.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.manufacturer")
  @js.native
  val manufacturer: String = js.native
  
  /**
    * Model of the device.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.model")
  @js.native
  val model: String = js.native
  
  /**
    * Name of the platform. Returns `android` for the Android platform, `iPhone OS` for the iOS
    * platform (iPhone, iPad, or iPod Touch), and `windows` for the Windows platform.
    * Since iOS 10 this property returns `iOS` for for the iOS platform (iPhone, iPad, or iPod Touch).
    */
  /* static member */
  @JSGlobal("Titanium.Platform.name")
  @js.native
  val name: String = js.native
  
  /**
    * System's WIFI network mask. No other network types are supported.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.netmask")
  @js.native
  val netmask: String = js.native
  
  /**
    * Opens this URL using the system's default application for its protocol/scheme.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.openURL")
  @js.native
  def openURL(url: String): Boolean = js.native
  @JSGlobal("Titanium.Platform.openURL")
  @js.native
  def openURL(
    url: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* repeated */ js.Any, Unit]
  ): Boolean = js.native
  @JSGlobal("Titanium.Platform.openURL")
  @js.native
  def openURL(url: String, options: OpenURLOptions): Boolean = js.native
  @JSGlobal("Titanium.Platform.openURL")
  @js.native
  def openURL(url: String, options: OpenURLOptions, callback: js.Function1[/* repeated */ js.Any, Unit]): Boolean = js.native
  
  /**
    * Short name of the system's Operating System. Returns `android` for the Android platfrom,
    * `iphone` for the iPhone or iPod Touch, `ipad` for the iPad, `windowsphone` for Windows Phone, and `windowsstore` for Windows Store
    * platform.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.osname")
  @js.native
  val osname: String = js.native
  
  /**
    * Operating System architecture. On Android, this is `32bit`.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.ostype")
  @js.native
  val ostype: String = js.native
  
  /**
    * Number of logical processing cores.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.processorCount")
  @js.native
  val processorCount: Double = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.removeEventListener")
  @js.native
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.removeEventListener")
  @js.native
  def removeEventListener_battery(
    name: battery,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.Platform, 
      /* event */ PlatformBatteryEvent, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Short name of the JavaScript runtime in use.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.runtime")
  @js.native
  val runtime: String = js.native
  
  /**
    * Sets the value of the <Titanium.Platform.batteryMonitoring> property.
    * @deprecated Set the value using <Titanium.Platform.batteryMonitoring> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.setBatteryMonitoring")
  @js.native
  def setBatteryMonitoring(batteryMonitoring: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Platform.bubbleParent> property.
    * @deprecated Set the value using <Titanium.Platform.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.setBubbleParent")
  @js.native
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Platform.identifierForAdvertising> property.
    * @deprecated Set the value using <Titanium.Platform.identifierForAdvertising> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.setIdentifierForAdvertising")
  @js.native
  def setIdentifierForAdvertising(identifierForAdvertising: String): Unit = js.native
  
  @JSGlobal("Titanium.Platform.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.Platform.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.Platform.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  
  /**
    * System's total memory, measured in bytes.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.totalMemory")
  @js.native
  val totalMemory: Double = js.native
  
  /**
    * System uptime since last boot in seconds.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.uptime")
  @js.native
  val uptime: Double = js.native
  
  /**
    * System name, if set. On iOS, this can be found in Settings > General > About > Name.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.username")
  @js.native
  val username: String = js.native
  
  /**
    * The operating system's version string.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.version")
  @js.native
  val version: String = js.native
  
  /**
    * The operating system's major version number.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.versionMajor")
  @js.native
  val versionMajor: Double = js.native
  
  /**
    * The operating system's minor version number.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.versionMinor")
  @js.native
  val versionMinor: Double = js.native
  
  /**
    * The operating system's patch version number.
    */
  /* static member */
  @JSGlobal("Titanium.Platform.versionPatch")
  @js.native
  val versionPatch: Double = js.native
}
