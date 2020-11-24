package typings.strongholdPayJs.mod.global.Stronghold

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddPaymentSourceOptions extends Options {
  
  def onSuccess(paymentSource: PaymentSource): Unit = js.native
  @JSName("onSuccess")
  var onSuccess_Original: AddPaymentSourceOnSuccess = js.native
}
