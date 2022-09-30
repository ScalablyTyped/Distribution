package typings.testcafeHammerhead.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InjectableResources extends StObject {
  
  var scripts: js.Array[String]
  
  var styles: js.Array[String]
  
  var userScripts: js.Array[UserScript]
}
object InjectableResources {
  
  inline def apply(scripts: js.Array[String], styles: js.Array[String], userScripts: js.Array[UserScript]): InjectableResources = {
    val __obj = js.Dynamic.literal(scripts = scripts.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], userScripts = userScripts.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectableResources]
  }
  
  extension [Self <: InjectableResources](x: Self) {
    
    inline def setScripts(value: js.Array[String]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    inline def setScriptsVarargs(value: String*): Self = StObject.set(x, "scripts", js.Array(value*))
    
    inline def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value*))
    
    inline def setUserScripts(value: js.Array[UserScript]): Self = StObject.set(x, "userScripts", value.asInstanceOf[js.Any])
    
    inline def setUserScriptsVarargs(value: UserScript*): Self = StObject.set(x, "userScripts", js.Array(value*))
  }
}
