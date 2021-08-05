package typings.webxr

import typings.webxr.mod.XRPlaneSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
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
  
  trait Enabled extends StObject {
    
    var enabled: Boolean
  }
  object Enabled {
    
    inline def apply(enabled: Boolean): Enabled = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Enabled]
    }
    
    extension [Self <: Enabled](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlaneDetectionState extends StObject {
    
    var planeDetectionState: js.UndefOr[Enabled] = js.undefined
  }
  object PlaneDetectionState {
    
    inline def apply(): PlaneDetectionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlaneDetectionState]
    }
    
    extension [Self <: PlaneDetectionState](x: Self) {
      
      inline def setPlaneDetectionState(value: Enabled): Self = StObject.set(x, "planeDetectionState", value.asInstanceOf[js.Any])
      
      inline def setPlaneDetectionStateUndefined: Self = StObject.set(x, "planeDetectionState", js.undefined)
    }
  }
}
