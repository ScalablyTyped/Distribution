package typings.webgme

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GmeUtil {
  
  @js.native
  trait Canon extends StObject {
    
    def parse(thing: js.Any): String = js.native
    
    def stringify(thing: js.Any): String = js.native
  }
  object Canon {
    
    @scala.inline
    def apply(parse: js.Any => String, stringify: js.Any => String): Canon = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
      __obj.asInstanceOf[Canon]
    }
    
    @scala.inline
    implicit class CanonMutableBuilder[Self <: Canon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParse(value: js.Any => String): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStringify(value: js.Any => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
    }
  }
}
