package typings.webxr

import typings.std.EventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRReferenceSpaceEventInit
  extends StObject
     with EventInit {
  
  var referenceSpace: js.UndefOr[XRReferenceSpace] = js.undefined
  
  var transform: js.UndefOr[XRRigidTransform] = js.undefined
}
object XRReferenceSpaceEventInit {
  
  inline def apply(): XRReferenceSpaceEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XRReferenceSpaceEventInit]
  }
  
  extension [Self <: XRReferenceSpaceEventInit](x: Self) {
    
    inline def setReferenceSpace(value: XRReferenceSpace): Self = StObject.set(x, "referenceSpace", value.asInstanceOf[js.Any])
    
    inline def setReferenceSpaceUndefined: Self = StObject.set(x, "referenceSpace", js.undefined)
    
    inline def setTransform(value: XRRigidTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
