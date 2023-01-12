package typings.tengitsui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MileageProps extends StObject {
  
  def onChange(value: String): Unit
  
  var opts: js.UndefOr[js.Object] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object MileageProps {
  
  inline def apply(onChange: String => Unit): MileageProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[MileageProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MileageProps] (val x: Self) extends AnyVal {
    
    inline def setOnChange(value: String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOpts(value: js.Object): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    
    inline def setOptsUndefined: Self = StObject.set(x, "opts", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
