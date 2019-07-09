package typings
package atTensorflowTfjsDashConverterLib.distSrcOperationsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttrParamMapper extends ParamMapper {
  var tfDeprecatedName: js.UndefOr[java.lang.String] = js.undefined
  var tfName: js.UndefOr[java.lang.String] = js.undefined
}

object AttrParamMapper {
  @scala.inline
  def apply(
    name: java.lang.String,
    `type`: ParamType,
    defaultValue: ValueType = null,
    notSupported: js.UndefOr[scala.Boolean] = js.undefined,
    tfDeprecatedName: java.lang.String = null,
    tfName: java.lang.String = null
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

