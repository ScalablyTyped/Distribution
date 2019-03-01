package typings
package atUirouterCoreLib.libUrlInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlMatcherCompileConfig extends js.Object {
  var caseInsensitive: js.UndefOr[scala.Boolean] = js.undefined
  var state: js.UndefOr[atUirouterCoreLib.libStateInterfaceMod.StateDeclaration] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object UrlMatcherCompileConfig {
  @scala.inline
  def apply(
    caseInsensitive: js.UndefOr[scala.Boolean] = js.undefined,
    state: atUirouterCoreLib.libStateInterfaceMod.StateDeclaration = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined
  ): UrlMatcherCompileConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseInsensitive)) __obj.updateDynamic("caseInsensitive")(caseInsensitive)
    if (state != null) __obj.updateDynamic("state")(state)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[UrlMatcherCompileConfig]
  }
}

