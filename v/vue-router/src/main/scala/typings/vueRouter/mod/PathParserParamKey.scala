package typings.vueRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A param in a url like `/users/:id`
  */
trait PathParserParamKey extends StObject {
  
  var name: String
  
  var optional: Boolean
  
  var repeatable: Boolean
}
object PathParserParamKey {
  
  inline def apply(name: String, optional: Boolean, repeatable: Boolean): PathParserParamKey = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], repeatable = repeatable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathParserParamKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathParserParamKey] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setRepeatable(value: Boolean): Self = StObject.set(x, "repeatable", value.asInstanceOf[js.Any])
  }
}
