package typings.styletronDashReact.styletronDashReactMod

import typings.react.reactMod.ReactNode
import typings.styletronDashStandard.styletronDashStandardMod.StandardEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevProviderProps extends js.Object {
  var children: ReactNode
  /** DebugEngineContext */
  var debug: js.UndefOr[DebugEngine] = js.undefined
  var debugAfterHydration: js.UndefOr[Boolean] = js.undefined
  var value: StandardEngine
}

object DevProviderProps {
  @scala.inline
  def apply(
    children: ReactNode,
    value: StandardEngine,
    debug: DebugEngine = null,
    debugAfterHydration: js.UndefOr[Boolean] = js.undefined
  ): DevProviderProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], value = value)
    if (debug != null) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(debugAfterHydration)) __obj.updateDynamic("debugAfterHydration")(debugAfterHydration)
    __obj.asInstanceOf[DevProviderProps]
  }
}

