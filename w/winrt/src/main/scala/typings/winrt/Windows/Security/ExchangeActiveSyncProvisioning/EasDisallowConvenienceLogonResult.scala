package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EasDisallowConvenienceLogonResult extends js.Object

@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult")
@js.native
object EasDisallowConvenienceLogonResult extends js.Object {
  @js.native
  sealed trait canBeCompliant extends EasDisallowConvenienceLogonResult
  
  @js.native
  sealed trait compliant extends EasDisallowConvenienceLogonResult
  
  @js.native
  sealed trait notEvaluated extends EasDisallowConvenienceLogonResult
  
  @js.native
  sealed trait requestedPolicyIsStricter extends EasDisallowConvenienceLogonResult
  
}

