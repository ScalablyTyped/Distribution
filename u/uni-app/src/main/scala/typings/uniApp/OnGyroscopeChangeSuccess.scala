package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnGyroscopeChangeSuccess extends js.Object {
  
  /**
    * x 轴方向角速度
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * y 轴方向角速度
    */
  var y: js.UndefOr[Double] = js.native
  
  /**
    * z 轴方向角速度
    */
  var z: js.UndefOr[Double] = js.native
}
object OnGyroscopeChangeSuccess {
  
  @scala.inline
  def apply(): OnGyroscopeChangeSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnGyroscopeChangeSuccess]
  }
  
  @scala.inline
  implicit class OnGyroscopeChangeSuccessOps[Self <: OnGyroscopeChangeSuccess] (val x: Self) extends AnyVal {
    
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
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZ: Self = this.set("z", js.undefined)
  }
}
