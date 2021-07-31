package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitScrollOptions extends StObject {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
}
object UIkitScrollOptions {
  
  @scala.inline
  def apply(): UIkitScrollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitScrollOptions]
  }
  
  @scala.inline
  implicit class UIkitScrollOptionsMutableBuilder[Self <: UIkitScrollOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
