package typings
package styletronDashReactLib.styletronDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevProviderProps extends js.Object {
  var children: reactLib.reactMod.ReactNode
  /** DebugEngineContext */
  var debug: js.UndefOr[DebugEngine] = js.undefined
  var debugAfterHydration: js.UndefOr[scala.Boolean] = js.undefined
  var value: styletronDashStandardLib.styletronDashStandardMod.StandardEngine
}

object DevProviderProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    value: styletronDashStandardLib.styletronDashStandardMod.StandardEngine,
    debug: DebugEngine = null,
    debugAfterHydration: js.UndefOr[scala.Boolean] = js.undefined
  ): DevProviderProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], value = value)
    if (debug != null) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(debugAfterHydration)) __obj.updateDynamic("debugAfterHydration")(debugAfterHydration)
    __obj.asInstanceOf[DevProviderProps]
  }
}

