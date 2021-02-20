package typings.uriTemplates

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uri-templates", JSImport.Namespace)
  @js.native
  def apply(template: String): URITemplate = js.native
  
  @js.native
  trait URITemplate extends StObject {
    
    def fill(callback: js.Function1[/* varName */ String, String]): String = js.native
    def fill(vars: StringDictionary[String | StringDictionary[String]]): String = js.native
    
    def fillFromObject(vars: StringDictionary[String | StringDictionary[String]]): String = js.native
    
    def fromUri(uri: String): StringDictionary[String] = js.native
    
    var template: String = js.native
    
    var varNames: js.Array[String] = js.native
  }
}
