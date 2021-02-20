package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitAlertOptions extends StObject {
  
  var animation: js.UndefOr[Boolean | String] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var `sel-close`: js.UndefOr[String] = js.native
}
object UIkitAlertOptions {
  
  @scala.inline
  def apply(): UIkitAlertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitAlertOptions]
  }
  
  @scala.inline
  implicit class UIkitAlertOptionsMutableBuilder[Self <: UIkitAlertOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: Boolean | String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def `setSel-close`(value: String): Self = StObject.set(x, "sel-close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSel-closeUndefined`: Self = StObject.set(x, "sel-close", js.undefined)
  }
}
