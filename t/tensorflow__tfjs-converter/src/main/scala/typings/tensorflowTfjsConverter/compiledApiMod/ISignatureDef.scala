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
    inputs: StringDictionary[ITensorInfo] = null,
    methodName: String = null,
    outputs: StringDictionary[ITensorInfo] = null
  ): ISignatureDef = {
    val __obj = js.Dynamic.literal()
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (methodName != null) __obj.updateDynamic("methodName")(methodName.asInstanceOf[js.Any])
    if (outputs != null) __obj.updateDynamic("outputs")(outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISignatureDef]
  }
}

