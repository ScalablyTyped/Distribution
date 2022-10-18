package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of a mobile broadband PIN operation. */
/* note: abstract class */ @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandPinOperationResult")
@js.native
open class MobileBroadbandPinOperationResult ()
  extends StObject
     with typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinOperationResult {
  
  /** Gets the number of PIN entry attempts remaining until the mobile broadband PIN is blocked. */
  /* CompleteClass */
  var attemptsRemaining: Double = js.native
  
  /** Gets a value indicating whether the PIN operation was successful. */
  /* CompleteClass */
  var isSuccessful: Boolean = js.native
}
