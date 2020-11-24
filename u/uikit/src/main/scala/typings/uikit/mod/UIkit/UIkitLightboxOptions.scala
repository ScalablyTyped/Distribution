package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitLightboxOptions extends js.Object {
  
  var animation: js.UndefOr[String] = js.native
  
  var autoplay: js.UndefOr[Double] = js.native
  
  var `autoplay-interval`: js.UndefOr[Double] = js.native
  
  var index: js.UndefOr[String] = js.native
  
  var `pause-on-hover`: js.UndefOr[Boolean] = js.native
  
  var toggle: js.UndefOr[String] = js.native
  
  var `video-autoplay`: js.UndefOr[Boolean] = js.native
}
object UIkitLightboxOptions {
  
  @scala.inline
  def apply(): UIkitLightboxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitLightboxOptions]
  }
  
  @scala.inline
  implicit class UIkitLightboxOptionsOps[Self <: UIkitLightboxOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoplay(value: Double): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    
    @scala.inline
    def `setAutoplay-interval`(value: Double): Self = this.set("autoplay-interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAutoplay-interval`: Self = this.set("autoplay-interval", js.undefined)
    
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def `setPause-on-hover`(value: Boolean): Self = this.set("pause-on-hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePause-on-hover`: Self = this.set("pause-on-hover", js.undefined)
    
    @scala.inline
    def setToggle(value: String): Self = this.set("toggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
    
    @scala.inline
    def `setVideo-autoplay`(value: Boolean): Self = this.set("video-autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteVideo-autoplay`: Self = this.set("video-autoplay", js.undefined)
  }
}
