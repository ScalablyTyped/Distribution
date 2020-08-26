package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.time
import typings.vegaTypings.vegaTypingsStrings.utc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeScale
  extends ContinuousScale
     with Scale {
  var nice: js.UndefOr[Boolean | TimeInterval | TimeIntervalStep | SignalRef] = js.native
  @JSName("type")
  var type_TimeScale: time | utc = js.native
}

object TimeScale {
  @scala.inline
  def apply(name: String, `type`: time | utc): TimeScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeScale]
  }
  @scala.inline
  implicit class TimeScaleOps[Self <: TimeScale] (val x: Self) extends AnyVal {
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
    def setType(value: time | utc): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setNice(value: Boolean | TimeInterval | TimeIntervalStep | SignalRef): Self = this.set("nice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNice: Self = this.set("nice", js.undefined)
  }
  
}

