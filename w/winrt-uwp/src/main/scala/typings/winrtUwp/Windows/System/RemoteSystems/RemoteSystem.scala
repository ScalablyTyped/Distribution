package typings.winrtUwp.Windows.System.RemoteSystems

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This class manages the attributes of a discovered remote system (device) and provides the capabilities to discover remote systems as part of Project Rome. */
@js.native
trait RemoteSystem extends js.Object {
  
  /** A list of the applications on this remote system that have registered with the Connected Devices Platform. */
  var apps: IVectorView[RemoteSystemApp] = js.native
  
  /** Gets the machine name of the given remote system. */
  var displayName: String = js.native
  
  /** Reports whether the RemoteSystem is capable of the given Remote System feature. */
  def getCapabilitySupportedAsync(capabilityName: String): IPromiseWithIAsyncOperation[Boolean] = js.native
  
  /** Gets the unique string identifier for the given remote system. */
  var id: String = js.native
  
  /** Checks whether the given remote system is available through proximal connection (such as a Bluetooth or local network connection) as opposed to cloud connection. */
  var isAvailableByProximity: Boolean = js.native
  
  /** Checks whether the given remote system is available through spatially proximal connection. */
  var isAvailableBySpatialProximity: Boolean = js.native
  
  /** Gets a String representation of the device type of the given remote system (desktop, Xbox, ...). */
  var kind: String = js.native
  
  /** Gets the manufacturer name of the given remote system. */
  var manufacturerDisplayName: String = js.native
  
  /** Gets the model name of the given remote system. */
  var modelDisplayName: String = js.native
  
  /** Gets a value describing the OS platform that this remote system is running. */
  var platform: RemoteSystemPlatform = js.native
  
  /** Gets the status of this remote system's availability. */
  var status: RemoteSystemStatus = js.native
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
  
  @scala.inline
  implicit class RemoteSystemOps[Self <: RemoteSystem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApps(value: IVectorView[RemoteSystemApp]): Self = this.set("apps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCapabilitySupportedAsync(value: String => IPromiseWithIAsyncOperation[Boolean]): Self = this.set("getCapabilitySupportedAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAvailableByProximity(value: Boolean): Self = this.set("isAvailableByProximity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAvailableBySpatialProximity(value: Boolean): Self = this.set("isAvailableBySpatialProximity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerDisplayName(value: String): Self = this.set("manufacturerDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelDisplayName(value: String): Self = this.set("modelDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: RemoteSystemPlatform): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: RemoteSystemStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
