package typings.twilioSync.subscriptionsMod

import typings.twilioSync.servicesMod.Configuration
import typings.twilioSync.servicesMod.Network
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionsServices extends js.Object {
  var config: Configuration
  var network: Network
}

object SubscriptionsServices {
  @scala.inline
  def apply(config: Configuration, network: Network): SubscriptionsServices = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SubscriptionsServices]
  }
}

