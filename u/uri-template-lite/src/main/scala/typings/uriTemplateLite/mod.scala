package typings.uriTemplateLite

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("uri-template-lite", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object URI extends js.Object {
    
    def expand(template: String, data: StringDictionary[js.Any]): String = js.native
    
    @js.native
    class Template protected () extends js.Object {
      def this(template: String) = this()
      
      def expand(data: StringDictionary[js.Any]): String = js.native
      
      def `match`(template: String): StringDictionary[String] = js.native
    }
  }
}
