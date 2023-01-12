package typings.tabulatorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckboxParams
  extends StObject
     with SharedEditorParams
     with _EditorParams {
  
  var indeterminateValue: js.UndefOr[String] = js.undefined
  
  // tick
  var tristate: js.UndefOr[Boolean] = js.undefined
}
object CheckboxParams {
  
  inline def apply(): CheckboxParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboxParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckboxParams] (val x: Self) extends AnyVal {
    
    inline def setIndeterminateValue(value: String): Self = StObject.set(x, "indeterminateValue", value.asInstanceOf[js.Any])
    
    inline def setIndeterminateValueUndefined: Self = StObject.set(x, "indeterminateValue", js.undefined)
    
    inline def setTristate(value: Boolean): Self = StObject.set(x, "tristate", value.asInstanceOf[js.Any])
    
    inline def setTristateUndefined: Self = StObject.set(x, "tristate", js.undefined)
  }
}
