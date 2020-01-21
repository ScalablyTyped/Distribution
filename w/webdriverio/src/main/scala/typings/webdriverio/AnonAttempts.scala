package typings.webdriverio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttempts extends js.Object {
  var attempts: Double
  var limit: Double
}

object AnonAttempts {
  @scala.inline
  def apply(attempts: Double, limit: Double): AnonAttempts = {
    val __obj = js.Dynamic.literal(attempts = attempts.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAttempts]
  }
}

