package typings.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EasDisallowConvenienceLogonResult extends StObject
@JSGlobal("Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult")
@js.native
object EasDisallowConvenienceLogonResult extends StObject {
  
  @js.native
  sealed trait canBeCompliant extends EasDisallowConvenienceLogonResult
  
  @js.native
  sealed trait compliant extends EasDisallowConvenienceLogonResult
  
  @js.native
  sealed trait notEvaluated extends EasDisallowConvenienceLogonResult
  
  @js.native
  sealed trait requestedPolicyIsStricter extends EasDisallowConvenienceLogonResult
}
