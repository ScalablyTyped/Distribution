package typings.wepy.wxEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkewAnimation extends js.Object {
  
  def skew(ax: Double): Animation = js.native
  
  def skewX(ax: Double): Animation = js.native
  
  def skewY(ay: Double): Animation = js.native
}
object SkewAnimation {
  
  @scala.inline
  def apply(skew: Double => Animation, skewX: Double => Animation, skewY: Double => Animation): SkewAnimation = {
    val __obj = js.Dynamic.literal(skew = js.Any.fromFunction1(skew), skewX = js.Any.fromFunction1(skewX), skewY = js.Any.fromFunction1(skewY))
    __obj.asInstanceOf[SkewAnimation]
  }
  
  @scala.inline
  implicit class SkewAnimationOps[Self <: SkewAnimation] (val x: Self) extends AnyVal {
    
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
    def setSkew(value: Double => Animation): Self = this.set("skew", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSkewX(value: Double => Animation): Self = this.set("skewX", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSkewY(value: Double => Animation): Self = this.set("skewY", js.Any.fromFunction1(value))
  }
}
