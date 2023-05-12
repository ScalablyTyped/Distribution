package typings.undici.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Argument extends StObject {
  
  var argument: String
  
  var prefix: String
  
  var types: js.Array[String]
}
object Argument {
  
  inline def apply(argument: String, prefix: String, types: js.Array[String]): Argument = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Argument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Argument] (val x: Self) extends AnyVal {
    
    inline def setArgument(value: String): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
