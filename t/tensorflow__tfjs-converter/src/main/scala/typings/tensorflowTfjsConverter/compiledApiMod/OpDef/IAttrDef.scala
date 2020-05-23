package typings.tensorflowTfjsConverter.compiledApiMod.OpDef

import typings.tensorflowTfjsConverter.compiledApiMod.IAttrValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an AttrDef. */
trait IAttrDef extends js.Object {
  /** AttrDef allowedValues */
  var allowedValues: js.UndefOr[IAttrValue | Null] = js.undefined
  /** AttrDef defaultValue */
  var defaultValue: js.UndefOr[IAttrValue | Null] = js.undefined
  /** AttrDef description */
  var description: js.UndefOr[String | Null] = js.undefined
  /** AttrDef hasMinimum */
  var hasMinimum: js.UndefOr[Boolean | Null] = js.undefined
  /** AttrDef minimum */
  var minimum: js.UndefOr[Double | String | Null] = js.undefined
  /** AttrDef name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** AttrDef type */
  var `type`: js.UndefOr[String | Null] = js.undefined
}

object IAttrDef {
  @scala.inline
  def apply(
    allowedValues: js.UndefOr[Null | IAttrValue] = js.undefined,
    defaultValue: js.UndefOr[Null | IAttrValue] = js.undefined,
    description: js.UndefOr[Null | String] = js.undefined,
    hasMinimum: js.UndefOr[Null | Boolean] = js.undefined,
    minimum: js.UndefOr[Null | Double | String] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined,
    `type`: js.UndefOr[Null | String] = js.undefined
  ): IAttrDef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowedValues)) __obj.updateDynamic("allowedValues")(allowedValues.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(hasMinimum)) __obj.updateDynamic("hasMinimum")(hasMinimum.asInstanceOf[js.Any])
    if (!js.isUndefined(minimum)) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAttrDef]
  }
}

