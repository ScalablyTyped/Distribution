package typings.vueRuntimeDom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var href: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
}
object BaseHTMLAttributes {
  
  inline def apply(): BaseHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseHTMLAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseHTMLAttributes] (val x: Self) extends AnyVal {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
