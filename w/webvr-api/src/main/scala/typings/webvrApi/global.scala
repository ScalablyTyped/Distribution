package typings.webvrApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("VRDisplay")
  @js.native
  open class VRDisplay ()
    extends StObject
       with typings.webvrApi.VRDisplay
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("VRDisplayCapabilities")
  @js.native
  open class VRDisplayCapabilities ()
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
  open class VRDisplayEvent protected ()
    extends StObject
       with typings.webvrApi.VRDisplayEvent {
    def this(`type`: String, eventInitDict: VRDisplayEventInit) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("VREyeParameters")
  @js.native
  open class VREyeParameters ()
    extends StObject
       with typings.webvrApi.VREyeParameters {
    
    /** @deprecated */
    /* CompleteClass */
    override val fieldOfView: typings.webvrApi.VRFieldOfView = js.native
    
    /* CompleteClass */
    override val offset: js.typedarray.Float32Array = js.native
    
    /* CompleteClass */
    override val renderHeight: Double = js.native
    
    /* CompleteClass */
    override val renderWidth: Double = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("VRFieldOfView")
  @js.native
  open class VRFieldOfView ()
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
  open class VRFrameData ()
    extends StObject
       with typings.webvrApi.VRFrameData {
    
    /* CompleteClass */
    override val leftProjectionMatrix: js.typedarray.Float32Array = js.native
    
    /* CompleteClass */
    override val leftViewMatrix: js.typedarray.Float32Array = js.native
    
    /* CompleteClass */
    override val pose: typings.webvrApi.VRPose = js.native
    
    /* CompleteClass */
    override val rightProjectionMatrix: js.typedarray.Float32Array = js.native
    
    /* CompleteClass */
    override val rightViewMatrix: js.typedarray.Float32Array = js.native
    
    /* CompleteClass */
    override val timestamp: Double = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("VRPose")
  @js.native
  open class VRPose ()
    extends StObject
       with typings.webvrApi.VRPose {
    
    /* CompleteClass */
    override val angularAcceleration: js.typedarray.Float32Array | Null = js.native
    
    /* CompleteClass */
    override val angularVelocity: js.typedarray.Float32Array | Null = js.native
    
    /* CompleteClass */
    override val linearAcceleration: js.typedarray.Float32Array | Null = js.native
    
    /* CompleteClass */
    override val linearVelocity: js.typedarray.Float32Array | Null = js.native
    
    /* CompleteClass */
    override val orientation: js.typedarray.Float32Array | Null = js.native
    
    /* CompleteClass */
    override val position: js.typedarray.Float32Array | Null = js.native
    
    /* CompleteClass */
    override val timestamp: Double = js.native
  }
}
