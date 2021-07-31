package typings.webvrApi

import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("VRDisplay")
  @js.native
  class VRDisplay ()
    extends StObject
       with typings.webvrApi.VRDisplay
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("VRDisplayCapabilities")
  @js.native
  class VRDisplayCapabilities ()
    extends StObject
       with typings.webvrApi.VRDisplayCapabilities {
    
    /* CompleteClass */
    override val canPresent: Boolean = js.native
    
    /* CompleteClass */
    override val hasExternalDisplay: Boolean = js.native
    
    /* CompleteClass */
    override val hasOrientation: Boolean = js.native
    
    /* CompleteClass */
    override val hasPosition: Boolean = js.native
    
    /* CompleteClass */
    override val maxLayers: Double = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("VRDisplayEvent")
  @js.native
  class VRDisplayEvent protected ()
    extends StObject
       with typings.webvrApi.VRDisplayEvent {
    def this(`type`: String, eventInitDict: VRDisplayEventInit) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("VREyeParameters")
  @js.native
  class VREyeParameters ()
    extends StObject
       with typings.webvrApi.VREyeParameters {
    
    /** @deprecated */
    /* CompleteClass */
    override val fieldOfView: typings.webvrApi.VRFieldOfView = js.native
    
    /* CompleteClass */
    override val offset: Float32Array = js.native
    
    /* CompleteClass */
    override val renderHeight: Double = js.native
    
    /* CompleteClass */
    override val renderWidth: Double = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("VRFieldOfView")
  @js.native
  class VRFieldOfView ()
    extends StObject
       with typings.webvrApi.VRFieldOfView {
    
    /* CompleteClass */
    override val downDegrees: Double = js.native
    
    /* CompleteClass */
    override val leftDegrees: Double = js.native
    
    /* CompleteClass */
    override val rightDegrees: Double = js.native
    
    /* CompleteClass */
    override val upDegrees: Double = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("VRFrameData")
  @js.native
  class VRFrameData ()
    extends StObject
       with typings.webvrApi.VRFrameData {
    
    /* CompleteClass */
    override val leftProjectionMatrix: Float32Array = js.native
    
    /* CompleteClass */
    override val leftViewMatrix: Float32Array = js.native
    
    /* CompleteClass */
    override val pose: typings.webvrApi.VRPose = js.native
    
    /* CompleteClass */
    override val rightProjectionMatrix: Float32Array = js.native
    
    /* CompleteClass */
    override val rightViewMatrix: Float32Array = js.native
    
    /* CompleteClass */
    override val timestamp: Double = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("VRPose")
  @js.native
  class VRPose ()
    extends StObject
       with typings.webvrApi.VRPose {
    
    /* CompleteClass */
    override val angularAcceleration: Float32Array | Null = js.native
    
    /* CompleteClass */
    override val angularVelocity: Float32Array | Null = js.native
    
    /* CompleteClass */
    override val linearAcceleration: Float32Array | Null = js.native
    
    /* CompleteClass */
    override val linearVelocity: Float32Array | Null = js.native
    
    /* CompleteClass */
    override val orientation: Float32Array | Null = js.native
    
    /* CompleteClass */
    override val position: Float32Array | Null = js.native
    
    /* CompleteClass */
    override val timestamp: Double = js.native
  }
}
