package typings.winrtUwp.global.Windows.Graphics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Holographic {
  
  @JSGlobal("Windows.Graphics.Holographic.HolographicCamera")
  @js.native
  abstract class HolographicCamera ()
    extends typings.winrtUwp.Windows.Graphics.Holographic.HolographicCamera
  
  @JSGlobal("Windows.Graphics.Holographic.HolographicCameraPose")
  @js.native
  abstract class HolographicCameraPose ()
    extends typings.winrtUwp.Windows.Graphics.Holographic.HolographicCameraPose
  
  @JSGlobal("Windows.Graphics.Holographic.HolographicCameraRenderingParameters")
  @js.native
  abstract class HolographicCameraRenderingParameters ()
    extends typings.winrtUwp.Windows.Graphics.Holographic.HolographicCameraRenderingParameters
  
  @JSGlobal("Windows.Graphics.Holographic.HolographicFrame")
  @js.native
  abstract class HolographicFrame ()
    extends typings.winrtUwp.Windows.Graphics.Holographic.HolographicFrame
  
  @JSGlobal("Windows.Graphics.Holographic.HolographicFramePrediction")
  @js.native
  abstract class HolographicFramePrediction ()
    extends typings.winrtUwp.Windows.Graphics.Holographic.HolographicFramePrediction
  
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
    extends typings.winrtUwp.Windows.Graphics.Holographic.HolographicSpace
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
    extends typings.winrtUwp.Windows.Graphics.Holographic.HolographicSpaceCameraAddedEventArgs
  
  @JSGlobal("Windows.Graphics.Holographic.HolographicSpaceCameraRemovedEventArgs")
  @js.native
  abstract class HolographicSpaceCameraRemovedEventArgs ()
    extends typings.winrtUwp.Windows.Graphics.Holographic.HolographicSpaceCameraRemovedEventArgs
}
