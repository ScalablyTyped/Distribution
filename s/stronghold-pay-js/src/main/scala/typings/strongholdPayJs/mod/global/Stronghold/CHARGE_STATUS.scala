package typings.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CHARGE_STATUS extends StObject
@JSGlobal("Stronghold.CHARGE_STATUS")
@js.native
object CHARGE_STATUS extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CHARGE_STATUS with String] = js.native
  
  @js.native
  sealed trait ATTEMPTING_COLLECTION extends CHARGE_STATUS
  /* "attempting_collection" */ val ATTEMPTING_COLLECTION: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.ATTEMPTING_COLLECTION with String = js.native
  
  @js.native
  sealed trait AUTHORIZED extends CHARGE_STATUS
  /* "authorized" */ val AUTHORIZED: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.AUTHORIZED with String = js.native
  
  @js.native
  sealed trait CANCELED extends CHARGE_STATUS
  /* "canceled" */ val CANCELED: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.CANCELED with String = js.native
  
  @js.native
  sealed trait CAPTURED extends CHARGE_STATUS
  /* "captured" */ val CAPTURED: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.CAPTURED with String = js.native
  
  @js.native
  sealed trait CAPTURE_FAILED extends CHARGE_STATUS
  /* "capture_failed" */ val CAPTURE_FAILED: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.CAPTURE_FAILED with String = js.native
  
  @js.native
  sealed trait CREATED extends CHARGE_STATUS
  /* "created" */ val CREATED: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.CREATED with String = js.native
  
  @js.native
  sealed trait DISPUTED extends CHARGE_STATUS
  /* "disputed" */ val DISPUTED: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.DISPUTED with String = js.native
  
  @js.native
  sealed trait REFUNDED extends CHARGE_STATUS
  /* "refunded" */ val REFUNDED: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.REFUNDED with String = js.native
  
  @js.native
  sealed trait REFUND_PENDING extends CHARGE_STATUS
  /* "refund_pending" */ val REFUND_PENDING: typings.strongholdPayJs.mod.global.Stronghold.CHARGE_STATUS.REFUND_PENDING with String = js.native
}
