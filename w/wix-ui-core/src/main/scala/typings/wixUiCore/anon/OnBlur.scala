package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBlur extends StObject {
  
  def onBlur(): js.Any
  
  def onChange(): js.Any
  
  def onHover(): js.Any
  
  def onKeyDown(): js.Any
}
object OnBlur {
  
  inline def apply(onBlur: () => js.Any, onChange: () => js.Any, onHover: () => js.Any, onKeyDown: () => js.Any): OnBlur = {
    val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onHover = js.Any.fromFunction0(onHover), onKeyDown = js.Any.fromFunction0(onKeyDown))
    __obj.asInstanceOf[OnBlur]
  }
  
  extension [Self <: OnBlur](x: Self) {
    
    inline def setOnBlur(value: () => js.Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
    
    inline def setOnChange(value: () => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    inline def setOnHover(value: () => js.Any): Self = StObject.set(x, "onHover", js.Any.fromFunction0(value))
    
    inline def setOnKeyDown(value: () => js.Any): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction0(value))
  }
}
