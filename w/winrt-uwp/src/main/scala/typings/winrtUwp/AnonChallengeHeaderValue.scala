package typings.winrtUwp

import typings.winrtUwp.Windows.Web.Http.Headers.HttpChallengeHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChallengeHeaderValue extends js.Object {
  /** The HttpChallengeHeaderValue version of the string. */ var challengeHeaderValue: HttpChallengeHeaderValue
  /** true if input is valid HttpChallengeHeaderValue information; otherwise, false. */ var returnValue: Boolean
}

object AnonChallengeHeaderValue {
  @scala.inline
  def apply(challengeHeaderValue: HttpChallengeHeaderValue, returnValue: Boolean): AnonChallengeHeaderValue = {
    val __obj = js.Dynamic.literal(challengeHeaderValue = challengeHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChallengeHeaderValue]
  }
}

