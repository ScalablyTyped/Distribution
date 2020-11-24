package typings.winrtUwp.Windows.Graphics.Holographic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HolographicSpaceCameraAddedEventArgs extends js.Object {
  
  var camera: js.Any = js.native
  
   /* unmapped type */ var getDeferral: js.Any = js.native
}
object HolographicSpaceCameraAddedEventArgs {
  
  @scala.inline
  def apply(camera: js.Any, getDeferral: js.Any): HolographicSpaceCameraAddedEventArgs = {
    val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any], getDeferral = getDeferral.asInstanceOf[js.Any])
    __obj.asInstanceOf[HolographicSpaceCameraAddedEventArgs]
  }
  
  @scala.inline
  implicit class HolographicSpaceCameraAddedEventArgsOps[Self <: HolographicSpaceCameraAddedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCamera(value: js.Any): Self = this.set("camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDeferral(value: js.Any): Self = this.set("getDeferral", value.asInstanceOf[js.Any])
  }
}
