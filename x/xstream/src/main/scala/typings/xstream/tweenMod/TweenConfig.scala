package typings.xstream.tweenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TweenConfig extends js.Object {
  var duration: Double = js.native
  var ease: js.UndefOr[Ease] = js.native
  var from: Double = js.native
  var interval: js.UndefOr[Double] = js.native
  var to: Double = js.native
}

object TweenConfig {
  @scala.inline
  def apply(duration: Double, from: Double, to: Double): TweenConfig = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[TweenConfig]
  }
  @scala.inline
  implicit class TweenConfigOps[Self <: TweenConfig] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: Double): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def setEase(value: (/* x */ Double, /* from */ Double, /* to */ Double) => Double): Self = this.set("ease", js.Any.fromFunction3(value))
    @scala.inline
    def deleteEase: Self = this.set("ease", js.undefined)
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
  }
  
}

