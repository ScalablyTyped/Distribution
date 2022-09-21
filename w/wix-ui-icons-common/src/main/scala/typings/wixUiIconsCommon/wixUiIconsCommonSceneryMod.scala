package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.sceneryMod.SceneryProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonSceneryMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Scenery", JSImport.Default)
  @js.native
  val default: FC[SceneryProps] = js.native
  
  type _To = FC[SceneryProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonSceneryMod.foo` */
  override def _to: FC[SceneryProps] = default
}
