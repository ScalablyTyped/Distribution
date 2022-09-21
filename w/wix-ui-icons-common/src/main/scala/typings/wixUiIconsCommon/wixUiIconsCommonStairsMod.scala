package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.stairsMod.StairsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonStairsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Stairs", JSImport.Default)
  @js.native
  val default: FC[StairsProps] = js.native
  
  type _To = FC[StairsProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonStairsMod.foo` */
  override def _to: FC[StairsProps] = default
}
