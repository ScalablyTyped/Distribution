package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.vignetteMod.VignetteProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonVignetteMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Vignette", JSImport.Default)
  @js.native
  val default: FC[VignetteProps] = js.native
  
  type _To = FC[VignetteProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonVignetteMod.foo` */
  override def _to: FC[VignetteProps] = default
}
