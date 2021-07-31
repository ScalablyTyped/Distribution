package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.invoiceMod.InvoiceProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonInvoiceMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Invoice", JSImport.Default)
  @js.native
  val default: SFC[InvoiceProps] = js.native
  
  type _To = SFC[InvoiceProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonInvoiceMod.foo` */
  override def _to: SFC[InvoiceProps] = default
}
