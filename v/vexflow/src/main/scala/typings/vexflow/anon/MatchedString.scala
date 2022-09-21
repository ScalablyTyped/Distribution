package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchedString extends StObject {
  
  var incrementPos: Unit
  
  var matchedString: Unit
  
  var pos: Any
  
  var success: Boolean
}
object MatchedString {
  
  inline def apply(incrementPos: Unit, matchedString: Unit, pos: Any, success: Boolean): MatchedString = {
    val __obj = js.Dynamic.literal(incrementPos = incrementPos.asInstanceOf[js.Any], matchedString = matchedString.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchedString]
  }
  
  extension [Self <: MatchedString](x: Self) {
    
    inline def setIncrementPos(value: Unit): Self = StObject.set(x, "incrementPos", value.asInstanceOf[js.Any])
    
    inline def setMatchedString(value: Unit): Self = StObject.set(x, "matchedString", value.asInstanceOf[js.Any])
    
    inline def setPos(value: Any): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
