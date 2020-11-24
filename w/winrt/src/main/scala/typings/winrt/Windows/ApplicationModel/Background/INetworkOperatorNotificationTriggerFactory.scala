package typings.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INetworkOperatorNotificationTriggerFactory extends js.Object {
  
  def create(networkAccountId: String): NetworkOperatorNotificationTrigger = js.native
}
object INetworkOperatorNotificationTriggerFactory {
  
  @scala.inline
  def apply(create: String => NetworkOperatorNotificationTrigger): INetworkOperatorNotificationTriggerFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[INetworkOperatorNotificationTriggerFactory]
  }
  
  @scala.inline
  implicit class INetworkOperatorNotificationTriggerFactoryOps[Self <: INetworkOperatorNotificationTriggerFactory] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: String => NetworkOperatorNotificationTrigger): Self = this.set("create", js.Any.fromFunction1(value))
  }
}
