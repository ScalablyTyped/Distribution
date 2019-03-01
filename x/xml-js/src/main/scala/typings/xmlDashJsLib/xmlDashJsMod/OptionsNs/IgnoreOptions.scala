package typings
package xmlDashJsLib.xmlDashJsMod.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgnoreOptions extends js.Object {
  var ignoreAttributes: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreCdata: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreComment: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreDeclaration: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreDoctype: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreInstruction: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreText: js.UndefOr[scala.Boolean] = js.undefined
}

object IgnoreOptions {
  @scala.inline
  def apply(
    ignoreAttributes: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreCdata: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreComment: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreDeclaration: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreDoctype: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreInstruction: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreText: js.UndefOr[scala.Boolean] = js.undefined
  ): IgnoreOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreAttributes)) __obj.updateDynamic("ignoreAttributes")(ignoreAttributes)
    if (!js.isUndefined(ignoreCdata)) __obj.updateDynamic("ignoreCdata")(ignoreCdata)
    if (!js.isUndefined(ignoreComment)) __obj.updateDynamic("ignoreComment")(ignoreComment)
    if (!js.isUndefined(ignoreDeclaration)) __obj.updateDynamic("ignoreDeclaration")(ignoreDeclaration)
    if (!js.isUndefined(ignoreDoctype)) __obj.updateDynamic("ignoreDoctype")(ignoreDoctype)
    if (!js.isUndefined(ignoreInstruction)) __obj.updateDynamic("ignoreInstruction")(ignoreInstruction)
    if (!js.isUndefined(ignoreText)) __obj.updateDynamic("ignoreText")(ignoreText)
    __obj.asInstanceOf[IgnoreOptions]
  }
}

