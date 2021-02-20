package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitIconOptions extends StObject {
  
  var icon: js.UndefOr[String] = js.native
  
  var ratio: js.UndefOr[Double] = js.native
}
object UIkitIconOptions {
  
  @scala.inline
  def apply(): UIkitIconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitIconOptions]
  }
  
  @scala.inline
  implicit class UIkitIconOptionsMutableBuilder[Self <: UIkitIconOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
  }
}
