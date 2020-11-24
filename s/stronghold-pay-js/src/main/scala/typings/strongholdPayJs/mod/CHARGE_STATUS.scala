package typings.strongholdPayJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stronghold-pay-js", "CHARGE_STATUS")
@js.native
object CHARGE_STATUS extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS with String] = js.native
  
  /* "attempting_collection" */ val ATTEMPTING_COLLECTION: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.ATTEMPTING_COLLECTION with String = js.native
  
  /* "authorized" */ val AUTHORIZED: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.AUTHORIZED with String = js.native
  
  /* "canceled" */ val CANCELED: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.CANCELED with String = js.native
  
  /* "captured" */ val CAPTURED: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.CAPTURED with String = js.native
  
  /* "capture_failed" */ val CAPTURE_FAILED: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.CAPTURE_FAILED with String = js.native
  
  /* "created" */ val CREATED: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.CREATED with String = js.native
  
  /* "disputed" */ val DISPUTED: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.DISPUTED with String = js.native
  
  /* "refunded" */ val REFUNDED: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.REFUNDED with String = js.native
  
  /* "refund_pending" */ val REFUND_PENDING: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.REFUND_PENDING with String = js.native
}
