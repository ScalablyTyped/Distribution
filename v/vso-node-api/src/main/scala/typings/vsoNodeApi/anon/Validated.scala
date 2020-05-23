package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Validated extends js.Object {
  var none: scala.Double
  var validated: scala.Double
}

object Validated {
  @scala.inline
  def apply(none: scala.Double, validated: scala.Double): Validated = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], validated = validated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Validated]
  }
}

