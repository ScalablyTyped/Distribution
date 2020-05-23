package typings.webvrApi

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class VRDisplay ()
    extends typings.webvrApi.VRDisplay
  
  @js.native
  class VRDisplayCapabilities ()
    extends typings.webvrApi.VRDisplayCapabilities {
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
  
  @js.native
  class VRDisplayEvent protected ()
    extends typings.webvrApi.VRDisplayEvent {
    def this(`type`: String, eventInitDict: VRDisplayEventInit) = this()
  }
  
  @js.native
  class VREyeParameters ()
    extends typings.webvrApi.VREyeParameters {
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
  
  @js.native
  class VRFieldOfView ()
    extends typings.webvrApi.VRFieldOfView {
    /* CompleteClass */
    override val downDegrees: Double = js.native
    /* CompleteClass */
    override val leftDegrees: Double = js.native
    /* CompleteClass */
    override val rightDegrees: Double = js.native
    /* CompleteClass */
    override val upDegrees: Double = js.native
  }
  
  @js.native
  class VRFrameData ()
    extends typings.webvrApi.VRFrameData {
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
  
  @js.native
  class VRPose ()
    extends typings.webvrApi.VRPose {
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
  
  @js.native
  object VRDisplay
    extends Instantiable0[typings.webvrApi.VRDisplay]
  
  @js.native
  object VRDisplayCapabilities
    extends Instantiable0[typings.webvrApi.VRDisplayCapabilities]
  
  @js.native
  object VRDisplayEvent
    extends Instantiable2[
          /* type */ String, 
          /* eventInitDict */ VRDisplayEventInit, 
          typings.webvrApi.VRDisplayEvent
        ]
  
  @js.native
  object VREyeParameters
    extends Instantiable0[typings.webvrApi.VREyeParameters]
  
  @js.native
  object VRFieldOfView
    extends Instantiable0[typings.webvrApi.VRFieldOfView]
  
  @js.native
  object VRFrameData
    extends Instantiable0[typings.webvrApi.VRFrameData]
  
  @js.native
  object VRPose
    extends Instantiable0[typings.webvrApi.VRPose]
  
}

