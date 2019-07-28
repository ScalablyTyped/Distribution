package typings.atTensorflowTfjsDashConverter.distSrcOperationsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttrParamMapper extends ParamMapper {
  var tfDeprecatedName: js.UndefOr[String] = js.undefined
  var tfName: js.UndefOr[String] = js.undefined
}

object AttrParamMapper {
  @scala.inline
  def apply(
    name: String,
    `type`: ParamType,
    defaultValue: ValueType = null,
    notSupported: js.UndefOr[Boolean] = js.undefined,
    tfDeprecatedName: String = null,
    tfName: String = null
  ): AttrParamMapper = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(notSupported)) __obj.updateDynamic("notSupported")(notSupported)
    if (tfDeprecatedName != null) __obj.updateDynamic("tfDeprecatedName")(tfDeprecatedName)
    if (tfName != null) __obj.updateDynamic("tfName")(tfName)
    __obj.asInstanceOf[AttrParamMapper]
  }
}

