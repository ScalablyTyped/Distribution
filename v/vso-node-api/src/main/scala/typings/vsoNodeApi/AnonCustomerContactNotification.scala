package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCustomerContactNotification extends js.Object {
  var customerContactNotification: Double
  var publisherMemberUpdateNotification: Double
  var qnaNotification: Double
  var reviewNotification: Double
}

object AnonCustomerContactNotification {
  @scala.inline
  def apply(
    customerContactNotification: Double,
    publisherMemberUpdateNotification: Double,
    qnaNotification: Double,
    reviewNotification: Double
  ): AnonCustomerContactNotification = {
    val __obj = js.Dynamic.literal(customerContactNotification = customerContactNotification.asInstanceOf[js.Any], publisherMemberUpdateNotification = publisherMemberUpdateNotification.asInstanceOf[js.Any], qnaNotification = qnaNotification.asInstanceOf[js.Any], reviewNotification = reviewNotification.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustomerContactNotification]
  }
}

