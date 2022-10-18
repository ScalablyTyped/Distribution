package typings.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterClause extends StObject {
  
  var fieldName: String
  
  var index: Double
  
  var logicalOperator: String
  
  var operator: String
  
  var value: String
}
object FilterClause {
  
  inline def apply(fieldName: String, index: Double, logicalOperator: String, operator: String, value: String): FilterClause = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], logicalOperator = logicalOperator.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterClause]
  }
  
  extension [Self <: FilterClause](x: Self) {
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setLogicalOperator(value: String): Self = StObject.set(x, "logicalOperator", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
