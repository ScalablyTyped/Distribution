package typings.atTensorflowTfjsDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Reasons extends js.Object {
  var reasons: js.UndefOr[js.Array[String]] = js.undefined
  var unreliable: Boolean
}

object Anon_Reasons {
  @scala.inline
  def apply(unreliable: Boolean, reasons: js.Array[String] = null): Anon_Reasons = {
    val __obj = js.Dynamic.literal(unreliable = unreliable)
    if (reasons != null) __obj.updateDynamic("reasons")(reasons)
    __obj.asInstanceOf[Anon_Reasons]
  }
}

