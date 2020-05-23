package typings.winrtUwp.global.Windows.Devices.Bluetooth

import typings.std.Date
import typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFlags
import typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatus
import typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementType
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allow apps to send and receive Bluetooth Low Energy (LE) advertisements. */
@JSGlobal("Windows.Devices.Bluetooth.Advertisement")
@js.native
object Advertisement extends js.Object {
  /** A representation of a Bluetooth LE advertisement payload. */
  @js.native
  /** Creates a new BluetoothLEAdvertisement object. */
  class BluetoothLEAdvertisement ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisement {
    /** Gets the list of raw data sections. */
    /* CompleteClass */
    override var dataSections: IVector[
        typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataSection
      ] = js.native
    /** Bluetooth LE advertisement flags. */
    /* CompleteClass */
    override var flags: BluetoothLEAdvertisementFlags = js.native
    /** The local name contained within the advertisement. */
    /* CompleteClass */
    override var localName: String = js.native
    /** Gets the list of manufacturer-specific data sections in a BluetoothLEAdvertisement . */
    /* CompleteClass */
    override var manufacturerData: IVector[
        typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEManufacturerData
      ] = js.native
    /** The list of service UUIDs in 128-bit GUID format in a BluetoothLEAdvertisement . */
    /* CompleteClass */
    override var serviceUuids: IVector[String] = js.native
    /**
      * Return a list of all manufacturer data sections in the BluetoothLEAdvertisement payload matching the specified company ID.
      * @param companyId The company identifier code defined by the Bluetooth Special Interest Group (SIG).
      * @return A vector of BluetoothLEManufacturerData contained within the payload.
      */
    /* CompleteClass */
    override def getManufacturerDataByCompanyId(companyId: Double): IVectorView[
        typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEManufacturerData
      ] = js.native
    /**
      * Return a list of advertisement data sections that matches a given advertisement section type in a BluetoothLEAdvertisement .
      * @param type The advertisement section type
      * @return A vector of all the BluetoothLEAdvertisementDataSection matching the given advertisement type.
      */
    /* CompleteClass */
    override def getSectionsByType(`type`: Double): IVectorView[
        typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataSection
      ] = js.native
  }
  
