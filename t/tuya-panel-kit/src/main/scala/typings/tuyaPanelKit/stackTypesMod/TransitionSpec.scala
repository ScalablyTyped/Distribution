package typings.tuyaPanelKit.stackTypesMod

import typings.tuyaPanelKit.anon.OmitSpringAnimationConfig
import typings.tuyaPanelKit.anon.OmitTimingAnimationConfig
import typings.tuyaPanelKit.tuyaPanelKitStrings.spring
import typings.tuyaPanelKit.tuyaPanelKitStrings.timing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.tuyaPanelKit.anon.Animation
  - typings.tuyaPanelKit.anon.Config
*/
trait TransitionSpec extends js.Object
object TransitionSpec {
  
  @scala.inline
  def Animation(animation: spring, config: OmitSpringAnimationConfig): TransitionSpec = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionSpec]
  }
  
  @scala.inline
  def Config(animation: timing, config: OmitTimingAnimationConfig): TransitionSpec = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionSpec]
  }
}
