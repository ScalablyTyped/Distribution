package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnCancel extends StObject {
  
  var disabled: Any
  
  var onCancel: Any
  
  var onConfirm: Any
}
object OnCancel {
  
  inline def apply(disabled: Any, onCancel: Any, onConfirm: Any): OnCancel = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], onCancel = onCancel.asInstanceOf[js.Any], onConfirm = onConfirm.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCancel]
  }
  
  extension [Self <: OnCancel](x: Self) {
    
    inline def setDisabled(value: Any): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setOnCancel(value: Any): Self = StObject.set(x, "onCancel", value.asInstanceOf[js.Any])
    
    inline def setOnConfirm(value: Any): Self = StObject.set(x, "onConfirm", value.asInstanceOf[js.Any])
  }
}
