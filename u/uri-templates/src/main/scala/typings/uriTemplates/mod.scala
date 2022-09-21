package typings.uriTemplates

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(template: String): URITemplate = ^.asInstanceOf[js.Dynamic].apply(template.asInstanceOf[js.Any]).asInstanceOf[URITemplate]
  
  @JSImport("uri-templates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait URITemplate extends StObject {
    
    def fill(callback: js.Function1[/* varName */ String, String]): String = js.native
    def fill(vars: StringDictionary[String | StringDictionary[String]]): String = js.native
    
    def fillFromObject(vars: StringDictionary[String | StringDictionary[String]]): String = js.native
    
    def fromUri(uri: String): js.UndefOr[StringDictionary[String]] = js.native
    
    var template: String = js.native
    
    var varNames: js.Array[String] = js.native
  }
}
