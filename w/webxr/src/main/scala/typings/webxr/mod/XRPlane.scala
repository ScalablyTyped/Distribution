package typings.webxr.mod

import typings.std.DOMPointReadOnly
import typings.webxr.webxrStrings.Horizontal
import typings.webxr.webxrStrings.Vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRPlane extends StObject {
  
  var lastChangedTime: Double = js.native
  
  var orientation: Horizontal | Vertical = js.native
  
  var planeSpace: XRSpace = js.native
  
  var polygon: js.Array[DOMPointReadOnly] = js.native
}
object XRPlane {
  
  @scala.inline
  def apply(
    lastChangedTime: Double,
    orientation: Horizontal | Vertical,
    planeSpace: XRSpace,
    polygon: js.Array[DOMPointReadOnly]
  ): XRPlane = {
    val __obj = js.Dynamic.literal(lastChangedTime = lastChangedTime.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], planeSpace = planeSpace.asInstanceOf[js.Any], polygon = polygon.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRPlane]
  }
  
  @scala.inline
  implicit class XRPlaneMutableBuilder[Self <: XRPlane] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastChangedTime(value: Double): Self = StObject.set(x, "lastChangedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: Horizontal | Vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaneSpace(value: XRSpace): Self = StObject.set(x, "planeSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygon(value: js.Array[DOMPointReadOnly]): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygonVarargs(value: DOMPointReadOnly*): Self = StObject.set(x, "polygon", js.Array(value :_*))
  }
}
