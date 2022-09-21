package typings.tengitsui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseProps
  extends StObject
     with RangePickerProps {
  
  var field: String
  
  var onChange: voidFunc
  
  var options: js.Array[Option_]
  
  var opts: BaseOpts
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[Double | String | (js.Array[Any | Double | String])] = js.undefined
}
object BaseProps {
  
  inline def apply(field: String, onChange: () => Unit, options: js.Array[Option_], opts: BaseOpts): BaseProps = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), options = options.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProps]
  }
  
  extension [Self <: BaseProps](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    inline def setOptions(value: js.Array[Option_]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: Option_ *): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setOpts(value: BaseOpts): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setValue(value: Double | String | (js.Array[Any | Double | String])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: (Any | Double | String)*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
