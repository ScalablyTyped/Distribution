package typings.webvrApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VRFieldOfView extends js.Object {
  
  val downDegrees: Double = js.native
  
  val leftDegrees: Double = js.native
  
  val rightDegrees: Double = js.native
  
  val upDegrees: Double = js.native
}
object VRFieldOfView {
  
  @scala.inline
  def apply(downDegrees: Double, leftDegrees: Double, rightDegrees: Double, upDegrees: Double): VRFieldOfView = {
    val __obj = js.Dynamic.literal(downDegrees = downDegrees.asInstanceOf[js.Any], leftDegrees = leftDegrees.asInstanceOf[js.Any], rightDegrees = rightDegrees.asInstanceOf[js.Any], upDegrees = upDegrees.asInstanceOf[js.Any])
    __obj.asInstanceOf[VRFieldOfView]
  }
  
  @scala.inline
  implicit class VRFieldOfViewOps[Self <: VRFieldOfView] (val x: Self) extends AnyVal {
    
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
    def setDownDegrees(value: Double): Self = this.set("downDegrees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftDegrees(value: Double): Self = this.set("leftDegrees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightDegrees(value: Double): Self = this.set("rightDegrees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpDegrees(value: Double): Self = this.set("upDegrees", value.asInstanceOf[js.Any])
  }
}
