package typings.swiper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyboardOptions extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var onlyInViewport: js.UndefOr[Boolean] = js.native
}
object KeyboardOptions {
  
  @scala.inline
  def apply(): KeyboardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardOptions]
  }
  
  @scala.inline
  implicit class KeyboardOptionsMutableBuilder[Self <: KeyboardOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setOnlyInViewport(value: Boolean): Self = StObject.set(x, "onlyInViewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyInViewportUndefined: Self = StObject.set(x, "onlyInViewport", js.undefined)
  }
}
