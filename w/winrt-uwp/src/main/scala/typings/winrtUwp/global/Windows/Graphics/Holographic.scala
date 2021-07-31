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
    var id: js.Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var isStereo: js.Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var renderTargetSize: js.Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var setFarPlaneDistance: js.Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var setNearPlaneDistance: js.Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var viewportScaleFactor: js.Any = js.native
  }
  
  @JSGlobal("Windows.Graphics.Holographic.HolographicCameraPose")
  @js.native
  abstract class HolographicCameraPose ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Holographic.HolographicCameraPose {
    
    /* CompleteClass */
    var farPlaneDistance: js.Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var holographicCamera: js.Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var nearPlaneDistance: js.Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var projectionTransform: js.Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var tryGetCullingFrustum: js.Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var tryGetViewTransform: js.Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var tryGetVisibleFrustum: js.Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var viewport: js.Any = js.native
  }
  
  @JSGlobal("Windows.Graphics.Holographic.HolographicCameraRenderingParameters")
  @js.native
  abstract class HolographicCameraRenderingParameters ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Holographic.HolographicCameraRenderingParameters {
    
    /* CompleteClass */
    var direct3D11BackBuffer: js.Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var direct3D11Device: js.Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var setFocusPoint: js.Any = js.native
  }
  
  @JSGlobal("Windows.Graphics.Holographic.HolographicFrame")
  @js.native
  abstract class HolographicFrame ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Holographic.HolographicFrame {
    
    /* CompleteClass */
    var addedCameras: js.Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var currentPrediction: js.Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var duration: js.Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var getRenderingParameters: js.Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var presentUsingCurrentPrediction: js.Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var removedCameras: js.Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var updateCurrentPrediction: js.Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var waitForFrameToFinish: js.Any = js.native
  }
  
  @JSGlobal("Windows.Graphics.Holographic.HolographicFramePrediction")
  @js.native
  abstract class HolographicFramePrediction ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Holographic.HolographicFramePrediction {
    
    /* CompleteClass */
    var cameraPoses: js.Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var timestamp: js.Any = js.native
  }
  
  object HolographicFramePresentResult {
    
    @JSGlobal("Windows.Graphics.Holographic.HolographicFramePresentResult")
    @js.native
    val ^ : js.Any = js.native
    
    /* unmapped type */
    @JSGlobal("Windows.Graphics.Holographic.HolographicFramePresentResult.deviceRemoved")
    @js.native
    def deviceRemoved: js.Any = js.native
    @scala.inline
    def deviceRemoved_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deviceRemoved")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Holographic.HolographicFramePresentResult.success")
    @js.native
    def success: js.Any = js.native
    @scala.inline
    def success_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("success")(x.asInstanceOf[js.Any])
  }
  
  object HolographicFramePresentWaitBehavior {
    
    @JSGlobal("Windows.Graphics.Holographic.HolographicFramePresentWaitBehavior")
    @js.native
    val ^ : js.Any = js.native
    
    /* unmapped type */
    @JSGlobal("Windows.Graphics.Holographic.HolographicFramePresentWaitBehavior.doNotWaitForFrameToFinish")
    @js.native
    def doNotWaitForFrameToFinish: js.Any = js.native
    @scala.inline
    def doNotWaitForFrameToFinish_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("doNotWaitForFrameToFinish")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Holographic.HolographicFramePresentWaitBehavior.waitForFrameToFinish")
    @js.native
    def waitForFrameToFinish: js.Any = js.native
    @scala.inline
    def waitForFrameToFinish_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("waitForFrameToFinish")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Graphics.Holographic.HolographicSpace")
  @js.native
  abstract class HolographicSpace ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Holographic.HolographicSpace {
    
    /* unmapped type */
    /* CompleteClass */
    var addEventListener: js.Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var createNextFrame: js.Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var oncameraadded: js.Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var oncameraremoved: js.Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var primaryAdapterId: js.Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var removeEventListener: js.Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var setDirect3D11Device: js.Any = js.native
  }
  object HolographicSpace {
    
    @JSGlobal("Windows.Graphics.Holographic.HolographicSpace")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Windows.Graphics.Holographic.HolographicSpace.createForCoreWindow")
    @js.native
    def createForCoreWindow: js.Any = js.native
    @scala.inline
    def createForCoreWindow_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createForCoreWindow")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Graphics.Holographic.HolographicSpaceCameraAddedEventArgs")
  @js.native
  abstract class HolographicSpaceCameraAddedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Holographic.HolographicSpaceCameraAddedEventArgs {
    
    /* CompleteClass */
    var camera: js.Any = js.native
    
    /* unmapped type */
    /* CompleteClass */
    var getDeferral: js.Any = js.native
  }
  
  @JSGlobal("Windows.Graphics.Holographic.HolographicSpaceCameraRemovedEventArgs")
  @js.native
  abstract class HolographicSpaceCameraRemovedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Graphics.Holographic.HolographicSpaceCameraRemovedEventArgs {
    
    /* CompleteClass */
    var camera: js.Any = js.native
  }
}
