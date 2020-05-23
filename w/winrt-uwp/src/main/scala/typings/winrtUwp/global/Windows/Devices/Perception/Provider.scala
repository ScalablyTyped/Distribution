package typings.winrtUwp.global.Windows.Devices.Perception

import typings.winrtUwp.Windows.Devices.Perception.Provider.IPerceptionFrameProvider
import typings.winrtUwp.Windows.Devices.Perception.Provider.IPerceptionFrameProviderManager
import typings.winrtUwp.Windows.Devices.Perception.Provider.PerceptionStartFaceAuthenticationHandler
import typings.winrtUwp.Windows.Devices.Perception.Provider.PerceptionStopFaceAuthenticationHandler
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Foundation.Deferral
import typings.winrtUwp.Windows.Foundation.IMemoryBuffer
import typings.winrtUwp.Windows.Foundation.Numerics.Quaternion
import typings.winrtUwp.Windows.Foundation.Numerics.Vector3
import typings.winrtUwp.Windows.Foundation.Size
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapAlphaMode
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat
import typings.winrtUwp.Windows.Media.VideoFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains types for implementing providers of perception frames. */
@JSGlobal("Windows.Devices.Perception.Provider")
@js.native
object Provider extends js.Object {
  /** A string used to identify the type classification of a frame. */
  @js.native
  abstract class KnownPerceptionFrameKind ()
    extends typings.winrtUwp.Windows.Devices.Perception.Provider.KnownPerceptionFrameKind
  
  /** A group of IPerceptionFrameProvider identifiers to be controlled together. */
  @js.native
  class PerceptionControlGroup protected ()
    extends typings.winrtUwp.Windows.Devices.Perception.Provider.PerceptionControlGroup {
    /**
      * Creates a PerceptionControlGroup containing the IPerceptionFrameProviders with the ids specified.
      * @param ids A list of the unique identifiers associated with the grouped IPerceptionFrameProviders. To be controllable, the id must match the associated PerceptionFrameProviderInfo::Id property.
      */
    def this(ids: IIterable[String]) = this()
    /** The id(s) of the IPerceptionFrameProvider(s) controlled by this group. */
    /* CompleteClass */
    override var frameProviderIds: IVectorView[String] = js.native
  }
  
  /** A description of the physical position and orientation of a device specified by the IPerceptionFrameProvider's unique identifier (PerceptionFrameProviderInfo::Id) sharing a common coordinate frame of other PerceptionCorrelations that will be combined into a PerceptionCorrelationGroup. */
  @js.native
  class PerceptionCorrelation protected ()
    extends typings.winrtUwp.Windows.Devices.Perception.Provider.PerceptionCorrelation {
    /**
      * Initializes a new PerceptionCorrelation instance.
      * @param targetId The unique identifier of the IPerceptionFrameProvider being described.
      * @param position The position of the device in a common coordinate frame of all members of a PerceptionCorrelationGroup.
      * @param orientation The orientation of the device in a common coordinate frame of all members of a PerceptionCorrelationGroup.
      */
    def this(targetId: String, position: Vector3, orientation: Quaternion) = this()
    /** The orientation of the device in the common coordinate frame shared by other PerceptionCorrelations in the PerceptionCorrelationGroup. */
    /* CompleteClass */
    override var orientation: Quaternion = js.native
    /** The position of the device in the common coordinate frame shared by other PerceptionCorrelations in the PerceptionCorrelationGroup. */
    /* CompleteClass */
    override var position: Vector3 = js.native
    /** The unique identifier of the described device. */
    /* CompleteClass */
    override var targetId: String = js.native
  }
  
  /** A collection of PerceptionCorrelations describing multiple unique providers in a common coordinate frame. */
  @js.native
  class PerceptionCorrelationGroup protected ()
    extends typings.winrtUwp.Windows.Devices.Perception.Provider.PerceptionCorrelationGroup {
    /**
      * Initializes a new PerceptionCorrelationGroup from a collection of one or more PerceptionCorrelation objects describing multiple providers in a common coordinate frame.
      * @param relativeLocations The collection of PerceptionCorrelations describing multiple providers in a common coordinate frame.
      */
    def this(relativeLocations: IIterable[typings.winrtUwp.Windows.Devices.Perception.Provider.PerceptionCorrelation]) = this()
    /** The collection of PerceptionCorrelations describing multiple unique providers in a common coordinate frame. */
    /* CompleteClass */
    override var relativeLocations: IVectorView[typings.winrtUwp.Windows.Devices.Perception.Provider.PerceptionCorrelation] = js.native
  }
  
