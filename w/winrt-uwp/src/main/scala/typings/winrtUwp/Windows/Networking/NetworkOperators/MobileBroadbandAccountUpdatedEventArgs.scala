package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information for the AccountUpdated event. */
trait MobileBroadbandAccountUpdatedEventArgs extends StObject {
  
  /** Gets a value indicating whether the device information has changed for the account. */
  var hasDeviceInformationChanged: Boolean
  
  /** Gets a value that indicates if the CurrentNetwork was updated for the account. */
  var hasNetworkChanged: Boolean
  
  /** Gets the network account Id of the updated account. */
  var networkAccountId: String
}
object MobileBroadbandAccountUpdatedEventArgs {
  
  @scala.inline
  def apply(hasDeviceInformationChanged: Boolean, hasNetworkChanged: Boolean, networkAccountId: String): MobileBroadbandAccountUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(hasDeviceInformationChanged = hasDeviceInformationChanged.asInstanceOf[js.Any], hasNetworkChanged = hasNetworkChanged.asInstanceOf[js.Any], networkAccountId = networkAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandAccountUpdatedEventArgs]
  }
  
  @scala.inline
  implicit class MobileBroadbandAccountUpdatedEventArgsMutableBuilder[Self <: MobileBroadbandAccountUpdatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasDeviceInformationChanged(value: Boolean): Self = StObject.set(x, "hasDeviceInformationChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasNetworkChanged(value: Boolean): Self = StObject.set(x, "hasNetworkChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkAccountId(value: String): Self = StObject.set(x, "networkAccountId", value.asInstanceOf[js.Any])
  }
}
