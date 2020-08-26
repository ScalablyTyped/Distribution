package typings.tensorflowTfjsCore.environmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlagRegistryEntry extends js.Object {
  var evaluationFn: FlagEvaluationFn = js.native
  var setHook: js.UndefOr[js.Function1[/* value */ FlagValue, Unit]] = js.native
}

object FlagRegistryEntry {
  @scala.inline
  def apply(evaluationFn: () => FlagValue | js.Promise[FlagValue]): FlagRegistryEntry = {
    val __obj = js.Dynamic.literal(evaluationFn = js.Any.fromFunction0(evaluationFn))
    __obj.asInstanceOf[FlagRegistryEntry]
  }
  @scala.inline
  implicit class FlagRegistryEntryOps[Self <: FlagRegistryEntry] (val x: Self) extends AnyVal {
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
    def setEvaluationFn(value: () => FlagValue | js.Promise[FlagValue]): Self = this.set("evaluationFn", js.Any.fromFunction0(value))
    @scala.inline
    def setSetHook(value: /* value */ FlagValue => Unit): Self = this.set("setHook", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetHook: Self = this.set("setHook", js.undefined)
  }
  
}

