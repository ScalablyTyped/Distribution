package typings.atTensorflowTfjsDashCore.distEnvironmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlagRegistryEntry extends js.Object {
  var setHook: js.UndefOr[js.Function1[/* value */ FlagValue, Unit]] = js.undefined
  def evaluationFn(): FlagValue
}

object FlagRegistryEntry {
  @scala.inline
  def apply(evaluationFn: () => FlagValue, setHook: /* value */ FlagValue => Unit = null): FlagRegistryEntry = {
    val __obj = js.Dynamic.literal(evaluationFn = js.Any.fromFunction0(evaluationFn))
    if (setHook != null) __obj.updateDynamic("setHook")(js.Any.fromFunction1(setHook))
    __obj.asInstanceOf[FlagRegistryEntry]
  }
}

