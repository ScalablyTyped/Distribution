package typings.tuyaPanelKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MotionPullUpProps extends MotionProps {
  
  var dropHeight: js.UndefOr[Double] = js.native
}
object MotionPullUpProps {
  
  @scala.inline
  def apply(): MotionPullUpProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionPullUpProps]
  }
  
  @scala.inline
  implicit class MotionPullUpPropsOps[Self <: MotionPullUpProps] (val x: Self) extends AnyVal {
    
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
  }
}