  /** A Bluetooth LE advertisement byte pattern for filters to match. */
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
    /** The Bluetooth LE advertisement data byte pattern to match. */
    /* CompleteClass */
    override var data: IBuffer = js.native
    /** The Bluetooth LE advertisement data type defined by the Bluetooth Special Interest Group (SIG) to match. */
    /* CompleteClass */
    override var dataType: Double = js.native
    /** The offset of byte pattern from beginning of advertisement data section. */
    /* CompleteClass */
    override var offset: Double = js.native
  }
  
  /** A Bluetooth LE advertisement section. */
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
    /** The Bluetooth LE advertisement data payload. */
    /* CompleteClass */
    override var data: IBuffer = js.native
    /** The Bluetooth LE advertisement data type as defined by the Bluetooth Special Interest Group (SIG). */
    /* CompleteClass */
    override var dataType: Double = js.native
  }
  
  /** Some of the Bluetooth LE advertisement types defined in the Generic Access Profile (GAP) by the Bluetooth Special Interest Group (SIG). */
  @js.native
  abstract class BluetoothLEAdvertisementDataTypes ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataTypes
  
  /** Groups parameters used to configure payload-based filtering of received Bluetooth LE advertisements. */
  @js.native
  /** Creates a new BluetoothLEAdvertisementFilter object. */
  class BluetoothLEAdvertisementFilter ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFilter {
    /** A BluetoothLEAdvertisement object that can be applied as filters to received Bluetooth LE advertisements. */
    /* CompleteClass */
    override var advertisement: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisement = js.native
    /** Gets a vector of byte patterns with offsets to match advertisement sections in a received Bluetooth LE advertisement. */
    /* CompleteClass */
    override var bytePatterns: IVector[
        typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementBytePattern
      ] = js.native
  }
  
  /** An object to send Bluetooth Low Energy (LE) advertisements. */
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
  
  /** Provides data for a StatusChanged event on a BluetoothLEAdvertisementPublisher . */
  @js.native
  abstract class BluetoothLEAdvertisementPublisherStatusChangedEventArgs ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatusChangedEventArgs {
    /** Gets the error status for a StatusChanged event on a BluetoothLEAdvertisementPublisher . */
    /* CompleteClass */
    override var error: typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothError = js.native
    /** Gets the new status of the BluetoothLEAdvertisementPublisher . */
    /* CompleteClass */
    override var status: BluetoothLEAdvertisementPublisherStatus = js.native
  }
  
  /** Provides data for a Received event on a BluetoothLEAdvertisementWatcher . */
  @js.native
  abstract class BluetoothLEAdvertisementReceivedEventArgs ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementReceivedEventArgs {
    /** Gets the Bluetooth LE advertisement payload data received. */
    /* CompleteClass */
    override var advertisement: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisement = js.native
    /** Gets the type of the received Bluetooth LE advertisement packet. */
    /* CompleteClass */
    override var advertisementType: BluetoothLEAdvertisementType = js.native
    /** Gets the Bluetooth address of the device sending the Bluetooth LE advertisement. */
    /* CompleteClass */
    override var bluetoothAddress: Double = js.native
    /** Gets the received signal strength indicator (RSSI) value, in dBm, for this received Bluetooth LE advertisement event. */
    /* CompleteClass */
    override var rawSignalStrengthInDBm: Double = js.native
    /** Gets the timestamp when the Received event occurred. */
    /* CompleteClass */
    override var timestamp: Date = js.native
  }
  
  /** An object to receive Bluetooth Low Energy (LE) advertisements. */
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
  
  /** Provides data for a Stopped event on a BluetoothLEAdvertisementWatcher . */
  @js.native
  abstract class BluetoothLEAdvertisementWatcherStoppedEventArgs ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementWatcherStoppedEventArgs {
    /** Gets the error status for Stopped event. */
    /* CompleteClass */
    override var error: typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothError = js.native
  }
  
  /** A Bluetooth LE manufacturer-specific data section (one particular type of LE advertisement section) */
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
    /** The Bluetooth LE company identifier code as defined by the Bluetooth Special Interest Group (SIG). */
    /* CompleteClass */
    override var companyId: Double = js.native
    /** Bluetooth LE manufacturer-specific section data. */
    /* CompleteClass */
    override var data: IBuffer = js.native
  }
  
  /* static members */
  @js.native
  object BluetoothLEAdvertisementDataTypes extends js.Object {
    /** Section data type for the Bluetooth LE advertising interval. */
    var advertisingInterval: Double = js.native
    /** Section data type for the Bluetooth LE advertising appearance. */
    var appearance: Double = js.native
    /** Section data type for the Bluetooth LE complete local name. */
    var completeLocalName: Double = js.native
    /** Section data type for the complete list of 128-bit Bluetooth LE service UUIDs */
    var completeService128BitUuids: Double = js.native
    /** Section data type for the complete list of 16-bit Bluetooth LE service UUIDs */
    var completeService16BitUuids: Double = js.native
    /** Section data type for the complete list of 32-bit Bluetooth LE service UUIDs */
    var completeService32BitUuids: Double = js.native
    /** Section data type for a set of flags for internal use. */
    var flags: Double = js.native
    /** Section data type for an incomplete list of 128-bit Bluetooth LE service UUIDs. */
    var incompleteService128BitUuids: Double = js.native
    /** Section data type for an incomplete list of 16-bit Bluetooth LE service UUIDs. */
    var incompleteService16BitUuids: Double = js.native
    /** Section data type for an incomplete list of 32-bit Bluetooth LE service UUIDs. */
    var incompleteService32BitUuids: Double = js.native
    /** Section data type for manufacturer-specific data for a Bluetooth LE advertisements. */
    var manufacturerSpecificData: Double = js.native
    /** Section data type for a list of public Bluetooth LE target addresses. */
    var publicTargetAddress: Double = js.native
    /** Section data type for a list of random Bluetooth LE target addresses. */
    var randomTargetAddress: Double = js.native
    /** Section data type for service data for 128-bit Bluetooth LE UUIDs. */
    var serviceData128BitUuids: Double = js.native
    /** Section data type for service data for 16-bit Bluetooth LE UUIDs. */
    var serviceData16BitUuids: Double = js.native
    /** Section data type for service data for 32-bit Bluetooth LE UUIDs.. */
    var serviceData32BitUuids: Double = js.native
    /** Section data type for a list of 128-bit Bluetooth LE service solicitation UUIDs. */
    var serviceSolicitation128BitUuids: Double = js.native
    /** Section data type for a list of 16-bit Bluetooth LE service solicitation UUIDs. */
    var serviceSolicitation16BitUuids: Double = js.native
    /** Section data type for a list of 32-bit Bluetooth LE service solicitation UUIDs. */
    var serviceSolicitation32BitUuids: Double = js.native
    /** Section data type for a shortened local name. */
    var shortenedLocalName: Double = js.native
    /** Section data type for the slave connection interval range. */
    var slaveConnectionIntervalRange: Double = js.native
    /** Section data type for the Bluetooth LE transmit power level. */
    var txPowerLevel: Double = js.native
  }
  
  /** Specifies flags used to match flags contained inside a Bluetooth LE advertisement payload. */
  @js.native
  object BluetoothLEAdvertisementFlags extends js.Object {
    /* 3 */ val classicNotSupported: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFlags.classicNotSupported with Double = js.native
    /* 4 */ val dualModeControllerCapable: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFlags.dualModeControllerCapable with Double = js.native
    /* 5 */ val dualModeHostCapable: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFlags.dualModeHostCapable with Double = js.native
    /* 2 */ val generalDiscoverableMode: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFlags.generalDiscoverableMode with Double = js.native
    /* 1 */ val limitedDiscoverableMode: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFlags.limitedDiscoverableMode with Double = js.native
    /* 0 */ val none: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFlags.none with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFlags with Double
      ] = js.native
  }
  
  /** Represents the possible states of the BluetoothLEAdvertisementPublisher . */
  @js.native
  object BluetoothLEAdvertisementPublisherStatus extends js.Object {
    /* 5 */ val aborted: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatus.aborted with Double = js.native
    /* 0 */ val created: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatus.created with Double = js.native
    /* 2 */ val started: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatus.started with Double = js.native
    /* 4 */ val stopped: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatus.stopped with Double = js.native
    /* 3 */ val stopping: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatus.stopping with Double = js.native
    /* 1 */ val waiting: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatus.waiting with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatus with Double
      ] = js.native
  }
  
  /** Specifies the different types of Bluetooth LE advertisement payloads. */
  @js.native
  object BluetoothLEAdvertisementType extends js.Object {
    /* 1 */ val connectableDirected: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementType.connectableDirected with Double = js.native
    /* 0 */ val connectableUndirected: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementType.connectableUndirected with Double = js.native
    /* 3 */ val nonConnectableUndirected: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementType.nonConnectableUndirected with Double = js.native
    /* 4 */ val scanResponse: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementType.scanResponse with Double = js.native
    /* 2 */ val scannableUndirected: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementType.scannableUndirected with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementType with Double
      ] = js.native
  }
  
  /** Represents the possible states of the BluetoothLEAdvertisementWatcher . */
  @js.native
  object BluetoothLEAdvertisementWatcherStatus extends js.Object {
    /* 4 */ val aborted: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementWatcherStatus.aborted with Double = js.native
    /* 0 */ val created: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementWatcherStatus.created with Double = js.native
    /* 1 */ val started: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementWatcherStatus.started with Double = js.native
    /* 3 */ val stopped: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementWatcherStatus.stopped with Double = js.native
    /* 2 */ val stopping: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementWatcherStatus.stopping with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementWatcherStatus with Double
      ] = js.native
  }
  
  /** Specifies the Bluetooth LE scanning mode. */
  @js.native
  object BluetoothLEScanningMode extends js.Object {
    /* 1 */ val active: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEScanningMode.active with Double = js.native
    /* 0 */ val passive: typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEScanningMode.passive with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEScanningMode with Double
      ] = js.native
  }
  
}

