package typings.three

import typings.three.cubeTextureMod.CubeTexture
import typings.three.sceneMod.Scene
import typings.three.textureMod.Texture
import typings.three.webGLRenderTargetMod.WebGLRenderTarget
import typings.three.webGLRendererMod.WebGLRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pmremgeneratorMod {
  
  @JSImport("three/src/extras/PMREMGenerator", "PMREMGenerator")
  @js.native
  open class PMREMGenerator protected () extends StObject {
    def this(renderer: WebGLRenderer) = this()
    
    def compileCubemapShader(): Unit = js.native
    
    def compileEquirectangularShader(): Unit = js.native
    
    def dispose(): Unit = js.native
    
    def fromCubemap(cubemap: CubeTexture): WebGLRenderTarget = js.native
    def fromCubemap(cubemap: CubeTexture, renderTarget: WebGLRenderTarget): WebGLRenderTarget = js.native
    
    def fromEquirectangular(equirectangular: Texture): WebGLRenderTarget = js.native
    def fromEquirectangular(equirectangular: Texture, renderTarget: WebGLRenderTarget): WebGLRenderTarget = js.native
    
    def fromScene(scene: Scene): WebGLRenderTarget = js.native
    def fromScene(scene: Scene, sigma: Double): WebGLRenderTarget = js.native
    def fromScene(scene: Scene, sigma: Double, near: Double): WebGLRenderTarget = js.native
    def fromScene(scene: Scene, sigma: Double, near: Double, far: Double): WebGLRenderTarget = js.native
    def fromScene(scene: Scene, sigma: Double, near: Unit, far: Double): WebGLRenderTarget = js.native
    def fromScene(scene: Scene, sigma: Unit, near: Double): WebGLRenderTarget = js.native
    def fromScene(scene: Scene, sigma: Unit, near: Double, far: Double): WebGLRenderTarget = js.native
    def fromScene(scene: Scene, sigma: Unit, near: Unit, far: Double): WebGLRenderTarget = js.native
  }
}
