package typings.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod

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
  def apply(function: js.Array[IFunctionDef] = null, gradient: js.Array[IGradientDef] = null): IFunctionDefLibrary = {
    val __obj = js.Dynamic.literal()
    if (function != null) __obj.updateDynamic("function")(function.asInstanceOf[js.Any])
    if (gradient != null) __obj.updateDynamic("gradient")(gradient.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFunctionDefLibrary]
  }
}

