package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Regex extends js.Object {
  var regex: scala.Double
  var variable: scala.Double
}

object Regex {
  @scala.inline
  def apply(regex: scala.Double, variable: scala.Double): Regex = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Regex]
  }
}

