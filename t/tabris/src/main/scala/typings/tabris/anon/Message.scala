package typings.tabris.anon

import typings.tabris.tabrisStrings.biometricsNotEnrolled
import typings.tabris.tabrisStrings.canceled
import typings.tabris.tabrisStrings.credentialsNotEnrolled
import typings.tabris.tabrisStrings.error
import typings.tabris.tabrisStrings.limitExceeded
import typings.tabris.tabrisStrings.lockout
import typings.tabris.tabrisStrings.success
import typings.tabris.tabrisStrings.userCanceled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  var message: String
  
  var status: success | canceled | userCanceled | limitExceeded | lockout | biometricsNotEnrolled | credentialsNotEnrolled | error
}
object Message {
  
  inline def apply(
    message: String,
    status: success | canceled | userCanceled | limitExceeded | lockout | biometricsNotEnrolled | credentialsNotEnrolled | error
  ): Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  extension [Self <: Message](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setStatus(
      value: success | canceled | userCanceled | limitExceeded | lockout | biometricsNotEnrolled | credentialsNotEnrolled | error
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
