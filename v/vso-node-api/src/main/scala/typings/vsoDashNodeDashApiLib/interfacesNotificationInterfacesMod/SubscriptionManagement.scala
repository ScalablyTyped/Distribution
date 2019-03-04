package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionManagement extends js.Object {
  var serviceInstanceType: java.lang.String
  var url: java.lang.String
}

object SubscriptionManagement {
  @scala.inline
  def apply(serviceInstanceType: java.lang.String, url: java.lang.String): SubscriptionManagement = {
    val __obj = js.Dynamic.literal(serviceInstanceType = serviceInstanceType, url = url)
  
    __obj.asInstanceOf[SubscriptionManagement]
  }
}

