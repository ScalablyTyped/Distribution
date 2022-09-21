package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsAppMarketMod.AppMarketProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appMarketMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/AppMarket", JSImport.Default)
  @js.native
  val default: FC[AppMarketProps] = js.native
  
  type _To = FC[AppMarketProps]
  
  /* This means you don't have to write `default`, but can instead just say `appMarketMod.foo` */
  override def _to: FC[AppMarketProps] = default
}
