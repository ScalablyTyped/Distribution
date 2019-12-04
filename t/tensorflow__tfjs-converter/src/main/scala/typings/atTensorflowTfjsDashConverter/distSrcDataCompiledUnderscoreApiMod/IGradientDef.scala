package typings.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGradientDef extends js.Object {
  /** GradientDef functionName */
  var functionName: js.UndefOr[String | Null] = js.undefined
  /** GradientDef gradientFunc */
  var gradientFunc: js.UndefOr[String | Null] = js.undefined
}

object IGradientDef {
  @scala.inline
  def apply(functionName: String = null, gradientFunc: String = null): IGradientDef = {
    val __obj = js.Dynamic.literal()
    if (functionName != null) __obj.updateDynamic("functionName")(functionName.asInstanceOf[js.Any])
    if (gradientFunc != null) __obj.updateDynamic("gradientFunc")(gradientFunc.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGradientDef]
  }
}

