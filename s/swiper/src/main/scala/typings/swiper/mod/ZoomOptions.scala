package typings.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoomOptions extends js.Object {
  
  var containerClass: js.UndefOr[String] = js.native
  
  var maxRatio: js.UndefOr[Double] = js.native
  
  var minRatio: js.UndefOr[Double] = js.native
  
  var toggle: js.UndefOr[Boolean] = js.native
  
  var zoomedSlideClass: js.UndefOr[String] = js.native
}
object ZoomOptions {
  
  @scala.inline
  def apply(): ZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomOptions]
  }
  
  @scala.inline
  implicit class ZoomOptionsOps[Self <: ZoomOptions] (val x: Self) extends AnyVal {
    
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
    def setContainerClass(value: String): Self = this.set("containerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerClass: Self = this.set("containerClass", js.undefined)
    
    @scala.inline
    def setMaxRatio(value: Double): Self = this.set("maxRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRatio: Self = this.set("maxRatio", js.undefined)
    
    @scala.inline
    def setMinRatio(value: Double): Self = this.set("minRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinRatio: Self = this.set("minRatio", js.undefined)
    
    @scala.inline
    def setToggle(value: Boolean): Self = this.set("toggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
    
    @scala.inline
    def setZoomedSlideClass(value: String): Self = this.set("zoomedSlideClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomedSlideClass: Self = this.set("zoomedSlideClass", js.undefined)
  }
}
