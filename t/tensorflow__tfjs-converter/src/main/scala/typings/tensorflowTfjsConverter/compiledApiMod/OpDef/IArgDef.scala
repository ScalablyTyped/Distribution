package typings.tensorflowTfjsConverter.compiledApiMod.OpDef

import typings.tensorflowTfjsConverter.compiledApiMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an ArgDef. */
trait IArgDef extends js.Object {
  /** ArgDef description */
  var description: js.UndefOr[String | Null] = js.undefined
  /** ArgDef isRef */
  var isRef: js.UndefOr[Boolean | Null] = js.undefined
  /** ArgDef name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** ArgDef numberAttr */
  var numberAttr: js.UndefOr[String | Null] = js.undefined
  /** ArgDef type */
  var `type`: js.UndefOr[DataType | Null] = js.undefined
  /** ArgDef typeAttr */
  var typeAttr: js.UndefOr[String | Null] = js.undefined
  /** ArgDef typeListAttr */
  var typeListAttr: js.UndefOr[String | Null] = js.undefined
}

object IArgDef {
  @scala.inline
  def apply(
    description: js.UndefOr[Null | String] = js.undefined,
    isRef: js.UndefOr[Null | Boolean] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined,
    numberAttr: js.UndefOr[Null | String] = js.undefined,
    `type`: js.UndefOr[Null | DataType] = js.undefined,
    typeAttr: js.UndefOr[Null | String] = js.undefined,
    typeListAttr: js.UndefOr[Null | String] = js.undefined
  ): IArgDef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(isRef)) __obj.updateDynamic("isRef")(isRef.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(numberAttr)) __obj.updateDynamic("numberAttr")(numberAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(typeAttr)) __obj.updateDynamic("typeAttr")(typeAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(typeListAttr)) __obj.updateDynamic("typeListAttr")(typeListAttr.asInstanceOf[js.Any])
    __obj.asInstanceOf[IArgDef]
  }
}

