package typings.three.webXRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRHitTestOptionsInit extends js.Object {
  
  var entityTypes: js.UndefOr[js.Array[XRHitTestTrackableType]] = js.native
  
  var offsetRay: js.UndefOr[XRRay] = js.native
  
  var space: XRSpace = js.native
}
object XRHitTestOptionsInit {
  
  @scala.inline
  def apply(space: XRSpace): XRHitTestOptionsInit = {
    val __obj = js.Dynamic.literal(space = space.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRHitTestOptionsInit]
  }
  
  @scala.inline
  implicit class XRHitTestOptionsInitOps[Self <: XRHitTestOptionsInit] (val x: Self) extends AnyVal {
    
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
    def setSpace(value: XRSpace): Self = this.set("space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypesVarargs(value: XRHitTestTrackableType*): Self = this.set("entityTypes", js.Array(value :_*))
    
    @scala.inline
    def setEntityTypes(value: js.Array[XRHitTestTrackableType]): Self = this.set("entityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityTypes: Self = this.set("entityTypes", js.undefined)
    
    @scala.inline
    def setOffsetRay(value: XRRay): Self = this.set("offsetRay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetRay: Self = this.set("offsetRay", js.undefined)
  }
}
