package typings.winrtDashUwp.Windows.Graphics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Holographic")
@js.native
object Holographic extends js.Object {
  @js.native
  abstract class HolographicCamera () extends js.Object {
    var id: js.Any = js.native
     /* unmapped type */ var isStereo: js.Any = js.native
     /* unmapped type */ var renderTargetSize: js.Any = js.native
     /* unmapped type */ var setFarPlaneDistance: js.Any = js.native
     /* unmapped type */ var setNearPlaneDistance: js.Any = js.native
     /* unmapped type */ var viewportScaleFactor: js.Any = js.native
  }
  
  @js.native
  abstract class HolographicCameraPose () extends js.Object {
    var farPlaneDistance: js.Any = js.native
     /* unmapped type */ var holographicCamera: js.Any = js.native
     /* unmapped type */ var nearPlaneDistance: js.Any = js.native
     /* unmapped type */ var projectionTransform: js.Any = js.native
     /* unmapped type */ var tryGetCullingFrustum: js.Any = js.native
     /* unmapped type */ var tryGetViewTransform: js.Any = js.native
     /* unmapped type */ var tryGetVisibleFrustum: js.Any = js.native
     /* unmapped type */ var viewport: js.Any = js.native
  }
  
  @js.native
  abstract class HolographicCameraRenderingParameters () extends js.Object {
    var direct3D11BackBuffer: js.Any = js.native
     /* unmapped type */ var direct3D11Device: js.Any = js.native
     /* unmapped type */ var setFocusPoint: js.Any = js.native
  }
  
  @js.native
  abstract class HolographicFrame () extends js.Object {
    var addedCameras: js.Any = js.native
     /* unmapped type */ var currentPrediction: js.Any = js.native
     /* unmapped type */ var duration: js.Any = js.native
     /* unmapped type */ var getRenderingParameters: js.Any = js.native
     /* unmapped type */ var presentUsingCurrentPrediction: js.Any = js.native
     /* unmapped type */ var removedCameras: js.Any = js.native
     /* unmapped type */ var updateCurrentPrediction: js.Any = js.native
     /* unmapped type */ var waitForFrameToFinish: js.Any = js.native
  }
  
  @js.native
  abstract class HolographicFramePrediction () extends js.Object {
    var cameraPoses: js.Any = js.native
     /* unmapped type */ var timestamp: js.Any = js.native
  }
  
  @js.native
  abstract class HolographicSpace () extends js.Object {
     /* unmapped type */ var addEventListener: js.Any = js.native
     /* unmapped type */ var createNextFrame: js.Any = js.native
     /* unmapped type */ var oncameraadded: js.Any = js.native
     /* unmapped type */ var oncameraremoved: js.Any = js.native
     /* unmapped type */ var primaryAdapterId: js.Any = js.native
     /* unmapped type */ var removeEventListener: js.Any = js.native
     /* unmapped type */ var setDirect3D11Device: js.Any = js.native
  }
  
  @js.native
  abstract class HolographicSpaceCameraAddedEventArgs () extends js.Object {
    var camera: js.Any = js.native
     /* unmapped type */ var getDeferral: js.Any = js.native
  }
  
  @js.native
  abstract class HolographicSpaceCameraRemovedEventArgs () extends js.Object {
    var camera: js.Any = js.native
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

