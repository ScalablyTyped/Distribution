package typings.webtorrent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Autoplay extends js.Object {
  
  var autoplay: js.UndefOr[Boolean] = js.native
  
  var controls: js.UndefOr[Boolean] = js.native
  
  var maxBlobLength: js.UndefOr[Double] = js.native
}
object Autoplay {
  
  @scala.inline
  def apply(): Autoplay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Autoplay]
  }
  
  @scala.inline
  implicit class AutoplayOps[Self <: Autoplay] (val x: Self) extends AnyVal {
    
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
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    
    @scala.inline
    def setControls(value: Boolean): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    
    @scala.inline
    def setMaxBlobLength(value: Double): Self = this.set("maxBlobLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxBlobLength: Self = this.set("maxBlobLength", js.undefined)
  }
}
