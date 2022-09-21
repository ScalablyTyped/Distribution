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
  
  var onanswerrequested: Any
  
  var onaudiotransferrequested: Any
  
  var ondialrequested: Any
  
  var onhanguprequested: Any
  
  var onkeypadpressed: Any
  
  var onredialrequested: Any
}
object ICallControl {
  
  inline def apply(
    endCall: Double => Unit,
    hasRinger: Boolean,
    indicateActiveCall: Double => Unit,
    indicateNewIncomingCall: (Boolean, String) => Double,
    indicateNewOutgoingCall: () => Double,
    onanswerrequested: Any,
    onaudiotransferrequested: Any,
    ondialrequested: Any,
    onhanguprequested: Any,
    onkeypadpressed: Any,
    onredialrequested: Any
  ): ICallControl = {
    val __obj = js.Dynamic.literal(endCall = js.Any.fromFunction1(endCall), hasRinger = hasRinger.asInstanceOf[js.Any], indicateActiveCall = js.Any.fromFunction1(indicateActiveCall), indicateNewIncomingCall = js.Any.fromFunction2(indicateNewIncomingCall), indicateNewOutgoingCall = js.Any.fromFunction0(indicateNewOutgoingCall), onanswerrequested = onanswerrequested.asInstanceOf[js.Any], onaudiotransferrequested = onaudiotransferrequested.asInstanceOf[js.Any], ondialrequested = ondialrequested.asInstanceOf[js.Any], onhanguprequested = onhanguprequested.asInstanceOf[js.Any], onkeypadpressed = onkeypadpressed.asInstanceOf[js.Any], onredialrequested = onredialrequested.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICallControl]
  }
  
  extension [Self <: ICallControl](x: Self) {
    
    inline def setEndCall(value: Double => Unit): Self = StObject.set(x, "endCall", js.Any.fromFunction1(value))
    
    inline def setHasRinger(value: Boolean): Self = StObject.set(x, "hasRinger", value.asInstanceOf[js.Any])
    
    inline def setIndicateActiveCall(value: Double => Unit): Self = StObject.set(x, "indicateActiveCall", js.Any.fromFunction1(value))
    
    inline def setIndicateNewIncomingCall(value: (Boolean, String) => Double): Self = StObject.set(x, "indicateNewIncomingCall", js.Any.fromFunction2(value))
    
    inline def setIndicateNewOutgoingCall(value: () => Double): Self = StObject.set(x, "indicateNewOutgoingCall", js.Any.fromFunction0(value))
    
    inline def setOnanswerrequested(value: Any): Self = StObject.set(x, "onanswerrequested", value.asInstanceOf[js.Any])
    
    inline def setOnaudiotransferrequested(value: Any): Self = StObject.set(x, "onaudiotransferrequested", value.asInstanceOf[js.Any])
    
    inline def setOndialrequested(value: Any): Self = StObject.set(x, "ondialrequested", value.asInstanceOf[js.Any])
    
    inline def setOnhanguprequested(value: Any): Self = StObject.set(x, "onhanguprequested", value.asInstanceOf[js.Any])
    
    inline def setOnkeypadpressed(value: Any): Self = StObject.set(x, "onkeypadpressed", value.asInstanceOf[js.Any])
    
    inline def setOnredialrequested(value: Any): Self = StObject.set(x, "onredialrequested", value.asInstanceOf[js.Any])
  }
}
