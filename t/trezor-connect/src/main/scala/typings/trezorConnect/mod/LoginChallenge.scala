package typings.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginChallenge extends RequestLoginParams {
  var challengeHidden: String
  var challengeVisual: String
}

object LoginChallenge {
  @scala.inline
  def apply(challengeHidden: String, challengeVisual: String): LoginChallenge = {
    val __obj = js.Dynamic.literal(challengeHidden = challengeHidden.asInstanceOf[js.Any], challengeVisual = challengeVisual.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LoginChallenge]
  }
}

