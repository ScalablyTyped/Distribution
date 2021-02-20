package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INetworkOperatorNotificationTrigger extends IBackgroundTrigger {
  
  var networkAccountId: String = js.native
}
object INetworkOperatorNotificationTrigger {
  
  @scala.inline
  def apply(networkAccountId: String): INetworkOperatorNotificationTrigger = {
    val __obj = js.Dynamic.literal(networkAccountId = networkAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[INetworkOperatorNotificationTrigger]
  }
  
  @scala.inline
  implicit class INetworkOperatorNotificationTriggerMutableBuilder[Self <: INetworkOperatorNotificationTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkAccountId(value: String): Self = StObject.set(x, "networkAccountId", value.asInstanceOf[js.Any])
  }
}
