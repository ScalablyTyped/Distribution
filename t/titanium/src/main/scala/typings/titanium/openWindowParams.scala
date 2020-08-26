package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary of options for the <Titanium.UI.Window.open> method.
  */
@js.native
trait openWindowParams extends js.Object {
  /**
    * Animation resource to run on the activity being opened.
    */
  var activityEnterAnimation: js.UndefOr[Double] = js.native
  /**
    * Animation resource to run on the activity that is being put in background as a window is being opened above it.
    */
  var activityExitAnimation: js.UndefOr[Double] = js.native
  /**
    * Determines whether to use an animated effect when the window is shown.
    */
  var animated: js.UndefOr[Boolean] = js.native
  /**
    * Window's bottom position, in platform-specific units.
    */
  var bottom: js.UndefOr[Double | java.lang.String] = js.native
  /**
    * Indicates whether the window enforces modal behaviour.
    */
  var forceModal: js.UndefOr[Boolean] = js.native
  /**
    * Determines if the window is fullscreen.
    */
  var fullscreen: js.UndefOr[Boolean] = js.native
  /**
    * Window's height, in platform-specific units.
    */
  var height: js.UndefOr[Double | java.lang.String] = js.native
  /**
    * Window's left position, in platform-specific units.
    */
  var left: js.UndefOr[Double | java.lang.String] = js.native
  /**
    * Determines whether to open the window modal in front of other windows.
    */
  var modal: js.UndefOr[Boolean] = js.native
  /**
    * Presentation style of this modal window.
    */
  var modalStyle: js.UndefOr[Double] = js.native
  /**
    * Transition style of this modal window.
    */
  var modalTransitionStyle: js.UndefOr[Double] = js.native
  /**
    * For modal windows, hides the nav bar (`true`) or shows the nav bar (`false`).
    */
  var navBarHidden: js.UndefOr[Boolean] = js.native
  /**
    * Window's right position, in platform-specific units.
    */
  var right: js.UndefOr[Double | java.lang.String] = js.native
  /**
    * Window's top position, in platform-specific units.
    */
  var top: js.UndefOr[Double | java.lang.String] = js.native
  /**
    * Transition style of this non-modal window.
    */
  var transition: js.UndefOr[Double] = js.native
  /**
    * Window's width, in platform-specific units.
    */
  var width: js.UndefOr[Double | java.lang.String] = js.native
}

object openWindowParams {
  @scala.inline
  def apply(): openWindowParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[openWindowParams]
  }
  @scala.inline
  implicit class openWindowParamsOps[Self <: openWindowParams] (val x: Self) extends AnyVal {
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
    def setBottom(value: Double | java.lang.String): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setForceModal(value: Boolean): Self = this.set("forceModal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceModal: Self = this.set("forceModal", js.undefined)
    @scala.inline
    def setFullscreen(value: Boolean): Self = this.set("fullscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullscreen: Self = this.set("fullscreen", js.undefined)
    @scala.inline
    def setHeight(value: Double | java.lang.String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLeft(value: Double | java.lang.String): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setModal(value: Boolean): Self = this.set("modal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    @scala.inline
    def setModalStyle(value: Double): Self = this.set("modalStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalStyle: Self = this.set("modalStyle", js.undefined)
    @scala.inline
    def setModalTransitionStyle(value: Double): Self = this.set("modalTransitionStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalTransitionStyle: Self = this.set("modalTransitionStyle", js.undefined)
    @scala.inline
    def setNavBarHidden(value: Boolean): Self = this.set("navBarHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavBarHidden: Self = this.set("navBarHidden", js.undefined)
    @scala.inline
    def setRight(value: Double | java.lang.String): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setTop(value: Double | java.lang.String): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setTransition(value: Double): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    @scala.inline
    def setWidth(value: Double | java.lang.String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

