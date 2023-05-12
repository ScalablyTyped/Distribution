package typings.three

import typings.three.srcRenderersWebGLRenderTargetMod.WebGLRenderTarget
import typings.three.srcRenderersWebGLRendererMod.WebGLRenderer
import typings.three.srcScenesSceneMod.Scene
import typings.three.srcTexturesCubeTextureMod.CubeTexture
import typings.three.srcTexturesTextureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExtrasPmremgeneratorMod {
  
  @JSImport("three/src/extras/PMREMGenerator", "PMREMGenerator")
  @js.native
  open class PMREMGenerator protected () extends StObject {
    /**
      * This constructor creates a new PMREMGenerator.
      * @param renderer
      */
    def this(renderer: WebGLRenderer) = this()
    
    /**
      * Pre-compiles the cubemap shader
      * @remarks
      * You can get faster start-up by invoking this method during your texture's network fetch for increased concurrency.
      */
    def compileCubemapShader(): Unit = js.native
    
    /**
      * Pre-compiles the equirectangular shader
      * @remarks
      * You can get faster start-up by invoking this method during your texture's network fetch for increased concurrency.
      */
    def compileEquirectangularShader(): Unit = js.native
    
    /**
      * Frees the GPU-related resources allocated by this instance
      * @remarks
      * Call this method whenever this instance is no longer used in your app.
      */
    def dispose(): Unit = js.native
    
    /**
      * Generates a PMREM from an cubemap texture.
      * @param cubemap The cubemap texture.
      */
    def fromCubemap(cubemap: CubeTexture): WebGLRenderTarget = js.native
    def fromCubemap(cubemap: CubeTexture, renderTarget: WebGLRenderTarget): WebGLRenderTarget = js.native
    
    /**
      * Generates a PMREM from an equirectangular texture.
      * @param equirectangular The equirectangular texture.
      */
    def fromEquirectangular(equirectangular: Texture): WebGLRenderTarget = js.native
    def fromEquirectangular(equirectangular: Texture, renderTarget: WebGLRenderTarget): WebGLRenderTarget = js.native
    
    /**
      * Generates a PMREM from a supplied Scene, which can be faster than using an image if networking bandwidth is low
      * @remarks
      * Optional near and far planes ensure the scene is rendered in its entirety (the cubeCamera is placed at the origin).
      * @param scene The given scene.
      * @param sigma Specifies a blur radius in radians to be applied to the scene before PMREM generation. Default `0`.
      * @param near The near plane value. Default `0.1`.
      * @param far The far plane value. Default `100`.
      */
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
