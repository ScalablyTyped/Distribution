package typings.tengitsui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationSelectOpts extends StObject {
  
  var cascDisabled: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var getValue: js.UndefOr[js.Function1[/* fields */ Fields, Location]] = js.undefined
}
object LocationSelectOpts {
  
  inline def apply(): LocationSelectOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationSelectOpts]
  }
  
  extension [Self <: LocationSelectOpts](x: Self) {
    
    inline def setCascDisabled(value: Boolean): Self = StObject.set(x, "cascDisabled", value.asInstanceOf[js.Any])
    
    inline def setCascDisabledUndefined: Self = StObject.set(x, "cascDisabled", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setGetValue(value: /* fields */ Fields => Location): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
    
    inline def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
  }
}
