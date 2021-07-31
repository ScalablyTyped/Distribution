package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginChallenge
  extends StObject
     with RequestLoginParams {
  
  var challengeHidden: String
  
  var challengeVisual: String
}
object LoginChallenge {
  
  @scala.inline
  def apply(challengeHidden: String, challengeVisual: String): LoginChallenge = {
    val __obj = js.Dynamic.literal(challengeHidden = challengeHidden.asInstanceOf[js.Any], challengeVisual = challengeVisual.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginChallenge]
  }
  
  @scala.inline
  implicit class LoginChallengeMutableBuilder[Self <: LoginChallenge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChallengeHidden(value: String): Self = StObject.set(x, "challengeHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChallengeVisual(value: String): Self = StObject.set(x, "challengeVisual", value.asInstanceOf[js.Any])
  }
}
