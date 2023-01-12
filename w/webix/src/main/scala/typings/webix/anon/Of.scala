package typings.webix.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Of extends StObject {
  
  var of: String
  
  var page: String
}
object Of {
  
  inline def apply(of: String, page: String): Of = {
    val __obj = js.Dynamic.literal(of = of.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Of]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Of] (val x: Self) extends AnyVal {
    
    inline def setOf(value: String): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
  }
}
