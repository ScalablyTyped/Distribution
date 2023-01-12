package typings.tengitsui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableEditorOpts extends StObject {
  
  var allowClear: js.UndefOr[Boolean] = js.undefined
  
  var mode: js.UndefOr[FeildMode] = js.undefined
}
object TableEditorOpts {
  
  inline def apply(): TableEditorOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableEditorOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableEditorOpts] (val x: Self) extends AnyVal {
    
    inline def setAllowClear(value: Boolean): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
    
    inline def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
    
    inline def setMode(value: FeildMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
