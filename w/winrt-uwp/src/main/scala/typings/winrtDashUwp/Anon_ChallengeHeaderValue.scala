package typings.winrtDashUwp

import typings.winrtDashUwp.Windows.Web.Http.Headers.HttpChallengeHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChallengeHeaderValue extends js.Object {
  /** The HttpChallengeHeaderValue version of the string. */ var challengeHeaderValue: HttpChallengeHeaderValue
  /** true if input is valid HttpChallengeHeaderValue information; otherwise, false. */ var returnValue: Boolean
}

object Anon_ChallengeHeaderValue {
  @scala.inline
  def apply(challengeHeaderValue: HttpChallengeHeaderValue, returnValue: Boolean): Anon_ChallengeHeaderValue = {
    val __obj = js.Dynamic.literal(challengeHeaderValue = challengeHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ChallengeHeaderValue]
  }
}

