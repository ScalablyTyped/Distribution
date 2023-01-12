package typings.three.examplesJsmLoadersIfcloaderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawLineData extends StObject {
  
  var ID: Double
  
  var arguments: js.Array[Any]
  
  var `type`: Double
}
object RawLineData {
  
  inline def apply(ID: Double, arguments: js.Array[Any], `type`: Double): RawLineData = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], arguments = arguments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawLineData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RawLineData] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: js.Array[Any]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsVarargs(value: Any*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
