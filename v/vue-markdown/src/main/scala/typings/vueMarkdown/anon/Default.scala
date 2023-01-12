package typings.vueMarkdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Default extends StObject {
  
  var default: scala.Any
  
  var `type`: scala.Any
}
object Default {
  
  inline def apply(default: scala.Any, `type`: scala.Any): Default = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: scala.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: scala.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
