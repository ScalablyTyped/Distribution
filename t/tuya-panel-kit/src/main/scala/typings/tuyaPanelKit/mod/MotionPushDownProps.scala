package typings.tuyaPanelKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MotionPushDownProps extends MotionProps {
  
  var dropHeight: js.UndefOr[Double] = js.native
  
  var isAlign: js.UndefOr[Boolean] = js.native
}
object MotionPushDownProps {
  
  @scala.inline
  def apply(): MotionPushDownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionPushDownProps]
  }
  
  @scala.inline
  implicit class MotionPushDownPropsOps[Self <: MotionPushDownProps] (val x: Self) extends AnyVal {
    
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
    def setDropHeight(value: Double): Self = this.set("dropHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropHeight: Self = this.set("dropHeight", js.undefined)
    
    @scala.inline
    def setIsAlign(value: Boolean): Self = this.set("isAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAlign: Self = this.set("isAlign", js.undefined)
  }
}
