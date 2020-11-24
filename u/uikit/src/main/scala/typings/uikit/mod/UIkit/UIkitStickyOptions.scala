package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitStickyOptions extends js.Object {
  
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
  implicit class UIkitStickyOptionsOps[Self <: UIkitStickyOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimation(value: String | Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setBottom(value: Boolean | String): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def `setCls-active`(value: String): Self = this.set("cls-active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCls-active`: Self = this.set("cls-active", js.undefined)
    
    @scala.inline
    def `setCls-inactive`(value: String): Self = this.set("cls-inactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCls-inactive`: Self = this.set("cls-inactive", js.undefined)
    
    @scala.inline
    def setMedia(value: Double | String | Boolean): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    
    @scala.inline
    def setOffset(value: Double | String): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def `setShow-on-up`(value: Boolean): Self = this.set("show-on-up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteShow-on-up`: Self = this.set("show-on-up", js.undefined)
    
    @scala.inline
    def `setTarget-offset`(value: Boolean | Double): Self = this.set("target-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTarget-offset`: Self = this.set("target-offset", js.undefined)
    
    @scala.inline
    def setTop(value: Double | String): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    
    @scala.inline
    def `setWidth-element`(value: String | Boolean): Self = this.set("width-element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteWidth-element`: Self = this.set("width-element", js.undefined)
  }
}
