package typings.strongholdPayJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stronghold-pay-js", "CHARGE_STATUS")
@js.native
object CHARGE_STATUS extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS & String] = js.native
  
  /* "attempting_collection" */ val ATTEMPTING_COLLECTION: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.ATTEMPTING_COLLECTION & String = js.native
  
  /* "authorized" */ val AUTHORIZED: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.AUTHORIZED & String = js.native
  
  /* "canceled" */ val CANCELED: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.CANCELED & String = js.native
  
  /* "captured" */ val CAPTURED: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.CAPTURED & String = js.native
  
  /* "capture_failed" */ val CAPTURE_FAILED: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.CAPTURE_FAILED & String = js.native
  
  /* "created" */ val CREATED: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.CREATED & String = js.native
  
  /* "disputed" */ val DISPUTED: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.DISPUTED & String = js.native
  
  /* "refunded" */ val REFUNDED: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.REFUNDED & String = js.native
  
  /* "refund_pending" */ val REFUND_PENDING: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.REFUND_PENDING & String = js.native
}
