package typings.atUirouterCore.libTransitionInterfaceMod

import typings.atUirouterCore.libTransitionTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionHookOptions extends js.Object {
  var bind: js.UndefOr[js.Any] = js.undefined
  var current: js.UndefOr[js.Function0[Transition]] = js.undefined
  var hookType: js.UndefOr[String] = js.undefined
  var stateHook: js.UndefOr[Boolean] = js.undefined
  var target: js.UndefOr[js.Any] = js.undefined
  var traceData: js.UndefOr[js.Any] = js.undefined
  var transition: js.UndefOr[Transition] = js.undefined
}

object TransitionHookOptions {
  @scala.inline
  def apply(
    bind: js.Any = null,
    current: () => Transition = null,
    hookType: String = null,
    stateHook: js.UndefOr[Boolean] = js.undefined,
    target: js.Any = null,
    traceData: js.Any = null,
    transition: Transition = null
  ): TransitionHookOptions = {
    val __obj = js.Dynamic.literal()
    if (bind != null) __obj.updateDynamic("bind")(bind)
    if (current != null) __obj.updateDynamic("current")(js.Any.fromFunction0(current))
    if (hookType != null) __obj.updateDynamic("hookType")(hookType)
    if (!js.isUndefined(stateHook)) __obj.updateDynamic("stateHook")(stateHook)
    if (target != null) __obj.updateDynamic("target")(target)
    if (traceData != null) __obj.updateDynamic("traceData")(traceData)
    if (transition != null) __obj.updateDynamic("transition")(transition)
    __obj.asInstanceOf[TransitionHookOptions]
  }
}

