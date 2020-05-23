package typings.tensorflowTfjsConverter.compiledApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFunctionDefLibrary extends js.Object {
  /** FunctionDefLibrary function */
  var function: js.UndefOr[js.Array[IFunctionDef] | Null] = js.undefined
  /** FunctionDefLibrary gradient */
  var gradient: js.UndefOr[js.Array[IGradientDef] | Null] = js.undefined
}

object IFunctionDefLibrary {
  @scala.inline
  def apply(
    function: js.UndefOr[Null | js.Array[IFunctionDef]] = js.undefined,
    gradient: js.UndefOr[Null | js.Array[IGradientDef]] = js.undefined
  ): IFunctionDefLibrary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(function)) __obj.updateDynamic("function")(function.asInstanceOf[js.Any])
    if (!js.isUndefined(gradient)) __obj.updateDynamic("gradient")(gradient.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFunctionDefLibrary]
  }
}

