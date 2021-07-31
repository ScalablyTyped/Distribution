package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.stackTypesMod.TransitionSpec
import typings.tuyaPanelKit.tuyaPanelKitStrings.spring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animation
  extends StObject
     with TransitionSpec {
  
  var animation: spring
  
  var config: OmitSpringAnimationConfig
}
object Animation {
  
  @scala.inline
  def apply(config: OmitSpringAnimationConfig): Animation = {
    val __obj = js.Dynamic.literal(animation = "spring", config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
  
  @scala.inline
  implicit class AnimationMutableBuilder[Self <: Animation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: spring): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: OmitSpringAnimationConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
  }
}
