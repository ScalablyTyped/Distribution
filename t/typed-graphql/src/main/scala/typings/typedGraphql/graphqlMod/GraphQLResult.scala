package typings.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphQLResult extends StObject {
  
  var data: js.UndefOr[Any] = js.undefined
  
  var errors: js.UndefOr[js.Array[js.Error]] = js.undefined
}
object GraphQLResult {
  
  inline def apply(): GraphQLResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQLResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphQLResult] (val x: Self) extends AnyVal {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setErrors(value: js.Array[js.Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: js.Error*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
