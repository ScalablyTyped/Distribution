package typings.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPushNotificationTriggerFactory extends js.Object {
  
  def create(applicationId: String): PushNotificationTrigger = js.native
}
object IPushNotificationTriggerFactory {
  
  @scala.inline
  def apply(create: String => PushNotificationTrigger): IPushNotificationTriggerFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[IPushNotificationTriggerFactory]
  }
  
  @scala.inline
  implicit class IPushNotificationTriggerFactoryOps[Self <: IPushNotificationTriggerFactory] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: String => PushNotificationTrigger): Self = this.set("create", js.Any.fromFunction1(value))
  }
}
