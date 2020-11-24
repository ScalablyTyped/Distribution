package typings.three

import typings.std.WebGLRenderingContext
import typings.three.cameraMod.Camera
import typings.three.eventDispatcherMod.EventDispatcher
import typings.three.groupMod.Group
import typings.three.webXRMod.XRFrameRequestCallback
import typings.three.webXRMod.XRReferenceSpace
import typings.three.webXRMod.XRReferenceSpaceType
import typings.three.webXRMod.XRSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/renderers/webxr/WebXRManager", JSImport.Namespace)
@js.native
object webXRManagerMod extends js.Object {
  
  @js.native
  class WebXRManager protected () extends EventDispatcher {
    def this(renderer: js.Any, gl: WebGLRenderingContext) = this()
    
    def dispose(): Unit = js.native
    
    /**
    	 * @default false
    	 */
    var enabled: Boolean = js.native
    
    def getCamera(camera: Camera): Camera = js.native
    
    def getController(id: Double): Group = js.native
    
    def getControllerGrip(id: Double): Group = js.native
    
    def getReferenceSpace(): XRReferenceSpace = js.native
    
    def getSession(): XRSession = js.native
    
    /**
    	 * @default false
    	 */
    var isPresenting: Boolean = js.native
    
    def setAnimationLoop(callback: XRFrameRequestCallback): Unit = js.native
    
    def setFramebufferScaleFactor(value: Double): Unit = js.native
    
    def setReferenceSpaceType(value: XRReferenceSpaceType): Unit = js.native
    
    def setSession(value: XRSession): Unit = js.native
  }
}
