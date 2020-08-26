package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Results extends js.Object {
  var failed: Double = js.native
  var finished: Double = js.native
  var passed: Double = js.native
}

object Results {
  @scala.inline
  def apply(failed: Double, finished: Double, passed: Double): Results = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results]
  }
  @scala.inline
  implicit class ResultsOps[Self <: Results] (val x: Self) extends AnyVal {
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
    def setFailed(value: Double): Self = this.set("failed", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinished(value: Double): Self = this.set("finished", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassed(value: Double): Self = this.set("passed", value.asInstanceOf[js.Any])
  }
  
}

