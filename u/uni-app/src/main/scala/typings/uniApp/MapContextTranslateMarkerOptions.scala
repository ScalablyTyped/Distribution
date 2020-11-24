package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapContextTranslateMarkerOptions extends js.Object {
  
  /**
    * 动画结束回调函数
    */
  var animationEnd: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 移动过程中是否自动旋转marker
    */
  var autoRotate: js.UndefOr[Boolean] = js.native
  
  /**
    * 指定marker移动到的目标点
    */
  var destination: js.UndefOr[LocationObject] = js.native
  
  /**
    * 动画持续时长，默认值1000ms，平移与旋转分别计算
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 指定marker
    */
  var markerId: js.UndefOr[Double] = js.native
  
  /**
    * marker的旋转角度
    */
  var rotate: js.UndefOr[Double] = js.native
}
object MapContextTranslateMarkerOptions {
  
  @scala.inline
  def apply(): MapContextTranslateMarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapContextTranslateMarkerOptions]
  }
  
  @scala.inline
  implicit class MapContextTranslateMarkerOptionsOps[Self <: MapContextTranslateMarkerOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimationEnd(value: () => Unit): Self = this.set("animationEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAnimationEnd: Self = this.set("animationEnd", js.undefined)
    
    @scala.inline
    def setAutoRotate(value: Boolean): Self = this.set("autoRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoRotate: Self = this.set("autoRotate", js.undefined)
    
    @scala.inline
    def setDestination(value: LocationObject): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setMarkerId(value: Double): Self = this.set("markerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerId: Self = this.set("markerId", js.undefined)
    
    @scala.inline
    def setRotate(value: Double): Self = this.set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
  }
}
