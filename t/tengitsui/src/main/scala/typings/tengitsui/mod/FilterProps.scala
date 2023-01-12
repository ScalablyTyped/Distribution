package typings.tengitsui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterProps extends StObject {
  
  var defaultValue: js.UndefOr[js.Object] = js.undefined
  
  var noClearer: Boolean
  
  var noCollpose: Boolean
  
  var onFieldChange: voidFunc
  
  var onReset: js.UndefOr[voidFunc] = js.undefined
  
  var onSearch: js.UndefOr[voidFunc] = js.undefined
  
  var schema: js.Object
}
object FilterProps {
  
  inline def apply(noClearer: Boolean, noCollpose: Boolean, onFieldChange: () => Unit, schema: js.Object): FilterProps = {
    val __obj = js.Dynamic.literal(noClearer = noClearer.asInstanceOf[js.Any], noCollpose = noCollpose.asInstanceOf[js.Any], onFieldChange = js.Any.fromFunction0(onFieldChange), schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterProps] (val x: Self) extends AnyVal {
    
    inline def setDefaultValue(value: js.Object): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setNoClearer(value: Boolean): Self = StObject.set(x, "noClearer", value.asInstanceOf[js.Any])
    
    inline def setNoCollpose(value: Boolean): Self = StObject.set(x, "noCollpose", value.asInstanceOf[js.Any])
    
    inline def setOnFieldChange(value: () => Unit): Self = StObject.set(x, "onFieldChange", js.Any.fromFunction0(value))
    
    inline def setOnReset(value: () => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction0(value))
    
    inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
    
    inline def setOnSearch(value: () => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction0(value))
    
    inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
    
    inline def setSchema(value: js.Object): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
