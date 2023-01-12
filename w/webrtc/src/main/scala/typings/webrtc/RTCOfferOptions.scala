package typings.webrtc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#idl-def-rtcofferoptions
trait RTCOfferOptions
  extends StObject
     with RTCOfferAnswerOptions {
  
  var iceRestart: js.UndefOr[Boolean] = js.undefined
}
object RTCOfferOptions {
  
  inline def apply(): RTCOfferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCOfferOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCOfferOptions] (val x: Self) extends AnyVal {
    
    inline def setIceRestart(value: Boolean): Self = StObject.set(x, "iceRestart", value.asInstanceOf[js.Any])
    
    inline def setIceRestartUndefined: Self = StObject.set(x, "iceRestart", js.undefined)
  }
}
