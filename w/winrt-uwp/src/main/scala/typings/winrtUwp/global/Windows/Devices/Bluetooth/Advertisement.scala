package typings.winrtUwp.global.Windows.Devices.Bluetooth

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Allow apps to send and receive Bluetooth Low Energy (LE) advertisements. */
object Advertisement {
  
  /** A representation of a Bluetooth LE advertisement payload. */
  @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisement")
  @js.native
  /** Creates a new BluetoothLEAdvertisement object. */
  class BluetoothLEAdvertisement ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisement
  
  /** A Bluetooth LE advertisement byte pattern for filters to match. */
  @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementBytePattern")
  @js.native
  /** Create a new BluetoothLEAdvertisementBytePattern object. */
  class BluetoothLEAdvertisementBytePattern ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementBytePattern {
    /**
      * Create a new BluetoothLEAdvertisementBytePattern object with an advertisement data type to match, the advertisement data byte pattern to match, and the offset of the byte pattern from the beginning of the advertisement data section.
      * @param dataType The Bluetooth LE advertisement data type to match.
      * @param offset The offset of byte pattern from beginning of advertisement data section.
      * @param data The Bluetooth LE advertisement data byte pattern to match.
      */
    def this(dataType: Double, offset: Double, data: IBuffer) = this()
  }
  
  /** A Bluetooth LE advertisement section. */
  @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataSection")
  @js.native
  /** Creates a new BluetoothLEAdvertisementDataSection object. */
  class BluetoothLEAdvertisementDataSection ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataSection {
    /**
      * Creates a new BluetoothLEAdvertisementDataSection object with the Bluetooth LE advertisement data type and the payload.
      * @param dataType The Bluetooth LE advertisement data type as defined by the Bluetooth Special Interest Group (SIG).
      * @param data The Bluetooth LE advertisement data payload.
      */
    def this(dataType: Double, data: IBuffer) = this()
  }
  
  /** Some of the Bluetooth LE advertisement types defined in the Generic Access Profile (GAP) by the Bluetooth Special Interest Group (SIG). */
  @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataTypes")
  @js.native
  abstract class BluetoothLEAdvertisementDataTypes ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataTypes
  object BluetoothLEAdvertisementDataTypes {
    
    @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataTypes")
    @js.native
    val ^ : js.Any = js.native
    
    /** Section data type for the Bluetooth LE advertising interval. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataTypes.advertisingInterval")
    @js.native
    def advertisingInterval: Double = js.native
    @scala.inline
    def advertisingInterval_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("advertisingInterval")(x.asInstanceOf[js.Any])
    
    /** Section data type for the Bluetooth LE advertising appearance. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataTypes.appearance")
    @js.native
    def appearance: Double = js.native
    @scala.inline
    def appearance_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appearance")(x.asInstanceOf[js.Any])
    
    /** Section data type for the Bluetooth LE complete local name. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataTypes.completeLocalName")
    @js.native
    def completeLocalName: Double = js.native
    @scala.inline
    def completeLocalName_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("completeLocalName")(x.asInstanceOf[js.Any])
    
    /** Section data type for the complete list of 128-bit Bluetooth LE service UUIDs */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataTypes.completeService128BitUuids")
    @js.native
    def completeService128BitUuids: Double = js.native
    @scala.inline
    def completeService128BitUuids_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("completeService128BitUuids")(x.asInstanceOf[js.Any])
    
    /** Section data type for the complete list of 16-bit Bluetooth LE service UUIDs */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataTypes.completeService16BitUuids")
    @js.native
    def completeService16BitUuids: Double = js.native
    @scala.inline
    def completeService16BitUuids_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("completeService16BitUuids")(x.asInstanceOf[js.Any])
    
    /** Section data type for the complete list of 32-bit Bluetooth LE service UUIDs */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataTypes.completeService32BitUuids")
    @js.native
    def completeService32BitUuids: Double = js.native
    @scala.inline
    def completeService32BitUuids_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("completeService32BitUuids")(x.asInstanceOf[js.Any])
    
