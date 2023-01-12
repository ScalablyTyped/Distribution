package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INetworkOperatorNotificationTriggerFactory extends StObject {
  
  def create(networkAccountId: String): NetworkOperatorNotificationTrigger
}
object INetworkOperatorNotificationTriggerFactory {
  
  inline def apply(create: String => NetworkOperatorNotificationTrigger): INetworkOperatorNotificationTriggerFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[INetworkOperatorNotificationTriggerFactory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: INetworkOperatorNotificationTriggerFactory] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: String => NetworkOperatorNotificationTrigger): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
