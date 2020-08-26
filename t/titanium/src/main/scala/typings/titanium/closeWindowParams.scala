package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary of options for the <Titanium.UI.Window.close> method.
  */
@js.native
trait closeWindowParams extends js.Object {
  /**
    * Animation resource to use for the incoming activity.
    */
  var activityEnterAnimation: js.UndefOr[Double] = js.native
  /**
    * Animation resource to use for the outgoing activity.
    */
  var activityExitAnimation: js.UndefOr[Double] = js.native
  /**
    * Determines whether to use an animated effect when the window is closed. Defaults to `true` on Android, `false` on iOS.
    */
  var animated: js.UndefOr[Boolean] = js.native
  /**
    * duration of the animation in milliseconds
    */
  var animationDuration: js.UndefOr[Double] = js.native
  /**
    * Transition type to use during a transition animation.
    */
  var animationStyle: js.UndefOr[Double] = js.native
}

object closeWindowParams {
  @scala.inline
  def apply(): closeWindowParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[closeWindowParams]
  }
  @scala.inline
  implicit class closeWindowParamsOps[Self <: closeWindowParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActivityEnterAnimation(value: Double): Self = this.set("activityEnterAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivityEnterAnimation: Self = this.set("activityEnterAnimation", js.undefined)
    @scala.inline
    def setActivityExitAnimation(value: Double): Self = this.set("activityExitAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivityExitAnimation: Self = this.set("activityExitAnimation", js.undefined)
    @scala.inline
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    @scala.inline
    def setAnimationStyle(value: Double): Self = this.set("animationStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationStyle: Self = this.set("animationStyle", js.undefined)
  }
  
}

