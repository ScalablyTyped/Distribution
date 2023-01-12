package typings.stronciumProcfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessIdMapRange extends StObject {
  
  var length: Double
  
  var start: Double
  
  var targetStart: Double
}
object ProcessIdMapRange {
  
  inline def apply(length: Double, start: Double, targetStart: Double): ProcessIdMapRange = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], targetStart = targetStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessIdMapRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProcessIdMapRange] (val x: Self) extends AnyVal {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setTargetStart(value: Double): Self = StObject.set(x, "targetStart", value.asInstanceOf[js.Any])
  }
}
