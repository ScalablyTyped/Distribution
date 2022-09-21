package typings.webxr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An XRPose describing the state of a viewer of the XR scene as tracked by the XR
  * device. A viewer may represent a tracked piece of hardware, the observed position
  * of a user's head relative to the hardware, or some other means of computing a series
  * of viewpoints into the XR scene. XRViewerPoses can only be queried relative to an
  * XRReferenceSpace. It provides, in addition to the XRPose values, an array of views
  * which include rigid transforms to indicate the viewpoint and projection matrices.
  * These values should be used by the application when rendering a frame of an XR scene.
  *
  * ref: https://immersive-web.github.io/webxr/#xrviewerpose-interface
  */
trait XRViewerPose
  extends StObject
     with XRPose {
  
  val views: js.Array[XRView]
}
object XRViewerPose {
  
  inline def apply(emulatedPosition: Boolean, transform: XRRigidTransform, views: js.Array[XRView]): XRViewerPose = {
    val __obj = js.Dynamic.literal(emulatedPosition = emulatedPosition.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRViewerPose]
  }
  
  extension [Self <: XRViewerPose](x: Self) {
    
    inline def setViews(value: js.Array[XRView]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    inline def setViewsVarargs(value: XRView*): Self = StObject.set(x, "views", js.Array(value*))
  }
}
