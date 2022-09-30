package typings.testcafeHammerhead.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageInjectableResources extends StObject {
  
  var embeddedScripts: js.Array[String]
  
  var scripts: js.Array[String]
  
  var stylesheets: js.Array[String]
}
object PageInjectableResources {
  
  inline def apply(embeddedScripts: js.Array[String], scripts: js.Array[String], stylesheets: js.Array[String]): PageInjectableResources = {
    val __obj = js.Dynamic.literal(embeddedScripts = embeddedScripts.asInstanceOf[js.Any], scripts = scripts.asInstanceOf[js.Any], stylesheets = stylesheets.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageInjectableResources]
  }
  
  extension [Self <: PageInjectableResources](x: Self) {
    
    inline def setEmbeddedScripts(value: js.Array[String]): Self = StObject.set(x, "embeddedScripts", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedScriptsVarargs(value: String*): Self = StObject.set(x, "embeddedScripts", js.Array(value*))
    
    inline def setScripts(value: js.Array[String]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    inline def setScriptsVarargs(value: String*): Self = StObject.set(x, "scripts", js.Array(value*))
    
    inline def setStylesheets(value: js.Array[String]): Self = StObject.set(x, "stylesheets", value.asInstanceOf[js.Any])
    
    inline def setStylesheetsVarargs(value: String*): Self = StObject.set(x, "stylesheets", js.Array(value*))
  }
}
