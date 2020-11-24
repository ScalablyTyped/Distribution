package typings.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CHARGE_TYPE extends js.Object
@JSGlobal("Stronghold.CHARGE_TYPE")
@js.native
object CHARGE_TYPE extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CHARGE_TYPE with String] = js.native
  
  @js.native
  sealed trait BANK_DEBIT extends CHARGE_TYPE
  /* "bank_debit" */ @js.native
  object BANK_DEBIT extends TopLevel[BANK_DEBIT with String]
  
  @js.native
  sealed trait BANK_DEBIT_CUSTOMER_NOT_PRESENT extends CHARGE_TYPE
  /* "bank_debit_cnp" */ @js.native
  object BANK_DEBIT_CUSTOMER_NOT_PRESENT extends TopLevel[BANK_DEBIT_CUSTOMER_NOT_PRESENT with String]
}
