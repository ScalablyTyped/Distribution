package typings.webdriverio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attempts extends js.Object {
  var attempts: Double
  var limit: Double
}

object Anon_Attempts {
  @scala.inline
  def apply(attempts: Double, limit: Double): Anon_Attempts = {
    val __obj = js.Dynamic.literal(attempts = attempts.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Attempts]
  }
}

