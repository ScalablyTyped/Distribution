package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.composeMod.ComposeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonComposeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Compose", JSImport.Default)
  @js.native
  val default: SFC[ComposeProps] = js.native
  
  type _To = SFC[ComposeProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonComposeMod.foo` */
  override def _to: SFC[ComposeProps] = default
}
