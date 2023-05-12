package typings.three

import typings.three.srcConstantsMod.PixelFormat
import typings.three.srcTexturesTextureMod.Texture
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTexturesFramebufferTextureMod {
  
  @JSImport("three/src/textures/FramebufferTexture", "FramebufferTexture")
  @js.native
  open class FramebufferTexture protected () extends Texture {
    /**
      * Create a new instance of {@link FramebufferTexture}
      * @param width The width of the texture.
      * @param height The height of the texture.
      * @param format See {@link Texture.format | .format}. Default {@link THREE.RGBAFormat}.
      */
    def this(width: Double, height: Double, format: PixelFormat) = this()
    
    /**
      * Read-only flag to check if a given object is of type {@link FramebufferTexture}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isFramebufferTexture: `true` = js.native
  }
}
