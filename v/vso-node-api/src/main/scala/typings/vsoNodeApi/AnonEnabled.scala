package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnabled extends js.Object {
  var disabled: Double
  var enabled: Double
  var undefined: Double
}

object AnonEnabled {
  @scala.inline
  def apply(disabled: Double, enabled: Double, undefined: Double): AnonEnabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEnabled]
  }
}

