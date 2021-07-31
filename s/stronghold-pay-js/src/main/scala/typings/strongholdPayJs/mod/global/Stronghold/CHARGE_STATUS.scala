package typings.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CHARGE_STATUS extends StObject
@JSGlobal("Stronghold.CHARGE_STATUS")
@js.native
object CHARGE_STATUS extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CHARGE_STATUS & String] = js.native
  
  @js.native
  sealed trait ATTEMPTING_COLLECTION
    extends StObject
       with CHARGE_STATUS
  /* "attempting_collection" */ val ATTEMPTING_COLLECTION: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.ATTEMPTING_COLLECTION & String = js.native
  
  @js.native
  sealed trait AUTHORIZED
    extends StObject
       with CHARGE_STATUS
  /* "authorized" */ val AUTHORIZED: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.AUTHORIZED & String = js.native
  
  @js.native
  sealed trait CANCELED
    extends StObject
       with CHARGE_STATUS
  /* "canceled" */ val CANCELED: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.CANCELED & String = js.native
  
  @js.native
  sealed trait CAPTURED
    extends StObject
       with CHARGE_STATUS
  /* "captured" */ val CAPTURED: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.CAPTURED & String = js.native
  
  @js.native
  sealed trait CAPTURE_FAILED
    extends StObject
       with CHARGE_STATUS
  /* "capture_failed" */ val CAPTURE_FAILED: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.CAPTURE_FAILED & String = js.native
  
  @js.native
  sealed trait CREATED
    extends StObject
       with CHARGE_STATUS
  /* "created" */ val CREATED: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.CREATED & String = js.native
  
  @js.native
  sealed trait DISPUTED
    extends StObject
       with CHARGE_STATUS
  /* "disputed" */ val DISPUTED: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.DISPUTED & String = js.native
  
  @js.native
  sealed trait REFUNDED
    extends StObject
       with CHARGE_STATUS
  /* "refunded" */ val REFUNDED: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.REFUNDED & String = js.native
  
  @js.native
  sealed trait REFUND_PENDING
    extends StObject
       with CHARGE_STATUS
  /* "refund_pending" */ val REFUND_PENDING: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.REFUND_PENDING & String = js.native
}