    /** Section data type for a set of flags for internal use. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataTypes.flags")
    @js.native
    def flags: Double = js.native
    @scala.inline
    def flags_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flags")(x.asInstanceOf[js.Any])
    
    /** Section data type for an incomplete list of 128-bit Bluetooth LE service UUIDs. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataTypes.incompleteService128BitUuids")
    @js.native
    def incompleteService128BitUuids: Double = js.native
    @scala.inline
    def incompleteService128BitUuids_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("incompleteService128BitUuids")(x.asInstanceOf[js.Any])
    
    /** Section data type for an incomplete list of 16-bit Bluetooth LE service UUIDs. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataTypes.incompleteService16BitUuids")
    @js.native
    def incompleteService16BitUuids: Double = js.native
    @scala.inline
    def incompleteService16BitUuids_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("incompleteService16BitUuids")(x.asInstanceOf[js.Any])
    
    /** Section data type for an incomplete list of 32-bit Bluetooth LE service UUIDs. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataTypes.incompleteService32BitUuids")
    @js.native
    def incompleteService32BitUuids: Double = js.native
    @scala.inline
    def incompleteService32BitUuids_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("incompleteService32BitUuids")(x.asInstanceOf[js.Any])
    
    /** Section data type for manufacturer-specific data for a Bluetooth LE advertisements. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataTypes.manufacturerSpecificData")
    @js.native
    def manufacturerSpecificData: Double = js.native
    @scala.inline
    def manufacturerSpecificData_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("manufacturerSpecificData")(x.asInstanceOf[js.Any])
    
    /** Section data type for a list of public Bluetooth LE target addresses. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataTypes.publicTargetAddress")
    @js.native
    def publicTargetAddress: Double = js.native
    @scala.inline
    def publicTargetAddress_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("publicTargetAddress")(x.asInstanceOf[js.Any])
    
    /** Section data type for a list of random Bluetooth LE target addresses. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataTypes.randomTargetAddress")
    @js.native
    def randomTargetAddress: Double = js.native
    @scala.inline
    def randomTargetAddress_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("randomTargetAddress")(x.asInstanceOf[js.Any])
    
    /** Section data type for service data for 128-bit Bluetooth LE UUIDs. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataTypes.serviceData128BitUuids")
    @js.native
    def serviceData128BitUuids: Double = js.native
    @scala.inline
    def serviceData128BitUuids_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serviceData128BitUuids")(x.asInstanceOf[js.Any])
    
    /** Section data type for service data for 16-bit Bluetooth LE UUIDs. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataTypes.serviceData16BitUuids")
    @js.native
    def serviceData16BitUuids: Double = js.native
    @scala.inline
    def serviceData16BitUuids_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serviceData16BitUuids")(x.asInstanceOf[js.Any])
    
    /** Section data type for service data for 32-bit Bluetooth LE UUIDs.. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataTypes.serviceData32BitUuids")
    @js.native
    def serviceData32BitUuids: Double = js.native
    @scala.inline
    def serviceData32BitUuids_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serviceData32BitUuids")(x.asInstanceOf[js.Any])
    
    /** Section data type for a list of 128-bit Bluetooth LE service solicitation UUIDs. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataTypes.serviceSolicitation128BitUuids")
    @js.native
    def serviceSolicitation128BitUuids: Double = js.native
    @scala.inline
    def serviceSolicitation128BitUuids_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serviceSolicitation128BitUuids")(x.asInstanceOf[js.Any])
    
    /** Section data type for a list of 16-bit Bluetooth LE service solicitation UUIDs. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataTypes.serviceSolicitation16BitUuids")
    @js.native
    def serviceSolicitation16BitUuids: Double = js.native
    @scala.inline
    def serviceSolicitation16BitUuids_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serviceSolicitation16BitUuids")(x.asInstanceOf[js.Any])
    
    /** Section data type for a list of 32-bit Bluetooth LE service solicitation UUIDs. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataTypes.serviceSolicitation32BitUuids")
    @js.native
    def serviceSolicitation32BitUuids: Double = js.native
    @scala.inline
    def serviceSolicitation32BitUuids_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serviceSolicitation32BitUuids")(x.asInstanceOf[js.Any])
    
    /** Section data type for a shortened local name. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataTypes.shortenedLocalName")
    @js.native
    def shortenedLocalName: Double = js.native
    @scala.inline
    def shortenedLocalName_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shortenedLocalName")(x.asInstanceOf[js.Any])
    
    /** Section data type for the slave connection interval range. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataTypes.slaveConnectionIntervalRange")
    @js.native
    def slaveConnectionIntervalRange: Double = js.native
    @scala.inline
    def slaveConnectionIntervalRange_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slaveConnectionIntervalRange")(x.asInstanceOf[js.Any])
    
    /** Section data type for the Bluetooth LE transmit power level. */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataTypes.txPowerLevel")
    @js.native
    def txPowerLevel: Double = js.native
    @scala.inline
    def txPowerLevel_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("txPowerLevel")(x.asInstanceOf[js.Any])
  }
  
  /** Groups parameters used to configure payload-based filtering of received Bluetooth LE advertisements. */
  @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFilter")
  @js.native
  /** Creates a new BluetoothLEAdvertisementFilter object. */
  class BluetoothLEAdvertisementFilter ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFilter
  
