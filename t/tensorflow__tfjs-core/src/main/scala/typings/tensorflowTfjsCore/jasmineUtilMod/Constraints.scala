package typings.tensorflowTfjsCore.jasmineUtilMod

import typings.tensorflowTfjsCore.environmentMod.Flags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constraints extends js.Object {
  var flags: js.UndefOr[Flags] = js.native
  var predicate: js.UndefOr[js.Function1[/* testEnv */ TestEnv, Boolean]] = js.native
}

object Constraints {
  @scala.inline
  def apply(): Constraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Constraints]
  }
  @scala.inline
  implicit class ConstraintsOps[Self <: Constraints] (val x: Self) extends AnyVal {
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
    def setFlags(value: Flags): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    @scala.inline
    def setPredicate(value: /* testEnv */ TestEnv => Boolean): Self = this.set("predicate", js.Any.fromFunction1(value))
    @scala.inline
    def deletePredicate: Self = this.set("predicate", js.undefined)
  }
  
}

