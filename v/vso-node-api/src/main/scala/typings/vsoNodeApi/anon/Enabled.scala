package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enabled extends js.Object {
  var disabled: scala.Double
  var enabled: scala.Double
  var undefined: scala.Double
}

object Enabled {
  @scala.inline
  def apply(disabled: scala.Double, enabled: scala.Double, undefined: scala.Double): Enabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enabled]
  }
}

