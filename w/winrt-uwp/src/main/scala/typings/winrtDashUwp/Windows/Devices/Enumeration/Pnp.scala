package typings.winrtDashUwp.Windows.Devices.Enumeration

import org.scalablytyped.runtime.TopLevel
import typings.std.Array
import typings.winrtDashUwp.Anon_Index
import typings.winrtDashUwp.Anon_ItemsReturnValueNumberPnpObject
import typings.winrtDashUwp.Windows.Foundation.Collections.IIterable
import typings.winrtDashUwp.Windows.Foundation.Collections.IIterator
import typings.winrtDashUwp.Windows.Foundation.Collections.IMapView
import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.added
import typings.winrtDashUwp.winrtDashUwpStrings.enumerationcompleted
import typings.winrtDashUwp.winrtDashUwpStrings.removed
import typings.winrtDashUwp.winrtDashUwpStrings.stopped
import typings.winrtDashUwp.winrtDashUwpStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides classes for enumerating a collection of Pnp device objects, and event handlers for monitoring changes to the objects in the collection asynchronously. */
@JSGlobal("Windows.Devices.Enumeration.Pnp")
@js.native
object Pnp extends js.Object {
  /** Represents a PnP object. This class allows access to well-known properties of a PnP object as well as a property store of additional properties that are specified to be retrieved from the the PnP object. */
  @js.native
  abstract class PnpObject () extends js.Object {
    /** A string representing the identity of the PnpObject . */
    var id: String = js.native
    /** A property store containing well-known values as well as additional specified properties. */
    var properties: IMapView[String, _] = js.native
    /** The type of the PnpObject . */
    var `type`: PnpObjectType = js.native
    /**
      * Updates the properties of an existing PnpObject by applying the changes described in a PnpObjectUpdate object.
      * @param updateInfo Indicates the properties to update.
      */
    def update(updateInfo: PnpObjectUpdate): Unit = js.native
  }
  
  /** Represents an iterable collection of Pnp device objects. */
  @js.native
  abstract class PnpObjectCollection () extends Array[PnpObject] {
    /** Returns the number of items in the collection. */
    var size: Double = js.native
    /**
      * Returns the iterator for iteration over the items in the collection.
      * @return The iterator object. The iterator's current position is at the 0-index position, or at the end of the collection if the collection is empty.
      */
    def first(): IIterator[PnpObject] = js.native
    /**
      * Returns the PnpObject located at the specified index.
      * @param index The integer index for the value to retrieve.
      * @return The PnpObject at the specified index.
      */
    def getAt(index: Double): PnpObject = js.native
    /**
      * Retrieves multiple elements in a single pass through the iterator.
      * @param startIndex The index from which to start retrieval.
      */
    def getMany(startIndex: Double): Anon_ItemsReturnValueNumberPnpObject = js.native
    def indexOf(value: PnpObject, extra: js.Any*): Anon_Index = js.native
    /* hack */
    @JSName("indexOf")
    def indexOf_Double(searchElement: PnpObject): Double = js.native
  }
  
  @js.native
  sealed trait PnpObjectType extends js.Object
  
  /** Contains the updated properties of a PnpObject . */
  @js.native
  abstract class PnpObjectUpdate () extends js.Object {
    /** The identifier of the PnpObject . */
    var id: String = js.native
    /** The changed properties in an update to a PnpObject . */
    var properties: IMapView[String, _] = js.native
    /** The type of the PnpObject . One of the values of the PnpObjectType enumeration. */
    var `type`: PnpObjectType = js.native
  }
  
