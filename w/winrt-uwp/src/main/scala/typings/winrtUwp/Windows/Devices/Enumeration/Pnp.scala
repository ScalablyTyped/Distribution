package typings.winrtUwp.Windows.Devices.Enumeration

import typings.std.Array
import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.anon.Index
import typings.winrtUwp.anon.ItemsPnpObject
import typings.winrtUwp.winrtUwpStrings.added
import typings.winrtUwp.winrtUwpStrings.enumerationcompleted
import typings.winrtUwp.winrtUwpStrings.removed
import typings.winrtUwp.winrtUwpStrings.stopped
import typings.winrtUwp.winrtUwpStrings.updated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides classes for enumerating a collection of Pnp device objects, and event handlers for monitoring changes to the objects in the collection asynchronously. */
object Pnp {
  
  @js.native
  sealed trait PnpObjectType extends StObject
  /** Indicates the device type of a PnpObject . */
  @JSGlobal("Windows.Devices.Enumeration.Pnp.PnpObjectType")
  @js.native
  object PnpObjectType extends StObject {
    
    /** The PnpObject represents an association endpoint. */
    @js.native
    sealed trait associationEndpoint
      extends StObject
         with PnpObjectType
    
    /** The PnpObject represents an association endpoint container. */
    @js.native
    sealed trait associationEndpointContainer
      extends StObject
         with PnpObjectType
    
    /** The PnpObject represents an association endpoint service. */
    @js.native
    sealed trait associationEndpointService
      extends StObject
         with PnpObjectType
    
    /** The PnpObject represents a device. */
    @js.native
    sealed trait device
      extends StObject
         with PnpObjectType
    
    /** The PnpObject represents a device container. */
    @js.native
    sealed trait deviceContainer
      extends StObject
         with PnpObjectType
    
    /** The PnpObject represents a device interface. */
    @js.native
    sealed trait deviceInterface
      extends StObject
         with PnpObjectType
    
    /** The PnpObject represents a device interface class. */
    @js.native
    sealed trait deviceInterfaceClass
      extends StObject
         with PnpObjectType
    
    /** The object is of an unknown type. This value is not used. */
    @js.native
    sealed trait unknown
      extends StObject
         with PnpObjectType
  }
  
  /** Represents a PnP object. This class allows access to well-known properties of a PnP object as well as a property store of additional properties that are specified to be retrieved from the the PnP object. */
  trait PnpObject extends StObject {
    
    /** A string representing the identity of the PnpObject . */
    var id: String
    
    /** A property store containing well-known values as well as additional specified properties. */
    var properties: IMapView[String, Any]
    
    /** The type of the PnpObject . */
    var `type`: PnpObjectType
    
    /**
      * Updates the properties of an existing PnpObject by applying the changes described in a PnpObjectUpdate object.
      * @param updateInfo Indicates the properties to update.
      */
    def update(updateInfo: PnpObjectUpdate): Unit
  }
  object PnpObject {
    
