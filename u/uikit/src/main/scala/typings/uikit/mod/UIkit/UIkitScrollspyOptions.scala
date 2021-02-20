package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitScrollspyOptions extends StObject {
  
  var cls: js.UndefOr[String] = js.native
  
  var delay: js.UndefOr[Double] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var `offset-left`: js.UndefOr[Double] = js.native
  
  var `offset-top`: js.UndefOr[Double] = js.native
  
  var repeat: js.UndefOr[Boolean] = js.native
}
object UIkitScrollspyOptions {
  
  @scala.inline
  def apply(): UIkitScrollspyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitScrollspyOptions]
  }
  
  @scala.inline
  implicit class UIkitScrollspyOptionsMutableBuilder[Self <: UIkitScrollspyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCls(value: String): Self = StObject.set(x, "cls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClsUndefined: Self = StObject.set(x, "cls", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def `setOffset-left`(value: Double): Self = StObject.set(x, "offset-left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOffset-leftUndefined`: Self = StObject.set(x, "offset-left", js.undefined)
    
    @scala.inline
    def `setOffset-top`(value: Double): Self = StObject.set(x, "offset-top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOffset-topUndefined`: Self = StObject.set(x, "offset-top", js.undefined)
    
    @scala.inline
    def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
  }
}
