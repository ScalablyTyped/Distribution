package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MuteEarphone extends StObject {
  
  /**
    * 是否静音耳机，默认值false
    */
  var muteEarphone: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 是否静音麦克风，默认值false
    */
  var muteMicrophone: js.UndefOr[Boolean] = js.undefined
}
object MuteEarphone {
  
  inline def apply(): MuteEarphone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MuteEarphone]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MuteEarphone] (val x: Self) extends AnyVal {
    
    inline def setMuteEarphone(value: Boolean): Self = StObject.set(x, "muteEarphone", value.asInstanceOf[js.Any])
    
    inline def setMuteEarphoneUndefined: Self = StObject.set(x, "muteEarphone", js.undefined)
    
    inline def setMuteMicrophone(value: Boolean): Self = StObject.set(x, "muteMicrophone", value.asInstanceOf[js.Any])
    
    inline def setMuteMicrophoneUndefined: Self = StObject.set(x, "muteMicrophone", js.undefined)
  }
}
