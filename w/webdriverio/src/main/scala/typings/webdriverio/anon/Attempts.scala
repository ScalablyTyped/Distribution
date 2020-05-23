package typings.webdriverio.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attempts extends js.Object {
  var attempts: Double
  var limit: Double
}

object Attempts {
  @scala.inline
  def apply(attempts: Double, limit: Double): Attempts = {
    val __obj = js.Dynamic.literal(attempts = attempts.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attempts]
  }
}

