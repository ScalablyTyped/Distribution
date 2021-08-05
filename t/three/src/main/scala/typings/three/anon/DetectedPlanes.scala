package typings.three.anon

import typings.three.webXRMod.XRPlaneSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectedPlanes extends StObject {
  
  var detectedPlanes: js.UndefOr[XRPlaneSet] = js.undefined
}
object DetectedPlanes {
  
  inline def apply(): DetectedPlanes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectedPlanes]
  }
  
  extension [Self <: DetectedPlanes](x: Self) {
    
    inline def setDetectedPlanes(value: XRPlaneSet): Self = StObject.set(x, "detectedPlanes", value.asInstanceOf[js.Any])
    
    inline def setDetectedPlanesUndefined: Self = StObject.set(x, "detectedPlanes", js.undefined)
  }
}
