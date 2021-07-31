package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.mobileMod.MobileProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonMobileMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Mobile", JSImport.Default)
  @js.native
  val default: SFC[MobileProps] = js.native
  
  type _To = SFC[MobileProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonMobileMod.foo` */
  override def _to: SFC[MobileProps] = default
}
