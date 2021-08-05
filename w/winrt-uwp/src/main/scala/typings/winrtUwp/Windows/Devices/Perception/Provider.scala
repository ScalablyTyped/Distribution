package typings.winrtUwp.Windows.Devices.Perception

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Foundation.Deferral
import typings.winrtUwp.Windows.Foundation.IClosable
import typings.winrtUwp.Windows.Foundation.IMemoryBuffer
import typings.winrtUwp.Windows.Foundation.Numerics.Quaternion
import typings.winrtUwp.Windows.Foundation.Numerics.Vector3
import typings.winrtUwp.Windows.Media.VideoFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains types for implementing providers of perception frames. */
object Provider {
  
  /** Represents an object that can produce PerceptionFrames. */
  trait IPerceptionFrameProvider
    extends StObject
       with IClosable {
    
    /** Gets a value indicating whether or not the device is ready to start producing PerceptionFrames. */
    var available: Boolean
    
    /** Gets the PerceptionFrameProviderInfo describing this device. */
    var frameProviderInfo: PerceptionFrameProviderInfo
    
    /** The properties describing the device and the frames produced by the device. */
    var properties: IPropertySet
    
    /**
      * The device is requested to update one of its Properties to a new value.
      * @param value Success or failure will be conveyed to the app.
      */
    def setProperty(value: PerceptionPropertyChangeRequest): Unit
    
    /** Tells the device to start producing frames. If success is returned, PerceptionFrameProviderManagerService::PublishFrameForProvider is expected to be called by this Provider. */
    def start(): Unit
    
    /** Tells the device to stop producing frames. Called only after Start is called and only if Start returns success. */
    def stop(): Unit
  }
  object IPerceptionFrameProvider {
    
