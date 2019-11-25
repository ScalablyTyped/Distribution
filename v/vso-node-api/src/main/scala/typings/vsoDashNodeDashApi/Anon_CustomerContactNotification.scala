package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomerContactNotification extends js.Object {
  var customerContactNotification: Double
  var publisherMemberUpdateNotification: Double
  var qnaNotification: Double
  var reviewNotification: Double
}

object Anon_CustomerContactNotification {
  @scala.inline
  def apply(
    customerContactNotification: Double,
    publisherMemberUpdateNotification: Double,
    qnaNotification: Double,
    reviewNotification: Double
  ): Anon_CustomerContactNotification = {
    val __obj = js.Dynamic.literal(customerContactNotification = customerContactNotification.asInstanceOf[js.Any], publisherMemberUpdateNotification = publisherMemberUpdateNotification.asInstanceOf[js.Any], qnaNotification = qnaNotification.asInstanceOf[js.Any], reviewNotification = reviewNotification.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CustomerContactNotification]
  }
}

