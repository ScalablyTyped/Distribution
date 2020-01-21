package typings.tensorflowTfjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReasons extends js.Object {
  var reasons: js.UndefOr[js.Array[String]] = js.undefined
  var unreliable: Boolean
}

object AnonReasons {
  @scala.inline
  def apply(unreliable: Boolean, reasons: js.Array[String] = null): AnonReasons = {
    val __obj = js.Dynamic.literal(unreliable = unreliable.asInstanceOf[js.Any])
    if (reasons != null) __obj.updateDynamic("reasons")(reasons.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReasons]
  }
}

