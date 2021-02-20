package typings.uriTemplateLite

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object URI {
    
    @JSImport("uri-template-lite", "URI.Template")
    @js.native
    class Template protected () extends StObject {
      def this(template: String) = this()
      
      def expand(data: StringDictionary[js.Any]): String = js.native
      
      def `match`(template: String): StringDictionary[String] = js.native
    }
    
    @JSImport("uri-template-lite", "URI.expand")
    @js.native
    def expand(template: String, data: StringDictionary[js.Any]): String = js.native
  }
}
