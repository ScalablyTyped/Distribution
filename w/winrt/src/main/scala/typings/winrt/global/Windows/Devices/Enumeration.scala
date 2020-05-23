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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Enumeration")
@js.native
object Enumeration extends js.Object {
  @js.native
  class DeviceInformation ()
    extends typings.winrt.Windows.Devices.Enumeration.DeviceInformation {
    /* CompleteClass */
    override var enclosureLocation: typings.winrt.Windows.Devices.Enumeration.EnclosureLocation = js.native
    /* CompleteClass */
    override var id: String = js.native
    /* CompleteClass */
    override var isDefault: Boolean = js.native
    /* CompleteClass */
    override var isEnabled: Boolean = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var properties: IMapView[String, _] = js.native
    /* CompleteClass */
    override def getGlyphThumbnailAsync(): IAsyncOperation[typings.winrt.Windows.Devices.Enumeration.DeviceThumbnail] = js.native
    /* CompleteClass */
    override def getThumbnailAsync(): IAsyncOperation[typings.winrt.Windows.Devices.Enumeration.DeviceThumbnail] = js.native
    /* CompleteClass */
    override def update(updateInfo: typings.winrt.Windows.Devices.Enumeration.DeviceInformationUpdate): Unit = js.native
  }
  
  @js.native
  class DeviceInformationCollection ()
    extends typings.winrt.Windows.Devices.Enumeration.DeviceInformationCollection {
    /* CompleteClass */
    override def first(): IIterator[typings.winrt.Windows.Devices.Enumeration.DeviceInformation] = js.native
  }
  
  @js.native
  class DeviceInformationUpdate ()
    extends typings.winrt.Windows.Devices.Enumeration.DeviceInformationUpdate {
    /* CompleteClass */
    override var id: String = js.native
    /* CompleteClass */
    override var properties: IMapView[String, _] = js.native
  }
  
  @js.native
  class DeviceThumbnail ()
    extends typings.winrt.Windows.Devices.Enumeration.DeviceThumbnail {
    /* CompleteClass */
    override var canRead: Boolean = js.native
    /* CompleteClass */
    override var canWrite: Boolean = js.native
    /* CompleteClass */
    override var contentType: String = js.native
    /* CompleteClass */
    override var position: Double = js.native
    /* CompleteClass */
    override var size: Double = js.native
    /* CompleteClass */
    override def cloneStream(): IRandomAccessStream = js.native
    /* CompleteClass */
    override def close(): Unit = js.native
    /* CompleteClass */
    override def dispose(): Unit = js.native
    /* CompleteClass */
    override def flushAsync(): IAsyncOperation[Boolean] = js.native
    /* CompleteClass */
    override def getInputStreamAt(position: Double): IInputStream = js.native
    /* CompleteClass */
    override def getOutputStreamAt(position: Double): IOutputStream = js.native
    /* CompleteClass */
    override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IAsyncOperationWithProgress[IBuffer, Double] = js.native
    /* CompleteClass */
    override def seek(position: Double): Unit = js.native
    /* CompleteClass */
    override def writeAsync(buffer: IBuffer): IAsyncOperationWithProgress[Double, Double] = js.native
  }
  
  @js.native
  class DeviceWatcher ()
    extends typings.winrt.Windows.Devices.Enumeration.DeviceWatcher {
    /* CompleteClass */
    override var onadded: js.Any = js.native
    /* CompleteClass */
    override var onenumerationcompleted: js.Any = js.native
    /* CompleteClass */
    override var onremoved: js.Any = js.native
    /* CompleteClass */
    override var onstopped: js.Any = js.native
    /* CompleteClass */
    override var onupdated: js.Any = js.native
    /* CompleteClass */
    override var status: DeviceWatcherStatus = js.native
    /* CompleteClass */
    override def start(): Unit = js.native
    /* CompleteClass */
    override def stop(): Unit = js.native
  }
  
  @js.native
  class EnclosureLocation ()
    extends typings.winrt.Windows.Devices.Enumeration.EnclosureLocation {
    /* CompleteClass */
    override var inDock: Boolean = js.native
    /* CompleteClass */
    override var inLid: Boolean = js.native
    /* CompleteClass */
    override var panel: Panel = js.native
  }
  
