package typings.webpagetest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunOptions extends js.Object {
  /** if true returns the repeat view (cached) data */
  var repeatView: js.UndefOr[Boolean] = js.native
  /** the test run number for multiple runs tests (default: 1, first test) */
  var run: js.UndefOr[Double] = js.native
}

object RunOptions {
  @scala.inline
  def apply(): RunOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunOptions]
  }
  @scala.inline
  implicit class RunOptionsOps[Self <: RunOptions] (val x: Self) extends AnyVal {
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
    def setRepeatView(value: Boolean): Self = this.set("repeatView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeatView: Self = this.set("repeatView", js.undefined)
    @scala.inline
    def setRun(value: Double): Self = this.set("run", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRun: Self = this.set("run", js.undefined)
  }
  
}

