package typings.tensorflowTfjsConverter.compiledApiMod

import typings.tensorflowTfjsConverter.compiledApiMod.OpDef.IArgDef
import typings.tensorflowTfjsConverter.compiledApiMod.OpDef.IAttrDef
import typings.tensorflowTfjsConverter.compiledApiMod.OpDef.IOpDeprecation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOpDef extends js.Object {
  /** OpDef allowsUninitializedInput */
  var allowsUninitializedInput: js.UndefOr[Boolean | Null] = js.undefined
  /** OpDef attr */
  var attr: js.UndefOr[js.Array[IAttrDef] | Null] = js.undefined
  /** OpDef deprecation */
  var deprecation: js.UndefOr[IOpDeprecation | Null] = js.undefined
  /** OpDef description */
  var description: js.UndefOr[String | Null] = js.undefined
  /** OpDef inputArg */
  var inputArg: js.UndefOr[js.Array[IArgDef] | Null] = js.undefined
  /** OpDef isAggregate */
  var isAggregate: js.UndefOr[Boolean | Null] = js.undefined
  /** OpDef isCommutative */
  var isCommutative: js.UndefOr[Boolean | Null] = js.undefined
  /** OpDef isStateful */
  var isStateful: js.UndefOr[Boolean | Null] = js.undefined
  /** OpDef name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** OpDef outputArg */
  var outputArg: js.UndefOr[js.Array[IArgDef] | Null] = js.undefined
  /** OpDef summary */
  var summary: js.UndefOr[String | Null] = js.undefined
}

object IOpDef {
  @scala.inline
  def apply(
    allowsUninitializedInput: js.UndefOr[Null | Boolean] = js.undefined,
    attr: js.UndefOr[Null | js.Array[IAttrDef]] = js.undefined,
    deprecation: js.UndefOr[Null | IOpDeprecation] = js.undefined,
    description: js.UndefOr[Null | String] = js.undefined,
    inputArg: js.UndefOr[Null | js.Array[IArgDef]] = js.undefined,
    isAggregate: js.UndefOr[Null | Boolean] = js.undefined,
    isCommutative: js.UndefOr[Null | Boolean] = js.undefined,
    isStateful: js.UndefOr[Null | Boolean] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined,
    outputArg: js.UndefOr[Null | js.Array[IArgDef]] = js.undefined,
    summary: js.UndefOr[Null | String] = js.undefined
  ): IOpDef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowsUninitializedInput)) __obj.updateDynamic("allowsUninitializedInput")(allowsUninitializedInput.asInstanceOf[js.Any])
    if (!js.isUndefined(attr)) __obj.updateDynamic("attr")(attr.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecation)) __obj.updateDynamic("deprecation")(deprecation.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(inputArg)) __obj.updateDynamic("inputArg")(inputArg.asInstanceOf[js.Any])
    if (!js.isUndefined(isAggregate)) __obj.updateDynamic("isAggregate")(isAggregate.asInstanceOf[js.Any])
    if (!js.isUndefined(isCommutative)) __obj.updateDynamic("isCommutative")(isCommutative.asInstanceOf[js.Any])
    if (!js.isUndefined(isStateful)) __obj.updateDynamic("isStateful")(isStateful.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(outputArg)) __obj.updateDynamic("outputArg")(outputArg.asInstanceOf[js.Any])
    if (!js.isUndefined(summary)) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOpDef]
  }
}

