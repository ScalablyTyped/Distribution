package typings.three.anon

import typings.three.webXRMod.XRPlaneSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectedPlanes extends js.Object {
  
  var detectedPlanes: js.UndefOr[XRPlaneSet] = js.native
}
object DetectedPlanes {
  
  @scala.inline
  def apply(): DetectedPlanes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectedPlanes]
  }
  
  @scala.inline
  implicit class DetectedPlanesOps[Self <: DetectedPlanes] (val x: Self) extends AnyVal {
    
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
    def setDetectedPlanes(value: XRPlaneSet): Self = this.set("detectedPlanes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectedPlanes: Self = this.set("detectedPlanes", js.undefined)
  }
}
