package typings.tsStructureModel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodModel extends StObject {
  
  var arguments: js.Array[ParameterModel]
  
  var end: Double
  
  var name: String
  
  var returnType: TypeModel
  
  var start: Double
  
  var text: String
}
object MethodModel {
  
  inline def apply(
    arguments: js.Array[ParameterModel],
    end: Double,
    name: String,
    returnType: TypeModel,
    start: Double,
    text: String
  ): MethodModel = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodModel]
  }
  
  extension [Self <: MethodModel](x: Self) {
    
    inline def setArguments(value: js.Array[ParameterModel]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsVarargs(value: ParameterModel*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReturnType(value: TypeModel): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
