package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitStickyOptions extends StObject {
  
  var animation: js.UndefOr[String | Boolean] = js.native
  
  var bottom: js.UndefOr[Boolean | String] = js.native
  
  var `cls-active`: js.UndefOr[String] = js.native
  
  var `cls-inactive`: js.UndefOr[String] = js.native
  
  var media: js.UndefOr[Double | String | Boolean] = js.native
  
  var offset: js.UndefOr[Double | String] = js.native
  
  var `show-on-up`: js.UndefOr[Boolean] = js.native
  
  var `target-offset`: js.UndefOr[Boolean | Double] = js.native
  
  var top: js.UndefOr[Double | String] = js.native
  
  var `width-element`: js.UndefOr[String | Boolean] = js.native
}
object UIkitStickyOptions {
  
  @scala.inline
  def apply(): UIkitStickyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitStickyOptions]
  }
  
  @scala.inline
  implicit class UIkitStickyOptionsMutableBuilder[Self <: UIkitStickyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: String | Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setBottom(value: Boolean | String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def `setCls-active`(value: String): Self = StObject.set(x, "cls-active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCls-activeUndefined`: Self = StObject.set(x, "cls-active", js.undefined)
    
    @scala.inline
    def `setCls-inactive`(value: String): Self = StObject.set(x, "cls-inactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCls-inactiveUndefined`: Self = StObject.set(x, "cls-inactive", js.undefined)
    
    @scala.inline
    def setMedia(value: Double | String | Boolean): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    @scala.inline
    def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def `setShow-on-up`(value: Boolean): Self = StObject.set(x, "show-on-up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShow-on-upUndefined`: Self = StObject.set(x, "show-on-up", js.undefined)
    
    @scala.inline
    def `setTarget-offset`(value: Boolean | Double): Self = StObject.set(x, "target-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTarget-offsetUndefined`: Self = StObject.set(x, "target-offset", js.undefined)
    
    @scala.inline
    def setTop(value: Double | String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def `setWidth-element`(value: String | Boolean): Self = StObject.set(x, "width-element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWidth-elementUndefined`: Self = StObject.set(x, "width-element", js.undefined)
  }
}
