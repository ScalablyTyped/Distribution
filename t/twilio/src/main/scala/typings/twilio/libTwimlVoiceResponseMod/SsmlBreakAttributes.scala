package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SsmlBreakAttributes extends StObject {
  
  /** strength - Set a pause based on strength */
  var strength: js.UndefOr[SsmlBreakStrength] = js.undefined
  
  /** time - Set a pause to a specific length of time in seconds or milliseconds, available values: [number]s, [number]ms */
  var time: js.UndefOr[String] = js.undefined
}
object SsmlBreakAttributes {
  
  inline def apply(): SsmlBreakAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SsmlBreakAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SsmlBreakAttributes] (val x: Self) extends AnyVal {
    
    inline def setStrength(value: SsmlBreakStrength): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    inline def setStrengthUndefined: Self = StObject.set(x, "strength", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