  /** A group of unique identifiers specifying IPerceptionFrameProviders that share handlers for entering and exiting Face Authentication mode. */
  @js.native
  class PerceptionFaceAuthenticationGroup protected ()
    extends typings.winrtUwp.Windows.Devices.Perception.Provider.PerceptionFaceAuthenticationGroup {
    /**
      * Initializes a new PerceptionFaceAuthenticationGroup instance.
      * @param ids The collection of unique identifiers which maps to IPerceptionFrameProviders via PerceptionFrameProviderInfo::Id.
      * @param startHandler The handler to invoke when this group is requested to enter Face Authentication mode returning if it's ready.
      * @param stopHandler The handler to invoke when this group is leaving Face Authentication mode after startHandler is called and returned true.
      */
    def this(
      ids: IIterable[String],
      startHandler: PerceptionStartFaceAuthenticationHandler,
      stopHandler: PerceptionStopFaceAuthenticationHandler
    ) = this()
    /** The id(s) of the IPerceptionFrameProvider(s) referenced by this group. */
    /* CompleteClass */
    override var frameProviderIds: IVectorView[String] = js.native
  }
  
  /** Represents a frame of data from the device. */
  @js.native
  abstract class PerceptionFrame ()
    extends typings.winrtUwp.Windows.Devices.Perception.Provider.PerceptionFrame {
    /** The actual bytes of the frame which can be consumed as described by the Properties of the IPerceptionFrameProvider which produced the frame. */
    /* CompleteClass */
    override var frameData: IMemoryBuffer = js.native
    /** Gets the Properties for this frame. */
    /* CompleteClass */
    override var properties: ValueSet = js.native
    /** Gets or sets the Relative Time of this frame relative to other frames from this IPerceptionFrameProvider. */
    /* CompleteClass */
    override var relativeTime: Double = js.native
  }
  
  /** A specific set of properties describing a unique IPerceptionFrameProvider. */
  @js.native
  /** Initializes a new PerceptionFrameProviderInfo instance. */
  class PerceptionFrameProviderInfo ()
    extends typings.winrtUwp.Windows.Devices.Perception.Provider.PerceptionFrameProviderInfo {
    /** Gets or sets the descriptor of the kind of FrameProvider categorically, for example, "com.contoso.depthcamera.x500". */
    /* CompleteClass */
    override var deviceKind: String = js.native
    /** Gets or sets the friendly name for the device, for example, "Contoso Depth Camera x500". */
    /* CompleteClass */
    override var displayName: String = js.native
    /** Gets or sets the type of frames the device creates. */
    /* CompleteClass */
    override var frameKind: String = js.native
    /** Gets or sets a value indicating whether the device enumerates via FindAllAsync or device-added events on source watchers. */
    /* CompleteClass */
    override var hidden: Boolean = js.native
    /** Gets or sets the unique identifier of the IPerceptionFrameProvider. */
    /* CompleteClass */
    override var id: String = js.native
  }
  
  /** Static methods for managing IPerceptionFrameProvider registration and unregistration, PerceptionFaceAuthenticationGroup registration and unregistration, PerceptionControlGroup registration and unregistration, PerceptionCorrelationGroup registration and unregistration, IPerceptionFrameProvider availablity, and publishing a new PerceptionFrame for an IPerceptionFrameProvider. */
  @js.native
  abstract class PerceptionFrameProviderManagerService ()
    extends typings.winrtUwp.Windows.Devices.Perception.Provider.PerceptionFrameProviderManagerService
  
