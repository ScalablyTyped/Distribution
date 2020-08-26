package typings.tweenjs.createjs

import typings.createjsLib.createjs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TweenProps extends js.Object {
  var bounce: js.UndefOr[Boolean] = js.native
  var ignoreGlobalPause: js.UndefOr[Boolean] = js.native
  var loop: js.UndefOr[Double] = js.native
  var onChange: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
  var onComplete: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
  var `override`: js.UndefOr[Boolean] = js.native
  var paused: js.UndefOr[Boolean] = js.native
  var pluginData: js.UndefOr[js.Any] = js.native
  var position: js.UndefOr[Double] = js.native
  var reversed: js.UndefOr[Boolean] = js.native
  var timeScale: js.UndefOr[Double] = js.native
  var useTicks: js.UndefOr[Boolean] = js.native
}

object TweenProps {
  @scala.inline
  def apply(): TweenProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TweenProps]
  }
  @scala.inline
  implicit class TweenPropsOps[Self <: TweenProps] (val x: Self) extends AnyVal {
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
    def setBounce(value: Boolean): Self = this.set("bounce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounce: Self = this.set("bounce", js.undefined)
    @scala.inline
    def setIgnoreGlobalPause(value: Boolean): Self = this.set("ignoreGlobalPause", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreGlobalPause: Self = this.set("ignoreGlobalPause", js.undefined)
    @scala.inline
    def setLoop(value: Double): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setOnChange(value: /* e */ Event => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnComplete(value: /* e */ Event => Unit): Self = this.set("onComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    @scala.inline
    def setOverride(value: Boolean): Self = this.set("override", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverride: Self = this.set("override", js.undefined)
    @scala.inline
    def setPaused(value: Boolean): Self = this.set("paused", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaused: Self = this.set("paused", js.undefined)
    @scala.inline
    def setPluginData(value: js.Any): Self = this.set("pluginData", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePluginData: Self = this.set("pluginData", js.undefined)
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setReversed(value: Boolean): Self = this.set("reversed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReversed: Self = this.set("reversed", js.undefined)
    @scala.inline
    def setTimeScale(value: Double): Self = this.set("timeScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeScale: Self = this.set("timeScale", js.undefined)
    @scala.inline
    def setUseTicks(value: Boolean): Self = this.set("useTicks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseTicks: Self = this.set("useTicks", js.undefined)
  }
  
}

