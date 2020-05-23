package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerContactNotification extends js.Object {
  var customerContactNotification: scala.Double
  var publisherMemberUpdateNotification: scala.Double
  var qnaNotification: scala.Double
  var reviewNotification: scala.Double
}

object CustomerContactNotification {
  @scala.inline
  def apply(
    customerContactNotification: scala.Double,
    publisherMemberUpdateNotification: scala.Double,
    qnaNotification: scala.Double,
    reviewNotification: scala.Double
  ): CustomerContactNotification = {
    val __obj = js.Dynamic.literal(customerContactNotification = customerContactNotification.asInstanceOf[js.Any], publisherMemberUpdateNotification = publisherMemberUpdateNotification.asInstanceOf[js.Any], qnaNotification = qnaNotification.asInstanceOf[js.Any], reviewNotification = reviewNotification.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerContactNotification]
  }
}

