package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncrementPos extends StObject {
  
  var incrementPos: Any
  
  var matchedString: Any
  
  var pos: Any
  
  var success: Boolean
}
object IncrementPos {
  
  inline def apply(incrementPos: Any, matchedString: Any, pos: Any, success: Boolean): IncrementPos = {
    val __obj = js.Dynamic.literal(incrementPos = incrementPos.asInstanceOf[js.Any], matchedString = matchedString.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncrementPos]
  }
  
  extension [Self <: IncrementPos](x: Self) {
    
    inline def setIncrementPos(value: Any): Self = StObject.set(x, "incrementPos", value.asInstanceOf[js.Any])
    
    inline def setMatchedString(value: Any): Self = StObject.set(x, "matchedString", value.asInstanceOf[js.Any])
    
    inline def setPos(value: Any): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
