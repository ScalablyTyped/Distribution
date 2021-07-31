package typings.winrtUwp.global.Windows.System

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Networking.HostName
import typings.winrtUwp.Windows.System.RemoteSystems.IRemoteSystemFilter
import typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAccessStatus
import typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAuthorizationKind
import typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemDiscoveryType
import typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemPlatform
import typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemStatus
import typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemStatusType
import typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcherError
import typings.winrtUwp.Windows.WinRTEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RemoteSystems {
  
  /** This class manages the attributes of a discovered remote system (device) and provides the capabilities to discover remote systems as part of Project Rome. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystem")
  @js.native
  abstract class RemoteSystem ()
    extends StObject
       with typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystem {
    
    /** A list of the applications on this remote system that have registered with the Connected Devices Platform. */
    /* CompleteClass */
    var apps: IVectorView[typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemApp] = js.native
    
    /** Gets the machine name of the given remote system. */
    /* CompleteClass */
    var displayName: String = js.native
    
    /** Reports whether the RemoteSystem is capable of the given Remote System feature. */
    /* CompleteClass */
    override def getCapabilitySupportedAsync(capabilityName: String): IPromiseWithIAsyncOperation[Boolean] = js.native
    
    /** Gets the unique string identifier for the given remote system. */
    /* CompleteClass */
    var id: String = js.native
    
    /** Checks whether the given remote system is available through proximal connection (such as a Bluetooth or local network connection) as opposed to cloud connection. */
    /* CompleteClass */
    var isAvailableByProximity: Boolean = js.native
    
    /** Checks whether the given remote system is available through spatially proximal connection. */
    /* CompleteClass */
    var isAvailableBySpatialProximity: Boolean = js.native
    
    /** Gets a String representation of the device type of the given remote system (desktop, Xbox, ...). */
    /* CompleteClass */
    var kind: String = js.native
    
    /** Gets the manufacturer name of the given remote system. */
    /* CompleteClass */
    var manufacturerDisplayName: String = js.native
    
    /** Gets the model name of the given remote system. */
    /* CompleteClass */
    var modelDisplayName: String = js.native
    
    /** Gets a value describing the OS platform that this remote system is running. */
    /* CompleteClass */
    var platform: RemoteSystemPlatform = js.native
    
    /** Gets the status of this remote system's availability. */
    /* CompleteClass */
    var status: RemoteSystemStatus = js.native
  }
  object RemoteSystem {
    
    @JSGlobal("Windows.System.RemoteSystems.RemoteSystem")
    @js.native
    val ^ : js.Any = js.native
    
    /** Returns a RemoteSystemWatcher object with no filters. */
    /* static member */
    @scala.inline
    def createWatcher(): typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("createWatcher")().asInstanceOf[typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcher]
    /** Returns a RemoteSystemWatcher object that filters the remote systems it can see. The filters parameter determines which remote systems will be seen. */
    /* static member */
    @scala.inline
    def createWatcher(filters: IIterable[IRemoteSystemFilter]): typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("createWatcher")(filters.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcher]
    
    /** Attempts to discover a single remote system specified by the HostName parameter. */
    /* static member */
    @scala.inline
    def findByHostNameAsync(host: HostName): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystem] = ^.asInstanceOf[js.Dynamic].applyDynamic("findByHostNameAsync")(host.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystem]]
    
    /** Checks whether the client device is authorized to discover other users' devices or just same-user devices. */
    /* static member */
    @scala.inline
    def isAuthorizationKindEnabled(kind: RemoteSystemAuthorizationKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAuthorizationKindEnabled")(kind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** Gets the status of the calling app's access to the Remote Systems feature. This method should always be called before an app attempts to discover or otherwise interact with remote systems. */
    /* static member */
    @scala.inline
    def requestAccessAsync(): IPromiseWithIAsyncOperation[RemoteSystemAccessStatus] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAccessAsync")().asInstanceOf[IPromiseWithIAsyncOperation[RemoteSystemAccessStatus]]
  }
  
  /** Contains the values that describe an app's access to use the Remote Systems feature. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemAccessStatus")
  @js.native
  object RemoteSystemAccessStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAccessStatus & Double] = js.native
    
    /* 1 */ val allowed: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAccessStatus.allowed & Double = js.native
    
    /* 3 */ val deniedBySystem: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAccessStatus.deniedBySystem & Double = js.native
    
    /* 2 */ val deniedByUser: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAccessStatus.deniedByUser & Double = js.native
    
    /* 0 */ val unspecified: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAccessStatus.unspecified & Double = js.native
  }
  
  /** Gets information about a RemoteSystemAdded event, namely the RemoteSystem that was added. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemAddedEventArgs")
  @js.native
  abstract class RemoteSystemAddedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAddedEventArgs {
    
    /** The RemoteSystem object representing the device that was added to the set of discoverable devices, causing the containing RemoteSystemAdded event to be raised. */
    /* CompleteClass */
    var remoteSystem: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystem = js.native
  }
  
  /** Represents an application on a remote system. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemApp")
  @js.native
  abstract class RemoteSystemApp ()
    extends StObject
       with typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemApp {
    
    /** The app-specific attributes of this application. */
    /* CompleteClass */
    var Attributes: IMapView[String, String] = js.native
    
    /** The display-friendly name for this application. This is the name used by the device for Bluetooth identification. If this hasn't been set or the device doesn't support Bluetooth, this field will be empty. */
    /* CompleteClass */
    var displayName: String = js.native
    
    /** The unique identifier for this application. */
    /* CompleteClass */
    var id: String = js.native
    
    /** Indicates whether this application is currently available for proximal connection. */
    /* CompleteClass */
    var isAvailableByProximity: Boolean = js.native
    
    /** Indicates whether this application is currently available for spatial sharing connection. */
    /* CompleteClass */
    var isAvailableBySpatialProximity: Boolean = js.native
  }
  
  /** Contains values specifying whether the client device can discover only same-user devices or other users' devices as well. Cross-user devices must be available through a proximal connection in order to be discovered (see RemoteSystemDiscoveryType for details). */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemAuthorizationKind")
  @js.native
  object RemoteSystemAuthorizationKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAuthorizationKind & Double
      ] = js.native
    
    /* 1 */ val anonymous: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAuthorizationKind.anonymous & Double = js.native
    
    /* 0 */ val sameUser: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAuthorizationKind.sameUser & Double = js.native
  }
  
  /** Represents an intent to communicate with a specific remote system (device). */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemConnectionRequest")
  @js.native
  class RemoteSystemConnectionRequest protected ()
    extends StObject
       with typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemConnectionRequest {
    /** Initializes an instance of the RemoteSystemConnectionRequest class. */
    def this(remoteSystem: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystem) = this()
    
    /** Represents the remote system (device) that the app intends to communicate with. */
    /* CompleteClass */
    var remoteSystem: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystem = js.native
    
    /** Represents the remote application that the app intends to communicate with. */
    /* CompleteClass */
    var remoteSystemApp: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemApp = js.native
  }
  object RemoteSystemConnectionRequest {
    
    @JSGlobal("Windows.System.RemoteSystems.RemoteSystemConnectionRequest")
    @js.native
    val ^ : js.Any = js.native
    
    /** Initializes a new instance of the RemoteSystemConnectionRequest class for a particular application on a remote system. */
    /* static member */
    @scala.inline
    def createForApp(remoteSystemApp: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemApp): typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemConnectionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("createForApp")(remoteSystemApp.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemConnectionRequest]
  }
  
  /** Contains the values that describe how remote systems are able to be discovered. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemDiscoveryType")
  @js.native
  object RemoteSystemDiscoveryType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemDiscoveryType & Double] = js.native
    
    /* 0 */ val any: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemDiscoveryType.any & Double = js.native
    
    /* 2 */ val cloud: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemDiscoveryType.cloud & Double = js.native
    
    /* 1 */ val proximal: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemDiscoveryType.proximal & Double = js.native
    
    /* 3 */ val spatiallyProximal: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemDiscoveryType.spatiallyProximal & Double = js.native
  }
  
  /** An IRemoteSystemFilter that limits the set of discoverable remote systems by allowing only those of a specific discovery type. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemDiscoveryTypeFilter")
  @js.native
  class RemoteSystemDiscoveryTypeFilter protected ()
    extends StObject
       with typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemDiscoveryTypeFilter {
    /** Initializes an instance of the RemoteSystemDiscoveryTypeFilter class. */
    def this(discoveryType: RemoteSystemDiscoveryType) = this()
    
    /** String representation(s) of the device type(s) that the containing RemoteSystemKindFilter object targets. */
    /* CompleteClass */
    var remoteSystemKinds: IVectorView[String] = js.native
  }
  
  /** This is the argument class for the **RemoteSystemWatcher.EnumerationCompleted** event. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemEnumerationCompletedEventArgs")
  @js.native
  abstract class RemoteSystemEnumerationCompletedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemEnumerationCompletedEventArgs
  
  /** An IRemoteSystemFilter that limits the set of discoverable remote systems by allowing only those of specific device types. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemKindFilter")
  @js.native
  class RemoteSystemKindFilter protected ()
    extends StObject
       with typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemKindFilter {
    /** Initializes an instance of the RemoteSystemKindFilter class with a list of string representations of device types to target. These strings should conform to the values of the properties of the RemoteSystemKinds class. */
    def this(remoteSystemKinds: IIterable[String]) = this()
    
    /** String representation(s) of the device type(s) that the containing RemoteSystemKindFilter object targets. */
    /* CompleteClass */
    var remoteSystemKinds: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemKinds = js.native
  }
  
  /** Contains read-only strings that identify various device types. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemKinds")
  @js.native
  abstract class RemoteSystemKinds ()
    extends StObject
       with typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemKinds
  object RemoteSystemKinds {
    
    @JSGlobal("Windows.System.RemoteSystems.RemoteSystemKinds")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets the string representation of the desktop device type. */
    /* static member */
    @JSGlobal("Windows.System.RemoteSystems.RemoteSystemKinds.desktop")
    @js.native
    def desktop: String = js.native
    @scala.inline
    def desktop_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desktop")(x.asInstanceOf[js.Any])
    
    /** Gets the string representation of the holographic device type. */
    /* static member */
    @JSGlobal("Windows.System.RemoteSystems.RemoteSystemKinds.holographic")
    @js.native
    def holographic: String = js.native
    @scala.inline
    def holographic_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("holographic")(x.asInstanceOf[js.Any])
    
    /** Gets the string representation of the hub device type. */
    /* static member */
    @JSGlobal("Windows.System.RemoteSystems.RemoteSystemKinds.hub")
    @js.native
    def hub: String = js.native
    @scala.inline
    def hub_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hub")(x.asInstanceOf[js.Any])
    
    /** Gets the string representation of the Internet of Things (IoT) device type. */
    /* static member */
    @JSGlobal("Windows.System.RemoteSystems.RemoteSystemKinds.iot")
    @js.native
    def iot: String = js.native
    @scala.inline
    def iot_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iot")(x.asInstanceOf[js.Any])
    
    /** Gets the string representation of the laptop device type. */
    /* static member */
    @JSGlobal("Windows.System.RemoteSystems.RemoteSystemKinds.laptop")
    @js.native
    def laptop: String = js.native
    @scala.inline
    def laptop_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("laptop")(x.asInstanceOf[js.Any])
    
    /** Gets the string representation of the phone device type. */
    /* static member */
    @JSGlobal("Windows.System.RemoteSystems.RemoteSystemKinds.phone")
    @js.native
    def phone: String = js.native
    @scala.inline
    def phone_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("phone")(x.asInstanceOf[js.Any])
    
    /** Gets the string representation of the tablet device type. */
    /* static member */
    @JSGlobal("Windows.System.RemoteSystems.RemoteSystemKinds.tablet")
    @js.native
    def tablet: String = js.native
    @scala.inline
    def tablet_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tablet")(x.asInstanceOf[js.Any])
    
    /** Gets the string representation of the xbox device type. */
    /* static member */
    @JSGlobal("Windows.System.RemoteSystems.RemoteSystemKinds.xbox")
    @js.native
    def xbox: String = js.native
    @scala.inline
    def xbox_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xbox")(x.asInstanceOf[js.Any])
  }
  
  /** Contains values that describe the operating system platforms that a remote system could be running. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemPlatform")
  @js.native
  object RemoteSystemPlatform extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemPlatform & Double] = js.native
    
    /* 2 */ val android: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemPlatform.android & Double = js.native
    
    /* 3 */ val ios: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemPlatform.ios & Double = js.native
    
    /* 4 */ val linux: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemPlatform.linux & Double = js.native
    
    /* 0 */ val unknown: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemPlatform.unknown & Double = js.native
    
    /* 1 */ val windows: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemPlatform.windows & Double = js.native
  }
  
  /** Gets information about a RemoteSystemRemoved event, namely the RemoteSystem that was removed. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemRemovedEventArgs")
  @js.native
  abstract class RemoteSystemRemovedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemRemovedEventArgs {
    
    /** The RemoteSystem object representing the device that was removed from the set of discoverable devices, causing the containing RemoteSystemRemoved event to be raised. */
    /* CompleteClass */
    var remoteSystemId: String = js.native
  }
  
  /** Contains the values that describe a remote system's availability status. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemStatus")
  @js.native
  object RemoteSystemStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemStatus & Double] = js.native
    
    /* 2 */ val available: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemStatus.available & Double = js.native
    
    /* 1 */ val discoveringAvailability: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemStatus.discoveringAvailability & Double = js.native
    
    /* 0 */ val unavailable: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemStatus.unavailable & Double = js.native
    
    /* 3 */ val unknown: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemStatus.unknown & Double = js.native
  }
  
  /** Contains the values that describe a remote system's status type. This is a simplification of the RemoteSystemStatus enumeration and is used to construct a RemoteSystemStatusTypeFilter object. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemStatusType")
  @js.native
  object RemoteSystemStatusType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemStatusType & Double] = js.native
    
    /* 0 */ val any: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemStatusType.any & Double = js.native
    
    /* 1 */ val available: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemStatusType.available & Double = js.native
  }
  
  /** An IRemoteSystemFilter that limits the set of discoverable remote systems by allowing only those of a specific availability status. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemStatusTypeFilter")
  @js.native
  class RemoteSystemStatusTypeFilter protected ()
    extends StObject
       with typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemStatusTypeFilter {
    /** Initializes an instance of the RemoteSystemStatusTypeFilter class. */
    def this(remoteSystemStatusType: RemoteSystemStatusType) = this()
    
    /** The status type that the containing RemoteSystemStatusTypeFilter object targets. */
    /* CompleteClass */
    var remoteSystemStatusType: RemoteSystemStatusType = js.native
  }
  
  /** Gets information about a RemoteSystemUpdated event, namely the RemoteSystem that was updated. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemUpdatedEventArgs")
  @js.native
  abstract class RemoteSystemUpdatedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemUpdatedEventArgs {
    
    /** The RemoteSystem object representing the device in the set of discoverable devices whose properties were updated, causing the containing RemoteSystemUpdated event to be raised. */
    /* CompleteClass */
    var remoteSystem: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystem = js.native
  }
  
  /** Watches for activity related to the discovery of remote systems and raises the appropriate events. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemWatcher")
  @js.native
  abstract class RemoteSystemWatcher ()
    extends StObject
       with typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcher {
    
    /** This event is raised when the initial remote system discovery process completes. */
    /* CompleteClass */
    override def onenumerationcompleted(
      ev: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemEnumerationCompletedEventArgs & WinRTEvent[typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcher]
    ): Unit = js.native
    /** This event is raised when the initial remote system discovery process completes. */
    /* CompleteClass */
    @JSName("onenumerationcompleted")
    var onenumerationcompleted_Original: TypedEventHandler[
        typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcher, 
        typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemEnumerationCompletedEventArgs
      ] = js.native
    
    /** This event is raised when an error occurs during discovery. The discovery process will continue if possible. For example, if the error occurs with a value of RemoteSystemWatcherError.InternetNotAvailable (see **RemoteSystemWatcherError**), proximal discovery will continue because the error applies only to cloud discovery (see **RemoteSystemDiscoveryType**). */
    /* CompleteClass */
    override def onerroroccured(
      ev: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcherErrorOccurredEventArgs & WinRTEvent[typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcher]
    ): Unit = js.native
    /** This event is raised when an error occurs during discovery. The discovery process will continue if possible. For example, if the error occurs with a value of RemoteSystemWatcherError.InternetNotAvailable (see **RemoteSystemWatcherError**), proximal discovery will continue because the error applies only to cloud discovery (see **RemoteSystemDiscoveryType**). */
    /* CompleteClass */
    @JSName("onerroroccured")
    var onerroroccured_Original: TypedEventHandler[
        typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcher, 
        typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcherErrorOccurredEventArgs
      ] = js.native
    
    /** The event that is raised when a new remote system (device) is discovered. */
    /* CompleteClass */
    override def onremotesystemadded(
      ev: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAddedEventArgs & WinRTEvent[typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcher]
    ): Unit = js.native
    /** The event that is raised when a new remote system (device) is discovered. */
    /* CompleteClass */
    @JSName("onremotesystemadded")
    var onremotesystemadded_Original: TypedEventHandler[
        typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcher, 
        typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAddedEventArgs
      ] = js.native
    
    /** The event that is raised when a previously discovered remote system (device) is no longer visible. */
    /* CompleteClass */
    override def onremotesystemremoved(
      ev: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemRemovedEventArgs & WinRTEvent[typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcher]
    ): Unit = js.native
    /** The event that is raised when a previously discovered remote system (device) is no longer visible. */
    /* CompleteClass */
    @JSName("onremotesystemremoved")
    var onremotesystemremoved_Original: TypedEventHandler[
        typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcher, 
        typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemRemovedEventArgs
      ] = js.native
    
    /** Raised when a remote system (device) that was previously discovered in this discovery session changes from proximally connected to cloud connected, or the reverse. It is also raised when a remote system changes one of its monitored properties (see the properties of the RemoteSystem class). */
    /* CompleteClass */
    override def onremotesystemupdated(
      ev: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemUpdatedEventArgs & WinRTEvent[typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcher]
    ): Unit = js.native
    /** Raised when a remote system (device) that was previously discovered in this discovery session changes from proximally connected to cloud connected, or the reverse. It is also raised when a remote system changes one of its monitored properties (see the properties of the RemoteSystem class). */
    /* CompleteClass */
    @JSName("onremotesystemupdated")
    var onremotesystemupdated_Original: TypedEventHandler[
        typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcher, 
        typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemUpdatedEventArgs
      ] = js.native
    
    /** Starts watching for discoverable remote systems. The discovery process runs until the Stop method is called or an error occurs. A RemoteSystemWatcher object can have its Start method called again at a later time. */
    /* CompleteClass */
    override def start(): Unit = js.native
    
    /** Stops watching for discoverable remote systems. */
    /* CompleteClass */
    override def stop(): Unit = js.native
  }
  
  /** Contains values that describe a watcher error, which may stop discovery. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemWatcherError")
  @js.native
  object RemoteSystemWatcherError extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcherError & Double] = js.native
    
    /* 2 */ val authenticationError: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcherError.authenticationError & Double = js.native
    
    /* 1 */ val internetNotAvailable: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcherError.internetNotAvailable & Double = js.native
    
    /* 0 */ val unknown: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcherError.unknown & Double = js.native
  }
  
  /** Gets information about an **ErrorOccurred** event, namely the **RemoteSystemWatcherError** value describing the error. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemWatcherErrorOccurredEventArgs")
  @js.native
  abstract class RemoteSystemWatcherErrorOccurredEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcherErrorOccurredEventArgs {
    
    /** The **RemoteSystemWatcherError** value representing the error that occurred during discovery, causing the containing **ErrorOccurred** event to be raised. */
    /* CompleteClass */
    var error: RemoteSystemWatcherError = js.native
  }
}
