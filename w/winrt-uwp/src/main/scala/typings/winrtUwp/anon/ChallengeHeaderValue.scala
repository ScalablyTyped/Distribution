package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpChallengeHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChallengeHeaderValue extends js.Object {
  /** The HttpChallengeHeaderValue version of the string. */ var challengeHeaderValue: HttpChallengeHeaderValue
  /** true if input is valid HttpChallengeHeaderValue information; otherwise, false. */ var returnValue: Boolean
}

object ChallengeHeaderValue {
  @scala.inline
  def apply(challengeHeaderValue: HttpChallengeHeaderValue, returnValue: Boolean): ChallengeHeaderValue = {
    val __obj = js.Dynamic.literal(challengeHeaderValue = challengeHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChallengeHeaderValue]
  }
}

