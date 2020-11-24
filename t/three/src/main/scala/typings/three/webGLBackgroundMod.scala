package typings.three

import typings.three.cameraMod.Camera
import typings.three.colorMod.Color
import typings.three.sceneMod.Scene
import typings.three.webGLCubeMapsMod.WebGLCubeMaps
import typings.three.webGLObjectsMod.WebGLObjects
import typings.three.webGLRenderListsMod.WebGLRenderList
import typings.three.webGLRendererMod.WebGLRenderer
import typings.three.webGLStateMod.WebGLState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/renderers/webgl/WebGLBackground", JSImport.Namespace)
@js.native
object webGLBackgroundMod extends js.Object {
  
  @js.native
  class WebGLBackground protected () extends js.Object {
    def this(
      renderer: WebGLRenderer,
      cubemaps: WebGLCubeMaps,
      state: WebGLState,
      objects: WebGLObjects,
      premultipliedAlpha: Boolean
    ) = this()
    
    def getClearAlpha(): Double = js.native
    
    def getClearColor(): Color = js.native
    
    def render(renderList: WebGLRenderList, scene: Scene, camera: Camera, forceClear: Boolean): Unit = js.native
    
    def setClearAlpha(alpha: Double): Unit = js.native
    
    def setClearColor(color: Color, alpha: Double): Unit = js.native
  }
}
