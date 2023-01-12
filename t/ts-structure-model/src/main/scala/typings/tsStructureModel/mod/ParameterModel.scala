package typings.tsStructureModel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterModel extends StObject {
  
  var end: Double
  
  var name: String
  
  var start: Double
  
  var text: String
  
  var `type`: TypeModel
}
object ParameterModel {
  
  inline def apply(end: Double, name: String, start: Double, text: String, `type`: TypeModel): ParameterModel = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParameterModel] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: TypeModel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
