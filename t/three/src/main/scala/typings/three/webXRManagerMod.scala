package typings.three

import typings.std.WebGLRenderingContext
import typings.three.cameraMod.Camera
import typings.three.groupMod.Group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webvr/WebXRManager", JSImport.Namespace)
@js.native
object webXRManagerMod extends js.Object {
  @js.native
  class WebXRManager protected () extends js.Object {
    def this(renderer: js.Any, gl: WebGLRenderingContext) = this()
    var enabled: Boolean = js.native
    def dispose(): Unit = js.native
    def getCamera(camera: Camera): Camera = js.native
    def getController(id: Double): Group = js.native
    def getSession(): js.Any = js.native
    def isPresenting(): Boolean = js.native
    def setAnimationLoop(callback: js.Function): Unit = js.native
    def setFramebufferScaleFactor(value: Double): Unit = js.native
    def setReferenceSpaceType(value: String): Unit = js.native
    def setSession(value: js.Any): Unit = js.native
  }
  
}

