package typings.three

import typings.std.DOMHighResTimeStamp
import typings.three.srcThreeMod.DirectionalLight
import typings.three.srcThreeMod.Group
import typings.three.srcThreeMod.LightProbe
import typings.three.srcThreeMod.Texture
import typings.three.srcThreeMod.WebGLRenderer
import typings.webxr.XRFrame
import typings.webxr.XRFrameRequestCallback
import typings.webxr.XRWebGLBinding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmWebxrXrestimatedlightMod {
  
  @JSImport("three/examples/jsm/webxr/XREstimatedLight", "SessionLightProbe")
  @js.native
  open class SessionLightProbe protected () extends StObject {
    def this(
      xrLight: XREstimatedLight,
      renderer: WebGLRenderer,
      lightProbe: LightProbe,
      environmentEstimation: Boolean,
      estimationStartCallback: js.Function0[Unit]
    ) = this()
    
    def dispose(): Unit = js.native
    
    def estimationStartCallback(): Unit = js.native
    
    def frameCallback(time: Double, xrFrame: XRFrame): Unit = js.native
    
    var lightProbe: LightProbe = js.native
    
    def onXRFrame(time: DOMHighResTimeStamp, frame: XRFrame): Unit = js.native
    @JSName("onXRFrame")
    var onXRFrame_Original: XRFrameRequestCallback = js.native
    
    var renderer: WebGLRenderer = js.native
    
    def updateReflection(): Unit = js.native
    
    var xrLight: XREstimatedLight = js.native
    
    var xrWebGLBinding: XRWebGLBinding | Null = js.native
  }
  
  @JSImport("three/examples/jsm/webxr/XREstimatedLight", "XREstimatedLight")
  @js.native
  open class XREstimatedLight protected () extends Group {
    def this(renderer: WebGLRenderer) = this()
    def this(renderer: WebGLRenderer, environmentEstimation: Boolean) = this()
    
    var directionalLight: DirectionalLight = js.native
    
    var environment: Texture = js.native
    
    var lightProbe: LightProbe = js.native
  }
}
