package typings.webvrApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigator extends js.Object {
  
  val activeVRDisplays: js.Array[VRDisplay] = js.native
  
  def getVRDisplays(): js.Promise[js.Array[VRDisplay]] = js.native
}
object Navigator {
  
  @scala.inline
  def apply(activeVRDisplays: js.Array[VRDisplay], getVRDisplays: () => js.Promise[js.Array[VRDisplay]]): Navigator = {
    val __obj = js.Dynamic.literal(activeVRDisplays = activeVRDisplays.asInstanceOf[js.Any], getVRDisplays = js.Any.fromFunction0(getVRDisplays))
    __obj.asInstanceOf[Navigator]
  }
  
  @scala.inline
  implicit class NavigatorOps[Self <: Navigator] (val x: Self) extends AnyVal {
    
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
    def setActiveVRDisplaysVarargs(value: VRDisplay*): Self = this.set("activeVRDisplays", js.Array(value :_*))
    
    @scala.inline
    def setActiveVRDisplays(value: js.Array[VRDisplay]): Self = this.set("activeVRDisplays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetVRDisplays(value: () => js.Promise[js.Array[VRDisplay]]): Self = this.set("getVRDisplays", js.Any.fromFunction0(value))
  }
}
