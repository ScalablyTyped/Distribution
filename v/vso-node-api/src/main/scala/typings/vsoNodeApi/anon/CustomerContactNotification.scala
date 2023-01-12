package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerContactNotification extends StObject {
  
  var customerContactNotification: scala.Double
  
  var publisherMemberUpdateNotification: scala.Double
  
  var qnaNotification: scala.Double
  
  var reviewNotification: scala.Double
}
object CustomerContactNotification {
  
  inline def apply(
    customerContactNotification: scala.Double,
    publisherMemberUpdateNotification: scala.Double,
    qnaNotification: scala.Double,
    reviewNotification: scala.Double
  ): CustomerContactNotification = {
    val __obj = js.Dynamic.literal(customerContactNotification = customerContactNotification.asInstanceOf[js.Any], publisherMemberUpdateNotification = publisherMemberUpdateNotification.asInstanceOf[js.Any], qnaNotification = qnaNotification.asInstanceOf[js.Any], reviewNotification = reviewNotification.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerContactNotification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomerContactNotification] (val x: Self) extends AnyVal {
    
    inline def setCustomerContactNotification(value: scala.Double): Self = StObject.set(x, "customerContactNotification", value.asInstanceOf[js.Any])
    
    inline def setPublisherMemberUpdateNotification(value: scala.Double): Self = StObject.set(x, "publisherMemberUpdateNotification", value.asInstanceOf[js.Any])
    
    inline def setQnaNotification(value: scala.Double): Self = StObject.set(x, "qnaNotification", value.asInstanceOf[js.Any])
    
    inline def setReviewNotification(value: scala.Double): Self = StObject.set(x, "reviewNotification", value.asInstanceOf[js.Any])
  }
}
