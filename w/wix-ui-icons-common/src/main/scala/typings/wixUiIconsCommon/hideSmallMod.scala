package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsHideSmallMod.HideSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hideSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/HideSmall", JSImport.Default)
  @js.native
  val default: FC[HideSmallProps] = js.native
  
  type _To = FC[HideSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `hideSmallMod.foo` */
  override def _to: FC[HideSmallProps] = default
}
