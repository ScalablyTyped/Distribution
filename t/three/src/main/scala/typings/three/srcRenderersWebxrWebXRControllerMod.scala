package typings.three

import typings.three.anon.DataType
import typings.three.anon.PartialXRHandJoints
import typings.three.srcMathVector3Mod.Vector3
import typings.three.srcObjectsGroupMod.Group
import typings.webxr.XRFrame
import typings.webxr.XRInputSource
import typings.webxr.XRInputSourceEventType
import typings.webxr.XRReferenceSpace
import typings.webxr.XRSessionEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRenderersWebxrWebXRControllerMod {
  
  @JSImport("three/src/renderers/webxr/WebXRController", "WebXRController")
  @js.native
  open class WebXRController () extends StObject {
    
    def disconnect(inputSource: XRInputSource): this.type = js.native
    
    def dispatchEvent(event: DataType): this.type = js.native
    
    def getGripSpace(): XRGripSpace = js.native
    
    def getHandSpace(): XRHandSpace = js.native
    
    def getTargetRaySpace(): XRTargetRaySpace = js.native
    
    def update(inputSource: XRInputSource, frame: XRFrame, referenceSpace: XRReferenceSpace): this.type = js.native
  }
  
  @JSImport("three/src/renderers/webxr/WebXRController", "XRGripSpace")
  @js.native
  open class XRGripSpace () extends Group {
    
    val angularVelocity: Vector3 = js.native
    
    var hasAngularVelocity: Boolean = js.native
    
    var hasLinearVelocity: Boolean = js.native
    
    val linearVelocity: Vector3 = js.native
  }
  
  @JSImport("three/src/renderers/webxr/WebXRController", "XRHandSpace")
  @js.native
  open class XRHandSpace () extends Group {
    
    val inputState: XRHandInputState = js.native
    
    val joints: PartialXRHandJoints = js.native
  }
  
  @JSImport("three/src/renderers/webxr/WebXRController", "XRTargetRaySpace")
  @js.native
  open class XRTargetRaySpace () extends Group {
    
    val angularVelocity: Vector3 = js.native
    
    var hasAngularVelocity: Boolean = js.native
    
    var hasLinearVelocity: Boolean = js.native
    
    val linearVelocity: Vector3 = js.native
  }
  
  type XRControllerEventType = XRSessionEventType | XRInputSourceEventType | "disconnected" | "connected"
  
  trait XRHandInputState extends StObject {
    
    var pinching: Boolean
  }
  object XRHandInputState {
    
    inline def apply(pinching: Boolean): XRHandInputState = {
      val __obj = js.Dynamic.literal(pinching = pinching.asInstanceOf[js.Any])
      __obj.asInstanceOf[XRHandInputState]
    }
    
    extension [Self <: XRHandInputState](x: Self) {
      
      inline def setPinching(value: Boolean): Self = StObject.set(x, "pinching", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Record<webxr.XRHandJoint, number> */
  trait XRHandJoints extends StObject {
    
    var `index-finger-metacarpal`: Double
    
    var `index-finger-phalanx-distal`: Double
    
    var `index-finger-phalanx-intermediate`: Double
    
    var `index-finger-phalanx-proximal`: Double
    
    var `index-finger-tip`: Double
    
    var `middle-finger-metacarpal`: Double
    
    var `middle-finger-phalanx-distal`: Double
    
    var `middle-finger-phalanx-intermediate`: Double
    
    var `middle-finger-phalanx-proximal`: Double
    
    var `middle-finger-tip`: Double
    
    var `pinky-finger-metacarpal`: Double
    
    var `pinky-finger-phalanx-distal`: Double
    
    var `pinky-finger-phalanx-intermediate`: Double
    
    var `pinky-finger-phalanx-proximal`: Double
    
    var `pinky-finger-tip`: Double
    
    var `ring-finger-metacarpal`: Double
    
    var `ring-finger-phalanx-distal`: Double
    
    var `ring-finger-phalanx-intermediate`: Double
    
    var `ring-finger-phalanx-proximal`: Double
    
    var `ring-finger-tip`: Double
    
    var `thumb-metacarpal`: Double
    
    var `thumb-phalanx-distal`: Double
    
    var `thumb-phalanx-proximal`: Double
    
    var `thumb-tip`: Double
    
    var wrist: Double
  }
  object XRHandJoints {
    
    inline def apply(
      `index-finger-metacarpal`: Double,
      `index-finger-phalanx-distal`: Double,
      `index-finger-phalanx-intermediate`: Double,
      `index-finger-phalanx-proximal`: Double,
      `index-finger-tip`: Double,
      `middle-finger-metacarpal`: Double,
      `middle-finger-phalanx-distal`: Double,
      `middle-finger-phalanx-intermediate`: Double,
      `middle-finger-phalanx-proximal`: Double,
      `middle-finger-tip`: Double,
      `pinky-finger-metacarpal`: Double,
      `pinky-finger-phalanx-distal`: Double,
      `pinky-finger-phalanx-intermediate`: Double,
      `pinky-finger-phalanx-proximal`: Double,
      `pinky-finger-tip`: Double,
      `ring-finger-metacarpal`: Double,
      `ring-finger-phalanx-distal`: Double,
      `ring-finger-phalanx-intermediate`: Double,
      `ring-finger-phalanx-proximal`: Double,
      `ring-finger-tip`: Double,
      `thumb-metacarpal`: Double,
      `thumb-phalanx-distal`: Double,
      `thumb-phalanx-proximal`: Double,
      `thumb-tip`: Double,
      wrist: Double
    ): XRHandJoints = {
      val __obj = js.Dynamic.literal(wrist = wrist.asInstanceOf[js.Any])
      __obj.updateDynamic("index-finger-metacarpal")(`index-finger-metacarpal`.asInstanceOf[js.Any])
      __obj.updateDynamic("index-finger-phalanx-distal")(`index-finger-phalanx-distal`.asInstanceOf[js.Any])
      __obj.updateDynamic("index-finger-phalanx-intermediate")(`index-finger-phalanx-intermediate`.asInstanceOf[js.Any])
      __obj.updateDynamic("index-finger-phalanx-proximal")(`index-finger-phalanx-proximal`.asInstanceOf[js.Any])
      __obj.updateDynamic("index-finger-tip")(`index-finger-tip`.asInstanceOf[js.Any])
      __obj.updateDynamic("middle-finger-metacarpal")(`middle-finger-metacarpal`.asInstanceOf[js.Any])
      __obj.updateDynamic("middle-finger-phalanx-distal")(`middle-finger-phalanx-distal`.asInstanceOf[js.Any])
      __obj.updateDynamic("middle-finger-phalanx-intermediate")(`middle-finger-phalanx-intermediate`.asInstanceOf[js.Any])
      __obj.updateDynamic("middle-finger-phalanx-proximal")(`middle-finger-phalanx-proximal`.asInstanceOf[js.Any])
      __obj.updateDynamic("middle-finger-tip")(`middle-finger-tip`.asInstanceOf[js.Any])
      __obj.updateDynamic("pinky-finger-metacarpal")(`pinky-finger-metacarpal`.asInstanceOf[js.Any])
      __obj.updateDynamic("pinky-finger-phalanx-distal")(`pinky-finger-phalanx-distal`.asInstanceOf[js.Any])
      __obj.updateDynamic("pinky-finger-phalanx-intermediate")(`pinky-finger-phalanx-intermediate`.asInstanceOf[js.Any])
      __obj.updateDynamic("pinky-finger-phalanx-proximal")(`pinky-finger-phalanx-proximal`.asInstanceOf[js.Any])
      __obj.updateDynamic("pinky-finger-tip")(`pinky-finger-tip`.asInstanceOf[js.Any])
      __obj.updateDynamic("ring-finger-metacarpal")(`ring-finger-metacarpal`.asInstanceOf[js.Any])
      __obj.updateDynamic("ring-finger-phalanx-distal")(`ring-finger-phalanx-distal`.asInstanceOf[js.Any])
      __obj.updateDynamic("ring-finger-phalanx-intermediate")(`ring-finger-phalanx-intermediate`.asInstanceOf[js.Any])
      __obj.updateDynamic("ring-finger-phalanx-proximal")(`ring-finger-phalanx-proximal`.asInstanceOf[js.Any])
      __obj.updateDynamic("ring-finger-tip")(`ring-finger-tip`.asInstanceOf[js.Any])
      __obj.updateDynamic("thumb-metacarpal")(`thumb-metacarpal`.asInstanceOf[js.Any])
      __obj.updateDynamic("thumb-phalanx-distal")(`thumb-phalanx-distal`.asInstanceOf[js.Any])
      __obj.updateDynamic("thumb-phalanx-proximal")(`thumb-phalanx-proximal`.asInstanceOf[js.Any])
      __obj.updateDynamic("thumb-tip")(`thumb-tip`.asInstanceOf[js.Any])
      __obj.asInstanceOf[XRHandJoints]
    }
    
    extension [Self <: XRHandJoints](x: Self) {
      
      inline def `setIndex-finger-metacarpal`(value: Double): Self = StObject.set(x, "index-finger-metacarpal", value.asInstanceOf[js.Any])
      
      inline def `setIndex-finger-phalanx-distal`(value: Double): Self = StObject.set(x, "index-finger-phalanx-distal", value.asInstanceOf[js.Any])
      
      inline def `setIndex-finger-phalanx-intermediate`(value: Double): Self = StObject.set(x, "index-finger-phalanx-intermediate", value.asInstanceOf[js.Any])
      
      inline def `setIndex-finger-phalanx-proximal`(value: Double): Self = StObject.set(x, "index-finger-phalanx-proximal", value.asInstanceOf[js.Any])
      
      inline def `setIndex-finger-tip`(value: Double): Self = StObject.set(x, "index-finger-tip", value.asInstanceOf[js.Any])
      
      inline def `setMiddle-finger-metacarpal`(value: Double): Self = StObject.set(x, "middle-finger-metacarpal", value.asInstanceOf[js.Any])
      
      inline def `setMiddle-finger-phalanx-distal`(value: Double): Self = StObject.set(x, "middle-finger-phalanx-distal", value.asInstanceOf[js.Any])
      
      inline def `setMiddle-finger-phalanx-intermediate`(value: Double): Self = StObject.set(x, "middle-finger-phalanx-intermediate", value.asInstanceOf[js.Any])
      
      inline def `setMiddle-finger-phalanx-proximal`(value: Double): Self = StObject.set(x, "middle-finger-phalanx-proximal", value.asInstanceOf[js.Any])
      
      inline def `setMiddle-finger-tip`(value: Double): Self = StObject.set(x, "middle-finger-tip", value.asInstanceOf[js.Any])
      
      inline def `setPinky-finger-metacarpal`(value: Double): Self = StObject.set(x, "pinky-finger-metacarpal", value.asInstanceOf[js.Any])
      
      inline def `setPinky-finger-phalanx-distal`(value: Double): Self = StObject.set(x, "pinky-finger-phalanx-distal", value.asInstanceOf[js.Any])
      
      inline def `setPinky-finger-phalanx-intermediate`(value: Double): Self = StObject.set(x, "pinky-finger-phalanx-intermediate", value.asInstanceOf[js.Any])
      
      inline def `setPinky-finger-phalanx-proximal`(value: Double): Self = StObject.set(x, "pinky-finger-phalanx-proximal", value.asInstanceOf[js.Any])
      
      inline def `setPinky-finger-tip`(value: Double): Self = StObject.set(x, "pinky-finger-tip", value.asInstanceOf[js.Any])
      
      inline def `setRing-finger-metacarpal`(value: Double): Self = StObject.set(x, "ring-finger-metacarpal", value.asInstanceOf[js.Any])
      
      inline def `setRing-finger-phalanx-distal`(value: Double): Self = StObject.set(x, "ring-finger-phalanx-distal", value.asInstanceOf[js.Any])
      
      inline def `setRing-finger-phalanx-intermediate`(value: Double): Self = StObject.set(x, "ring-finger-phalanx-intermediate", value.asInstanceOf[js.Any])
      
      inline def `setRing-finger-phalanx-proximal`(value: Double): Self = StObject.set(x, "ring-finger-phalanx-proximal", value.asInstanceOf[js.Any])
      
      inline def `setRing-finger-tip`(value: Double): Self = StObject.set(x, "ring-finger-tip", value.asInstanceOf[js.Any])
      
      inline def `setThumb-metacarpal`(value: Double): Self = StObject.set(x, "thumb-metacarpal", value.asInstanceOf[js.Any])
      
      inline def `setThumb-phalanx-distal`(value: Double): Self = StObject.set(x, "thumb-phalanx-distal", value.asInstanceOf[js.Any])
      
      inline def `setThumb-phalanx-proximal`(value: Double): Self = StObject.set(x, "thumb-phalanx-proximal", value.asInstanceOf[js.Any])
      
      inline def `setThumb-tip`(value: Double): Self = StObject.set(x, "thumb-tip", value.asInstanceOf[js.Any])
      
      inline def setWrist(value: Double): Self = StObject.set(x, "wrist", value.asInstanceOf[js.Any])
    }
  }
}
