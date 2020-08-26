package typings.superagent.mod

import typings.superagent.superagentStrings.download
import typings.superagent.superagentStrings.upload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressEvent extends js.Object {
  var direction: download | upload = js.native
  var loaded: Double = js.native
  var percent: js.UndefOr[Double] = js.native
  var total: js.UndefOr[Double] = js.native
}

object ProgressEvent {
  @scala.inline
  def apply(direction: download | upload, loaded: Double): ProgressEvent = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressEvent]
  }
  @scala.inline
  implicit class ProgressEventOps[Self <: ProgressEvent] (val x: Self) extends AnyVal {
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
    def setDirection(value: download | upload): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoaded(value: Double): Self = this.set("loaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercent(value: Double): Self = this.set("percent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercent: Self = this.set("percent", js.undefined)
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
  
}

