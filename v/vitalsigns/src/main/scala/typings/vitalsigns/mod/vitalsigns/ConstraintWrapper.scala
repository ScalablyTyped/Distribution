package typings.vitalsigns.mod.vitalsigns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstraintWrapper extends js.Object {
  @JSName("equals")
  var equals_FConstraintWrapper: js.UndefOr[js.Function1[/* num */ Double, this.type]] = js.native
  var greaterThan: js.UndefOr[js.Function1[/* num */ Double, this.type]] = js.native
  var lessThan: js.UndefOr[js.Function1[/* num */ Double, this.type]] = js.native
  var not: js.UndefOr[ConstraintWrapper] = js.native
}

object ConstraintWrapper {
  @scala.inline
  def apply(): ConstraintWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstraintWrapper]
  }
  @scala.inline
  implicit class ConstraintWrapperOps[Self <: ConstraintWrapper] (val x: Self) extends AnyVal {
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
    def setEquals(value: /* num */ Double => ConstraintWrapper): Self = this.set("equals", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEquals: Self = this.set("equals", js.undefined)
    @scala.inline
    def setGreaterThan(value: /* num */ Double => ConstraintWrapper): Self = this.set("greaterThan", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGreaterThan: Self = this.set("greaterThan", js.undefined)
    @scala.inline
    def setLessThan(value: /* num */ Double => ConstraintWrapper): Self = this.set("lessThan", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLessThan: Self = this.set("lessThan", js.undefined)
    @scala.inline
    def setNot(value: ConstraintWrapper): Self = this.set("not", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNot: Self = this.set("not", js.undefined)
  }
  
}

