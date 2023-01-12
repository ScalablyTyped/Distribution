package typings.vueDevtoolsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallName extends StObject {
  
  var callName: String
  
  var inArgs: js.Array[Any]
  
  var outArgs: js.Array[Any]
}
object CallName {
  
  inline def apply(callName: String, inArgs: js.Array[Any], outArgs: js.Array[Any]): CallName = {
    val __obj = js.Dynamic.literal(callName = callName.asInstanceOf[js.Any], inArgs = inArgs.asInstanceOf[js.Any], outArgs = outArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CallName] (val x: Self) extends AnyVal {
    
    inline def setCallName(value: String): Self = StObject.set(x, "callName", value.asInstanceOf[js.Any])
    
    inline def setInArgs(value: js.Array[Any]): Self = StObject.set(x, "inArgs", value.asInstanceOf[js.Any])
    
    inline def setInArgsVarargs(value: Any*): Self = StObject.set(x, "inArgs", js.Array(value*))
    
    inline def setOutArgs(value: js.Array[Any]): Self = StObject.set(x, "outArgs", value.asInstanceOf[js.Any])
    
    inline def setOutArgsVarargs(value: Any*): Self = StObject.set(x, "outArgs", js.Array(value*))
  }
}
