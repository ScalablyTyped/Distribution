package typings.winrt.global.Windows.Devices

import typings.winrt.Windows.Devices.Enumeration.DeviceClass
import typings.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus
import typings.winrt.Windows.Devices.Enumeration.Panel
import typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectType
import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Storage.Streams.IBuffer
import typings.winrt.Windows.Storage.Streams.IInputStream
import typings.winrt.Windows.Storage.Streams.IOutputStream
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import typings.winrt.Windows.Storage.Streams.InputStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Enumeration {
  
  @JSGlobal("Windows.Devices.Enumeration.DeviceClass")
  @js.native
  object DeviceClass extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Devices.Enumeration.DeviceClass & Double] = js.native
    
    /* 0 */ val all: typings.winrt.Windows.Devices.Enumeration.DeviceClass.all & Double = js.native
    
    /* 1 */ val audioCapture: typings.winrt.Windows.Devices.Enumeration.DeviceClass.audioCapture & Double = js.native
    
    /* 2 */ val audioRender: typings.winrt.Windows.Devices.Enumeration.DeviceClass.audioRender & Double = js.native
    
    /* 3 */ val portableStorageDevice: typings.winrt.Windows.Devices.Enumeration.DeviceClass.portableStorageDevice & Double = js.native
    
    /* 4 */ val videoCapture: typings.winrt.Windows.Devices.Enumeration.DeviceClass.videoCapture & Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Enumeration.DeviceInformation")
  @js.native
  open class DeviceInformation ()
    extends StObject
       with typings.winrt.Windows.Devices.Enumeration.DeviceInformation {
    
    /* CompleteClass */
    var enclosureLocation: typings.winrt.Windows.Devices.Enumeration.EnclosureLocation = js.native
    
    /* CompleteClass */
    override def getGlyphThumbnailAsync(): IAsyncOperation[typings.winrt.Windows.Devices.Enumeration.DeviceThumbnail] = js.native
    
    /* CompleteClass */
    override def getThumbnailAsync(): IAsyncOperation[typings.winrt.Windows.Devices.Enumeration.DeviceThumbnail] = js.native
    
    /* CompleteClass */
    var id: String = js.native
    
    /* CompleteClass */
    var isDefault: Boolean = js.native
    
    /* CompleteClass */
    var isEnabled: Boolean = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var properties: IMapView[String, Any] = js.native
    
    /* CompleteClass */
    override def update(updateInfo: typings.winrt.Windows.Devices.Enumeration.DeviceInformationUpdate): Unit = js.native
  }
  /* static members */
  object DeviceInformation {
    
    @JSGlobal("Windows.Devices.Enumeration.DeviceInformation")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createFromIdAsync(id: String): IAsyncOperation[typings.winrt.Windows.Devices.Enumeration.DeviceInformation] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromIdAsync")(id.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[typings.winrt.Windows.Devices.Enumeration.DeviceInformation]]
    inline def createFromIdAsync(id: String, additionalProperties: IIterable[String]): IAsyncOperation[typings.winrt.Windows.Devices.Enumeration.DeviceInformation] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromIdAsync")(id.asInstanceOf[js.Any], additionalProperties.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[typings.winrt.Windows.Devices.Enumeration.DeviceInformation]]
    
    inline def createWatcher(): typings.winrt.Windows.Devices.Enumeration.DeviceWatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("createWatcher")().asInstanceOf[typings.winrt.Windows.Devices.Enumeration.DeviceWatcher]
    inline def createWatcher(aqsFilter: String): typings.winrt.Windows.Devices.Enumeration.DeviceWatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("createWatcher")(aqsFilter.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.Devices.Enumeration.DeviceWatcher]
    inline def createWatcher(aqsFilter: String, additionalProperties: IIterable[String]): typings.winrt.Windows.Devices.Enumeration.DeviceWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatcher")(aqsFilter.asInstanceOf[js.Any], additionalProperties.asInstanceOf[js.Any])).asInstanceOf[typings.winrt.Windows.Devices.Enumeration.DeviceWatcher]
    inline def createWatcher(deviceClass: DeviceClass): typings.winrt.Windows.Devices.Enumeration.DeviceWatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("createWatcher")(deviceClass.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.Devices.Enumeration.DeviceWatcher]
    
    inline def findAllAsync(): IAsyncOperation[typings.winrt.Windows.Devices.Enumeration.DeviceInformationCollection] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllAsync")().asInstanceOf[IAsyncOperation[typings.winrt.Windows.Devices.Enumeration.DeviceInformationCollection]]
    inline def findAllAsync(aqsFilter: String): IAsyncOperation[typings.winrt.Windows.Devices.Enumeration.DeviceInformationCollection] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllAsync")(aqsFilter.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[typings.winrt.Windows.Devices.Enumeration.DeviceInformationCollection]]
    inline def findAllAsync(aqsFilter: String, additionalProperties: IIterable[String]): IAsyncOperation[typings.winrt.Windows.Devices.Enumeration.DeviceInformationCollection] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllAsync")(aqsFilter.asInstanceOf[js.Any], additionalProperties.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[typings.winrt.Windows.Devices.Enumeration.DeviceInformationCollection]]
    inline def findAllAsync(deviceClass: DeviceClass): IAsyncOperation[typings.winrt.Windows.Devices.Enumeration.DeviceInformationCollection] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllAsync")(deviceClass.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[typings.winrt.Windows.Devices.Enumeration.DeviceInformationCollection]]
  }
  
  @JSGlobal("Windows.Devices.Enumeration.DeviceInformationCollection")
  @js.native
  open class DeviceInformationCollection ()
    extends StObject
       with typings.winrt.Windows.Devices.Enumeration.DeviceInformationCollection {
    
    /* CompleteClass */
    override def first(): IIterator[typings.winrt.Windows.Devices.Enumeration.DeviceInformation] = js.native
  }
  
  @JSGlobal("Windows.Devices.Enumeration.DeviceInformationUpdate")
  @js.native
  open class DeviceInformationUpdate ()
    extends StObject
       with typings.winrt.Windows.Devices.Enumeration.DeviceInformationUpdate {
    
    /* CompleteClass */
    var id: String = js.native
    
    /* CompleteClass */
    var properties: IMapView[String, Any] = js.native
  }
  
  @JSGlobal("Windows.Devices.Enumeration.DeviceThumbnail")
  @js.native
  open class DeviceThumbnail ()
    extends StObject
       with typings.winrt.Windows.Devices.Enumeration.DeviceThumbnail {
    
    /* CompleteClass */
    var canRead: Boolean = js.native
    
    /* CompleteClass */
    var canWrite: Boolean = js.native
    
    /* CompleteClass */
    override def cloneStream(): IRandomAccessStream = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    var contentType: String = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def flushAsync(): IAsyncOperation[Boolean] = js.native
    
    /* CompleteClass */
    override def getInputStreamAt(position: Double): IInputStream = js.native
    
    /* CompleteClass */
    override def getOutputStreamAt(position: Double): IOutputStream = js.native
    
    /* CompleteClass */
    var position: Double = js.native
    
    /* CompleteClass */
    override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IAsyncOperationWithProgress[IBuffer, Double] = js.native
    
    /* CompleteClass */
    override def seek(position: Double): Unit = js.native
    
    /* CompleteClass */
    var size: Double = js.native
    
    /* CompleteClass */
    override def writeAsync(buffer: IBuffer): IAsyncOperationWithProgress[Double, Double] = js.native
  }
  
  @JSGlobal("Windows.Devices.Enumeration.DeviceWatcher")
  @js.native
  open class DeviceWatcher ()
    extends StObject
       with typings.winrt.Windows.Devices.Enumeration.DeviceWatcher {
    
    /* CompleteClass */
    var onadded: Any = js.native
    
    /* CompleteClass */
    var onenumerationcompleted: Any = js.native
    
    /* CompleteClass */
    var onremoved: Any = js.native
    
    /* CompleteClass */
    var onstopped: Any = js.native
    
    /* CompleteClass */
    var onupdated: Any = js.native
    
    /* CompleteClass */
    override def start(): Unit = js.native
    
    /* CompleteClass */
    var status: DeviceWatcherStatus = js.native
    
    /* CompleteClass */
    override def stop(): Unit = js.native
  }
  
  @JSGlobal("Windows.Devices.Enumeration.DeviceWatcherStatus")
  @js.native
  object DeviceWatcherStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus & Double] = js.native
    
    /* 5 */ val aborted: typings.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus.aborted & Double = js.native
    
    /* 0 */ val created: typings.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus.created & Double = js.native
    
    /* 2 */ val enumerationCompleted: typings.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus.enumerationCompleted & Double = js.native
    
    /* 1 */ val started: typings.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus.started & Double = js.native
    
    /* 4 */ val stopped: typings.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus.stopped & Double = js.native
    
    /* 3 */ val stopping: typings.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus.stopping & Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Enumeration.EnclosureLocation")
  @js.native
  open class EnclosureLocation ()
    extends StObject
       with typings.winrt.Windows.Devices.Enumeration.EnclosureLocation {
    
    /* CompleteClass */
    var inDock: Boolean = js.native
    
    /* CompleteClass */
    var inLid: Boolean = js.native
    
    /* CompleteClass */
    var panel: Panel = js.native
  }
  
  @JSGlobal("Windows.Devices.Enumeration.Panel")
  @js.native
  object Panel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Devices.Enumeration.Panel & Double] = js.native
    
    /* 2 */ val back: typings.winrt.Windows.Devices.Enumeration.Panel.back & Double = js.native
    
    /* 4 */ val bottom: typings.winrt.Windows.Devices.Enumeration.Panel.bottom & Double = js.native
    
    /* 1 */ val front: typings.winrt.Windows.Devices.Enumeration.Panel.front & Double = js.native
    
    /* 5 */ val left: typings.winrt.Windows.Devices.Enumeration.Panel.left & Double = js.native
    
    /* 6 */ val right: typings.winrt.Windows.Devices.Enumeration.Panel.right & Double = js.native
    
    /* 3 */ val top: typings.winrt.Windows.Devices.Enumeration.Panel.top & Double = js.native
    
    /* 0 */ val unknown: typings.winrt.Windows.Devices.Enumeration.Panel.unknown & Double = js.native
  }
  
  object Pnp {
    
    @JSGlobal("Windows.Devices.Enumeration.Pnp.PnpObject")
    @js.native
    open class PnpObject ()
      extends StObject
         with typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObject {
      
      /* CompleteClass */
      var id: String = js.native
      
      /* CompleteClass */
      var properties: IMapView[String, Any] = js.native
      
      /* CompleteClass */
      var `type`: PnpObjectType = js.native
      
      /* CompleteClass */
      override def update(updateInfo: typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectUpdate): Unit = js.native
    }
    /* static members */
    object PnpObject {
      
      @JSGlobal("Windows.Devices.Enumeration.Pnp.PnpObject")
      @js.native
      val ^ : js.Any = js.native
      
      inline def createFromIdAsync(`type`: PnpObjectType, id: String, requestedProperties: IIterable[String]): IAsyncOperation[typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromIdAsync")(`type`.asInstanceOf[js.Any], id.asInstanceOf[js.Any], requestedProperties.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObject]]
      
      inline def createWatcher(`type`: PnpObjectType, requestedProperties: IIterable[String]): typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatcher")(`type`.asInstanceOf[js.Any], requestedProperties.asInstanceOf[js.Any])).asInstanceOf[typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectWatcher]
      inline def createWatcher(`type`: PnpObjectType, requestedProperties: IIterable[String], aqsFilter: String): typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatcher")(`type`.asInstanceOf[js.Any], requestedProperties.asInstanceOf[js.Any], aqsFilter.asInstanceOf[js.Any])).asInstanceOf[typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectWatcher]
      
      inline def findAllAsync(`type`: PnpObjectType, requestedProperties: IIterable[String]): IAsyncOperation[typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectCollection] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllAsync")(`type`.asInstanceOf[js.Any], requestedProperties.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectCollection]]
      inline def findAllAsync(`type`: PnpObjectType, requestedProperties: IIterable[String], aqsFilter: String): IAsyncOperation[typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectCollection] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllAsync")(`type`.asInstanceOf[js.Any], requestedProperties.asInstanceOf[js.Any], aqsFilter.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectCollection]]
    }
    
    @JSGlobal("Windows.Devices.Enumeration.Pnp.PnpObjectCollection")
    @js.native
    open class PnpObjectCollection ()
      extends StObject
         with typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectCollection {
      
      /* CompleteClass */
      override def first(): IIterator[typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObject] = js.native
    }
    
    @JSGlobal("Windows.Devices.Enumeration.Pnp.PnpObjectType")
    @js.native
    object PnpObjectType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectType & Double] = js.native
      
      /* 3 */ val device: typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectType.device & Double = js.native
      
      /* 2 */ val deviceContainer: typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectType.deviceContainer & Double = js.native
      
      /* 1 */ val deviceInterface: typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectType.deviceInterface & Double = js.native
      
      /* 4 */ val deviceInterfaceClass: typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectType.deviceInterfaceClass & Double = js.native
      
      /* 0 */ val unknown: typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectType.unknown & Double = js.native
    }
    
    @JSGlobal("Windows.Devices.Enumeration.Pnp.PnpObjectUpdate")
    @js.native
    open class PnpObjectUpdate ()
      extends StObject
         with typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectUpdate {
      
      /* CompleteClass */
      var id: String = js.native
      
      /* CompleteClass */
      var properties: IMapView[String, Any] = js.native
      
      /* CompleteClass */
      var `type`: PnpObjectType = js.native
    }
    
    @JSGlobal("Windows.Devices.Enumeration.Pnp.PnpObjectWatcher")
    @js.native
    open class PnpObjectWatcher ()
      extends StObject
         with typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectWatcher {
      
      /* CompleteClass */
      var onadded: Any = js.native
      
      /* CompleteClass */
      var onenumerationcompleted: Any = js.native
      
      /* CompleteClass */
      var onremoved: Any = js.native
      
      /* CompleteClass */
      var onstopped: Any = js.native
      
      /* CompleteClass */
      var onupdated: Any = js.native
      
      /* CompleteClass */
      override def start(): Unit = js.native
      
      /* CompleteClass */
      var status: DeviceWatcherStatus = js.native
      
      /* CompleteClass */
      override def stop(): Unit = js.native
    }
  }
}
