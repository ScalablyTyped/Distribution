package typings.winrtUwp.Windows.System.RemoteSystems

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This class manages the attributes of a discovered remote system (device) and provides the capabilities to discover remote systems as part of Project Rome. */
trait RemoteSystem extends js.Object {
  /** A list of the applications on this remote system that have registered with the Connected Devices Platform. */
  var apps: IVectorView[RemoteSystemApp]
  /** Gets the machine name of the given remote system. */
  var displayName: String
  /** Gets the unique string identifier for the given remote system. */
  var id: String
  /** Checks whether the given remote system is available through proximal connection (such as a Bluetooth or local network connection) as opposed to cloud connection. */
  var isAvailableByProximity: Boolean
  /** Checks whether the given remote system is available through spatially proximal connection. */
  var isAvailableBySpatialProximity: Boolean
  /** Gets a String representation of the device type of the given remote system (desktop, Xbox, ...). */
  var kind: String
  /** Gets the manufacturer name of the given remote system. */
  var manufacturerDisplayName: String
  /** Gets the model name of the given remote system. */
  var modelDisplayName: String
  /** Gets a value describing the OS platform that this remote system is running. */
  var platform: RemoteSystemPlatform
  /** Gets the status of this remote system's availability. */
  var status: RemoteSystemStatus
  /** Reports whether the RemoteSystem is capable of the given Remote System feature. */
  def getCapabilitySupportedAsync(capabilityName: String): IPromiseWithIAsyncOperation[Boolean]
}

object RemoteSystem {
  @scala.inline
  def apply(
    apps: IVectorView[RemoteSystemApp],
    displayName: String,
    getCapabilitySupportedAsync: String => IPromiseWithIAsyncOperation[Boolean],
    id: String,
    isAvailableByProximity: Boolean,
    isAvailableBySpatialProximity: Boolean,
    kind: String,
    manufacturerDisplayName: String,
    modelDisplayName: String,
    platform: RemoteSystemPlatform,
    status: RemoteSystemStatus
  ): RemoteSystem = {
    val __obj = js.Dynamic.literal(apps = apps.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], getCapabilitySupportedAsync = js.Any.fromFunction1(getCapabilitySupportedAsync), id = id.asInstanceOf[js.Any], isAvailableByProximity = isAvailableByProximity.asInstanceOf[js.Any], isAvailableBySpatialProximity = isAvailableBySpatialProximity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], manufacturerDisplayName = manufacturerDisplayName.asInstanceOf[js.Any], modelDisplayName = modelDisplayName.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteSystem]
  }
}

