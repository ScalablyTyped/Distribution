package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary of options for the <Titanium.UI.Window.open> method.
  */
@js.native
trait openWindowParams extends StObject {
  
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
  var bottom: js.UndefOr[Double | String] = js.native
  
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
  var height: js.UndefOr[Double | String] = js.native
  
  /**
    * Window's left position, in platform-specific units.
    */
  var left: js.UndefOr[Double | String] = js.native
  
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
  var right: js.UndefOr[Double | String] = js.native
  
  /**
    * Window's top position, in platform-specific units.
    */
  var top: js.UndefOr[Double | String] = js.native
  
  /**
    * Transition style of this non-modal window.
    */
  var transition: js.UndefOr[Double] = js.native
  
  /**
    * Window's width, in platform-specific units.
    */
  var width: js.UndefOr[Double | String] = js.native
}
object openWindowParams {
  
  @scala.inline
  def apply(): openWindowParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[openWindowParams]
  }
  
  @scala.inline
  implicit class openWindowParamsMutableBuilder[Self <: openWindowParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityEnterAnimation(value: Double): Self = StObject.set(x, "activityEnterAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityEnterAnimationUndefined: Self = StObject.set(x, "activityEnterAnimation", js.undefined)
    
    @scala.inline
    def setActivityExitAnimation(value: Double): Self = StObject.set(x, "activityExitAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityExitAnimationUndefined: Self = StObject.set(x, "activityExitAnimation", js.undefined)
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    @scala.inline
    def setBottom(value: Double | String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setForceModal(value: Boolean): Self = StObject.set(x, "forceModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceModalUndefined: Self = StObject.set(x, "forceModal", js.undefined)
    
    @scala.inline
    def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLeft(value: Double | String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalStyle(value: Double): Self = StObject.set(x, "modalStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalStyleUndefined: Self = StObject.set(x, "modalStyle", js.undefined)
    
    @scala.inline
    def setModalTransitionStyle(value: Double): Self = StObject.set(x, "modalTransitionStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalTransitionStyleUndefined: Self = StObject.set(x, "modalTransitionStyle", js.undefined)
    
    @scala.inline
    def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    @scala.inline
    def setNavBarHidden(value: Boolean): Self = StObject.set(x, "navBarHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavBarHiddenUndefined: Self = StObject.set(x, "navBarHidden", js.undefined)
    
    @scala.inline
    def setRight(value: Double | String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setTop(value: Double | String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setTransition(value: Double): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
