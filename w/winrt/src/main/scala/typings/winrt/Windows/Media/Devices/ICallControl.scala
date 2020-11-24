package typings.winrt.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICallControl extends js.Object {
  
  def endCall(callToken: Double): Unit = js.native
  
  var hasRinger: Boolean = js.native
  
  def indicateActiveCall(callToken: Double): Unit = js.native
  
  def indicateNewIncomingCall(enableRinger: Boolean, callerId: String): Double = js.native
  
  def indicateNewOutgoingCall(): Double = js.native
  
  var onanswerrequested: js.Any = js.native
  
  var onaudiotransferrequested: js.Any = js.native
  
  var ondialrequested: js.Any = js.native
  
  var onhanguprequested: js.Any = js.native
  
  var onkeypadpressed: js.Any = js.native
  
  var onredialrequested: js.Any = js.native
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
  implicit class ICallControlOps[Self <: ICallControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndCall(value: Double => Unit): Self = this.set("endCall", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasRinger(value: Boolean): Self = this.set("hasRinger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicateActiveCall(value: Double => Unit): Self = this.set("indicateActiveCall", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIndicateNewIncomingCall(value: (Boolean, String) => Double): Self = this.set("indicateNewIncomingCall", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIndicateNewOutgoingCall(value: () => Double): Self = this.set("indicateNewOutgoingCall", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnanswerrequested(value: js.Any): Self = this.set("onanswerrequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnaudiotransferrequested(value: js.Any): Self = this.set("onaudiotransferrequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndialrequested(value: js.Any): Self = this.set("ondialrequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnhanguprequested(value: js.Any): Self = this.set("onhanguprequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnkeypadpressed(value: js.Any): Self = this.set("onkeypadpressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnredialrequested(value: js.Any): Self = this.set("onredialrequested", value.asInstanceOf[js.Any])
  }
}
