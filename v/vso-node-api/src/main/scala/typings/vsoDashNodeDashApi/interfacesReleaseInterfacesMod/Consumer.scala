package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Consumer extends js.Object {
  var consumerId: Double
  var consumerName: String
}

object Consumer {
  @scala.inline
  def apply(consumerId: Double, consumerName: String): Consumer = {
    val __obj = js.Dynamic.literal(consumerId = consumerId.asInstanceOf[js.Any], consumerName = consumerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Consumer]
  }
}

