package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settings extends StObject {
  
  var config: obj
  
  def define(property: String, value: Any): Unit
  
  var name: String
}
object Settings {
  
  @JSImport("webix", "Settings")
  @js.native
  val ^ : Settings = js.native
  
  extension [Self <: Settings](x: Self) {
    
    inline def setConfig(value: obj): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setDefine(value: (String, Any) => Unit): Self = StObject.set(x, "define", js.Any.fromFunction2(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
