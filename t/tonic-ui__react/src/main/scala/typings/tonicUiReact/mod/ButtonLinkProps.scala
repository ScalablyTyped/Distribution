package typings.tonicUiReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonLinkProps
  extends StObject
     with ButtonProps {
  
  var href: js.UndefOr[String] = js.undefined
}
object ButtonLinkProps {
  
  inline def apply(): ButtonLinkProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonLinkProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ButtonLinkProps] (val x: Self) extends AnyVal {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
  }
}
