package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait translateMarkerOptions extends CommonCallbackOptions {
  
  //  动画结束回调函数
  var animationEnd: js.UndefOr[js.Function0[Unit]] = js.native
  
  //  移动过程中是否自动旋转 marker
  var autoRotate: Boolean = js.native
  
  //  指定 marker 移动到的目标点
  var destination: LocationBaseOptions = js.native
  
  //  动画持续时长，平移与旋转分别计算
  var duration: js.UndefOr[Double] = js.native
  
  //  指定 marker
  var markerId: Double = js.native
  
  //  marker 的旋转角度
  var rotate: Double = js.native
}
object translateMarkerOptions {
  
  @scala.inline
  def apply(autoRotate: Boolean, destination: LocationBaseOptions, markerId: Double, rotate: Double): translateMarkerOptions = {
    val __obj = js.Dynamic.literal(autoRotate = autoRotate.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], markerId = markerId.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any])
    __obj.asInstanceOf[translateMarkerOptions]
  }
  
  @scala.inline
  implicit class translateMarkerOptionsOps[Self <: translateMarkerOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoRotate(value: Boolean): Self = this.set("autoRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination(value: LocationBaseOptions): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerId(value: Double): Self = this.set("markerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotate(value: Double): Self = this.set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationEnd(value: () => Unit): Self = this.set("animationEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAnimationEnd: Self = this.set("animationEnd", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
  }
}
