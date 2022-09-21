package typings.webgme

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GmeUtil {
  
  trait Canon extends StObject {
    
    def parse(thing: Any): String
    
    def stringify(thing: Any): String
  }
  object Canon {
    
    inline def apply(parse: Any => String, stringify: Any => String): Canon = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
      __obj.asInstanceOf[Canon]
    }
    
    extension [Self <: Canon](x: Self) {
      
      inline def setParse(value: Any => String): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      inline def setStringify(value: Any => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
    }
  }
}
