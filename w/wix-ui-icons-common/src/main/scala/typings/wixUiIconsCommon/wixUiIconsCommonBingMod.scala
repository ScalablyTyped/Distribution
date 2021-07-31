package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.bingMod.BingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonBingMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Bing", JSImport.Default)
  @js.native
  val default: SFC[BingProps] = js.native
  
  type _To = SFC[BingProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonBingMod.foo` */
  override def _to: SFC[BingProps] = default
}
