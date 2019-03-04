package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomerContactNotification extends js.Object {
  var customerContactNotification: scala.Double
  var publisherMemberUpdateNotification: scala.Double
  var qnaNotification: scala.Double
  var reviewNotification: scala.Double
}

object Anon_CustomerContactNotification {
  @scala.inline
  def apply(
    customerContactNotification: scala.Double,
    publisherMemberUpdateNotification: scala.Double,
    qnaNotification: scala.Double,
    reviewNotification: scala.Double
  ): Anon_CustomerContactNotification = {
    val __obj = js.Dynamic.literal(customerContactNotification = customerContactNotification, publisherMemberUpdateNotification = publisherMemberUpdateNotification, qnaNotification = qnaNotification, reviewNotification = reviewNotification)
  
    __obj.asInstanceOf[Anon_CustomerContactNotification]
  }
}

