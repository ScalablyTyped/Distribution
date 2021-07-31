package typings.winrtUwp.Windows.Devices.SmartCards

import typings.std.Date
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a smart card personal identification number (PIN) reset request. */
trait SmartCardPinResetRequest extends StObject {
  
  /** Gets the smart card's challenge value. */
  var challenge: IBuffer
  
  /** Gets the length of time to wait before requesting the smart card personal identification number (PIN) reset. */
  var deadline: Date
  
  /**
    * Gets an instance of a wait time for a requested smart card personal identification number (PIN) reset.
    * @return An instance of a wait time for a requested smart card PIN reset.
    */
  def getDeferral(): SmartCardPinResetDeferral
  
  /**
    * Sets the response to a smart card authentication challenge/response operation.
    * @param response The response to a smart card authentication challenge/response operation.
    */
  def setResponse(response: IBuffer): Unit
}
object SmartCardPinResetRequest {
  
  @scala.inline
  def apply(
    challenge: IBuffer,
    deadline: Date,
    getDeferral: () => SmartCardPinResetDeferral,
    setResponse: IBuffer => Unit
  ): SmartCardPinResetRequest = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), setResponse = js.Any.fromFunction1(setResponse))
    __obj.asInstanceOf[SmartCardPinResetRequest]
  }
  
  @scala.inline
  implicit class SmartCardPinResetRequestMutableBuilder[Self <: SmartCardPinResetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChallenge(value: IBuffer): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeadline(value: Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDeferral(value: () => SmartCardPinResetDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetResponse(value: IBuffer => Unit): Self = StObject.set(x, "setResponse", js.Any.fromFunction1(value))
  }
}
