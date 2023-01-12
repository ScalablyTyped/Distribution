package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICached extends StObject {
  
  var nextPos: Double
  
  var result: Any
}
object ICached {
  
  inline def apply(nextPos: Double, result: Any): ICached = {
    val __obj = js.Dynamic.literal(nextPos = nextPos.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICached]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICached] (val x: Self) extends AnyVal {
    
    inline def setNextPos(value: Double): Self = StObject.set(x, "nextPos", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
