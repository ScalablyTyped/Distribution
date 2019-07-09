package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Reasons extends js.Object {
  var reasons: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var unreliable: scala.Boolean
}

object Anon_Reasons {
  @scala.inline
  def apply(unreliable: scala.Boolean, reasons: js.Array[java.lang.String] = null): Anon_Reasons = {
    val __obj = js.Dynamic.literal(unreliable = unreliable)
    if (reasons != null) __obj.updateDynamic("reasons")(reasons)
    __obj.asInstanceOf[Anon_Reasons]
  }
}

