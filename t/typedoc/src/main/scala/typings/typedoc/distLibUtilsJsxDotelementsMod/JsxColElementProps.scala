package typings.typedoc.distLibUtilsJsxDotelementsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxColElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var span: js.UndefOr[Double] = js.undefined
}
object JsxColElementProps {
  
  inline def apply(): JsxColElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxColElementProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsxColElementProps] (val x: Self) extends AnyVal {
    
    inline def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
  }
}
