package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsBooleans.`false`
import typings.vegaTypings.vegaTypingsStrings.log
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogScale
  extends ContinuousScale
     with Scale {
  var base: js.UndefOr[Double | SignalRef] = js.native
  var nice: js.UndefOr[Boolean | Double | SignalRef] = js.native
  @JSName("type")
  var type_LogScale: log = js.native
  var zero: js.UndefOr[`false`] = js.native
}

object LogScale {
  @scala.inline
  def apply(name: String, `type`: log): LogScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogScale]
  }
  @scala.inline
  implicit class LogScaleOps[Self <: LogScale] (val x: Self) extends AnyVal {
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
    def setType(value: log): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setBase(value: Double | SignalRef): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    @scala.inline
    def setNice(value: Boolean | Double | SignalRef): Self = this.set("nice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNice: Self = this.set("nice", js.undefined)
    @scala.inline
    def setZero(value: `false`): Self = this.set("zero", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZero: Self = this.set("zero", js.undefined)
  }
  
}

