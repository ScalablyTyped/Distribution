package typings.winrt.Windows.Devices.Enumeration

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pnp {
  
  @js.native
  sealed trait PnpObjectType extends StObject
  @JSGlobal("Windows.Devices.Enumeration.Pnp.PnpObjectType")
  @js.native
  object PnpObjectType extends StObject {
    
    @js.native
    sealed trait device
      extends StObject
         with PnpObjectType
    
    @js.native
    sealed trait deviceContainer
      extends StObject
         with PnpObjectType
    
    @js.native
    sealed trait deviceInterface
      extends StObject
         with PnpObjectType
    
    @js.native
    sealed trait deviceInterfaceClass
      extends StObject
         with PnpObjectType
    
    @js.native
    sealed trait unknown
      extends StObject
         with PnpObjectType
  }
  
  trait IPnpObject extends StObject {
    
    var id: String
    
    var properties: IMapView[String, js.Any]
    
    var `type`: PnpObjectType
    
    def update(updateInfo: PnpObjectUpdate): Unit
  }
  object IPnpObject {
    
    inline def apply(
      id: String,
      properties: IMapView[String, js.Any],
      `type`: PnpObjectType,
      update: PnpObjectUpdate => Unit
    ): IPnpObject = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPnpObject]
    }
    
    extension [Self <: IPnpObject](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: IMapView[String, js.Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setType(value: PnpObjectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: PnpObjectUpdate => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IPnpObjectStatics extends StObject {
    
    def createFromIdAsync(`type`: PnpObjectType, id: String, requestedProperties: IIterable[String]): IAsyncOperation[PnpObject] = js.native
    
    def createWatcher(`type`: PnpObjectType, requestedProperties: IIterable[String]): PnpObjectWatcher = js.native
    def createWatcher(`type`: PnpObjectType, requestedProperties: IIterable[String], aqsFilter: String): PnpObjectWatcher = js.native
    
    def findAllAsync(`type`: PnpObjectType, requestedProperties: IIterable[String]): IAsyncOperation[PnpObjectCollection] = js.native
    def findAllAsync(`type`: PnpObjectType, requestedProperties: IIterable[String], aqsFilter: String): IAsyncOperation[PnpObjectCollection] = js.native
  }
  
  trait IPnpObjectUpdate extends StObject {
    
    var id: String
    
    var properties: IMapView[String, js.Any]
    
    var `type`: PnpObjectType
  }
  object IPnpObjectUpdate {
    
    inline def apply(id: String, properties: IMapView[String, js.Any], `type`: PnpObjectType): IPnpObjectUpdate = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPnpObjectUpdate]
    }
    
    extension [Self <: IPnpObjectUpdate](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: IMapView[String, js.Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setType(value: PnpObjectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPnpObjectWatcher extends StObject {
    
    var onadded: js.Any
    
    var onenumerationcompleted: js.Any
    
    var onremoved: js.Any
    
    var onstopped: js.Any
    
    var onupdated: js.Any
    
    def start(): Unit
    
    var status: DeviceWatcherStatus
    
    def stop(): Unit
  }
  object IPnpObjectWatcher {
    
    inline def apply(
      onadded: js.Any,
      onenumerationcompleted: js.Any,
      onremoved: js.Any,
      onstopped: js.Any,
      onupdated: js.Any,
      start: () => Unit,
      status: DeviceWatcherStatus,
      stop: () => Unit
    ): IPnpObjectWatcher = {
      val __obj = js.Dynamic.literal(onadded = onadded.asInstanceOf[js.Any], onenumerationcompleted = onenumerationcompleted.asInstanceOf[js.Any], onremoved = onremoved.asInstanceOf[js.Any], onstopped = onstopped.asInstanceOf[js.Any], onupdated = onupdated.asInstanceOf[js.Any], start = js.Any.fromFunction0(start), status = status.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[IPnpObjectWatcher]
    }
    
    extension [Self <: IPnpObjectWatcher](x: Self) {
      
      inline def setOnadded(value: js.Any): Self = StObject.set(x, "onadded", value.asInstanceOf[js.Any])
      
      inline def setOnenumerationcompleted(value: js.Any): Self = StObject.set(x, "onenumerationcompleted", value.asInstanceOf[js.Any])
      
      inline def setOnremoved(value: js.Any): Self = StObject.set(x, "onremoved", value.asInstanceOf[js.Any])
      
      inline def setOnstopped(value: js.Any): Self = StObject.set(x, "onstopped", value.asInstanceOf[js.Any])
      
      inline def setOnupdated(value: js.Any): Self = StObject.set(x, "onupdated", value.asInstanceOf[js.Any])
      
      inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setStatus(value: DeviceWatcherStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  trait PnpObject
    extends StObject
       with IPnpObject
  object PnpObject {
    
    inline def apply(
      id: String,
      properties: IMapView[String, js.Any],
      `type`: PnpObjectType,
      update: PnpObjectUpdate => Unit
    ): PnpObject = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PnpObject]
    }
  }
  
  @js.native
  trait PnpObjectCollection
    extends StObject
       with IVectorView[PnpObject]
  
  trait PnpObjectUpdate
    extends StObject
       with IPnpObjectUpdate
  object PnpObjectUpdate {
    
    inline def apply(id: String, properties: IMapView[String, js.Any], `type`: PnpObjectType): PnpObjectUpdate = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PnpObjectUpdate]
    }
  }
  
  trait PnpObjectWatcher
    extends StObject
       with IPnpObjectWatcher
  object PnpObjectWatcher {
    
    inline def apply(
      onadded: js.Any,
      onenumerationcompleted: js.Any,
      onremoved: js.Any,
      onstopped: js.Any,
      onupdated: js.Any,
      start: () => Unit,
      status: DeviceWatcherStatus,
      stop: () => Unit
    ): PnpObjectWatcher = {
      val __obj = js.Dynamic.literal(onadded = onadded.asInstanceOf[js.Any], onenumerationcompleted = onenumerationcompleted.asInstanceOf[js.Any], onremoved = onremoved.asInstanceOf[js.Any], onstopped = onstopped.asInstanceOf[js.Any], onupdated = onupdated.asInstanceOf[js.Any], start = js.Any.fromFunction0(start), status = status.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[PnpObjectWatcher]
    }
  }
}
