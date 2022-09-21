package typings.vueMarkdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeAny extends StObject {
  
  var `type`: scala.Any
}
object TypeAny {
  
  inline def apply(`type`: scala.Any): TypeAny = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeAny]
  }
  
  extension [Self <: TypeAny](x: Self) {
    
    inline def setType(value: scala.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
