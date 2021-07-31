package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of a mobile broadband PIN operation. */
trait MobileBroadbandPinOperationResult extends StObject {
  
  /** Gets the number of PIN entry attempts remaining until the mobile broadband PIN is blocked. */
  var attemptsRemaining: Double
  
  /** Gets a value indicating whether the PIN operation was successful. */
  var isSuccessful: Boolean
}
object MobileBroadbandPinOperationResult {
  
  @scala.inline
  def apply(attemptsRemaining: Double, isSuccessful: Boolean): MobileBroadbandPinOperationResult = {
    val __obj = js.Dynamic.literal(attemptsRemaining = attemptsRemaining.asInstanceOf[js.Any], isSuccessful = isSuccessful.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandPinOperationResult]
  }
  
  @scala.inline
  implicit class MobileBroadbandPinOperationResultMutableBuilder[Self <: MobileBroadbandPinOperationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttemptsRemaining(value: Double): Self = StObject.set(x, "attemptsRemaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSuccessful(value: Boolean): Self = StObject.set(x, "isSuccessful", value.asInstanceOf[js.Any])
  }
}
