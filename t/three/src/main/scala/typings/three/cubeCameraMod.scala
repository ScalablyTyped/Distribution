package typings.three

import typings.three.eventDispatcherMod.Event
import typings.three.object3DMod.Object3D
import typings.three.sceneMod.Scene
import typings.three.webGLCubeRenderTargetMod.WebGLCubeRenderTarget
import typings.three.webGLRendererMod.WebGLRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cubeCameraMod {
  
  @JSImport("three/src/cameras/CubeCamera", "CubeCamera")
  @js.native
  open class CubeCamera protected () extends Object3D[Event] {
    def this(near: Double, far: Double, renderTarget: WebGLCubeRenderTarget) = this()
    
    var renderTarget: WebGLCubeRenderTarget = js.native
    
    @JSName("type")
    var type_CubeCamera: typings.three.threeStrings.CubeCamera = js.native
    
    def update(renderer: WebGLRenderer, scene: Scene): Unit = js.native
  }
}
