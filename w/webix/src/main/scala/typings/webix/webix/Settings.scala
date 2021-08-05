package typings.webix.webix

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settings extends StObject {
  
  var config: StringDictionary[js.Any]
  
  def define(property: String, value: js.Any): Unit
  
  var name: String
}
object Settings {
  
  inline def apply(config: StringDictionary[js.Any], define: (String, js.Any) => Unit, name: String): Settings = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], define = js.Any.fromFunction2(define), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  
  extension [Self <: Settings](x: Self) {
    
    inline def setConfig(value: StringDictionary[js.Any]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setDefine(value: (String, js.Any) => Unit): Self = StObject.set(x, "define", js.Any.fromFunction2(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
