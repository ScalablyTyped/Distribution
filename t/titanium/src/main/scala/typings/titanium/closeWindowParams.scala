package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary of options for the <Titanium.UI.Window.close> method.
  */
@js.native
trait closeWindowParams extends StObject {
  
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
  implicit class closeWindowParamsMutableBuilder[Self <: closeWindowParams] (val x: Self) extends AnyVal {
    
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
    def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    @scala.inline
    def setAnimationStyle(value: Double): Self = StObject.set(x, "animationStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationStyleUndefined: Self = StObject.set(x, "animationStyle", js.undefined)
  }
}
