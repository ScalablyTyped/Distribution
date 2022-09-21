package typings.tablestore.mod

import typings.tablestore.anon.AfterModify
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnContent extends StObject {
  
  var returnColumns: js.UndefOr[js.Array[String]] = js.undefined
  
  var returnType: EnumValues[AfterModify]
}
object ReturnContent {
  
  inline def apply(returnType: EnumValues[AfterModify]): ReturnContent = {
    val __obj = js.Dynamic.literal(returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnContent]
  }
  
  extension [Self <: ReturnContent](x: Self) {
    
    inline def setReturnColumns(value: js.Array[String]): Self = StObject.set(x, "returnColumns", value.asInstanceOf[js.Any])
    
    inline def setReturnColumnsUndefined: Self = StObject.set(x, "returnColumns", js.undefined)
    
    inline def setReturnColumnsVarargs(value: String*): Self = StObject.set(x, "returnColumns", js.Array(value*))
    
    inline def setReturnType(value: EnumValues[AfterModify]): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
