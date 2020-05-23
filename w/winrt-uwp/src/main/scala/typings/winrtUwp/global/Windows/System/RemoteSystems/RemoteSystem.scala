package typings.winrtUwp.global.Windows.System.RemoteSystems

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Networking.HostName
import typings.winrtUwp.Windows.System.RemoteSystems.IRemoteSystemFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This class manages the attributes of a discovered remote system (device) and provides the capabilities to discover remote systems as part of Project Rome. */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystem")
@js.native
abstract class RemoteSystem ()
  extends typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystem {
  /** A list of the applications on this remote system that have registered with the Connected Devices Platform. */
  /* CompleteClass */
  override var apps: IVectorView[typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemApp] = js.native
  /** Gets the machine name of the given remote system. */
  /* CompleteClass */
  override var displayName: String = js.native
  /** Gets the unique string identifier for the given remote system. */
  /* CompleteClass */
  override var id: String = js.native
  /** Checks whether the given remote system is available through proximal connection (such as a Bluetooth or local network connection) as opposed to cloud connection. */
  /* CompleteClass */
  override var isAvailableByProximity: Boolean = js.native
  /** Checks whether the given remote system is available through spatially proximal connection. */
  /* CompleteClass */
  override var isAvailableBySpatialProximity: Boolean = js.native
  /** Gets a String representation of the device type of the given remote system (desktop, Xbox, ...). */
  /* CompleteClass */
  override var kind: String = js.native
  /** Gets the manufacturer name of the given remote system. */
  /* CompleteClass */
  override var manufacturerDisplayName: String = js.native
  /** Gets the model name of the given remote system. */
  /* CompleteClass */
  override var modelDisplayName: String = js.native
  /** Gets a value describing the OS platform that this remote system is running. */
  /* CompleteClass */
  override var platform: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemPlatform = js.native
  /** Gets the status of this remote system's availability. */
  /* CompleteClass */
  override var status: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemStatus = js.native
  /** Reports whether the RemoteSystem is capable of the given Remote System feature. */
  /* CompleteClass */
  override def getCapabilitySupportedAsync(capabilityName: String): IPromiseWithIAsyncOperation[Boolean] = js.native
}

/* static members */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystem")
@js.native
object RemoteSystem extends js.Object {
  /** Returns a RemoteSystemWatcher object with no filters. */
  def createWatcher(): typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcher = js.native
  /** Returns a RemoteSystemWatcher object that filters the remote systems it can see. The filters parameter determines which remote systems will be seen. */
  def createWatcher(filters: IIterable[IRemoteSystemFilter]): typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcher = js.native
  /** Attempts to discover a single remote system specified by the HostName parameter. */
  def findByHostNameAsync(host: HostName): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystem] = js.native
  /** Checks whether the client device is authorized to discover other users' devices or just same-user devices. */
  def isAuthorizationKindEnabled(kind: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAuthorizationKind): Boolean = js.native
  /** Gets the status of the calling app's access to the Remote Systems feature. This method should always be called before an app attempts to discover or otherwise interact with remote systems. */
  def requestAccessAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemAccessStatus] = js.native
}

