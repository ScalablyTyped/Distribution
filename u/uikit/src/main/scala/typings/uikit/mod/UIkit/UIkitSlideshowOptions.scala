package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitSlideshowOptions extends js.Object {
  
  var animation: js.UndefOr[String] = js.native
  
  var autoplay: js.UndefOr[Boolean] = js.native
  
  var `autoplay-interval`: js.UndefOr[Double] = js.native
  
  var draggable: js.UndefOr[Boolean] = js.native
  
  var easing: js.UndefOr[String] = js.native
  
  var finite: js.UndefOr[Boolean] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var `max-height`: js.UndefOr[Boolean | Double] = js.native
  
  var `min-height`: js.UndefOr[Boolean | Double] = js.native
  
  var `pause-on-hover`: js.UndefOr[Boolean] = js.native
  
  var ratio: js.UndefOr[String | Double] = js.native
  
  var velocity: js.UndefOr[Double] = js.native
}
object UIkitSlideshowOptions {
  
  @scala.inline
  def apply(): UIkitSlideshowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitSlideshowOptions]
  }
  
  @scala.inline
  implicit class UIkitSlideshowOptionsOps[Self <: UIkitSlideshowOptions] (val x: Self) extends AnyVal {
    
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
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setFinite(value: Boolean): Self = this.set("finite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinite: Self = this.set("finite", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def `setMax-height`(value: Boolean | Double): Self = this.set("max-height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMax-height`: Self = this.set("max-height", js.undefined)
    
    @scala.inline
    def `setMin-height`(value: Boolean | Double): Self = this.set("min-height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMin-height`: Self = this.set("min-height", js.undefined)
    
    @scala.inline
    def `setPause-on-hover`(value: Boolean): Self = this.set("pause-on-hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePause-on-hover`: Self = this.set("pause-on-hover", js.undefined)
    
    @scala.inline
    def setRatio(value: String | Double): Self = this.set("ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRatio: Self = this.set("ratio", js.undefined)
    
    @scala.inline
    def setVelocity(value: Double): Self = this.set("velocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVelocity: Self = this.set("velocity", js.undefined)
  }
}
