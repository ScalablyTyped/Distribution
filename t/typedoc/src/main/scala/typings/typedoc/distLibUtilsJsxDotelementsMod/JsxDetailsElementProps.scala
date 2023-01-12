package typings.typedoc.distLibUtilsJsxDotelementsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxDetailsElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var open: js.UndefOr[Boolean] = js.undefined
}
object JsxDetailsElementProps {
  
  inline def apply(): JsxDetailsElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxDetailsElementProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsxDetailsElementProps] (val x: Self) extends AnyVal {
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
