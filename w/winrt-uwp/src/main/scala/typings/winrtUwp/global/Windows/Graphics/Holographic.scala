package typings.winrtUwp.global.Windows.Graphics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Holographic {
  
  @JSGlobal("Windows.Graphics.Holographic.HolographicCamera")
  @js.native
  abstract class HolographicCamera ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Holographic.HolographicCamera {
    
    /* CompleteClass */
    var id: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var isStereo: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var renderTargetSize: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var setFarPlaneDistance: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var setNearPlaneDistance: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var viewportScaleFactor: Any = js.native
  }
  
  @JSGlobal("Windows.Graphics.Holographic.HolographicCameraPose")
  @js.native
  abstract class HolographicCameraPose ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Holographic.HolographicCameraPose {
    
    /* CompleteClass */
    var farPlaneDistance: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var holographicCamera: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var nearPlaneDistance: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var projectionTransform: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var tryGetCullingFrustum: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var tryGetViewTransform: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var tryGetVisibleFrustum: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var viewport: Any = js.native
  }
  
  @JSGlobal("Windows.Graphics.Holographic.HolographicCameraRenderingParameters")
  @js.native
  abstract class HolographicCameraRenderingParameters ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Holographic.HolographicCameraRenderingParameters {
    
    /* CompleteClass */
    var direct3D11BackBuffer: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var direct3D11Device: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var setFocusPoint: Any = js.native
  }
  
  @JSGlobal("Windows.Graphics.Holographic.HolographicFrame")
  @js.native
  abstract class HolographicFrame ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Holographic.HolographicFrame {
    
    /* CompleteClass */
    var addedCameras: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var currentPrediction: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var duration: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var getRenderingParameters: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var presentUsingCurrentPrediction: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var removedCameras: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var updateCurrentPrediction: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var waitForFrameToFinish: Any = js.native
  }
  
  @JSGlobal("Windows.Graphics.Holographic.HolographicFramePrediction")
  @js.native
  abstract class HolographicFramePrediction ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Holographic.HolographicFramePrediction {
    
    /* CompleteClass */
    var cameraPoses: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var timestamp: Any = js.native
  }
  
  object HolographicFramePresentResult {
    
    @JSGlobal("Windows.Graphics.Holographic.HolographicFramePresentResult")
    @js.native
    val ^ : js.Any = js.native
    
    /* unmapped type */
    @JSGlobal("Windows.Graphics.Holographic.HolographicFramePresentResult.deviceRemoved")
    @js.native
    def deviceRemoved: Any = js.native
    inline def deviceRemoved_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deviceRemoved")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Holographic.HolographicFramePresentResult.success")
    @js.native
    def success: Any = js.native
    inline def success_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("success")(x.asInstanceOf[js.Any])
  }
  
  object HolographicFramePresentWaitBehavior {
    
    @JSGlobal("Windows.Graphics.Holographic.HolographicFramePresentWaitBehavior")
    @js.native
    val ^ : js.Any = js.native
    
    /* unmapped type */
    @JSGlobal("Windows.Graphics.Holographic.HolographicFramePresentWaitBehavior.doNotWaitForFrameToFinish")
    @js.native
    def doNotWaitForFrameToFinish: Any = js.native
    inline def doNotWaitForFrameToFinish_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("doNotWaitForFrameToFinish")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Holographic.HolographicFramePresentWaitBehavior.waitForFrameToFinish")
    @js.native
    def waitForFrameToFinish: Any = js.native
    inline def waitForFrameToFinish_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("waitForFrameToFinish")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Graphics.Holographic.HolographicSpace")
  @js.native
  abstract class HolographicSpace ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Holographic.HolographicSpace {
    
    /* unmapped type */
    /* CompleteClass */
    var addEventListener: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var createNextFrame: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var oncameraadded: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var oncameraremoved: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var primaryAdapterId: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var removeEventListener: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var setDirect3D11Device: Any = js.native
  }
  object HolographicSpace {
    
    @JSGlobal("Windows.Graphics.Holographic.HolographicSpace")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Windows.Graphics.Holographic.HolographicSpace.createForCoreWindow")
    @js.native
    def createForCoreWindow: Any = js.native
    inline def createForCoreWindow_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createForCoreWindow")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Graphics.Holographic.HolographicSpaceCameraAddedEventArgs")
  @js.native
  abstract class HolographicSpaceCameraAddedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Holographic.HolographicSpaceCameraAddedEventArgs {
    
    /* CompleteClass */
    var camera: Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var getDeferral: Any = js.native
  }
  
  @JSGlobal("Windows.Graphics.Holographic.HolographicSpaceCameraRemovedEventArgs")
  @js.native
  abstract class HolographicSpaceCameraRemovedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Holographic.HolographicSpaceCameraRemovedEventArgs {
    
    /* CompleteClass */
    var camera: Any = js.native
  }
}