  /** A request from an app that's in control of this IPerceptionFrameProvider to update a property. */
  @js.native
  abstract class PerceptionPropertyChangeRequest ()
    extends typings.winrtUwp.Windows.Devices.Perception.Provider.PerceptionPropertyChangeRequest {
    /** Gets the name of the property to change. */
    /* CompleteClass */
    override var name: String = js.native
    /** Sets the new status of the request after processing the request. */
    /* CompleteClass */
    override var status: typings.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourcePropertyChangeStatus = js.native
    /** Gets the requested new value of the property. */
    /* CompleteClass */
    override var value: js.Any = js.native
    /**
      * Gets a Windows::Foundation::Deferral object to allow background processing if needed.
      * @return The Deferral object.
      */
    /* CompleteClass */
    override def getDeferral(): Deferral = js.native
  }
  
  /** An allocator that can create PerceptionFrames directly which can be written into or copied from Windows::Media::VideoFrame into a PerceptionFrame. */
  @js.native
  class PerceptionVideoFrameAllocator protected ()
    extends typings.winrtUwp.Windows.Devices.Perception.Provider.PerceptionVideoFrameAllocator {
    /**
      * Initializes a new PerceptionVideoFrameAllocator with the required properties for use by the IPerceptionFrameProvider to create PerceptionFrames published via PerceptionFrameProviderManagerService::PublishFrameForProvider.
      * @param maxOutstandingFrameCountForWrite This is the number of buffers in flight required by the FrameProvider to produce its * frames at framerate. The suggestion is at least 2.
      * @param format The Windows::Graphics::Imaging::BitmapPixelFormat describing the format of the bytes of the frame.
      * @param resolution The resolution in pixels of the frame.
      * @param alpha The Windows::Graphics::Imaging::BitmapAlphaMode describing how transparency is handled in the pixels.
      */
    def this(
      maxOutstandingFrameCountForWrite: Double,
      format: BitmapPixelFormat,
      resolution: Size,
      alpha: BitmapAlphaMode
    ) = this()
    /**
      * Creates an empty PerceptionFrame with the properties specified when creating the PerceptionVideoFrameAllocator.
      * @return The empty frame with the properties specified when creating the PerceptionVideoFrameAllocator.
      */
    /* CompleteClass */
    override def allocateFrame(): typings.winrtUwp.Windows.Devices.Perception.Provider.PerceptionFrame = js.native
    /** Releases system resources that are exposed by a Windows Runtime object. */
    /* CompleteClass */
    override def close(): Unit = js.native
    /**
      * Creates a deep copy of the video FrameProvider with the bytes already filled in with the resulting PerceptionFrame.
      * @param frame The input frame from which to copy the pixel data.
      * @return The resulting filled PerceptionFrame.
      */
    /* CompleteClass */
    override def copyFromVideoFrame(frame: VideoFrame): typings.winrtUwp.Windows.Devices.Perception.Provider.PerceptionFrame = js.native
  }
  
  /* static members */
  @js.native
  object KnownPerceptionFrameKind extends js.Object {
    /** Gets the string representing the Color FrameKind of a PerceptionFrameProviderInfo. */
    var color: String = js.native
    /** Gets the string representing the Depth FrameKind of a PerceptionFrameProviderInfo. */
    var depth: String = js.native
    /** Gets the string representing the Infrared FrameKind of a PerceptionFrameProviderInfo. */
    var infrared: String = js.native
  }
  
