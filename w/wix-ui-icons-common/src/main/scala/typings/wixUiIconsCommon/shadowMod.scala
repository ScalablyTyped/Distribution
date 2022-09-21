package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsShadowMod.ShadowProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shadowMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Shadow", JSImport.Default)
  @js.native
  val default: FC[ShadowProps] = js.native
  
  type _To = FC[ShadowProps]
  
  /* This means you don't have to write `default`, but can instead just say `shadowMod.foo` */
  override def _to: FC[ShadowProps] = default
}
