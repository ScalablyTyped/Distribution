package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitLightboxPanelOptions extends js.Object {
  
  var animation: js.UndefOr[String] = js.native
  
  var autoplay: js.UndefOr[Boolean] = js.native
  
  var `autoplay-interval`: js.UndefOr[Double] = js.native
  
  var `delay-controls`: js.UndefOr[Double] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var items: js.UndefOr[js.Array[js.Object]] = js.native
  
  var `pause-on-hover`: js.UndefOr[Boolean] = js.native
  
  var preload: js.UndefOr[Double] = js.native
  
  var template: js.UndefOr[String] = js.native
  
  var velocity: js.UndefOr[Double] = js.native
  
  var `video-autoplay`: js.UndefOr[Boolean] = js.native
}
object UIkitLightboxPanelOptions {
  
  @scala.inline
  def apply(): UIkitLightboxPanelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitLightboxPanelOptions]
  }
  
  @scala.inline
  implicit class UIkitLightboxPanelOptionsOps[Self <: UIkitLightboxPanelOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnimation(value: String): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    
    @scala.inline
    def `setAutoplay-interval`(value: Double): Self = this.set("autoplay-interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAutoplay-interval`: Self = this.set("autoplay-interval", js.undefined)
    
    @scala.inline
    def `setDelay-controls`(value: Double): Self = this.set("delay-controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteDelay-controls`: Self = this.set("delay-controls", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: js.Object*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[js.Object]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def `setPause-on-hover`(value: Boolean): Self = this.set("pause-on-hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePause-on-hover`: Self = this.set("pause-on-hover", js.undefined)
    
    @scala.inline
    def setPreload(value: Double): Self = this.set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setVelocity(value: Double): Self = this.set("velocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVelocity: Self = this.set("velocity", js.undefined)
    
    @scala.inline
    def `setVideo-autoplay`(value: Boolean): Self = this.set("video-autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteVideo-autoplay`: Self = this.set("video-autoplay", js.undefined)
  }
}
