package typings.winrtUwp.global.Windows.Devices.Enumeration

import typings.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectType
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides classes for enumerating a collection of Pnp device objects, and event handlers for monitoring changes to the objects in the collection asynchronously. */
@JSGlobal("Windows.Devices.Enumeration.Pnp")
@js.native
object Pnp extends js.Object {
  /** Represents a PnP object. This class allows access to well-known properties of a PnP object as well as a property store of additional properties that are specified to be retrieved from the the PnP object. */
  @js.native
  abstract class PnpObject ()
    extends typings.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObject {
    /** A string representing the identity of the PnpObject . */
    /* CompleteClass */
    override var id: String = js.native
    /** A property store containing well-known values as well as additional specified properties. */
    /* CompleteClass */
    override var properties: IMapView[String, _] = js.native
    /** The type of the PnpObject . */
    /* CompleteClass */
    override var `type`: PnpObjectType = js.native
    /**
      * Updates the properties of an existing PnpObject by applying the changes described in a PnpObjectUpdate object.
      * @param updateInfo Indicates the properties to update.
      */
    /* CompleteClass */
    override def update(updateInfo: typings.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectUpdate): Unit = js.native
  }
  
  /** Represents an iterable collection of Pnp device objects. */
  @js.native
  abstract class PnpObjectCollection ()
    extends typings.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectCollection
  
  /** Contains the updated properties of a PnpObject . */
  @js.native
  abstract class PnpObjectUpdate ()
    extends typings.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectUpdate {
    /** The identifier of the PnpObject . */
    /* CompleteClass */
    override var id: String = js.native
    /** The changed properties in an update to a PnpObject . */
    /* CompleteClass */
    override var properties: IMapView[String, _] = js.native
    /** The type of the PnpObject . One of the values of the PnpObjectType enumeration. */
    /* CompleteClass */
    override var `type`: PnpObjectType = js.native
  }
  
  /** Raises events to notify the client that a PnpObject has been added, updated, or removed from an enumerated collection of Pnp device objects in an incremental and asynchronous way. */
  @js.native
  abstract class PnpObjectWatcher ()
    extends typings.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectWatcher
  
  /* static members */
  @js.native
  object PnpObject extends js.Object {
    /**
      * Creates a PnpObject object asynchronously from a previously saved DeviceInformation ID.
      * @param type The type of the PnpObject .
      * @param id The string value identifying the PnpObject .
      * @param requestedProperties An iterable list of additional properties to include in the Properties property of the PnpObject object to create. For more info on what the properties represent, see Device information properties.
      * @return The PnpObject created from the previously saved DeviceInformation ID.
      */
    def createFromIdAsync(`type`: PnpObjectType, id: String, requestedProperties: IIterable[String]): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObject] = js.native
    /**
      * Returns a PnpObjectWatcher object that is used to enumerate the PnP objects in the collection using events.
      * @param type The type of the PnpObject .
      * @param requestedProperties An iterable list of additional properties to include in the Properties property of the PnpObject objects included in enumeration results. For more info on what the properties represent, see Device information properties.
      * @return A PnpObjectWatcher object used to enumerate the collection by registering event notification delegates and by issuing start and stop event notifications.
      */
    def createWatcher(`type`: PnpObjectType, requestedProperties: IIterable[String]): typings.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectWatcher = js.native
    /**
      * Returns a PnpObjectWatcher object that is used to enumerate a filtered collection of PnP objects using events.
      * @param type The type of the PnpObject .
      * @param requestedProperties An iterable list of additional properties to include in the Properties property of the PnpObject objects included in enumeration results. For more info on what the properties represent, see Device information properties.
      * @param aqsFilter An AQS string that filters the PnP objects that will be returned. Typically, this string is retrieved from the GetDeviceSelector method of a class that interacts with devices.
      * @return A PnpObjectWatcher object used to enumerate the collection by registering event notification delegates and by issuing start and stop event notifications.
      */
    def createWatcher(`type`: PnpObjectType, requestedProperties: IIterable[String], aqsFilter: String): typings.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectWatcher = js.native
    /**
      * Returns all of the PnP objects of a specified type that match the specified criteria.
      * @param type The type of the PnpObject .
      * @param requestedProperties An iterable list of additional properties to include in the Properties property of the PnpObject objects included in enumeration results. For more info on what the properties represent, see Device information properties.
      * @return An object that represents the asynchronous operation.
      */
    def findAllAsync(`type`: PnpObjectType, requestedProperties: IIterable[String]): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectCollection] = js.native
    /**
      * Returns all of the PnP objects of a specified type that match the specified filter.
      * @param type The type of the PnpObject .
      * @param requestedProperties An iterable list of additional properties to include in the Properties property of the PnpObject objects included in enumeration results. For more info on what the properties represent, see Device information properties.
      * @param aqsFilter An AQS string that filters the PnP objects that will be returned. Typically, this string is retrieved from the GetDeviceSelector method of a class that interacts with devices.
      * @return An object that represents the asynchronous operation.
      */
    def findAllAsync(`type`: PnpObjectType, requestedProperties: IIterable[String], aqsFilter: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectCollection] = js.native
  }
  
  /** Indicates the device type of a PnpObject . */
  @js.native
  object PnpObjectType extends js.Object {
    /* 5 */ val associationEndpoint: typings.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectType.associationEndpoint with Double = js.native
    /* 6 */ val associationEndpointContainer: typings.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectType.associationEndpointContainer with Double = js.native
    /* 7 */ val associationEndpointService: typings.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectType.associationEndpointService with Double = js.native
    /* 3 */ val device: typings.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectType.device with Double = js.native
    /* 2 */ val deviceContainer: typings.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectType.deviceContainer with Double = js.native
    /* 1 */ val deviceInterface: typings.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectType.deviceInterface with Double = js.native
    /* 4 */ val deviceInterfaceClass: typings.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectType.deviceInterfaceClass with Double = js.native
    /* 0 */ val unknown: typings.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectType.unknown with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Enumeration.Pnp.PnpObjectType with Double] = js.native
  }
  
}

