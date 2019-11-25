package typings.swiz.swizMod.struct

import typings.swiz.swizMod.IChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFieldOptions extends js.Object {
  var attribute: js.UndefOr[Boolean] = js.undefined
  var coerceTo: js.UndefOr[String] = js.undefined
  var desc: js.UndefOr[String] = js.undefined
  var enumerated: js.UndefOr[js.Any] = js.undefined
  var filterFrom: js.UndefOr[js.Array[String]] = js.undefined
  var ignorePublic: js.UndefOr[Boolean] = js.undefined
  var plural: js.UndefOr[String] = js.undefined
  var singular: js.UndefOr[String] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var `val`: js.UndefOr[IChain] = js.undefined
}

object IFieldOptions {
  @scala.inline
  def apply(
    attribute: js.UndefOr[Boolean] = js.undefined,
    coerceTo: String = null,
    desc: String = null,
    enumerated: js.Any = null,
    filterFrom: js.Array[String] = null,
    ignorePublic: js.UndefOr[Boolean] = js.undefined,
    plural: String = null,
    singular: String = null,
    src: String = null,
    `val`: IChain = null
  ): IFieldOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attribute)) __obj.updateDynamic("attribute")(attribute.asInstanceOf[js.Any])
    if (coerceTo != null) __obj.updateDynamic("coerceTo")(coerceTo.asInstanceOf[js.Any])
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (enumerated != null) __obj.updateDynamic("enumerated")(enumerated.asInstanceOf[js.Any])
    if (filterFrom != null) __obj.updateDynamic("filterFrom")(filterFrom.asInstanceOf[js.Any])
    if (!js.isUndefined(ignorePublic)) __obj.updateDynamic("ignorePublic")(ignorePublic.asInstanceOf[js.Any])
    if (plural != null) __obj.updateDynamic("plural")(plural.asInstanceOf[js.Any])
    if (singular != null) __obj.updateDynamic("singular")(singular.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (`val` != null) __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldOptions]
  }
}

