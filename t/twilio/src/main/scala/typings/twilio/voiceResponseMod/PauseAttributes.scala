package typings.twilio.voiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PauseAttributes extends StObject {
  
  var length: js.UndefOr[Double] = js.undefined
}
object PauseAttributes {
  
  inline def apply(): PauseAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PauseAttributes]
  }
  
  extension [Self <: PauseAttributes](x: Self) {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
  }
}
