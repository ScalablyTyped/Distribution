package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INetworkOperatorNotificationTriggerFactory extends StObject {
  
  def create(networkAccountId: String): NetworkOperatorNotificationTrigger = js.native
}
object INetworkOperatorNotificationTriggerFactory {
  
  @scala.inline
  def apply(create: String => NetworkOperatorNotificationTrigger): INetworkOperatorNotificationTriggerFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[INetworkOperatorNotificationTriggerFactory]
  }
  
  @scala.inline
  implicit class INetworkOperatorNotificationTriggerFactoryMutableBuilder[Self <: INetworkOperatorNotificationTriggerFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: String => NetworkOperatorNotificationTrigger): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
