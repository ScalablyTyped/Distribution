package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeLine extends StObject {
  
  var code: String
  
  var line: Double
  
  var point: Double
}
object CodeLine {
  
  inline def apply(code: String, line: Double, point: Double): CodeLine = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeLine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeLine] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: Double): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
  }
}
