package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.paymentMod.PaymentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonPaymentMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Payment", JSImport.Default)
  @js.native
  val default: SFC[PaymentProps] = js.native
  
  type _To = SFC[PaymentProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonPaymentMod.foo` */
  override def _to: SFC[PaymentProps] = default
}
