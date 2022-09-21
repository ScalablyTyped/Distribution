package typings.tablestore.anon

import typings.tablestore.mod.EnumValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Points extends StObject {
  
  var fieldName: String
  
  var order: EnumValues[SORTORDERASC]
  
  var points: js.Array[String]
}
object Points {
  
  inline def apply(fieldName: String, order: EnumValues[SORTORDERASC], points: js.Array[String]): Points = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[Points]
  }
  
  extension [Self <: Points](x: Self) {
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: EnumValues[SORTORDERASC]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setPoints(value: js.Array[String]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: String*): Self = StObject.set(x, "points", js.Array(value*))
  }
}
