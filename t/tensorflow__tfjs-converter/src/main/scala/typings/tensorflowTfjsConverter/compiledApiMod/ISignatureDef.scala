package typings.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISignatureDef extends js.Object {
  /** SignatureDef inputs */
  var inputs: js.UndefOr[StringDictionary[ITensorInfo] | Null] = js.undefined
  /** SignatureDef methodName */
  var methodName: js.UndefOr[String | Null] = js.undefined
  /** SignatureDef outputs */
  var outputs: js.UndefOr[StringDictionary[ITensorInfo] | Null] = js.undefined
}

object ISignatureDef {
  @scala.inline
  def apply(
    inputs: js.UndefOr[Null | StringDictionary[ITensorInfo]] = js.undefined,
    methodName: js.UndefOr[Null | String] = js.undefined,
    outputs: js.UndefOr[Null | StringDictionary[ITensorInfo]] = js.undefined
  ): ISignatureDef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inputs)) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (!js.isUndefined(methodName)) __obj.updateDynamic("methodName")(methodName.asInstanceOf[js.Any])
    if (!js.isUndefined(outputs)) __obj.updateDynamic("outputs")(outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISignatureDef]
  }
}

