package typings.winrtUwp.global.Windows.Graphics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Holographic")
@js.native
object Holographic extends js.Object {
  @js.native
  abstract class HolographicCamera ()
    extends typings.winrtUwp.Windows.Graphics.Holographic.HolographicCamera
  
  @js.native
  abstract class HolographicCameraPose ()
    extends typings.winrtUwp.Windows.Graphics.Holographic.HolographicCameraPose
  
  @js.native
  abstract class HolographicCameraRenderingParameters ()
    extends typings.winrtUwp.Windows.Graphics.Holographic.HolographicCameraRenderingParameters
  
  @js.native
  abstract class HolographicFrame ()
    extends typings.winrtUwp.Windows.Graphics.Holographic.HolographicFrame
  
  @js.native
  abstract class HolographicFramePrediction ()
    extends typings.winrtUwp.Windows.Graphics.Holographic.HolographicFramePrediction
  
  @js.native
  abstract class HolographicSpace ()
    extends typings.winrtUwp.Windows.Graphics.Holographic.HolographicSpace
  
  @js.native
  abstract class HolographicSpaceCameraAddedEventArgs ()
    extends typings.winrtUwp.Windows.Graphics.Holographic.HolographicSpaceCameraAddedEventArgs
  
  @js.native
  abstract class HolographicSpaceCameraRemovedEventArgs ()
    extends typings.winrtUwp.Windows.Graphics.Holographic.HolographicSpaceCameraRemovedEventArgs
  
  @js.native
  object HolographicFramePresentResult extends js.Object {
    var deviceRemoved: js.Any = js.native
    var success: js.Any = js.native
  }
  
  @js.native
  object HolographicFramePresentWaitBehavior extends js.Object {
    var doNotWaitForFrameToFinish: js.Any = js.native
    var waitForFrameToFinish: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object HolographicSpace extends js.Object {
    var createForCoreWindow: js.Any = js.native
  }
  
}

