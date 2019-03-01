package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginChallenge extends js.Object {
  var challengeHidden: java.lang.String
  var challengeVisual: java.lang.String
}

object LoginChallenge {
  @scala.inline
  def apply(challengeHidden: java.lang.String, challengeVisual: java.lang.String): LoginChallenge = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("challengeHidden")(challengeHidden)
    __obj.updateDynamic("challengeVisual")(challengeVisual)
    __obj.asInstanceOf[LoginChallenge]
  }
}