  @js.native
  object DeviceClass extends js.Object {
    /* 0 */ val all: typings.winrt.Windows.Devices.Enumeration.DeviceClass.all with Double = js.native
    /* 1 */ val audioCapture: typings.winrt.Windows.Devices.Enumeration.DeviceClass.audioCapture with Double = js.native
    /* 2 */ val audioRender: typings.winrt.Windows.Devices.Enumeration.DeviceClass.audioRender with Double = js.native
    /* 3 */ val portableStorageDevice: typings.winrt.Windows.Devices.Enumeration.DeviceClass.portableStorageDevice with Double = js.native
    /* 4 */ val videoCapture: typings.winrt.Windows.Devices.Enumeration.DeviceClass.videoCapture with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Devices.Enumeration.DeviceClass with Double] = js.native
  }
  
  /* static members */
  @js.native
  object DeviceInformation extends js.Object {
    def createFromIdAsync(id: String): IAsyncOperation[typings.winrt.Windows.Devices.Enumeration.DeviceInformation] = js.native
    def createFromIdAsync(id: String, additionalProperties: IIterable[String]): IAsyncOperation[typings.winrt.Windows.Devices.Enumeration.DeviceInformation] = js.native
    def createWatcher(): typings.winrt.Windows.Devices.Enumeration.DeviceWatcher = js.native
    def createWatcher(aqsFilter: String): typings.winrt.Windows.Devices.Enumeration.DeviceWatcher = js.native
    def createWatcher(aqsFilter: String, additionalProperties: IIterable[String]): typings.winrt.Windows.Devices.Enumeration.DeviceWatcher = js.native
    def createWatcher(deviceClass: DeviceClass): typings.winrt.Windows.Devices.Enumeration.DeviceWatcher = js.native
    def findAllAsync(): IAsyncOperation[typings.winrt.Windows.Devices.Enumeration.DeviceInformationCollection] = js.native
    def findAllAsync(aqsFilter: String): IAsyncOperation[typings.winrt.Windows.Devices.Enumeration.DeviceInformationCollection] = js.native
    def findAllAsync(aqsFilter: String, additionalProperties: IIterable[String]): IAsyncOperation[typings.winrt.Windows.Devices.Enumeration.DeviceInformationCollection] = js.native
    def findAllAsync(deviceClass: DeviceClass): IAsyncOperation[typings.winrt.Windows.Devices.Enumeration.DeviceInformationCollection] = js.native
  }
  
  @js.native
  object DeviceWatcherStatus extends js.Object {
    /* 5 */ val aborted: typings.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus.aborted with Double = js.native
    /* 0 */ val created: typings.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus.created with Double = js.native
    /* 2 */ val enumerationCompleted: typings.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus.enumerationCompleted with Double = js.native
    /* 1 */ val started: typings.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus.started with Double = js.native
    /* 4 */ val stopped: typings.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus.stopped with Double = js.native
    /* 3 */ val stopping: typings.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus.stopping with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus with Double] = js.native
  }
  
  @js.native
  object Panel extends js.Object {
    /* 2 */ val back: typings.winrt.Windows.Devices.Enumeration.Panel.back with Double = js.native
    /* 4 */ val bottom: typings.winrt.Windows.Devices.Enumeration.Panel.bottom with Double = js.native
    /* 1 */ val front: typings.winrt.Windows.Devices.Enumeration.Panel.front with Double = js.native
    /* 5 */ val left: typings.winrt.Windows.Devices.Enumeration.Panel.left with Double = js.native
    /* 6 */ val right: typings.winrt.Windows.Devices.Enumeration.Panel.right with Double = js.native
    /* 3 */ val top: typings.winrt.Windows.Devices.Enumeration.Panel.top with Double = js.native
    /* 0 */ val unknown: typings.winrt.Windows.Devices.Enumeration.Panel.unknown with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Devices.Enumeration.Panel with Double] = js.native
  }
  
  @js.native
  object Pnp extends js.Object {
    @js.native
    class PnpObject ()
      extends typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObject {
      /* CompleteClass */
      override var id: String = js.native
      /* CompleteClass */
      override var properties: IMapView[String, _] = js.native
      /* CompleteClass */
      override var `type`: PnpObjectType = js.native
      /* CompleteClass */
      override def update(updateInfo: typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectUpdate): Unit = js.native
    }
    
    @js.native
    class PnpObjectCollection ()
      extends typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectCollection {
      /* CompleteClass */
      override def first(): IIterator[typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObject] = js.native
    }
    
    @js.native
    class PnpObjectUpdate ()
      extends typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectUpdate {
      /* CompleteClass */
      override var id: String = js.native
      /* CompleteClass */
      override var properties: IMapView[String, _] = js.native
      /* CompleteClass */
      override var `type`: PnpObjectType = js.native
    }
    
    @js.native
    class PnpObjectWatcher ()
      extends typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectWatcher {
      /* CompleteClass */
      override var onadded: js.Any = js.native
      /* CompleteClass */
      override var onenumerationcompleted: js.Any = js.native
      /* CompleteClass */
      override var onremoved: js.Any = js.native
      /* CompleteClass */
      override var onstopped: js.Any = js.native
      /* CompleteClass */
      override var onupdated: js.Any = js.native
      /* CompleteClass */
      override var status: DeviceWatcherStatus = js.native
      /* CompleteClass */
      override def start(): Unit = js.native
      /* CompleteClass */
      override def stop(): Unit = js.native
    }
    
    /* static members */
    @js.native
    object PnpObject extends js.Object {
      def createFromIdAsync(`type`: PnpObjectType, id: String, requestedProperties: IIterable[String]): IAsyncOperation[typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObject] = js.native
      def createWatcher(`type`: PnpObjectType, requestedProperties: IIterable[String]): typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectWatcher = js.native
      def createWatcher(`type`: PnpObjectType, requestedProperties: IIterable[String], aqsFilter: String): typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectWatcher = js.native
      def findAllAsync(`type`: PnpObjectType, requestedProperties: IIterable[String]): IAsyncOperation[typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectCollection] = js.native
      def findAllAsync(`type`: PnpObjectType, requestedProperties: IIterable[String], aqsFilter: String): IAsyncOperation[typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectCollection] = js.native
    }
    
    @js.native
    object PnpObjectType extends js.Object {
      /* 3 */ val device: typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectType.device with Double = js.native
      /* 2 */ val deviceContainer: typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectType.deviceContainer with Double = js.native
      /* 1 */ val deviceInterface: typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectType.deviceInterface with Double = js.native
      /* 4 */ val deviceInterfaceClass: typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectType.deviceInterfaceClass with Double = js.native
      /* 0 */ val unknown: typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectType.unknown with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObjectType with Double] = js.native
    }
    
  }
  
}

