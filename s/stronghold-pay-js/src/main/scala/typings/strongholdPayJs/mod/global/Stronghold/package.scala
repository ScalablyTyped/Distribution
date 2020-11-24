package typings.strongholdPayJs.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Stronghold {
  
  type AddPaymentSourceOnSuccess = js.Function1[
    /* paymentSource */ typings.strongholdPayJs.mod.global.Stronghold.PaymentSource, 
    scala.Unit
  ]
  
  type ChargeOnSuccess = js.Function1[/* charge */ typings.strongholdPayJs.mod.global.Stronghold.Charge, scala.Unit]
  
  type OnError = js.Function1[
    /* error */ typings.strongholdPayJs.mod.global.Stronghold.StrongholdPayError, 
    scala.Unit
  ]
  
  type OnEvent = js.Function1[
    /* event */ typings.strongholdPayJs.mod.global.Stronghold.StrongholdMessageEvent, 
    scala.Unit
  ]
  
  type OnExit = js.Function0[scala.Unit]
  
  type OnReady = js.Function0[scala.Unit]
  
  type TipOnSuccess = js.Function1[/* tip */ typings.strongholdPayJs.mod.global.Stronghold.Tip, scala.Unit]
  
  type UpdatePaymentSourceOnSuccess = js.Function1[
    /* paymentSource */ typings.strongholdPayJs.mod.global.Stronghold.PaymentSource, 
    scala.Unit
  ]
}
