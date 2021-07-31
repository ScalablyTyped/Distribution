package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.stackTypesMod.TransitionSpec
import typings.tuyaPanelKit.tuyaPanelKitStrings.timing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config
  extends StObject
     with TransitionSpec {
  
  var animation: timing
  
  var config: OmitTimingAnimationConfig
}
object Config {
  
  @scala.inline
  def apply(config: OmitTimingAnimationConfig): Config = {
    val __obj = js.Dynamic.literal(animation = "timing", config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: timing): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: OmitTimingAnimationConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
  }
}
