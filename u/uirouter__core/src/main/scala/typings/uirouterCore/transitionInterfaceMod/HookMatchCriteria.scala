package typings.uirouterCore.transitionInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.uirouterCore.stateObjectMod.StateObject
import typings.uirouterCore.transitionTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HookMatchCriteria
  extends /* key */ StringDictionary[js.UndefOr[HookMatchCriterion]] {
  /** A [[HookMatchCriterion]] to match any state that would be entering */
  var entering: js.UndefOr[HookMatchCriterion] = js.native
  /** A [[HookMatchCriterion]] to match any state that would be exiting */
  var exiting: js.UndefOr[HookMatchCriterion] = js.native
  /** A [[HookMatchCriterion]] to match the original (from) state */
  var from: js.UndefOr[HookMatchCriterion] = js.native
  /** A [[HookMatchCriterion]] to match any state that would be retained */
  var retained: js.UndefOr[HookMatchCriterion] = js.native
  /** A [[HookMatchCriterion]] to match the destination state */
  var to: js.UndefOr[HookMatchCriterion] = js.native
}

object HookMatchCriteria {
  @scala.inline
  def apply(): HookMatchCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HookMatchCriteria]
  }
  @scala.inline
  implicit class HookMatchCriteriaOps[Self <: HookMatchCriteria] (val x: Self) extends AnyVal {
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
    def setEnteringFunction2(value: (/* x */ js.UndefOr[StateObject], /* y */ js.UndefOr[Transition]) => Boolean): Self = this.set("entering", js.Any.fromFunction2(value))
    @scala.inline
    def setEntering(value: HookMatchCriterion): Self = this.set("entering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntering: Self = this.set("entering", js.undefined)
    @scala.inline
    def setExitingFunction2(value: (/* x */ js.UndefOr[StateObject], /* y */ js.UndefOr[Transition]) => Boolean): Self = this.set("exiting", js.Any.fromFunction2(value))
    @scala.inline
    def setExiting(value: HookMatchCriterion): Self = this.set("exiting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExiting: Self = this.set("exiting", js.undefined)
    @scala.inline
    def setFromFunction2(value: (/* x */ js.UndefOr[StateObject], /* y */ js.UndefOr[Transition]) => Boolean): Self = this.set("from", js.Any.fromFunction2(value))
    @scala.inline
    def setFrom(value: HookMatchCriterion): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setRetainedFunction2(value: (/* x */ js.UndefOr[StateObject], /* y */ js.UndefOr[Transition]) => Boolean): Self = this.set("retained", js.Any.fromFunction2(value))
    @scala.inline
    def setRetained(value: HookMatchCriterion): Self = this.set("retained", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetained: Self = this.set("retained", js.undefined)
    @scala.inline
    def setToFunction2(value: (/* x */ js.UndefOr[StateObject], /* y */ js.UndefOr[Transition]) => Boolean): Self = this.set("to", js.Any.fromFunction2(value))
    @scala.inline
    def setTo(value: HookMatchCriterion): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

