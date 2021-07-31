package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitCoverOptions extends StObject {
  
  var automute: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object UIkitCoverOptions {
  
  @scala.inline
  def apply(): UIkitCoverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitCoverOptions]
  }
  
  @scala.inline
  implicit class UIkitCoverOptionsMutableBuilder[Self <: UIkitCoverOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomute(value: Boolean): Self = StObject.set(x, "automute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomuteUndefined: Self = StObject.set(x, "automute", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
