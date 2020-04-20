package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAbusive extends js.Object {
  var abusive: Double
  var general: Double
  var spam: Double
}

object AnonAbusive {
  @scala.inline
  def apply(abusive: Double, general: Double, spam: Double): AnonAbusive = {
    val __obj = js.Dynamic.literal(abusive = abusive.asInstanceOf[js.Any], general = general.asInstanceOf[js.Any], spam = spam.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAbusive]
  }
}

