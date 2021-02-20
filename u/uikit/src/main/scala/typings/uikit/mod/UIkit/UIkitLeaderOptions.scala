package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitLeaderOptions extends StObject {
  
  var fill: js.UndefOr[String] = js.native
  
  var media: js.UndefOr[Double | String] = js.native
}
object UIkitLeaderOptions {
  
  @scala.inline
  def apply(): UIkitLeaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitLeaderOptions]
  }
  
  @scala.inline
  implicit class UIkitLeaderOptionsMutableBuilder[Self <: UIkitLeaderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setMedia(value: Double | String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
  }
}
