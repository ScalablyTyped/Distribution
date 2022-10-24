package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnCopy extends StObject {
  
  var onCopy: js.UndefOr[js.Function] = js.undefined
  
  var resetTimeout: js.UndefOr[Double] = js.undefined
  
  var value: String
}
object OnCopy {
  
  inline def apply(value: String): OnCopy = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCopy]
  }
  
  extension [Self <: OnCopy](x: Self) {
    
    inline def setOnCopy(value: js.Function): Self = StObject.set(x, "onCopy", value.asInstanceOf[js.Any])
    
    inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
    
    inline def setResetTimeout(value: Double): Self = StObject.set(x, "resetTimeout", value.asInstanceOf[js.Any])
    
    inline def setResetTimeoutUndefined: Self = StObject.set(x, "resetTimeout", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