    inline def apply(
      id: String,
      properties: IMapView[String, Any],
      `type`: PnpObjectType,
      update: PnpObjectUpdate => Unit
    ): PnpObject = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PnpObject]
    }
    
    extension [Self <: PnpObject](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: IMapView[String, Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setType(value: PnpObjectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: PnpObjectUpdate => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  /** Represents an iterable collection of Pnp device objects. */
  @js.native
  trait PnpObjectCollection
    extends StObject
       with Array[PnpObject] {
    
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
    def getMany(startIndex: Double): ItemsPnpObject = js.native
    
    def indexOf(value: PnpObject, extra: Any*): Index = js.native
    /* hack */
    @JSName("indexOf")
    def indexOf_Double(searchElement: PnpObject): Double = js.native
    
    /** Returns the number of items in the collection. */
    var size: Double = js.native
  }
  
  /** Contains the updated properties of a PnpObject . */
  trait PnpObjectUpdate extends StObject {
    
    /** The identifier of the PnpObject . */
    var id: String
    
    /** The changed properties in an update to a PnpObject . */
    var properties: IMapView[String, Any]
    
    /** The type of the PnpObject . One of the values of the PnpObjectType enumeration. */
    var `type`: PnpObjectType
  }
  object PnpObjectUpdate {
    
    inline def apply(id: String, properties: IMapView[String, Any], `type`: PnpObjectType): PnpObjectUpdate = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PnpObjectUpdate]
    }
    
    extension [Self <: PnpObjectUpdate](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: IMapView[String, Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setType(value: PnpObjectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /** Raises events to notify the client that a PnpObject has been added, updated, or removed from an enumerated collection of Pnp device objects in an incremental and asynchronous way. */
  @js.native
  trait PnpObjectWatcher extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_added(`type`: added, listener: TypedEventHandler[PnpObjectWatcher, PnpObject]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_enumerationcompleted(`type`: enumerationcompleted, listener: TypedEventHandler[PnpObjectWatcher, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_removed(`type`: removed, listener: TypedEventHandler[PnpObjectWatcher, PnpObjectUpdate]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stopped(`type`: stopped, listener: TypedEventHandler[PnpObjectWatcher, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_updated(`type`: updated, listener: TypedEventHandler[PnpObjectWatcher, PnpObjectUpdate]): Unit = js.native
    
    /** Occurs when a PnpObject is added to the collection enumerated by the PnpObjectWatcher . */
    def onadded(ev: PnpObject & WinRTEvent[PnpObjectWatcher]): Unit = js.native
    /** Occurs when a PnpObject is added to the collection enumerated by the PnpObjectWatcher . */
    @JSName("onadded")
    var onadded_Original: TypedEventHandler[PnpObjectWatcher, PnpObject] = js.native
    
    /** Occurs when the enumeration of Pnp device objects has been completed. */
    def onenumerationcompleted(ev: Any & WinRTEvent[PnpObjectWatcher]): Unit = js.native
    /** Occurs when the enumeration of Pnp device objects has been completed. */
    @JSName("onenumerationcompleted")
    var onenumerationcompleted_Original: TypedEventHandler[PnpObjectWatcher, Any] = js.native
    
    /** Occurs when a PnpObject is removed from the collection enumerated by the PnpObjectWatcher . */
    def onremoved(ev: PnpObjectUpdate & WinRTEvent[PnpObjectWatcher]): Unit = js.native
    /** Occurs when a PnpObject is removed from the collection enumerated by the PnpObjectWatcher . */
    @JSName("onremoved")
    var onremoved_Original: TypedEventHandler[PnpObjectWatcher, PnpObjectUpdate] = js.native
    
    /** Occurs when the PnpObjectWatcher has stopped monitoring changes to the collection of Pnp device objects. */
    def onstopped(ev: Any & WinRTEvent[PnpObjectWatcher]): Unit = js.native
    /** Occurs when the PnpObjectWatcher has stopped monitoring changes to the collection of Pnp device objects. */
    @JSName("onstopped")
    var onstopped_Original: TypedEventHandler[PnpObjectWatcher, Any] = js.native
    
    /** Occurs when the properties of a PnpObject in the collection enumerated by the PnpObjectWatcher are updated. */
    def onupdated(ev: PnpObjectUpdate & WinRTEvent[PnpObjectWatcher]): Unit = js.native
    /** Occurs when the properties of a PnpObject in the collection enumerated by the PnpObjectWatcher are updated. */
    @JSName("onupdated")
    var onupdated_Original: TypedEventHandler[PnpObjectWatcher, PnpObjectUpdate] = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_added(`type`: added, listener: TypedEventHandler[PnpObjectWatcher, PnpObject]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_enumerationcompleted(`type`: enumerationcompleted, listener: TypedEventHandler[PnpObjectWatcher, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_removed(`type`: removed, listener: TypedEventHandler[PnpObjectWatcher, PnpObjectUpdate]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_stopped(`type`: stopped, listener: TypedEventHandler[PnpObjectWatcher, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_updated(`type`: updated, listener: TypedEventHandler[PnpObjectWatcher, PnpObjectUpdate]): Unit = js.native
    
    /** Starts raising the events to inform the client that a PnpObject has been added, updated, or removed. */
    def start(): Unit = js.native
    
    /** The status associated with the asynchronous operation. */
    var status: DeviceWatcherStatus = js.native
    
    /** Stops raising the events to inform the client that a PnpObject has been added, updated, or removed. */
    def stop(): Unit = js.native
  }
}
