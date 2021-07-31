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
    
    @scala.inline
    def apply(): DetectedPlanes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DetectedPlanes]
    }
    
    @scala.inline
    implicit class DetectedPlanesMutableBuilder[Self <: DetectedPlanes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetectedPlanes(value: XRPlaneSet): Self = StObject.set(x, "detectedPlanes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectedPlanesUndefined: Self = StObject.set(x, "detectedPlanes", js.undefined)
    }
  }
  
  trait Enabled extends StObject {
    
    var enabled: Boolean
  }
  object Enabled {
    
    @scala.inline
    def apply(enabled: Boolean): Enabled = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Enabled]
    }
    
    @scala.inline
    implicit class EnabledMutableBuilder[Self <: Enabled] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlaneDetectionState extends StObject {
    
    var planeDetectionState: js.UndefOr[Enabled] = js.undefined
  }
  object PlaneDetectionState {
    
    @scala.inline
    def apply(): PlaneDetectionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlaneDetectionState]
    }
    
    @scala.inline
    implicit class PlaneDetectionStateMutableBuilder[Self <: PlaneDetectionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlaneDetectionState(value: Enabled): Self = StObject.set(x, "planeDetectionState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaneDetectionStateUndefined: Self = StObject.set(x, "planeDetectionState", js.undefined)
    }
  }
}
