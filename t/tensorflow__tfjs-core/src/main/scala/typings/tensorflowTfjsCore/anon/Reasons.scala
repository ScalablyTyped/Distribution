package typings.tensorflowTfjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reasons extends js.Object {
  var reasons: js.UndefOr[js.Array[String]] = js.undefined
  var unreliable: Boolean
}

object Reasons {
  @scala.inline
  def apply(unreliable: Boolean, reasons: js.Array[String] = null): Reasons = {
    val __obj = js.Dynamic.literal(unreliable = unreliable.asInstanceOf[js.Any])
    if (reasons != null) __obj.updateDynamic("reasons")(reasons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reasons]
  }
}