  /** Raises events to notify the client that a PnpObject has been added, updated, or removed from an enumerated collection of Pnp device objects in an incremental and asynchronous way. */
  @js.native
  abstract class PnpObjectWatcher () extends js.Object {
    /** Occurs when a PnpObject is added to the collection enumerated by the PnpObjectWatcher . */
    @JSName("onadded")
    var onadded_Original: TypedEventHandler[PnpObjectWatcher, PnpObject] = js.native
    /** Occurs when the enumeration of Pnp device objects has been completed. */
    @JSName("onenumerationcompleted")
    var onenumerationcompleted_Original: TypedEventHandler[PnpObjectWatcher, _] = js.native
    /** Occurs when a PnpObject is removed from the collection enumerated by the PnpObjectWatcher . */
    @JSName("onremoved")
    var onremoved_Original: TypedEventHandler[PnpObjectWatcher, PnpObjectUpdate] = js.native
    /** Occurs when the PnpObjectWatcher has stopped monitoring changes to the collection of Pnp device objects. */
    @JSName("onstopped")
    var onstopped_Original: TypedEventHandler[PnpObjectWatcher, _] = js.native
    /** Occurs when the properties of a PnpObject in the collection enumerated by the PnpObjectWatcher are updated. */
    @JSName("onupdated")
    var onupdated_Original: TypedEventHandler[PnpObjectWatcher, PnpObjectUpdate] = js.native
    /** The status associated with the asynchronous operation. */
    var status: DeviceWatcherStatus = js.native
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_added(`type`: added, listener: TypedEventHandler[PnpObjectWatcher, PnpObject]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_enumerationcompleted(`type`: enumerationcompleted, listener: TypedEventHandler[PnpObjectWatcher, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_removed(`type`: removed, listener: TypedEventHandler[PnpObjectWatcher, PnpObjectUpdate]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stopped(`type`: stopped, listener: TypedEventHandler[PnpObjectWatcher, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_updated(`type`: updated, listener: TypedEventHandler[PnpObjectWatcher, PnpObjectUpdate]): Unit = js.native
    /** Occurs when a PnpObject is added to the collection enumerated by the PnpObjectWatcher . */
    def onadded(ev: PnpObject with WinRTEvent[PnpObjectWatcher]): Unit = js.native
    /** Occurs when the enumeration of Pnp device objects has been completed. */
    def onenumerationcompleted(ev: js.Any with WinRTEvent[PnpObjectWatcher]): Unit = js.native
    /** Occurs when a PnpObject is removed from the collection enumerated by the PnpObjectWatcher . */
    def onremoved(ev: PnpObjectUpdate with WinRTEvent[PnpObjectWatcher]): Unit = js.native
    /** Occurs when the PnpObjectWatcher has stopped monitoring changes to the collection of Pnp device objects. */
    def onstopped(ev: js.Any with WinRTEvent[PnpObjectWatcher]): Unit = js.native
    /** Occurs when the properties of a PnpObject in the collection enumerated by the PnpObjectWatcher are updated. */
    def onupdated(ev: PnpObjectUpdate with WinRTEvent[PnpObjectWatcher]): Unit = js.native
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_added(`type`: added, listener: TypedEventHandler[PnpObjectWatcher, PnpObject]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_enumerationcompleted(`type`: enumerationcompleted, listener: TypedEventHandler[PnpObjectWatcher, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_removed(`type`: removed, listener: TypedEventHandler[PnpObjectWatcher, PnpObjectUpdate]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_stopped(`type`: stopped, listener: TypedEventHandler[PnpObjectWatcher, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_updated(`type`: updated, listener: TypedEventHandler[PnpObjectWatcher, PnpObjectUpdate]): Unit = js.native
    /** Starts raising the events to inform the client that a PnpObject has been added, updated, or removed. */
    def start(): Unit = js.native
    /** Stops raising the events to inform the client that a PnpObject has been added, updated, or removed. */
    def stop(): Unit = js.native
  }
  
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
    def createFromIdAsync(`type`: PnpObjectType, id: String, requestedProperties: IIterable[String]): IPromiseWithIAsyncOperation[PnpObject] = js.native
    /**
      * Returns a PnpObjectWatcher object that is used to enumerate the PnP objects in the collection using events.
      * @param type The type of the PnpObject .
      * @param requestedProperties An iterable list of additional properties to include in the Properties property of the PnpObject objects included in enumeration results. For more info on what the properties represent, see Device information properties.
      * @return A PnpObjectWatcher object used to enumerate the collection by registering event notification delegates and by issuing start and stop event notifications.
      */
    def createWatcher(`type`: PnpObjectType, requestedProperties: IIterable[String]): PnpObjectWatcher = js.native
    /**
      * Returns a PnpObjectWatcher object that is used to enumerate a filtered collection of PnP objects using events.
      * @param type The type of the PnpObject .
      * @param requestedProperties An iterable list of additional properties to include in the Properties property of the PnpObject objects included in enumeration results. For more info on what the properties represent, see Device information properties.
      * @param aqsFilter An AQS string that filters the PnP objects that will be returned. Typically, this string is retrieved from the GetDeviceSelector method of a class that interacts with devices.
      * @return A PnpObjectWatcher object used to enumerate the collection by registering event notification delegates and by issuing start and stop event notifications.
      */
    def createWatcher(`type`: PnpObjectType, requestedProperties: IIterable[String], aqsFilter: String): PnpObjectWatcher = js.native
    /**
      * Returns all of the PnP objects of a specified type that match the specified criteria.
      * @param type The type of the PnpObject .
      * @param requestedProperties An iterable list of additional properties to include in the Properties property of the PnpObject objects included in enumeration results. For more info on what the properties represent, see Device information properties.
      * @return An object that represents the asynchronous operation.
      */
    def findAllAsync(`type`: PnpObjectType, requestedProperties: IIterable[String]): IPromiseWithIAsyncOperation[PnpObjectCollection] = js.native
    /**
      * Returns all of the PnP objects of a specified type that match the specified filter.
      * @param type The type of the PnpObject .
      * @param requestedProperties An iterable list of additional properties to include in the Properties property of the PnpObject objects included in enumeration results. For more info on what the properties represent, see Device information properties.
      * @param aqsFilter An AQS string that filters the PnP objects that will be returned. Typically, this string is retrieved from the GetDeviceSelector method of a class that interacts with devices.
      * @return An object that represents the asynchronous operation.
      */
    def findAllAsync(`type`: PnpObjectType, requestedProperties: IIterable[String], aqsFilter: String): IPromiseWithIAsyncOperation[PnpObjectCollection] = js.native
  }
  
  /** Indicates the device type of a PnpObject . */
  @js.native
  object PnpObjectType extends js.Object {
    /** The PnpObject represents an association endpoint. */
    @js.native
    sealed trait associationEndpoint extends PnpObjectType
    
    /** The PnpObject represents an association endpoint container. */
    @js.native
    sealed trait associationEndpointContainer extends PnpObjectType
    
    /** The PnpObject represents an association endpoint service. */
    @js.native
    sealed trait associationEndpointService extends PnpObjectType
    
    /** The PnpObject represents a device. */
    @js.native
    sealed trait device extends PnpObjectType
    
    /** The PnpObject represents a device container. */
    @js.native
    sealed trait deviceContainer extends PnpObjectType
    
    /** The PnpObject represents a device interface. */
    @js.native
    sealed trait deviceInterface extends PnpObjectType
    
    /** The PnpObject represents a device interface class. */
    @js.native
    sealed trait deviceInterfaceClass extends PnpObjectType
    
    /** The object is of an unknown type. This value is not used. */
    @js.native
    sealed trait unknown extends PnpObjectType
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PnpObjectType with Double] = js.native
    /* 5 */ @js.native
    object associationEndpoint extends TopLevel[associationEndpoint with Double]
    
    /* 6 */ @js.native
    object associationEndpointContainer extends TopLevel[associationEndpointContainer with Double]
    
    /* 7 */ @js.native
    object associationEndpointService extends TopLevel[associationEndpointService with Double]
    
    /* 3 */ @js.native
    object device extends TopLevel[device with Double]
    
    /* 2 */ @js.native
    object deviceContainer extends TopLevel[deviceContainer with Double]
    
    /* 1 */ @js.native
    object deviceInterface extends TopLevel[deviceInterface with Double]
    
    /* 4 */ @js.native
    object deviceInterfaceClass extends TopLevel[deviceInterfaceClass with Double]
    
    /* 0 */ @js.native
    object unknown extends TopLevel[unknown with Double]
    
  }
  
}

