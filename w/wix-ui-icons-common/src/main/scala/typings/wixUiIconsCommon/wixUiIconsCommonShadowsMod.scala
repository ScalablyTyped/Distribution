package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.shadowsMod.ShadowsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonShadowsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Shadows", JSImport.Default)
  @js.native
  val default: FC[ShadowsProps] = js.native
  
  type _To = FC[ShadowsProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonShadowsMod.foo` */
  override def _to: FC[ShadowsProps] = default
}
