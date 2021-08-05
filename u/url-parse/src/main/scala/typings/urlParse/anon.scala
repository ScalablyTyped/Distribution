package typings.urlParse

import typings.urlParse.mod.QueryParser
import typings.urlParse.mod.StringifyQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Parse extends StObject {
    
    def parse(query: String): js.Object
    @JSName("parse")
    var parse_Original: QueryParser
    
    def stringify(query: js.Object): String
    @JSName("stringify")
    var stringify_Original: StringifyQuery
  }
  object Parse {
    
    inline def apply(parse: /* query */ String => js.Object, stringify: /* query */ js.Object => String): Parse = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
      __obj.asInstanceOf[Parse]
    }
    
    extension [Self <: Parse](x: Self) {
      
      inline def setParse(value: /* query */ String => js.Object): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      inline def setStringify(value: /* query */ js.Object => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
    }
  }
  
  trait Protocol extends StObject {
    
    var protocol: String
    
    var rest: String
    
    var slashes: Boolean
  }
  object Protocol {
    
    inline def apply(protocol: String, rest: String, slashes: Boolean): Protocol = {
      val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], slashes = slashes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Protocol]
    }
    
    extension [Self <: Protocol](x: Self) {
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setRest(value: String): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
      
      inline def setSlashes(value: Boolean): Self = StObject.set(x, "slashes", value.asInstanceOf[js.Any])
    }
  }
}
