package typings.stylelint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleTesterResult extends js.Object {
  var actual: Double = js.native
  var description: String = js.native
  var expected: Double = js.native
}

object RuleTesterResult {
  @scala.inline
  def apply(actual: Double, description: String, expected: Double): RuleTesterResult = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleTesterResult]
  }
  @scala.inline
  implicit class RuleTesterResultOps[Self <: RuleTesterResult] (val x: Self) extends AnyVal {
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
    def setActual(value: Double): Self = this.set("actual", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpected(value: Double): Self = this.set("expected", value.asInstanceOf[js.Any])
  }
  
}

