package typings.atTensorflowTfjsDashCore.distJasmineUnderscoreUtilMod

import typings.atTensorflowTfjsDashCore.distEnvironmentMod.Flags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constraints extends js.Object {
  var flags: js.UndefOr[Flags] = js.undefined
  var predicate: js.UndefOr[js.Function1[/* testEnv */ TestEnv, Boolean]] = js.undefined
}

object Constraints {
  @scala.inline
  def apply(flags: Flags = null, predicate: /* testEnv */ TestEnv => Boolean = null): Constraints = {
    val __obj = js.Dynamic.literal()
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (predicate != null) __obj.updateDynamic("predicate")(js.Any.fromFunction1(predicate))
    __obj.asInstanceOf[Constraints]
  }
}

