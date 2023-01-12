package typings.vegaTypings.typesRuntimeRuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompareParam
  extends StObject
     with BuiltinParameter {
  
  /**
    * Fields to compare on
    */
  @JSName("$compare")
  var $compare: OrArray[String]
  
  @JSName("$order")
  var $order: OrArray[Order]
}
object CompareParam {
  
  inline def apply($compare: OrArray[String], $order: OrArray[Order]): CompareParam = {
    val __obj = js.Dynamic.literal($compare = $compare.asInstanceOf[js.Any], $order = $order.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompareParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompareParam] (val x: Self) extends AnyVal {
    
    inline def set$compare(value: OrArray[String]): Self = StObject.set(x, "$compare", value.asInstanceOf[js.Any])
    
    inline def set$compareVarargs(value: String*): Self = StObject.set(x, "$compare", js.Array(value*))
    
    inline def set$order(value: OrArray[Order]): Self = StObject.set(x, "$order", value.asInstanceOf[js.Any])
    
    inline def set$orderVarargs(value: Order*): Self = StObject.set(x, "$order", js.Array(value*))
  }
}
