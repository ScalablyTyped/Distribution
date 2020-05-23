package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Allow extends js.Object {
  var allow: scala.Double
  var completed: scala.Double
  var disallow: scala.Double
}

object Allow {
  @scala.inline
  def apply(allow: scala.Double, completed: scala.Double, disallow: scala.Double): Allow = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], disallow = disallow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allow]
  }
}

