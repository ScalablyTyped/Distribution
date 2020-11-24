package typings.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CHARGE_STATUS extends js.Object
@JSGlobal("Stronghold.CHARGE_STATUS")
@js.native
object CHARGE_STATUS extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CHARGE_STATUS with String] = js.native
  
  @js.native
  sealed trait ATTEMPTING_COLLECTION extends CHARGE_STATUS
  /* "attempting_collection" */ @js.native
  object ATTEMPTING_COLLECTION extends TopLevel[ATTEMPTING_COLLECTION with String]
  
  @js.native
  sealed trait AUTHORIZED extends CHARGE_STATUS
  /* "authorized" */ @js.native
  object AUTHORIZED extends TopLevel[AUTHORIZED with String]
  
  @js.native
  sealed trait CANCELED extends CHARGE_STATUS
  /* "canceled" */ @js.native
  object CANCELED extends TopLevel[CANCELED with String]
  
  @js.native
  sealed trait CAPTURED extends CHARGE_STATUS
  /* "captured" */ @js.native
  object CAPTURED extends TopLevel[CAPTURED with String]
  
  @js.native
  sealed trait CAPTURE_FAILED extends CHARGE_STATUS
  /* "capture_failed" */ @js.native
  object CAPTURE_FAILED extends TopLevel[CAPTURE_FAILED with String]
  
  @js.native
  sealed trait CREATED extends CHARGE_STATUS
  /* "created" */ @js.native
  object CREATED extends TopLevel[CREATED with String]
  
  @js.native
  sealed trait DISPUTED extends CHARGE_STATUS
  /* "disputed" */ @js.native
  object DISPUTED extends TopLevel[DISPUTED with String]
  
  @js.native
  sealed trait REFUNDED extends CHARGE_STATUS
  /* "refunded" */ @js.native
  object REFUNDED extends TopLevel[REFUNDED with String]
  
  @js.native
  sealed trait REFUND_PENDING extends CHARGE_STATUS
  /* "refund_pending" */ @js.native
  object REFUND_PENDING extends TopLevel[REFUND_PENDING with String]
}
