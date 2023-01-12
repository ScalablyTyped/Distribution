package typings.tengitsui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvancedFilterProps extends StObject {
  
  var defaultValue: js.UndefOr[js.Object] = js.undefined
  
  var noClearer: js.UndefOr[Boolean] = js.undefined
  
  var noCollpose: js.UndefOr[Boolean] = js.undefined
  
  var onChange: typings.tengitsui.mod.onChange
  
  var onFieldChange: voidFunc
  
  var onReset: js.UndefOr[voidFunc] = js.undefined
  
  var onSearch: js.UndefOr[voidFunc] = js.undefined
  
  var schema: js.Object
}
object AdvancedFilterProps {
  
  inline def apply(onChange: /* value */ Any => Unit, onFieldChange: () => Unit, schema: js.Object): AdvancedFilterProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), onFieldChange = js.Any.fromFunction0(onFieldChange), schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedFilterProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdvancedFilterProps] (val x: Self) extends AnyVal {
    
    inline def setDefaultValue(value: js.Object): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setNoClearer(value: Boolean): Self = StObject.set(x, "noClearer", value.asInstanceOf[js.Any])
    
    inline def setNoClearerUndefined: Self = StObject.set(x, "noClearer", js.undefined)
    
    inline def setNoCollpose(value: Boolean): Self = StObject.set(x, "noCollpose", value.asInstanceOf[js.Any])
    
    inline def setNoCollposeUndefined: Self = StObject.set(x, "noCollpose", js.undefined)
    
    inline def setOnChange(value: /* value */ Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnFieldChange(value: () => Unit): Self = StObject.set(x, "onFieldChange", js.Any.fromFunction0(value))
    
    inline def setOnReset(value: () => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction0(value))
    
    inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
    
    inline def setOnSearch(value: () => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction0(value))
    
    inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
    
    inline def setSchema(value: js.Object): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
