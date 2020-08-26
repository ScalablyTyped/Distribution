package typings.uirouterCore.transitionInterfaceMod

import typings.uirouterCore.transitionTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionHookOptions extends js.Object {
  var bind: js.UndefOr[js.Any] = js.native
  var current: js.UndefOr[js.Function0[Transition]] = js.native
  var hookType: js.UndefOr[String] = js.native
  var stateHook: js.UndefOr[Boolean] = js.native
  var target: js.UndefOr[js.Any] = js.native
  var traceData: js.UndefOr[js.Any] = js.native
  var transition: js.UndefOr[Transition] = js.native
}

object TransitionHookOptions {
  @scala.inline
  def apply(): TransitionHookOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionHookOptions]
  }
  @scala.inline
  implicit class TransitionHookOptionsOps[Self <: TransitionHookOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBind(value: js.Any): Self = this.set("bind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBind: Self = this.set("bind", js.undefined)
    @scala.inline
    def setCurrent(value: () => Transition): Self = this.set("current", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCurrent: Self = this.set("current", js.undefined)
    @scala.inline
    def setHookType(value: String): Self = this.set("hookType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHookType: Self = this.set("hookType", js.undefined)
    @scala.inline
    def setStateHook(value: Boolean): Self = this.set("stateHook", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateHook: Self = this.set("stateHook", js.undefined)
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTraceData(value: js.Any): Self = this.set("traceData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTraceData: Self = this.set("traceData", js.undefined)
    @scala.inline
    def setTransition(value: Transition): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
  }
  
}

