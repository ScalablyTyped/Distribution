package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INetworkOperatorNotificationTrigger
  extends StObject
     with IBackgroundTrigger {
  
  var networkAccountId: String
}
object INetworkOperatorNotificationTrigger {
  
  inline def apply(networkAccountId: String): INetworkOperatorNotificationTrigger = {
    val __obj = js.Dynamic.literal(networkAccountId = networkAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[INetworkOperatorNotificationTrigger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: INetworkOperatorNotificationTrigger] (val x: Self) extends AnyVal {
    
    inline def setNetworkAccountId(value: String): Self = StObject.set(x, "networkAccountId", value.asInstanceOf[js.Any])
  }
}
