package typings.tuyaPanelKit.`@reactNavigationStackTypesMod`

import typings.tuyaPanelKit.anon.OmitSpringAnimationConfig
import typings.tuyaPanelKit.anon.OmitTimingAnimationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.tuyaPanelKit.anon.Animation
  - typings.tuyaPanelKit.anon.Config
*/
trait TransitionSpec extends StObject
object TransitionSpec {
  
  inline def Animation(config: OmitSpringAnimationConfig): typings.tuyaPanelKit.anon.Animation = {
    val __obj = js.Dynamic.literal(animation = "spring", config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.tuyaPanelKit.anon.Animation]
  }
  
  inline def Config(config: OmitTimingAnimationConfig): typings.tuyaPanelKit.anon.Config = {
    val __obj = js.Dynamic.literal(animation = "timing", config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.tuyaPanelKit.anon.Config]
  }
}
