package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitVideoOptions extends StObject {
  
  var automute: js.UndefOr[Boolean] = js.native
  
  var autoplay: js.UndefOr[Boolean | String] = js.native
}
object UIkitVideoOptions {
  
  @scala.inline
  def apply(): UIkitVideoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitVideoOptions]
  }
  
  @scala.inline
  implicit class UIkitVideoOptionsMutableBuilder[Self <: UIkitVideoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomute(value: Boolean): Self = StObject.set(x, "automute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomuteUndefined: Self = StObject.set(x, "automute", js.undefined)
    
    @scala.inline
    def setAutoplay(value: Boolean | String): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
  }
}
