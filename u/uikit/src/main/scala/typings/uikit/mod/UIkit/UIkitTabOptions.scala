package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitTabOptions extends js.Object {
  
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
  implicit class UIkitTabOptionsOps[Self <: UIkitTabOptions] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Double): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setAnimation(value: String): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setConnect(value: String): Self = this.set("connect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnect: Self = this.set("connect", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setMedia(value: Double | String): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    
    @scala.inline
    def setSwiping(value: Boolean): Self = this.set("swiping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwiping: Self = this.set("swiping", js.undefined)
    
    @scala.inline
    def setToggle(value: String): Self = this.set("toggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
  }
}
