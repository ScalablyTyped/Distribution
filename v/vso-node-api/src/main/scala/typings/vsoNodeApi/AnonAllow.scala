package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllow extends js.Object {
  var allow: Double
  var completed: Double
  var disallow: Double
}

object AnonAllow {
  @scala.inline
  def apply(allow: Double, completed: Double, disallow: Double): AnonAllow = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], disallow = disallow.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllow]
  }
}

