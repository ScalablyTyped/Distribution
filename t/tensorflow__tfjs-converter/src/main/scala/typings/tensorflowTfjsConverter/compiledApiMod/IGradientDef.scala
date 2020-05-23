package typings.tensorflowTfjsConverter.compiledApiMod

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
  def apply(
    functionName: js.UndefOr[Null | String] = js.undefined,
    gradientFunc: js.UndefOr[Null | String] = js.undefined
  ): IGradientDef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(functionName)) __obj.updateDynamic("functionName")(functionName.asInstanceOf[js.Any])
    if (!js.isUndefined(gradientFunc)) __obj.updateDynamic("gradientFunc")(gradientFunc.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGradientDef]
  }
}

