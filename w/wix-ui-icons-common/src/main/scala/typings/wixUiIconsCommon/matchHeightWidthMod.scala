package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsMatchHeightWidthMod.MatchHeightWidthProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchHeightWidthMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/MatchHeight_Width", JSImport.Default)
  @js.native
  val default: FC[MatchHeightWidthProps] = js.native
  
  type _To = FC[MatchHeightWidthProps]
  
  /* This means you don't have to write `default`, but can instead just say `matchHeightWidthMod.foo` */
  override def _to: FC[MatchHeightWidthProps] = default
}
