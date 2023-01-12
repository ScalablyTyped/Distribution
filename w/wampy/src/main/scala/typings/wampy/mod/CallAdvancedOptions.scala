package typings.wampy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallAdvancedOptions extends StObject {
  
  var disclose_me: js.UndefOr[Boolean] = js.undefined
  
  var receive_progress: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object CallAdvancedOptions {
  
  inline def apply(): CallAdvancedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallAdvancedOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CallAdvancedOptions] (val x: Self) extends AnyVal {
    
    inline def setDisclose_me(value: Boolean): Self = StObject.set(x, "disclose_me", value.asInstanceOf[js.Any])
    
    inline def setDisclose_meUndefined: Self = StObject.set(x, "disclose_me", js.undefined)
    
    inline def setReceive_progress(value: Boolean): Self = StObject.set(x, "receive_progress", value.asInstanceOf[js.Any])
    
    inline def setReceive_progressUndefined: Self = StObject.set(x, "receive_progress", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
