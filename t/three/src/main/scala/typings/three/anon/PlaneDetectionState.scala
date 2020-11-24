package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaneDetectionState extends js.Object {
  
  var planeDetectionState: js.UndefOr[EnabledBoolean] = js.native
}
object PlaneDetectionState {
  
  @scala.inline
  def apply(): PlaneDetectionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaneDetectionState]
  }
  
  @scala.inline
  implicit class PlaneDetectionStateOps[Self <: PlaneDetectionState] (val x: Self) extends AnyVal {
    
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
    def setPlaneDetectionState(value: EnabledBoolean): Self = this.set("planeDetectionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaneDetectionState: Self = this.set("planeDetectionState", js.undefined)
  }
}
