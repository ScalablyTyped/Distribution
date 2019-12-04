package typings.atTensorflowTfjsDashCore.distJasmineUnderscoreUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestFilter extends js.Object {
  var excludes: js.UndefOr[js.Array[String]] = js.undefined
  var include: js.UndefOr[String] = js.undefined
  var startsWith: js.UndefOr[String] = js.undefined
}

object TestFilter {
  @scala.inline
  def apply(excludes: js.Array[String] = null, include: String = null, startsWith: String = null): TestFilter = {
    val __obj = js.Dynamic.literal()
    if (excludes != null) __obj.updateDynamic("excludes")(excludes.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (startsWith != null) __obj.updateDynamic("startsWith")(startsWith.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestFilter]
  }
}

