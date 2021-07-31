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
  
  @scala.inline
  def apply(): CallAdvancedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallAdvancedOptions]
  }
  
  @scala.inline
  implicit class CallAdvancedOptionsMutableBuilder[Self <: CallAdvancedOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisclose_me(value: Boolean): Self = StObject.set(x, "disclose_me", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisclose_meUndefined: Self = StObject.set(x, "disclose_me", js.undefined)
    
    @scala.inline
    def setReceive_progress(value: Boolean): Self = StObject.set(x, "receive_progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceive_progressUndefined: Self = StObject.set(x, "receive_progress", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
