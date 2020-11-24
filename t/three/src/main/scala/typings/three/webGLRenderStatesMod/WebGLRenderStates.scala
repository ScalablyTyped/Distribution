package typings.three.webGLRenderStatesMod

import typings.three.cameraMod.Camera
import typings.three.sceneMod.Scene
import typings.three.webGLCapabilitiesMod.WebGLCapabilities
import typings.three.webGLExtensionsMod.WebGLExtensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/renderers/webgl/WebGLRenderStates", "WebGLRenderStates")
@js.native
class WebGLRenderStates protected () extends js.Object {
  def this(extensions: WebGLExtensions, capabilities: WebGLCapabilities) = this()
  
  def dispose(): Unit = js.native
  
  def get(scene: Scene, camera: Camera): WebGLRenderState = js.native
}
