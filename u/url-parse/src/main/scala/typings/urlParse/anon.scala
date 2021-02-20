package typings.urlParse

import typings.urlParse.mod.QueryParser
import typings.urlParse.mod.StringifyQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Parse extends StObject {
    
    def parse(query: String): js.Object = js.native
    @JSName("parse")
    var parse_Original: QueryParser = js.native
    
    def stringify(query: js.Object): String = js.native
    @JSName("stringify")
    var stringify_Original: StringifyQuery = js.native
  }
  
  @js.native
  trait Protocol extends StObject {
    
    var protocol: String = js.native
    
    var rest: String = js.native
    
    var slashes: Boolean = js.native
  }
  object Protocol {
    
    @scala.inline
    def apply(protocol: String, rest: String, slashes: Boolean): Protocol = {
      val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], slashes = slashes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Protocol]
    }
    
    @scala.inline
    implicit class ProtocolMutableBuilder[Self <: Protocol] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRest(value: String): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlashes(value: Boolean): Self = StObject.set(x, "slashes", value.asInstanceOf[js.Any])
    }
  }
}
