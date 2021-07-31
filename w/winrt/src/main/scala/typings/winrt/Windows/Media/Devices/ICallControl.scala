package typings.winrt.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICallControl extends StObject {
  
  def endCall(callToken: Double): Unit
  
  var hasRinger: Boolean
  
  def indicateActiveCall(callToken: Double): Unit
  
  def indicateNewIncomingCall(enableRinger: Boolean, callerId: String): Double
  
  def indicateNewOutgoingCall(): Double
  
  var onanswerrequested: js.Any
  
  var onaudiotransferrequested: js.Any
  
  var ondialrequested: js.Any
  
  var onhanguprequested: js.Any
  
  var onkeypadpressed: js.Any
  
  var onredialrequested: js.Any
}
object ICallControl {
  
  @scala.inline
  def apply(
    endCall: Double => Unit,
    hasRinger: Boolean,
    indicateActiveCall: Double => Unit,
    indicateNewIncomingCall: (Boolean, String) => Double,
    indicateNewOutgoingCall: () => Double,
    onanswerrequested: js.Any,
    onaudiotransferrequested: js.Any,
    ondialrequested: js.Any,
    onhanguprequested: js.Any,
    onkeypadpressed: js.Any,
    onredialrequested: js.Any
  ): ICallControl = {
    val __obj = js.Dynamic.literal(endCall = js.Any.fromFunction1(endCall), hasRinger = hasRinger.asInstanceOf[js.Any], indicateActiveCall = js.Any.fromFunction1(indicateActiveCall), indicateNewIncomingCall = js.Any.fromFunction2(indicateNewIncomingCall), indicateNewOutgoingCall = js.Any.fromFunction0(indicateNewOutgoingCall), onanswerrequested = onanswerrequested.asInstanceOf[js.Any], onaudiotransferrequested = onaudiotransferrequested.asInstanceOf[js.Any], ondialrequested = ondialrequested.asInstanceOf[js.Any], onhanguprequested = onhanguprequested.asInstanceOf[js.Any], onkeypadpressed = onkeypadpressed.asInstanceOf[js.Any], onredialrequested = onredialrequested.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICallControl]
  }
  
  @scala.inline
  implicit class ICallControlMutableBuilder[Self <: ICallControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndCall(value: Double => Unit): Self = StObject.set(x, "endCall", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasRinger(value: Boolean): Self = StObject.set(x, "hasRinger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicateActiveCall(value: Double => Unit): Self = StObject.set(x, "indicateActiveCall", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIndicateNewIncomingCall(value: (Boolean, String) => Double): Self = StObject.set(x, "indicateNewIncomingCall", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIndicateNewOutgoingCall(value: () => Double): Self = StObject.set(x, "indicateNewOutgoingCall", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnanswerrequested(value: js.Any): Self = StObject.set(x, "onanswerrequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnaudiotransferrequested(value: js.Any): Self = StObject.set(x, "onaudiotransferrequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndialrequested(value: js.Any): Self = StObject.set(x, "ondialrequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnhanguprequested(value: js.Any): Self = StObject.set(x, "onhanguprequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnkeypadpressed(value: js.Any): Self = StObject.set(x, "onkeypadpressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnredialrequested(value: js.Any): Self = StObject.set(x, "onredialrequested", value.asInstanceOf[js.Any])
  }
}
