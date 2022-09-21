package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsMatchHeightMod.MatchHeightProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchHeightMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/MatchHeight", JSImport.Default)
  @js.native
  val default: FC[MatchHeightProps] = js.native
  
  type _To = FC[MatchHeightProps]
  
  /* This means you don't have to write `default`, but can instead just say `matchHeightMod.foo` */
  override def _to: FC[MatchHeightProps] = default
}