  /* static members */
  @js.native
  object PerceptionFrameProviderManagerService extends js.Object {
    /**
      * Sends the PerceptionFrame to the service to tell any apps listening for frames for the provided provider. Frames aren't expected to be published before IPerceptionFrameProvider::Start() is called or after IPerceptionFrameProvider::Stop() is called.
      * @param provider The IPerceptionFrameProvider which produced the frame.
      * @param frame The PerceptionFrame that was produced and should be sent to apps.
      */
    def publishFrameForProvider(
      provider: IPerceptionFrameProvider,
      frame: typings.winrtUwp.Windows.Devices.Perception.Provider.PerceptionFrame
    ): Unit = js.native
    /**
      * Registers a PerceptionControlGroup associated with the IPerceptionFrameProviderManager.
      * @param manager The manager that owns the lifetime of the group.
      * @param controlGroup The group of IPerceptionFrameProvider(s) to control atomically.
      */
    def registerControlGroup(
      manager: IPerceptionFrameProviderManager,
      controlGroup: typings.winrtUwp.Windows.Devices.Perception.Provider.PerceptionControlGroup
    ): Unit = js.native
    /**
      * Registers a PerceptionCorrelationGroup associated with the IPerceptionFrameProviderManager.
      * @param manager The manager that owns the lifetime of the group.
      * @param correlationGroup The group of PerceptionCorrelations(s) to control atomically.
      */
    def registerCorrelationGroup(
      manager: IPerceptionFrameProviderManager,
      correlationGroup: typings.winrtUwp.Windows.Devices.Perception.Provider.PerceptionCorrelationGroup
    ): Unit = js.native
    /**
      * Registers a PerceptionFaceAuthenticationGroup associated with the given IPerceptionProviderManager.
      * @param manager The manager that owns the lifetime of the group.
      * @param faceAuthenticationGroup The group of IPerceptionFrameProvider(s) to atomically control.
      */
    def registerFaceAuthenticationGroup(
      manager: IPerceptionFrameProviderManager,
      faceAuthenticationGroup: typings.winrtUwp.Windows.Devices.Perception.Provider.PerceptionFaceAuthenticationGroup
    ): Unit = js.native
    /**
      * Registers the PerceptionFrameProviderInfo in association with the given IPerceptionFrameProviderManager.
      * @param manager The manager which can provide the IPerceptionFrameProvider associated with the info.
      * @param frameProviderInfo The PerceptionFrameProviderInfo which identifies the available IPerceptionFrameProvider.
      */
    def registerFrameProviderInfo(
      manager: IPerceptionFrameProviderManager,
      frameProviderInfo: typings.winrtUwp.Windows.Devices.Perception.Provider.PerceptionFrameProviderInfo
    ): Unit = js.native
    /**
      * Removes the registration of a previously registered PerceptionControlGroup.
      * @param manager The manager that owns the lifetime of the group.
      * @param controlGroup The group of IPerceptionFrameProvider(s) to prevent from being controlled.
      */
    def unregisterControlGroup(
      manager: IPerceptionFrameProviderManager,
      controlGroup: typings.winrtUwp.Windows.Devices.Perception.Provider.PerceptionControlGroup
    ): Unit = js.native
    /**
      * Unregisters a PerceptionCorrelationGroup associated with the IPerceptionFrameProviderManager.
      * @param manager The manager that owns the lifetime of the group.
      * @param correlationGroup The PerceptionCorrelationGroup to unregister.
      */
    def unregisterCorrelationGroup(
      manager: IPerceptionFrameProviderManager,
      correlationGroup: typings.winrtUwp.Windows.Devices.Perception.Provider.PerceptionCorrelationGroup
    ): Unit = js.native
    /**
      * Unregisters a PerceptionFaceAuthenticationGroup in association with the given IPerceptionProviderManager.
      * @param manager The manager that owns the lifetime of the group.
      * @param faceAuthenticationGroup The PerceptionFaceAuthenticationGroup to unregister.
      */
    def unregisterFaceAuthenticationGroup(
      manager: IPerceptionFrameProviderManager,
      faceAuthenticationGroup: typings.winrtUwp.Windows.Devices.Perception.Provider.PerceptionFaceAuthenticationGroup
    ): Unit = js.native
    /**
      * Unregisters the PerceptionFrameProviderInfo in association with the given IPerceptionProviderManager.
      * @param manager The manager which previously registered this info.
      * @param frameProviderInfo The PerceptionFrameProviderInfo which identifies the IPerceptionFrameProvider.
      */
    def unregisterFrameProviderInfo(
      manager: IPerceptionFrameProviderManager,
      frameProviderInfo: typings.winrtUwp.Windows.Devices.Perception.Provider.PerceptionFrameProviderInfo
    ): Unit = js.native
    /**
      * Sets whether or not the IPerceptionFrameProvider is available.
      * @param provider The provider to set availability for.
      * @param available Whether or not the provider is available.
      */
    def updateAvailabilityForProvider(provider: IPerceptionFrameProvider, available: Boolean): Unit = js.native
  }
  
}

