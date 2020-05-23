package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Warning extends js.Object {
  var error: scala.Double
  var warning: scala.Double
}

object Warning {
  @scala.inline
  def apply(error: scala.Double, warning: scala.Double): Warning = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Warning]
  }
}

