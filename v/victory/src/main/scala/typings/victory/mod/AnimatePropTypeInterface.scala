package typings.victory.mod

import typings.victory.anon.After
import typings.victory.anon.Before
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimatePropTypeInterface extends js.Object {
  /**
    * Animation duration
    */
  var duration: Double = js.native
  /**
    * The easing prop specifies an easing function name to use for tweening.
    * @default "quadInOut"
    */
  var easing: js.UndefOr[AnimationEasing] = js.native
  /**
    * Animation end callback
    */
  var onEnd: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Animation enter transition configuration
    */
  var onEnter: js.UndefOr[After] = js.native
  /**
    * Animation exit transition configuration
    */
  var onExit: js.UndefOr[Before] = js.native
  /**
    * Animation load transition configuration
    */
  var onLoad: js.UndefOr[After] = js.native
}

object AnimatePropTypeInterface {
  @scala.inline
  def apply(duration: Double): AnimatePropTypeInterface = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatePropTypeInterface]
  }
  @scala.inline
  implicit class AnimatePropTypeInterfaceOps[Self <: AnimatePropTypeInterface] (val x: Self) extends AnyVal {
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
    def setEasing(value: AnimationEasing): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setOnEnd(value: () => Unit): Self = this.set("onEnd", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnEnd: Self = this.set("onEnd", js.undefined)
    @scala.inline
    def setOnEnter(value: After): Self = this.set("onEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEnter: Self = this.set("onEnter", js.undefined)
    @scala.inline
    def setOnExit(value: Before): Self = this.set("onExit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnExit: Self = this.set("onExit", js.undefined)
    @scala.inline
    def setOnLoad(value: After): Self = this.set("onLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
  }
  
}

