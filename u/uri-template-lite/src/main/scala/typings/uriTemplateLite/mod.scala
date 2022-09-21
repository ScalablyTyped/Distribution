package typings.uriTemplateLite

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object URI {
    
    @JSImport("uri-template-lite", "URI")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("uri-template-lite", "URI.Template")
    @js.native
    open class Template protected () extends StObject {
      def this(template: String) = this()
      
      def expand(data: StringDictionary[Any]): String = js.native
      
      def `match`(template: String): StringDictionary[String] = js.native
    }
    
    inline def expand(template: String, data: StringDictionary[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
