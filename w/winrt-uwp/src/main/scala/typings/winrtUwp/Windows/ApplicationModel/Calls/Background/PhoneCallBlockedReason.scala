package typings.winrtUwp.Windows.ApplicationModel.Calls.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhoneCallBlockedReason extends StObject
/** Provides the reason why a phone call was rejected. */
@JSGlobal("Windows.ApplicationModel.Calls.Background.PhoneCallBlockedReason")
@js.native
object PhoneCallBlockedReason extends StObject {
  
  /** The call was rejected because it was in the blocking list. */
  @js.native
  sealed trait inCallBlockingList extends PhoneCallBlockedReason
  
  /** The call was rejected because it was a private number and private numbers are blocked. */
  @js.native
  sealed trait privateNumber extends PhoneCallBlockedReason
  
  /** The call was rejected because it was an unknown number and unknown numbers are blocked. */
  @js.native
  sealed trait unknownNumber extends PhoneCallBlockedReason
}
