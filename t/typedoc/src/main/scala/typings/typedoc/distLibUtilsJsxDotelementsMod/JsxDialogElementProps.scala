package typings.typedoc.distLibUtilsJsxDotelementsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxDialogElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var open: js.UndefOr[Boolean] = js.undefined
}
object JsxDialogElementProps {
  
  inline def apply(): JsxDialogElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxDialogElementProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsxDialogElementProps] (val x: Self) extends AnyVal {
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
