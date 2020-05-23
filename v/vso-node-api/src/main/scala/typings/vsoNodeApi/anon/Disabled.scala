package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disabled extends js.Object {
  var disabled: scala.Double
  var enabled: scala.Double
  var paused: scala.Double
}

object Disabled {
  @scala.inline
  def apply(disabled: scala.Double, enabled: scala.Double, paused: scala.Double): Disabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled]
  }
}

