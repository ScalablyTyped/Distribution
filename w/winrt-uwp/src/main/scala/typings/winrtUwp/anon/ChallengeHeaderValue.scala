package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpChallengeHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChallengeHeaderValue extends StObject {
  
  /** The HttpChallengeHeaderValue version of the string. */ var challengeHeaderValue: HttpChallengeHeaderValue
  
  /** true if input is valid HttpChallengeHeaderValue information; otherwise, false. */ var returnValue: Boolean
}
object ChallengeHeaderValue {
  
  inline def apply(challengeHeaderValue: HttpChallengeHeaderValue, returnValue: Boolean): ChallengeHeaderValue = {
    val __obj = js.Dynamic.literal(challengeHeaderValue = challengeHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChallengeHeaderValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChallengeHeaderValue] (val x: Self) extends AnyVal {
    
    inline def setChallengeHeaderValue(value: HttpChallengeHeaderValue): Self = StObject.set(x, "challengeHeaderValue", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
