package typings.typedoc.jsxElementsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxLabelElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var `for`: js.UndefOr[String] = js.undefined
}
object JsxLabelElementProps {
  
  inline def apply(): JsxLabelElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxLabelElementProps]
  }
  
  extension [Self <: JsxLabelElementProps](x: Self) {
    
    inline def setFor(value: String): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
    
    inline def setForUndefined: Self = StObject.set(x, "for", js.undefined)
  }
}
