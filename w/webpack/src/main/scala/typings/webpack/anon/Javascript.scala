package typings.webpack.anon

import typings.webpack.mod.ModuleTemplate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Javascript extends StObject {
  
  var javascript: ModuleTemplate
}
object Javascript {
  
  inline def apply(javascript: ModuleTemplate): Javascript = {
    val __obj = js.Dynamic.literal(javascript = javascript.asInstanceOf[js.Any])
    __obj.asInstanceOf[Javascript]
  }
  
  extension [Self <: Javascript](x: Self) {
    
    inline def setJavascript(value: ModuleTemplate): Self = StObject.set(x, "javascript", value.asInstanceOf[js.Any])
  }
}
