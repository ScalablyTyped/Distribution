package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChallengeHeaderValue extends js.Object {
  /** The HttpChallengeHeaderValue version of the string. */ var challengeHeaderValue: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpChallengeHeaderValue
  /** true if input is valid HttpChallengeHeaderValue information; otherwise, false. */ var returnValue: scala.Boolean
}

object Anon_ChallengeHeaderValue {
  @scala.inline
  def apply(
    challengeHeaderValue: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpChallengeHeaderValue,
    returnValue: scala.Boolean
  ): Anon_ChallengeHeaderValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("challengeHeaderValue")(challengeHeaderValue)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_ChallengeHeaderValue]
  }
}

