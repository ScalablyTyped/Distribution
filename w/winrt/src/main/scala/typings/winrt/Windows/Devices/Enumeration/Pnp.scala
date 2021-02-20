package typings.winrt.Windows.Devices.Enumeration

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pnp {
  
  @js.native
  sealed trait PnpObjectType extends StObject
  @JSGlobal("Windows.Devices.Enumeration.Pnp.PnpObjectType")
  @js.native
  object PnpObjectType extends StObject {
    
    @js.native
    sealed trait device extends PnpObjectType
    
    @js.native
    sealed trait deviceContainer extends PnpObjectType
    
    @js.native
    sealed trait deviceInterface extends PnpObjectType
    
    @js.native
    sealed trait deviceInterfaceClass extends PnpObjectType
    
    @js.native
    sealed trait unknown extends PnpObjectType
  }
  
  @js.native
  trait IPnpObject extends StObject {
    
    var id: String = js.native
    
    var properties: IMapView[String, _] = js.native
    
    var `type`: PnpObjectType = js.native
    
    def update(updateInfo: PnpObjectUpdate): Unit = js.native
  }
  object IPnpObject {
    
    @scala.inline
    def apply(
      id: String,
      properties: IMapView[String, _],
      `type`: PnpObjectType,
      update: PnpObjectUpdate => Unit
    ): IPnpObject = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPnpObject]
    }
    
    @scala.inline
    implicit class IPnpObjectMutableBuilder[Self <: IPnpObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperties(value: IMapView[String, _]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: PnpObjectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: PnpObjectUpdate => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
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
  
  @js.native
  trait IPnpObjectUpdate extends StObject {
    
    var id: String = js.native
    
    var properties: IMapView[String, _] = js.native
    
    var `type`: PnpObjectType = js.native
  }
  object IPnpObjectUpdate {
    
    @scala.inline
    def apply(id: String, properties: IMapView[String, _], `type`: PnpObjectType): IPnpObjectUpdate = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPnpObjectUpdate]
    }
    
    @scala.inline
    implicit class IPnpObjectUpdateMutableBuilder[Self <: IPnpObjectUpdate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperties(value: IMapView[String, _]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: PnpObjectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IPnpObjectWatcher extends StObject {
    
    var onadded: js.Any = js.native
    
    var onenumerationcompleted: js.Any = js.native
    
    var onremoved: js.Any = js.native
    
    var onstopped: js.Any = js.native
    
    var onupdated: js.Any = js.native
    
    def start(): Unit = js.native
    
    var status: DeviceWatcherStatus = js.native
    
    def stop(): Unit = js.native
  }
  object IPnpObjectWatcher {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class IPnpObjectWatcherMutableBuilder[Self <: IPnpObjectWatcher] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnadded(value: js.Any): Self = StObject.set(x, "onadded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnenumerationcompleted(value: js.Any): Self = StObject.set(x, "onenumerationcompleted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnremoved(value: js.Any): Self = StObject.set(x, "onremoved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnstopped(value: js.Any): Self = StObject.set(x, "onstopped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnupdated(value: js.Any): Self = StObject.set(x, "onupdated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStatus(value: DeviceWatcherStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait PnpObject extends IPnpObject
  object PnpObject {
    
    @scala.inline
    def apply(
      id: String,
      properties: IMapView[String, _],
      `type`: PnpObjectType,
      update: PnpObjectUpdate => Unit
    ): PnpObject = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PnpObject]
    }
  }
  
  @js.native
  trait PnpObjectCollection extends IVectorView[PnpObject]
  
  @js.native
  trait PnpObjectUpdate extends IPnpObjectUpdate
  object PnpObjectUpdate {
    
    @scala.inline
    def apply(id: String, properties: IMapView[String, _], `type`: PnpObjectType): PnpObjectUpdate = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PnpObjectUpdate]
    }
  }
  
  @js.native
  trait PnpObjectWatcher extends IPnpObjectWatcher
  object PnpObjectWatcher {
    
    @scala.inline
    def apply(
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
