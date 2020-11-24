package typings.three.webXRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRViewerPose extends js.Object {
  
  val transform: XRRigidTransform = js.native
  
  val views: js.Array[XRView] = js.native
}
object XRViewerPose {
  
  @scala.inline
  def apply(transform: XRRigidTransform, views: js.Array[XRView]): XRViewerPose = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRViewerPose]
  }
  
  @scala.inline
  implicit class XRViewerPoseOps[Self <: XRViewerPose] (val x: Self) extends AnyVal {
    
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
    def setTransform(value: XRRigidTransform): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewsVarargs(value: XRView*): Self = this.set("views", js.Array(value :_*))
    
    @scala.inline
    def setViews(value: js.Array[XRView]): Self = this.set("views", value.asInstanceOf[js.Any])
  }
}