    inline def apply(
      available: Boolean,
      close: () => Unit,
      frameProviderInfo: PerceptionFrameProviderInfo,
      properties: IPropertySet,
      setProperty: PerceptionPropertyChangeRequest => Unit,
      start: () => Unit,
      stop: () => Unit
    ): IPerceptionFrameProvider = {
      val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), frameProviderInfo = frameProviderInfo.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], setProperty = js.Any.fromFunction1(setProperty), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[IPerceptionFrameProvider]
    }
    
    extension [Self <: IPerceptionFrameProvider](x: Self) {
      
      inline def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
      
      inline def setFrameProviderInfo(value: PerceptionFrameProviderInfo): Self = StObject.set(x, "frameProviderInfo", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: IPropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setSetProperty(value: PerceptionPropertyChangeRequest => Unit): Self = StObject.set(x, "setProperty", js.Any.fromFunction1(value))
      
      inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  /** The IPerceptionFrameProviderManager is expected to provide any IPerceptionFrameProvider that has been registered via PerceptionFrameProviderManagerService::RegisterFrameProviderInfo(). */
  trait IPerceptionFrameProviderManager
    extends StObject
       with IClosable {
    
    /**
      * The method to request an IPerceptionFrameProvider associated with a registered PerceptionFrameProviderInfo.
      * @param frameProviderInfo The info specifying the desired IPerceptionFrameProvider.
      * @return The associated IPerceptionFrameProvider, or nullptr if there is no such registerd provider.
      */
    def getFrameProvider(frameProviderInfo: PerceptionFrameProviderInfo): IPerceptionFrameProvider
  }
  object IPerceptionFrameProviderManager {
    
    inline def apply(close: () => Unit, getFrameProvider: PerceptionFrameProviderInfo => IPerceptionFrameProvider): IPerceptionFrameProviderManager = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getFrameProvider = js.Any.fromFunction1(getFrameProvider))
      __obj.asInstanceOf[IPerceptionFrameProviderManager]
    }
    
    extension [Self <: IPerceptionFrameProviderManager](x: Self) {
      
      inline def setGetFrameProvider(value: PerceptionFrameProviderInfo => IPerceptionFrameProvider): Self = StObject.set(x, "getFrameProvider", js.Any.fromFunction1(value))
    }
  }
  
  /** A string used to identify the type classification of a frame. */
  trait KnownPerceptionFrameKind extends StObject
  
  /** A group of IPerceptionFrameProvider identifiers to be controlled together. */
  trait PerceptionControlGroup extends StObject {
    
    /** The id(s) of the IPerceptionFrameProvider(s) controlled by this group. */
    var frameProviderIds: IVectorView[String]
  }
  object PerceptionControlGroup {
    
    inline def apply(frameProviderIds: IVectorView[String]): PerceptionControlGroup = {
      val __obj = js.Dynamic.literal(frameProviderIds = frameProviderIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[PerceptionControlGroup]
    }
    
    extension [Self <: PerceptionControlGroup](x: Self) {
      
      inline def setFrameProviderIds(value: IVectorView[String]): Self = StObject.set(x, "frameProviderIds", value.asInstanceOf[js.Any])
    }
  }
  
  /** A description of the physical position and orientation of a device specified by the IPerceptionFrameProvider's unique identifier (PerceptionFrameProviderInfo::Id) sharing a common coordinate frame of other PerceptionCorrelations that will be combined into a PerceptionCorrelationGroup. */
  trait PerceptionCorrelation extends StObject {
    
    /** The orientation of the device in the common coordinate frame shared by other PerceptionCorrelations in the PerceptionCorrelationGroup. */
    var orientation: Quaternion
    
    /** The position of the device in the common coordinate frame shared by other PerceptionCorrelations in the PerceptionCorrelationGroup. */
    var position: Vector3
    
    /** The unique identifier of the described device. */
    var targetId: String
  }
  object PerceptionCorrelation {
    
    inline def apply(orientation: Quaternion, position: Vector3, targetId: String): PerceptionCorrelation = {
      val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PerceptionCorrelation]
    }
    
    extension [Self <: PerceptionCorrelation](x: Self) {
      
      inline def setOrientation(value: Quaternion): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Vector3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    }
  }
  
  /** A collection of PerceptionCorrelations describing multiple unique providers in a common coordinate frame. */
  trait PerceptionCorrelationGroup extends StObject {
    
    /** The collection of PerceptionCorrelations describing multiple unique providers in a common coordinate frame. */
    var relativeLocations: IVectorView[PerceptionCorrelation]
  }
  object PerceptionCorrelationGroup {
    
    inline def apply(relativeLocations: IVectorView[PerceptionCorrelation]): PerceptionCorrelationGroup = {
      val __obj = js.Dynamic.literal(relativeLocations = relativeLocations.asInstanceOf[js.Any])
      __obj.asInstanceOf[PerceptionCorrelationGroup]
    }
    
    extension [Self <: PerceptionCorrelationGroup](x: Self) {
      
      inline def setRelativeLocations(value: IVectorView[PerceptionCorrelation]): Self = StObject.set(x, "relativeLocations", value.asInstanceOf[js.Any])
    }
  }
  
  /** A group of unique identifiers specifying IPerceptionFrameProviders that share handlers for entering and exiting Face Authentication mode. */
  trait PerceptionFaceAuthenticationGroup extends StObject {
    
    /** The id(s) of the IPerceptionFrameProvider(s) referenced by this group. */
    var frameProviderIds: IVectorView[String]
  }
  object PerceptionFaceAuthenticationGroup {
    
    inline def apply(frameProviderIds: IVectorView[String]): PerceptionFaceAuthenticationGroup = {
      val __obj = js.Dynamic.literal(frameProviderIds = frameProviderIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[PerceptionFaceAuthenticationGroup]
    }
    
    extension [Self <: PerceptionFaceAuthenticationGroup](x: Self) {
      
      inline def setFrameProviderIds(value: IVectorView[String]): Self = StObject.set(x, "frameProviderIds", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents a frame of data from the device. */
  trait PerceptionFrame extends StObject {
    
    /** The actual bytes of the frame which can be consumed as described by the Properties of the IPerceptionFrameProvider which produced the frame. */
    var frameData: IMemoryBuffer
    
    /** Gets the Properties for this frame. */
    var properties: ValueSet
    
    /** Gets or sets the Relative Time of this frame relative to other frames from this IPerceptionFrameProvider. */
    var relativeTime: Double
  }
  object PerceptionFrame {
    
    inline def apply(frameData: IMemoryBuffer, properties: ValueSet, relativeTime: Double): PerceptionFrame = {
      val __obj = js.Dynamic.literal(frameData = frameData.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], relativeTime = relativeTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[PerceptionFrame]
    }
    
    extension [Self <: PerceptionFrame](x: Self) {
      
      inline def setFrameData(value: IMemoryBuffer): Self = StObject.set(x, "frameData", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: ValueSet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setRelativeTime(value: Double): Self = StObject.set(x, "relativeTime", value.asInstanceOf[js.Any])
    }
  }
  
  /** A specific set of properties describing a unique IPerceptionFrameProvider. */
  trait PerceptionFrameProviderInfo extends StObject {
    
    /** Gets or sets the descriptor of the kind of FrameProvider categorically, for example, "com.contoso.depthcamera.x500". */
    var deviceKind: String
    
    /** Gets or sets the friendly name for the device, for example, "Contoso Depth Camera x500". */
    var displayName: String
    
    /** Gets or sets the type of frames the device creates. */
    var frameKind: String
    
    /** Gets or sets a value indicating whether the device enumerates via FindAllAsync or device-added events on source watchers. */
    var hidden: Boolean
    
    /** Gets or sets the unique identifier of the IPerceptionFrameProvider. */
    var id: String
  }
  object PerceptionFrameProviderInfo {
    
    inline def apply(deviceKind: String, displayName: String, frameKind: String, hidden: Boolean, id: String): PerceptionFrameProviderInfo = {
      val __obj = js.Dynamic.literal(deviceKind = deviceKind.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], frameKind = frameKind.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[PerceptionFrameProviderInfo]
    }
    
    extension [Self <: PerceptionFrameProviderInfo](x: Self) {
      
      inline def setDeviceKind(value: String): Self = StObject.set(x, "deviceKind", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setFrameKind(value: String): Self = StObject.set(x, "frameKind", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  /** Static methods for managing IPerceptionFrameProvider registration and unregistration, PerceptionFaceAuthenticationGroup registration and unregistration, PerceptionControlGroup registration and unregistration, PerceptionCorrelationGroup registration and unregistration, IPerceptionFrameProvider availablity, and publishing a new PerceptionFrame for an IPerceptionFrameProvider. */
  trait PerceptionFrameProviderManagerService extends StObject
  
  /** A request from an app that's in control of this IPerceptionFrameProvider to update a property. */
  trait PerceptionPropertyChangeRequest extends StObject {
    
    /**
      * Gets a Windows::Foundation::Deferral object to allow background processing if needed.
      * @return The Deferral object.
      */
    def getDeferral(): Deferral
    
    /** Gets the name of the property to change. */
    var name: String
    
    /** Sets the new status of the request after processing the request. */
    var status: PerceptionFrameSourcePropertyChangeStatus
    
    /** Gets the requested new value of the property. */
    var value: js.Any
  }
  object PerceptionPropertyChangeRequest {
    
    inline def apply(
      getDeferral: () => Deferral,
      name: String,
      status: PerceptionFrameSourcePropertyChangeStatus,
      value: js.Any
    ): PerceptionPropertyChangeRequest = {
      val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PerceptionPropertyChangeRequest]
    }
    
    extension [Self <: PerceptionPropertyChangeRequest](x: Self) {
      
      inline def setGetDeferral(value: () => Deferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: PerceptionFrameSourcePropertyChangeStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /** Invoked when a PerceptionFaceAuthenticationGroup enters Face Authentication mode. */
  type PerceptionStartFaceAuthenticationHandler = js.Function1[/* sender */ PerceptionFaceAuthenticationGroup, Unit]
  
  /** Invoked when a PerceptionFaceAuthenticationGroup exits Face Authentication mode. This will only be invoked after the group received a PerceptionStartFaceAuthenticationHandler from which it returned true. */
  type PerceptionStopFaceAuthenticationHandler = js.Function1[/* sender */ PerceptionFaceAuthenticationGroup, Unit]
  
  /** An allocator that can create PerceptionFrames directly which can be written into or copied from Windows::Media::VideoFrame into a PerceptionFrame. */
  trait PerceptionVideoFrameAllocator extends StObject {
    
    /**
      * Creates an empty PerceptionFrame with the properties specified when creating the PerceptionVideoFrameAllocator.
      * @return The empty frame with the properties specified when creating the PerceptionVideoFrameAllocator.
      */
    def allocateFrame(): PerceptionFrame
    
    /** Releases system resources that are exposed by a Windows Runtime object. */
    def close(): Unit
    
    /**
      * Creates a deep copy of the video FrameProvider with the bytes already filled in with the resulting PerceptionFrame.
      * @param frame The input frame from which to copy the pixel data.
      * @return The resulting filled PerceptionFrame.
      */
    def copyFromVideoFrame(frame: VideoFrame): PerceptionFrame
  }
  object PerceptionVideoFrameAllocator {
    
    inline def apply(
      allocateFrame: () => PerceptionFrame,
      close: () => Unit,
      copyFromVideoFrame: VideoFrame => PerceptionFrame
    ): PerceptionVideoFrameAllocator = {
      val __obj = js.Dynamic.literal(allocateFrame = js.Any.fromFunction0(allocateFrame), close = js.Any.fromFunction0(close), copyFromVideoFrame = js.Any.fromFunction1(copyFromVideoFrame))
      __obj.asInstanceOf[PerceptionVideoFrameAllocator]
    }
    
    extension [Self <: PerceptionVideoFrameAllocator](x: Self) {
      
      inline def setAllocateFrame(value: () => PerceptionFrame): Self = StObject.set(x, "allocateFrame", js.Any.fromFunction0(value))
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setCopyFromVideoFrame(value: VideoFrame => PerceptionFrame): Self = StObject.set(x, "copyFromVideoFrame", js.Any.fromFunction1(value))
    }
  }
}
