package typings.webxr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRHitTestOptionsInit extends StObject {
  
  var entityTypes: js.UndefOr[js.Array[XRHitTestTrackableType]] = js.undefined
  
  var offsetRay: js.UndefOr[XRRay] = js.undefined
  
  var space: XRSpace
}
object XRHitTestOptionsInit {
  
  @scala.inline
  def apply(space: XRSpace): XRHitTestOptionsInit = {
    val __obj = js.Dynamic.literal(space = space.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRHitTestOptionsInit]
  }
  
  @scala.inline
  implicit class XRHitTestOptionsInitMutableBuilder[Self <: XRHitTestOptionsInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityTypes(value: js.Array[XRHitTestTrackableType]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    @scala.inline
    def setEntityTypesVarargs(value: XRHitTestTrackableType*): Self = StObject.set(x, "entityTypes", js.Array(value :_*))
    
    @scala.inline
    def setOffsetRay(value: XRRay): Self = StObject.set(x, "offsetRay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetRayUndefined: Self = StObject.set(x, "offsetRay", js.undefined)
    
    @scala.inline
    def setSpace(value: XRSpace): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
  }
}
