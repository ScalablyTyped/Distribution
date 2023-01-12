package typings.trtcCallingJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 事件 */
trait EventMap extends StObject {
  
  var onCallEnd: Unit
  
  var onCallingCancel: Unit
  
  var onCallingTimeout: Unit
  
  var onError: Any
  
  var onInvited: InvitedInfo
  
  var onKickedOut: Unit
  
  var onLineBusy: UserInfo
  
  var onNoResp: UserInfo
  
  var onReject: UserInfo
  
  var onUserAudioAvailable: UserAudioInfo
  
  var onUserEnter: UserInfo
  
  var onUserLeave: UserInfo
  
  var onUserVideoAvailable: UserVideoInfo
}
object EventMap {
  
  inline def apply(
    onCallEnd: Unit,
    onCallingCancel: Unit,
    onCallingTimeout: Unit,
    onError: Any,
    onInvited: InvitedInfo,
    onKickedOut: Unit,
    onLineBusy: UserInfo,
    onNoResp: UserInfo,
    onReject: UserInfo,
    onUserAudioAvailable: UserAudioInfo,
    onUserEnter: UserInfo,
    onUserLeave: UserInfo,
    onUserVideoAvailable: UserVideoInfo
  ): EventMap = {
    val __obj = js.Dynamic.literal(onCallEnd = onCallEnd.asInstanceOf[js.Any], onCallingCancel = onCallingCancel.asInstanceOf[js.Any], onCallingTimeout = onCallingTimeout.asInstanceOf[js.Any], onError = onError.asInstanceOf[js.Any], onInvited = onInvited.asInstanceOf[js.Any], onKickedOut = onKickedOut.asInstanceOf[js.Any], onLineBusy = onLineBusy.asInstanceOf[js.Any], onNoResp = onNoResp.asInstanceOf[js.Any], onReject = onReject.asInstanceOf[js.Any], onUserAudioAvailable = onUserAudioAvailable.asInstanceOf[js.Any], onUserEnter = onUserEnter.asInstanceOf[js.Any], onUserLeave = onUserLeave.asInstanceOf[js.Any], onUserVideoAvailable = onUserVideoAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
    
    inline def setOnCallEnd(value: Unit): Self = StObject.set(x, "onCallEnd", value.asInstanceOf[js.Any])
    
    inline def setOnCallingCancel(value: Unit): Self = StObject.set(x, "onCallingCancel", value.asInstanceOf[js.Any])
    
    inline def setOnCallingTimeout(value: Unit): Self = StObject.set(x, "onCallingTimeout", value.asInstanceOf[js.Any])
    
    inline def setOnError(value: Any): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    inline def setOnInvited(value: InvitedInfo): Self = StObject.set(x, "onInvited", value.asInstanceOf[js.Any])
    
    inline def setOnKickedOut(value: Unit): Self = StObject.set(x, "onKickedOut", value.asInstanceOf[js.Any])
    
    inline def setOnLineBusy(value: UserInfo): Self = StObject.set(x, "onLineBusy", value.asInstanceOf[js.Any])
    
    inline def setOnNoResp(value: UserInfo): Self = StObject.set(x, "onNoResp", value.asInstanceOf[js.Any])
    
    inline def setOnReject(value: UserInfo): Self = StObject.set(x, "onReject", value.asInstanceOf[js.Any])
    
    inline def setOnUserAudioAvailable(value: UserAudioInfo): Self = StObject.set(x, "onUserAudioAvailable", value.asInstanceOf[js.Any])
    
    inline def setOnUserEnter(value: UserInfo): Self = StObject.set(x, "onUserEnter", value.asInstanceOf[js.Any])
    
    inline def setOnUserLeave(value: UserInfo): Self = StObject.set(x, "onUserLeave", value.asInstanceOf[js.Any])
    
    inline def setOnUserVideoAvailable(value: UserVideoInfo): Self = StObject.set(x, "onUserVideoAvailable", value.asInstanceOf[js.Any])
  }
}
