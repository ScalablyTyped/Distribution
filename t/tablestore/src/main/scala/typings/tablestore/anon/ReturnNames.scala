package typings.tablestore.anon

import typings.tablestore.mod.EnumValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnNames extends StObject {
  
  var returnNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var returnType: EnumValues[RETURNALL]
}
object ReturnNames {
  
  inline def apply(returnType: EnumValues[RETURNALL]): ReturnNames = {
    val __obj = js.Dynamic.literal(returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnNames]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnNames] (val x: Self) extends AnyVal {
    
    inline def setReturnNames(value: js.Array[String]): Self = StObject.set(x, "returnNames", value.asInstanceOf[js.Any])
    
    inline def setReturnNamesUndefined: Self = StObject.set(x, "returnNames", js.undefined)
    
    inline def setReturnNamesVarargs(value: String*): Self = StObject.set(x, "returnNames", js.Array(value*))
    
    inline def setReturnType(value: EnumValues[RETURNALL]): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
