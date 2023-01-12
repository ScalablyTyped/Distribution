package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PERSPECTIVECAMERA extends StObject {
  
  var PERSPECTIVE_CAMERA: Double
}
object PERSPECTIVECAMERA {
  
  inline def apply(PERSPECTIVE_CAMERA: Double): PERSPECTIVECAMERA = {
    val __obj = js.Dynamic.literal(PERSPECTIVE_CAMERA = PERSPECTIVE_CAMERA.asInstanceOf[js.Any])
    __obj.asInstanceOf[PERSPECTIVECAMERA]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PERSPECTIVECAMERA] (val x: Self) extends AnyVal {
    
    inline def setPERSPECTIVE_CAMERA(value: Double): Self = StObject.set(x, "PERSPECTIVE_CAMERA", value.asInstanceOf[js.Any])
  }
}
