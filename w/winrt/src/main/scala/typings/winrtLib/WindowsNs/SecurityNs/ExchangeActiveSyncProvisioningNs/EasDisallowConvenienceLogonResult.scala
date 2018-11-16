package typings
package winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EasDisallowConvenienceLogonResult extends js.Object

@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult")
@js.native
object EasDisallowConvenienceLogonResult extends js.Object {
  @js.native
  sealed trait canBeCompliant
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasDisallowConvenienceLogonResult
  
  @js.native
  sealed trait compliant
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasDisallowConvenienceLogonResult
  
  @js.native
  sealed trait notEvaluated
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasDisallowConvenienceLogonResult
  
  @js.native
  sealed trait requestedPolicyIsStricter
    extends winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasDisallowConvenienceLogonResult
  
  val canBeCompliant: canBeCompliant with java.lang.String = js.native
  val compliant: compliant with java.lang.String = js.native
  val notEvaluated: notEvaluated with java.lang.String = js.native
  val requestedPolicyIsStricter: requestedPolicyIsStricter with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.SecurityNs.ExchangeActiveSyncProvisioningNs.EasDisallowConvenienceLogonResult with java.lang.String
  ] = js.native
}

