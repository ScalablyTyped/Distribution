package typings.twilio.voiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayAttributes extends StObject {
  
  var digits: js.UndefOr[String] = js.undefined
  
  var loop: js.UndefOr[Double] = js.undefined
}
object PlayAttributes {
  
  inline def apply(): PlayAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayAttributes]
  }
  
  extension [Self <: PlayAttributes](x: Self) {
    
    inline def setDigits(value: String): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
    
    inline def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
    
    inline def setLoop(value: Double): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
  }
}
