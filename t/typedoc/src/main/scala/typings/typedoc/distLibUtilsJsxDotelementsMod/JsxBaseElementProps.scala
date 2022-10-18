package typings.typedoc.distLibUtilsJsxDotelementsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxBaseElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var href: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
}
object JsxBaseElementProps {
  
  inline def apply(): JsxBaseElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxBaseElementProps]
  }
  
  extension [Self <: JsxBaseElementProps](x: Self) {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
