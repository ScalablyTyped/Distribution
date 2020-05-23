package typings.winrtUwp.global.Windows.Graphics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Holographic")
@js.native
object Holographic extends js.Object {
  @js.native
  abstract class HolographicCamera ()
    extends typings.winrtUwp.Windows.Graphics.Holographic.HolographicCamera {
    /* CompleteClass */
    override var id: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var isStereo: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var renderTargetSize: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var setFarPlaneDistance: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var setNearPlaneDistance: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var viewportScaleFactor: js.Any = js.native
  }
  
  @js.native
  abstract class HolographicCameraPose ()
    extends typings.winrtUwp.Windows.Graphics.Holographic.HolographicCameraPose {
    /* CompleteClass */
    override var farPlaneDistance: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var holographicCamera: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var nearPlaneDistance: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var projectionTransform: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var tryGetCullingFrustum: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var tryGetViewTransform: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var tryGetVisibleFrustum: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var viewport: js.Any = js.native
  }
  
  @js.native
  abstract class HolographicCameraRenderingParameters ()
    extends typings.winrtUwp.Windows.Graphics.Holographic.HolographicCameraRenderingParameters {
    /* CompleteClass */
    override var direct3D11BackBuffer: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var direct3D11Device: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var setFocusPoint: js.Any = js.native
  }
  
  @js.native
  abstract class HolographicFrame ()
    extends typings.winrtUwp.Windows.Graphics.Holographic.HolographicFrame {
    /* CompleteClass */
    override var addedCameras: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var currentPrediction: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var duration: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var getRenderingParameters: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var presentUsingCurrentPrediction: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var removedCameras: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var updateCurrentPrediction: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var waitForFrameToFinish: js.Any = js.native
  }
  
  @js.native
  abstract class HolographicFramePrediction ()
    extends typings.winrtUwp.Windows.Graphics.Holographic.HolographicFramePrediction {
    /* CompleteClass */
    override var cameraPoses: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var timestamp: js.Any = js.native
  }
  
  @js.native
  abstract class HolographicSpace ()
    extends typings.winrtUwp.Windows.Graphics.Holographic.HolographicSpace {
     /* unmapped type */ /* CompleteClass */
    override var addEventListener: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var createNextFrame: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var oncameraadded: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var oncameraremoved: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var primaryAdapterId: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var removeEventListener: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var setDirect3D11Device: js.Any = js.native
  }
  
  @js.native
  abstract class HolographicSpaceCameraAddedEventArgs ()
    extends typings.winrtUwp.Windows.Graphics.Holographic.HolographicSpaceCameraAddedEventArgs {
    /* CompleteClass */
    override var camera: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var getDeferral: js.Any = js.native
  }
  
  @js.native
  abstract class HolographicSpaceCameraRemovedEventArgs ()
    extends typings.winrtUwp.Windows.Graphics.Holographic.HolographicSpaceCameraRemovedEventArgs {
    /* CompleteClass */
    override var camera: js.Any = js.native
  }
  
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

