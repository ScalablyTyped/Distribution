package typings.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod.OpDef

import typings.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod.DataType
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
    description: String = null,
    isRef: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    numberAttr: String = null,
    `type`: DataType = null,
    typeAttr: String = null,
    typeListAttr: String = null
  ): IArgDef = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(isRef)) __obj.updateDynamic("isRef")(isRef.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (numberAttr != null) __obj.updateDynamic("numberAttr")(numberAttr.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeAttr != null) __obj.updateDynamic("typeAttr")(typeAttr.asInstanceOf[js.Any])
    if (typeListAttr != null) __obj.updateDynamic("typeListAttr")(typeListAttr.asInstanceOf[js.Any])
    __obj.asInstanceOf[IArgDef]
  }
}

