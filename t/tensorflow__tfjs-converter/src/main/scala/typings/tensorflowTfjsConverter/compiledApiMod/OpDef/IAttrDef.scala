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
    allowedValues: IAttrValue = null,
    defaultValue: IAttrValue = null,
    description: String = null,
    hasMinimum: js.UndefOr[Boolean] = js.undefined,
    minimum: Double | String = null,
    name: String = null,
    `type`: String = null
  ): IAttrDef = {
    val __obj = js.Dynamic.literal()
    if (allowedValues != null) __obj.updateDynamic("allowedValues")(allowedValues.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(hasMinimum)) __obj.updateDynamic("hasMinimum")(hasMinimum.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAttrDef]
  }
}

