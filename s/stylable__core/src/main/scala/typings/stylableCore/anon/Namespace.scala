package typings.stylableCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Namespace extends StObject {
  
  var namespace: String
  
  var prefix: String
  
  var stylesheetPath: String
}
object Namespace {
  
  inline def apply(namespace: String, prefix: String, stylesheetPath: String): Namespace = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], stylesheetPath = stylesheetPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Namespace]
  }
  
  extension [Self <: Namespace](x: Self) {
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setStylesheetPath(value: String): Self = StObject.set(x, "stylesheetPath", value.asInstanceOf[js.Any])
  }
}
