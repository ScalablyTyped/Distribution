package typings
package atUirouterCoreLib.libTransitionInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionHookOptions extends js.Object {
  var bind: js.UndefOr[js.Any] = js.undefined
  var current: js.UndefOr[js.Function0[atUirouterCoreLib.libTransitionTransitionMod.Transition]] = js.undefined
  var hookType: js.UndefOr[java.lang.String] = js.undefined
  var stateHook: js.UndefOr[scala.Boolean] = js.undefined
  var target: js.UndefOr[js.Any] = js.undefined
  var traceData: js.UndefOr[js.Any] = js.undefined
  var transition: js.UndefOr[atUirouterCoreLib.libTransitionTransitionMod.Transition] = js.undefined
}

object TransitionHookOptions {
  @scala.inline
  def apply(
    bind: js.Any = null,
    current: js.Function0[atUirouterCoreLib.libTransitionTransitionMod.Transition] = null,
    hookType: java.lang.String = null,
    stateHook: js.UndefOr[scala.Boolean] = js.undefined,
    target: js.Any = null,
    traceData: js.Any = null,
    transition: atUirouterCoreLib.libTransitionTransitionMod.Transition = null
  ): TransitionHookOptions = {
    val __obj = js.Dynamic.literal()
    if (bind != null) __obj.updateDynamic("bind")(bind)
    if (current != null) __obj.updateDynamic("current")(current)
    if (hookType != null) __obj.updateDynamic("hookType")(hookType)
    if (!js.isUndefined(stateHook)) __obj.updateDynamic("stateHook")(stateHook)
    if (target != null) __obj.updateDynamic("target")(target)
    if (traceData != null) __obj.updateDynamic("traceData")(traceData)
    if (transition != null) __obj.updateDynamic("transition")(transition)
    __obj.asInstanceOf[TransitionHookOptions]
  }
}

