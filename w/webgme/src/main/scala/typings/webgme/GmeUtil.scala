package typings.webgme

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GmeUtil {
  
  trait Canon extends StObject {
    
    def parse(thing: js.Any): String
    
    def stringify(thing: js.Any): String
  }
  object Canon {
    
    inline def apply(parse: js.Any => String, stringify: js.Any => String): Canon = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
      __obj.asInstanceOf[Canon]
    }
    
    extension [Self <: Canon](x: Self) {
      
      inline def setParse(value: js.Any => String): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      inline def setStringify(value: js.Any => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
    }
  }
}
