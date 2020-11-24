package typings.winrtUwp.global.Windows.Devices.Perception

import typings.winrtUwp.Windows.Devices.Perception.Provider.IPerceptionFrameProvider
import typings.winrtUwp.Windows.Devices.Perception.Provider.IPerceptionFrameProviderManager
import typings.winrtUwp.Windows.Devices.Perception.Provider.PerceptionStartFaceAuthenticationHandler
import typings.winrtUwp.Windows.Devices.Perception.Provider.PerceptionStopFaceAuthenticationHandler
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Numerics.Quaternion
import typings.winrtUwp.Windows.Foundation.Numerics.Vector3
import typings.winrtUwp.Windows.Foundation.Size
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapAlphaMode
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains types for implementing providers of perception frames. */
@JSGlobal("Windows.Devices.Perception.Provider")
@js.native
object Provider extends js.Object {
  
  /** A string used to identify the type classification of a frame. */
  @js.native
  abstract class KnownPerceptionFrameKind ()
    extends typings.winrtUwp.Windows.Devices.Perception.Provider.KnownPerceptionFrameKind
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
  
  /** A group of IPerceptionFrameProvider identifiers to be controlled together. */
  @js.native
  class PerceptionControlGroup protected ()
    extends typings.winrtUwp.Windows.Devices.Perception.Provider.PerceptionControlGroup {
    /**
      * Creates a PerceptionControlGroup containing the IPerceptionFrameProviders with the ids specified.
      * @param ids A list of the unique identifiers associated with the grouped IPerceptionFrameProviders. To be controllable, the id must match the associated PerceptionFrameProviderInfo::Id property.
      */
    def this(ids: IIterable[String]) = this()
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
  }
  
  /** Represents a frame of data from the device. */
  @js.native
  abstract class PerceptionFrame ()
    extends typings.winrtUwp.Windows.Devices.Perception.Provider.PerceptionFrame
  
  /** A specific set of properties describing a unique IPerceptionFrameProvider. */
  @js.native
  /** Initializes a new PerceptionFrameProviderInfo instance. */
  class PerceptionFrameProviderInfo ()
    extends typings.winrtUwp.Windows.Devices.Perception.Provider.PerceptionFrameProviderInfo
  
  /** Static methods for managing IPerceptionFrameProvider registration and unregistration, PerceptionFaceAuthenticationGroup registration and unregistration, PerceptionControlGroup registration and unregistration, PerceptionCorrelationGroup registration and unregistration, IPerceptionFrameProvider availablity, and publishing a new PerceptionFrame for an IPerceptionFrameProvider. */
  @js.native
  abstract class PerceptionFrameProviderManagerService ()
    extends typings.winrtUwp.Windows.Devices.Perception.Provider.PerceptionFrameProviderManagerService
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
  
  /** A request from an app that's in control of this IPerceptionFrameProvider to update a property. */
  @js.native
  abstract class PerceptionPropertyChangeRequest ()
    extends typings.winrtUwp.Windows.Devices.Perception.Provider.PerceptionPropertyChangeRequest
  
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
  }
}
