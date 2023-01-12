package typings.vueMarkdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultType extends StObject {
  
  var default: String
  
  var `type`: scala.Any
}
object DefaultType {
  
  inline def apply(default: String, `type`: scala.Any): DefaultType = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultType] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: scala.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
