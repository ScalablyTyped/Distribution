package typings.weixinApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonServices extends js.Object {
  var services: js.Array[AnonIsPrimary]
}

object AnonServices {
  @scala.inline
  def apply(services: js.Array[AnonIsPrimary]): AnonServices = {
    val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonServices]
  }
}

