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
    
    def connect(inputSource: XRInputSource): this.type = js.native
    
    def disconnect(inputSource: XRInputSource): this.type = js.native
    
    def dispatchEvent(event: DataType): this.type = js.native
    
    def getGripSpace(): XRGripSpace = js.native
    
    def getHandSpace(): XRHandSpace = js.native
    
    def getTargetRaySpace(): XRTargetRaySpace = js.native
    
    def update(inputSource: XRInputSource, frame: XRFrame, referenceSpace: XRReferenceSpace): this.type = js.native
  }
  
  @JSImport("three/src/renderers/webxr/WebXRController", "XRGripSpace")
  @js.native
  /**
    * Creates a new {@link Bone}.
    */
  open class XRGripSpace () extends Group {
    
    val angularVelocity: Vector3 = js.native
    
    var hasAngularVelocity: Boolean = js.native
    
    var hasLinearVelocity: Boolean = js.native
    
    val linearVelocity: Vector3 = js.native
  }
  
  @JSImport("three/src/renderers/webxr/WebXRController", "XRHandSpace")
  @js.native
  /**
    * Creates a new {@link Bone}.
    */
  open class XRHandSpace () extends Group {
    
    val inputState: XRHandInputState = js.native
    
    val joints: PartialXRHandJoints = js.native
  }
  
  @JSImport("three/src/renderers/webxr/WebXRController", "XRJointSpace")
  @js.native
  /**
    * Creates a new {@link Bone}.
    */
  open class XRJointSpace () extends Group {
    
    val jointRadius: js.UndefOr[Double] = js.native
  }
  
  @JSImport("three/src/renderers/webxr/WebXRController", "XRTargetRaySpace")
  @js.native
  /**
    * Creates a new {@link Bone}.
    */
  open class XRTargetRaySpace () extends Group {
    
    val angularVelocity: Vector3 = js.native
    
    var hasAngularVelocity: Boolean = js.native
    
    var hasLinearVelocity: Boolean = js.native
    
    val linearVelocity: Vector3 = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.webxr.XRSessionEventType
    - typings.webxr.XRInputSourceEventType
    - typings.three.threeStrings.disconnected
    - typings.three.threeStrings.connected
  */
  type XRControllerEventType = _XRControllerEventType | XRSessionEventType | XRInputSourceEventType
  
  trait XRHandInputState extends StObject {
    
    var pinching: Boolean
  }
  object XRHandInputState {
    
    inline def apply(pinching: Boolean): XRHandInputState = {
      val __obj = js.Dynamic.literal(pinching = pinching.asInstanceOf[js.Any])
      __obj.asInstanceOf[XRHandInputState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XRHandInputState] (val x: Self) extends AnyVal {
      
      inline def setPinching(value: Boolean): Self = StObject.set(x, "pinching", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Record<webxr.XRHandJoint, three.three/src/renderers/webxr/WebXRController.XRJointSpace> */
  trait XRHandJoints extends StObject {
    
    var `index-finger-metacarpal`: XRJointSpace
    
    var `index-finger-phalanx-distal`: XRJointSpace
    
    var `index-finger-phalanx-intermediate`: XRJointSpace
    
    var `index-finger-phalanx-proximal`: XRJointSpace
    
    var `index-finger-tip`: XRJointSpace
    
    var `middle-finger-metacarpal`: XRJointSpace
    
    var `middle-finger-phalanx-distal`: XRJointSpace
    
    var `middle-finger-phalanx-intermediate`: XRJointSpace
    
    var `middle-finger-phalanx-proximal`: XRJointSpace
    
    var `middle-finger-tip`: XRJointSpace
    
    var `pinky-finger-metacarpal`: XRJointSpace
    
    var `pinky-finger-phalanx-distal`: XRJointSpace
    
    var `pinky-finger-phalanx-intermediate`: XRJointSpace
    
    var `pinky-finger-phalanx-proximal`: XRJointSpace
    
    var `pinky-finger-tip`: XRJointSpace
    
    var `ring-finger-metacarpal`: XRJointSpace
    
    var `ring-finger-phalanx-distal`: XRJointSpace
    
    var `ring-finger-phalanx-intermediate`: XRJointSpace
    
    var `ring-finger-phalanx-proximal`: XRJointSpace
    
    var `ring-finger-tip`: XRJointSpace
    
    var `thumb-metacarpal`: XRJointSpace
    
    var `thumb-phalanx-distal`: XRJointSpace
    
    var `thumb-phalanx-proximal`: XRJointSpace
    
    var `thumb-tip`: XRJointSpace
    
    var wrist: XRJointSpace
  }
  object XRHandJoints {
    
    inline def apply(
      `index-finger-metacarpal`: XRJointSpace,
      `index-finger-phalanx-distal`: XRJointSpace,
      `index-finger-phalanx-intermediate`: XRJointSpace,
      `index-finger-phalanx-proximal`: XRJointSpace,
      `index-finger-tip`: XRJointSpace,
      `middle-finger-metacarpal`: XRJointSpace,
      `middle-finger-phalanx-distal`: XRJointSpace,
      `middle-finger-phalanx-intermediate`: XRJointSpace,
      `middle-finger-phalanx-proximal`: XRJointSpace,
      `middle-finger-tip`: XRJointSpace,
      `pinky-finger-metacarpal`: XRJointSpace,
      `pinky-finger-phalanx-distal`: XRJointSpace,
      `pinky-finger-phalanx-intermediate`: XRJointSpace,
      `pinky-finger-phalanx-proximal`: XRJointSpace,
      `pinky-finger-tip`: XRJointSpace,
      `ring-finger-metacarpal`: XRJointSpace,
      `ring-finger-phalanx-distal`: XRJointSpace,
      `ring-finger-phalanx-intermediate`: XRJointSpace,
      `ring-finger-phalanx-proximal`: XRJointSpace,
      `ring-finger-tip`: XRJointSpace,
      `thumb-metacarpal`: XRJointSpace,
      `thumb-phalanx-distal`: XRJointSpace,
      `thumb-phalanx-proximal`: XRJointSpace,
      `thumb-tip`: XRJointSpace,
      wrist: XRJointSpace
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XRHandJoints] (val x: Self) extends AnyVal {
      
      inline def `setIndex-finger-metacarpal`(value: XRJointSpace): Self = StObject.set(x, "index-finger-metacarpal", value.asInstanceOf[js.Any])
      
      inline def `setIndex-finger-phalanx-distal`(value: XRJointSpace): Self = StObject.set(x, "index-finger-phalanx-distal", value.asInstanceOf[js.Any])
      
      inline def `setIndex-finger-phalanx-intermediate`(value: XRJointSpace): Self = StObject.set(x, "index-finger-phalanx-intermediate", value.asInstanceOf[js.Any])
      
      inline def `setIndex-finger-phalanx-proximal`(value: XRJointSpace): Self = StObject.set(x, "index-finger-phalanx-proximal", value.asInstanceOf[js.Any])
      
      inline def `setIndex-finger-tip`(value: XRJointSpace): Self = StObject.set(x, "index-finger-tip", value.asInstanceOf[js.Any])
      
      inline def `setMiddle-finger-metacarpal`(value: XRJointSpace): Self = StObject.set(x, "middle-finger-metacarpal", value.asInstanceOf[js.Any])
      
      inline def `setMiddle-finger-phalanx-distal`(value: XRJointSpace): Self = StObject.set(x, "middle-finger-phalanx-distal", value.asInstanceOf[js.Any])
      
      inline def `setMiddle-finger-phalanx-intermediate`(value: XRJointSpace): Self = StObject.set(x, "middle-finger-phalanx-intermediate", value.asInstanceOf[js.Any])
      
      inline def `setMiddle-finger-phalanx-proximal`(value: XRJointSpace): Self = StObject.set(x, "middle-finger-phalanx-proximal", value.asInstanceOf[js.Any])
      
      inline def `setMiddle-finger-tip`(value: XRJointSpace): Self = StObject.set(x, "middle-finger-tip", value.asInstanceOf[js.Any])
      
      inline def `setPinky-finger-metacarpal`(value: XRJointSpace): Self = StObject.set(x, "pinky-finger-metacarpal", value.asInstanceOf[js.Any])
      
      inline def `setPinky-finger-phalanx-distal`(value: XRJointSpace): Self = StObject.set(x, "pinky-finger-phalanx-distal", value.asInstanceOf[js.Any])
      
      inline def `setPinky-finger-phalanx-intermediate`(value: XRJointSpace): Self = StObject.set(x, "pinky-finger-phalanx-intermediate", value.asInstanceOf[js.Any])
      
      inline def `setPinky-finger-phalanx-proximal`(value: XRJointSpace): Self = StObject.set(x, "pinky-finger-phalanx-proximal", value.asInstanceOf[js.Any])
      
      inline def `setPinky-finger-tip`(value: XRJointSpace): Self = StObject.set(x, "pinky-finger-tip", value.asInstanceOf[js.Any])
      
      inline def `setRing-finger-metacarpal`(value: XRJointSpace): Self = StObject.set(x, "ring-finger-metacarpal", value.asInstanceOf[js.Any])
      
      inline def `setRing-finger-phalanx-distal`(value: XRJointSpace): Self = StObject.set(x, "ring-finger-phalanx-distal", value.asInstanceOf[js.Any])
      
      inline def `setRing-finger-phalanx-intermediate`(value: XRJointSpace): Self = StObject.set(x, "ring-finger-phalanx-intermediate", value.asInstanceOf[js.Any])
      
      inline def `setRing-finger-phalanx-proximal`(value: XRJointSpace): Self = StObject.set(x, "ring-finger-phalanx-proximal", value.asInstanceOf[js.Any])
      
      inline def `setRing-finger-tip`(value: XRJointSpace): Self = StObject.set(x, "ring-finger-tip", value.asInstanceOf[js.Any])
      
      inline def `setThumb-metacarpal`(value: XRJointSpace): Self = StObject.set(x, "thumb-metacarpal", value.asInstanceOf[js.Any])
      
      inline def `setThumb-phalanx-distal`(value: XRJointSpace): Self = StObject.set(x, "thumb-phalanx-distal", value.asInstanceOf[js.Any])
      
      inline def `setThumb-phalanx-proximal`(value: XRJointSpace): Self = StObject.set(x, "thumb-phalanx-proximal", value.asInstanceOf[js.Any])
      
      inline def `setThumb-tip`(value: XRJointSpace): Self = StObject.set(x, "thumb-tip", value.asInstanceOf[js.Any])
      
      inline def setWrist(value: XRJointSpace): Self = StObject.set(x, "wrist", value.asInstanceOf[js.Any])
    }
  }
  
  trait _XRControllerEventType extends StObject
}
