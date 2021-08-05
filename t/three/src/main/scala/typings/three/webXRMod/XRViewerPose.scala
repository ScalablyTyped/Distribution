package typings.three.webXRMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRViewerPose extends StObject {
  
  val transform: XRRigidTransform
  
  val views: js.Array[XRView]
}
object XRViewerPose {
  
  inline def apply(transform: XRRigidTransform, views: js.Array[XRView]): XRViewerPose = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRViewerPose]
  }
  
  extension [Self <: XRViewerPose](x: Self) {
    
    inline def setTransform(value: XRRigidTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setViews(value: js.Array[XRView]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    inline def setViewsVarargs(value: XRView*): Self = StObject.set(x, "views", js.Array(value :_*))
  }
}
