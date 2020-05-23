package typings.uirouterCore.urlInterfaceMod

import typings.uirouterCore.stateInterfaceMod.StateDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlMatcherCompileConfig extends js.Object {
  var caseInsensitive: js.UndefOr[Boolean] = js.undefined
  var state: js.UndefOr[StateDeclaration] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object UrlMatcherCompileConfig {
  @scala.inline
  def apply(
    caseInsensitive: js.UndefOr[Boolean] = js.undefined,
    state: StateDeclaration = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): UrlMatcherCompileConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseInsensitive)) __obj.updateDynamic("caseInsensitive")(caseInsensitive.get.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlMatcherCompileConfig]
  }
}

