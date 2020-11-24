package typings.twilioSync.subscriptionsMod

import typings.twilioSync.servicesMod.Configuration
import typings.twilioSync.servicesMod.Network
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionsServices extends js.Object {
  
  var config: Configuration = js.native
  
  var network: Network = js.native
}
object SubscriptionsServices {
  
  @scala.inline
  def apply(config: Configuration, network: Network): SubscriptionsServices = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionsServices]
  }
  
  @scala.inline
  implicit class SubscriptionsServicesOps[Self <: SubscriptionsServices] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: Configuration): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetwork(value: Network): Self = this.set("network", value.asInstanceOf[js.Any])
  }
}
