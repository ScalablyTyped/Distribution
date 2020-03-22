package typings.typedoc.optionsDeclarationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationOptionBase extends js.Object {
  var help: String
  var name: String
  var scope: js.UndefOr[ParameterScope] = js.undefined
  var short: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[ParameterType] = js.undefined
}

object DeclarationOptionBase {
  @scala.inline
  def apply(
    help: String,
    name: String,
    scope: ParameterScope = null,
    short: String = null,
    `type`: ParameterType = null
  ): DeclarationOptionBase = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (short != null) __obj.updateDynamic("short")(short.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarationOptionBase]
  }
}

