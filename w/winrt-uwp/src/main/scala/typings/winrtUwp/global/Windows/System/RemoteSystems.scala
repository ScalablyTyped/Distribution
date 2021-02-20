package typings.winrtUwp.global.Windows.System

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Networking.HostName
import typings.winrtUwp.Windows.System.RemoteSystems.IRemoteSystemFilter
import typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAccessStatus
import typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAuthorizationKind
import typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemDiscoveryType
import typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemStatusType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RemoteSystems {
  
  /** This class manages the attributes of a discovered remote system (device) and provides the capabilities to discover remote systems as part of Project Rome. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystem")
  @js.native
  abstract class RemoteSystem ()
    extends typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystem
  object RemoteSystem {
    
    /** Returns a RemoteSystemWatcher object with no filters. */
    /* static member */
    @JSGlobal("Windows.System.RemoteSystems.RemoteSystem.createWatcher")
    @js.native
    def createWatcher(): typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcher = js.native
    /** Returns a RemoteSystemWatcher object that filters the remote systems it can see. The filters parameter determines which remote systems will be seen. */
    /* static member */
    @JSGlobal("Windows.System.RemoteSystems.RemoteSystem.createWatcher")
    @js.native
    def createWatcher(filters: IIterable[IRemoteSystemFilter]): typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcher = js.native
    
    /** Attempts to discover a single remote system specified by the HostName parameter. */
    /* static member */
    @JSGlobal("Windows.System.RemoteSystems.RemoteSystem.findByHostNameAsync")
    @js.native
    def findByHostNameAsync(host: HostName): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystem] = js.native
    
    /** Checks whether the client device is authorized to discover other users' devices or just same-user devices. */
    /* static member */
    @JSGlobal("Windows.System.RemoteSystems.RemoteSystem.isAuthorizationKindEnabled")
    @js.native
    def isAuthorizationKindEnabled(kind: RemoteSystemAuthorizationKind): Boolean = js.native
    
    /** Gets the status of the calling app's access to the Remote Systems feature. This method should always be called before an app attempts to discover or otherwise interact with remote systems. */
    /* static member */
    @JSGlobal("Windows.System.RemoteSystems.RemoteSystem.requestAccessAsync")
    @js.native
    def requestAccessAsync(): IPromiseWithIAsyncOperation[RemoteSystemAccessStatus] = js.native
  }
  
  /** Contains the values that describe an app's access to use the Remote Systems feature. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemAccessStatus")
  @js.native
  object RemoteSystemAccessStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAccessStatus with Double
      ] = js.native
    
    /* 1 */ val allowed: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAccessStatus.allowed with Double = js.native
    
    /* 3 */ val deniedBySystem: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAccessStatus.deniedBySystem with Double = js.native
    
    /* 2 */ val deniedByUser: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAccessStatus.deniedByUser with Double = js.native
    
    /* 0 */ val unspecified: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAccessStatus.unspecified with Double = js.native
  }
  
  /** Gets information about a RemoteSystemAdded event, namely the RemoteSystem that was added. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemAddedEventArgs")
  @js.native
  abstract class RemoteSystemAddedEventArgs ()
    extends typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAddedEventArgs
  
  /** Represents an application on a remote system. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemApp")
  @js.native
  abstract class RemoteSystemApp ()
    extends typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemApp
  
  /** Contains values specifying whether the client device can discover only same-user devices or other users' devices as well. Cross-user devices must be available through a proximal connection in order to be discovered (see RemoteSystemDiscoveryType for details). */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemAuthorizationKind")
  @js.native
  object RemoteSystemAuthorizationKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAuthorizationKind with Double
      ] = js.native
    
    /* 1 */ val anonymous: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAuthorizationKind.anonymous with Double = js.native
    
    /* 0 */ val sameUser: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAuthorizationKind.sameUser with Double = js.native
  }
  
  /** Represents an intent to communicate with a specific remote system (device). */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemConnectionRequest")
  @js.native
  class RemoteSystemConnectionRequest protected ()
    extends typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemConnectionRequest {
    /** Initializes an instance of the RemoteSystemConnectionRequest class. */
    def this(remoteSystem: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystem) = this()
  }
  object RemoteSystemConnectionRequest {
    
    /** Initializes a new instance of the RemoteSystemConnectionRequest class for a particular application on a remote system. */
    /* static member */
    @JSGlobal("Windows.System.RemoteSystems.RemoteSystemConnectionRequest.createForApp")
    @js.native
    def createForApp(remoteSystemApp: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemApp): typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemConnectionRequest = js.native
  }
  
  /** Contains the values that describe how remote systems are able to be discovered. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemDiscoveryType")
  @js.native
  object RemoteSystemDiscoveryType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemDiscoveryType with Double
      ] = js.native
    
    /* 0 */ val any: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemDiscoveryType.any with Double = js.native
    
    /* 2 */ val cloud: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemDiscoveryType.cloud with Double = js.native
    
    /* 1 */ val proximal: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemDiscoveryType.proximal with Double = js.native
    
    /* 3 */ val spatiallyProximal: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemDiscoveryType.spatiallyProximal with Double = js.native
  }
  
  /** An IRemoteSystemFilter that limits the set of discoverable remote systems by allowing only those of a specific discovery type. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemDiscoveryTypeFilter")
  @js.native
  class RemoteSystemDiscoveryTypeFilter protected ()
    extends typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemDiscoveryTypeFilter {
    /** Initializes an instance of the RemoteSystemDiscoveryTypeFilter class. */
    def this(discoveryType: RemoteSystemDiscoveryType) = this()
  }
  
  /** This is the argument class for the **RemoteSystemWatcher.EnumerationCompleted** event. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemEnumerationCompletedEventArgs")
  @js.native
  abstract class RemoteSystemEnumerationCompletedEventArgs ()
    extends typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemEnumerationCompletedEventArgs
  
  /** An IRemoteSystemFilter that limits the set of discoverable remote systems by allowing only those of specific device types. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemKindFilter")
  @js.native
  class RemoteSystemKindFilter protected ()
    extends typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemKindFilter {
    /** Initializes an instance of the RemoteSystemKindFilter class with a list of string representations of device types to target. These strings should conform to the values of the properties of the RemoteSystemKinds class. */
    def this(remoteSystemKinds: IIterable[String]) = this()
  }
  
  /** Contains read-only strings that identify various device types. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemKinds")
  @js.native
  abstract class RemoteSystemKinds ()
    extends typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemKinds
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
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemPlatform with Double] = js.native
    
    /* 2 */ val android: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemPlatform.android with Double = js.native
    
    /* 3 */ val ios: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemPlatform.ios with Double = js.native
    
    /* 4 */ val linux: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemPlatform.linux with Double = js.native
    
    /* 0 */ val unknown: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemPlatform.unknown with Double = js.native
    
    /* 1 */ val windows: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemPlatform.windows with Double = js.native
  }
  
  /** Gets information about a RemoteSystemRemoved event, namely the RemoteSystem that was removed. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemRemovedEventArgs")
  @js.native
  abstract class RemoteSystemRemovedEventArgs ()
    extends typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemRemovedEventArgs
  
  /** Contains the values that describe a remote system's availability status. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemStatus")
  @js.native
  object RemoteSystemStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemStatus with Double] = js.native
    
    /* 2 */ val available: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemStatus.available with Double = js.native
    
    /* 1 */ val discoveringAvailability: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemStatus.discoveringAvailability with Double = js.native
    
    /* 0 */ val unavailable: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemStatus.unavailable with Double = js.native
    
    /* 3 */ val unknown: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemStatus.unknown with Double = js.native
  }
  
  /** Contains the values that describe a remote system's status type. This is a simplification of the RemoteSystemStatus enumeration and is used to construct a RemoteSystemStatusTypeFilter object. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemStatusType")
  @js.native
  object RemoteSystemStatusType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemStatusType with Double] = js.native
    
    /* 0 */ val any: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemStatusType.any with Double = js.native
    
    /* 1 */ val available: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemStatusType.available with Double = js.native
  }
  
  /** An IRemoteSystemFilter that limits the set of discoverable remote systems by allowing only those of a specific availability status. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemStatusTypeFilter")
  @js.native
  class RemoteSystemStatusTypeFilter protected ()
    extends typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemStatusTypeFilter {
    /** Initializes an instance of the RemoteSystemStatusTypeFilter class. */
    def this(remoteSystemStatusType: RemoteSystemStatusType) = this()
  }
  
  /** Gets information about a RemoteSystemUpdated event, namely the RemoteSystem that was updated. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemUpdatedEventArgs")
  @js.native
  abstract class RemoteSystemUpdatedEventArgs ()
    extends typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemUpdatedEventArgs
  
  /** Watches for activity related to the discovery of remote systems and raises the appropriate events. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemWatcher")
  @js.native
  abstract class RemoteSystemWatcher ()
    extends typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcher
  
  /** Contains values that describe a watcher error, which may stop discovery. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemWatcherError")
  @js.native
  object RemoteSystemWatcherError extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcherError with Double
      ] = js.native
    
    /* 2 */ val authenticationError: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcherError.authenticationError with Double = js.native
    
    /* 1 */ val internetNotAvailable: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcherError.internetNotAvailable with Double = js.native
    
    /* 0 */ val unknown: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcherError.unknown with Double = js.native
  }
  
  /** Gets information about an **ErrorOccurred** event, namely the **RemoteSystemWatcherError** value describing the error. */
  @JSGlobal("Windows.System.RemoteSystems.RemoteSystemWatcherErrorOccurredEventArgs")
  @js.native
  abstract class RemoteSystemWatcherErrorOccurredEventArgs ()
    extends typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcherErrorOccurredEventArgs
}