  /** Specifies flags used to match flags contained inside a Bluetooth LE advertisement payload. */
  @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFlags")
  @js.native
  object BluetoothLEAdvertisementFlags extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFlags with Double
      ] = js.native
    
    /* 3 */ val classicNotSupported: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFlags.classicNotSupported with Double = js.native
    
    /* 4 */ val dualModeControllerCapable: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFlags.dualModeControllerCapable with Double = js.native
    
    /* 5 */ val dualModeHostCapable: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFlags.dualModeHostCapable with Double = js.native
    
    /* 2 */ val generalDiscoverableMode: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFlags.generalDiscoverableMode with Double = js.native
    
    /* 1 */ val limitedDiscoverableMode: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFlags.limitedDiscoverableMode with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFlags.none with Double = js.native
  }
  
  /** An object to send Bluetooth Low Energy (LE) advertisements. */
  @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisher")
  @js.native
  /** Creates a new BluetoothLEAdvertisementPublisher object. */
  class BluetoothLEAdvertisementPublisher ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisher {
    /**
      * Creates a new BluetoothLEAdvertisementPublisher object with the Bluetooth LE advertisement to publish.
      * @param advertisement The Bluetooth LE advertisement to publish.
      */
    def this(advertisement: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisement) = this()
  }
  
  /** Represents the possible states of the BluetoothLEAdvertisementPublisher . */
  @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatus")
  @js.native
  object BluetoothLEAdvertisementPublisherStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatus with Double
      ] = js.native
    
    /* 5 */ val aborted: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatus.aborted with Double = js.native
    
    /* 0 */ val created: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatus.created with Double = js.native
    
    /* 2 */ val started: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatus.started with Double = js.native
    
    /* 4 */ val stopped: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatus.stopped with Double = js.native
    
    /* 3 */ val stopping: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatus.stopping with Double = js.native
    
    /* 1 */ val waiting: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatus.waiting with Double = js.native
  }
  
  /** Provides data for a StatusChanged event on a BluetoothLEAdvertisementPublisher . */
  @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatusChangedEventArgs")
  @js.native
  abstract class BluetoothLEAdvertisementPublisherStatusChangedEventArgs ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatusChangedEventArgs
  
  /** Provides data for a Received event on a BluetoothLEAdvertisementWatcher . */
  @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementReceivedEventArgs")
  @js.native
  abstract class BluetoothLEAdvertisementReceivedEventArgs ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementReceivedEventArgs
  
  /** Specifies the different types of Bluetooth LE advertisement payloads. */
  @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementType")
  @js.native
  object BluetoothLEAdvertisementType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementType with Double
      ] = js.native
    
    /* 1 */ val connectableDirected: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementType.connectableDirected with Double = js.native
    
    /* 0 */ val connectableUndirected: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementType.connectableUndirected with Double = js.native
    
    /* 3 */ val nonConnectableUndirected: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementType.nonConnectableUndirected with Double = js.native
    
    /* 4 */ val scanResponse: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementType.scanResponse with Double = js.native
    
    /* 2 */ val scannableUndirected: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementType.scannableUndirected with Double = js.native
  }
  
  /** An object to receive Bluetooth Low Energy (LE) advertisements. */
  @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementWatcher")
  @js.native
  /** Creates a new BluetoothLEAdvertisementWatcher object. */
  class BluetoothLEAdvertisementWatcher ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementWatcher {
    /**
      * Creates a new BluetoothLEAdvertisementWatcher object with an advertisement filter to initialize the watcher.
      * @param advertisementFilter The advertisement filter to initialize the watcher.
      */
    def this(advertisementFilter: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFilter) = this()
  }
  
  /** Represents the possible states of the BluetoothLEAdvertisementWatcher . */
  @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementWatcherStatus")
  @js.native
  object BluetoothLEAdvertisementWatcherStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementWatcherStatus with Double
      ] = js.native
    
    /* 4 */ val aborted: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementWatcherStatus.aborted with Double = js.native
    
    /* 0 */ val created: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementWatcherStatus.created with Double = js.native
    
    /* 1 */ val started: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementWatcherStatus.started with Double = js.native
    
    /* 3 */ val stopped: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementWatcherStatus.stopped with Double = js.native
    
    /* 2 */ val stopping: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementWatcherStatus.stopping with Double = js.native
  }
  
  /** Provides data for a Stopped event on a BluetoothLEAdvertisementWatcher . */
  @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementWatcherStoppedEventArgs")
  @js.native
  abstract class BluetoothLEAdvertisementWatcherStoppedEventArgs ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementWatcherStoppedEventArgs
  
  /** A Bluetooth LE manufacturer-specific data section (one particular type of LE advertisement section) */
  @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEManufacturerData")
  @js.native
  /** Creates a new BluetoothLEManufacturerData object. */
  class BluetoothLEManufacturerData ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEManufacturerData {
    /**
      * Creates a new BluetoothLEManufacturerData object with a company identifier code and manufacterer-specific section data.
      * @param companyId The Bluetooth LE company identifier code as defined by the Bluetooth Special Interest Group (SIG).
      * @param data Bluetooth LE manufacturer-specific section data.
      */
    def this(companyId: Double, data: IBuffer) = this()
  }
  
  /** Specifies the Bluetooth LE scanning mode. */
  @JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEScanningMode")
  @js.native
  object BluetoothLEScanningMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEScanningMode with Double
      ] = js.native
    
    /* 1 */ val active: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEScanningMode.active with Double = js.native
    
    /* 0 */ val passive: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEScanningMode.passive with Double = js.native
  }
}
