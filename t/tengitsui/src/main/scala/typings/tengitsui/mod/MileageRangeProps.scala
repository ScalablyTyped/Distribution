package typings.tengitsui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MileageRangeProps extends StObject {
  
  def onChange(value: js.Array[String]): Unit
  
  var opts: js.UndefOr[js.Object] = js.undefined
  
  var value: js.UndefOr[js.Array[String]] = js.undefined
}
object MileageRangeProps {
  
  inline def apply(onChange: js.Array[String] => Unit): MileageRangeProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[MileageRangeProps]
  }
  
  extension [Self <: MileageRangeProps](x: Self) {
    
    inline def setOnChange(value: js.Array[String] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOpts(value: js.Object): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    
    inline def setOptsUndefined: Self = StObject.set(x, "opts", js.undefined)
    
    inline def setValue(value: js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
