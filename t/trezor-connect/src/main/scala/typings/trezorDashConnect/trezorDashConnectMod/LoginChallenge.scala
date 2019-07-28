package typings.trezorDashConnect.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginChallenge extends js.Object {
  var challengeHidden: String
  var challengeVisual: String
}

object LoginChallenge {
  @scala.inline
  def apply(challengeHidden: String, challengeVisual: String): LoginChallenge = {
    val __obj = js.Dynamic.literal(challengeHidden = challengeHidden, challengeVisual = challengeVisual)
  
    __obj.asInstanceOf[LoginChallenge]
  }
}

