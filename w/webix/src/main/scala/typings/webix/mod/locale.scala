package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait locale extends StObject {
  
  var pager: Any
}
object locale {
  
  @JSImport("webix", "locale")
  @js.native
  val ^ : typings.webix.webix.locale = js.native
  
  extension [Self <: locale](x: Self) {
    
    inline def setPager(value: Any): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
  }
}
