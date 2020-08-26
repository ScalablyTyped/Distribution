package typings.webpagetest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestRun extends js.Object {
  var firstView: js.Any = js.native
}

object TestRun {
  @scala.inline
  def apply(firstView: js.Any): TestRun = {
    val __obj = js.Dynamic.literal(firstView = firstView.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRun]
  }
  @scala.inline
  implicit class TestRunOps[Self <: TestRun] (val x: Self) extends AnyVal {
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
    def setFirstView(value: js.Any): Self = this.set("firstView", value.asInstanceOf[js.Any])
  }
  
}

