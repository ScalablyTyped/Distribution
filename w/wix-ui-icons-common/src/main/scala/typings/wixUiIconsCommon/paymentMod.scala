package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.distSrcGeneralDistComponentsPaymentMod.PaymentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paymentMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Payment", JSImport.Default)
  @js.native
  val default: FC[PaymentProps] = js.native
  
  type _To = FC[PaymentProps]
  
  /* This means you don't have to write `default`, but can instead just say `paymentMod.foo` */
  override def _to: FC[PaymentProps] = default
}
