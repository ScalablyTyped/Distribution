package typings.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a mobile network operator notification trigger. */
@js.native
trait NetworkOperatorNotificationTrigger extends js.Object {
  
  /** Gets the account identifier for the mobile network operator notification trigger. */
  var networkAccountId: String = js.native
}
object NetworkOperatorNotificationTrigger {
  
  @scala.inline
  def apply(networkAccountId: String): NetworkOperatorNotificationTrigger = {
    val __obj = js.Dynamic.literal(networkAccountId = networkAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkOperatorNotificationTrigger]
  }
  
  @scala.inline
  implicit class NetworkOperatorNotificationTriggerOps[Self <: NetworkOperatorNotificationTrigger] (val x: Self) extends AnyVal {
    
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
    def setNetworkAccountId(value: String): Self = this.set("networkAccountId", value.asInstanceOf[js.Any])
  }
}
