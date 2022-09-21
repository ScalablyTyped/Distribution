package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsPaypalMod.PaypalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paypalMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Paypal", JSImport.Default)
  @js.native
  val default: FC[PaypalProps] = js.native
  
  type _To = FC[PaypalProps]
  
  /* This means you don't have to write `default`, but can instead just say `paypalMod.foo` */
  override def _to: FC[PaypalProps] = default
}
