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
    allowsUninitializedInput: js.UndefOr[Boolean] = js.undefined,
    attr: js.Array[IAttrDef] = null,
    deprecation: IOpDeprecation = null,
    description: String = null,
    inputArg: js.Array[IArgDef] = null,
    isAggregate: js.UndefOr[Boolean] = js.undefined,
    isCommutative: js.UndefOr[Boolean] = js.undefined,
    isStateful: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    outputArg: js.Array[IArgDef] = null,
    summary: String = null
  ): IOpDef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowsUninitializedInput)) __obj.updateDynamic("allowsUninitializedInput")(allowsUninitializedInput.asInstanceOf[js.Any])
    if (attr != null) __obj.updateDynamic("attr")(attr.asInstanceOf[js.Any])
    if (deprecation != null) __obj.updateDynamic("deprecation")(deprecation.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (inputArg != null) __obj.updateDynamic("inputArg")(inputArg.asInstanceOf[js.Any])
    if (!js.isUndefined(isAggregate)) __obj.updateDynamic("isAggregate")(isAggregate.asInstanceOf[js.Any])
    if (!js.isUndefined(isCommutative)) __obj.updateDynamic("isCommutative")(isCommutative.asInstanceOf[js.Any])
    if (!js.isUndefined(isStateful)) __obj.updateDynamic("isStateful")(isStateful.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (outputArg != null) __obj.updateDynamic("outputArg")(outputArg.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOpDef]
  }
}

