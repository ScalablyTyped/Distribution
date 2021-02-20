package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitTabOptions extends StObject {
  
  var active: js.UndefOr[Double] = js.native
  
  var animation: js.UndefOr[String] = js.native
  
  var connect: js.UndefOr[String] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var media: js.UndefOr[Double | String] = js.native
  
  var swiping: js.UndefOr[Boolean] = js.native
  
  var toggle: js.UndefOr[String] = js.native
}
object UIkitTabOptions {
  
  @scala.inline
  def apply(): UIkitTabOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitTabOptions]
  }
  
  @scala.inline
  implicit class UIkitTabOptionsMutableBuilder[Self <: UIkitTabOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Double): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setConnect(value: String): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setMedia(value: Double | String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    @scala.inline
    def setSwiping(value: Boolean): Self = StObject.set(x, "swiping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipingUndefined: Self = StObject.set(x, "swiping", js.undefined)
    
    @scala.inline
    def setToggle(value: String): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
  }
}
