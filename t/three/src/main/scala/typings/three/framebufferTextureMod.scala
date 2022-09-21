package typings.three

import typings.three.srcConstantsMod.PixelFormat
import typings.three.textureMod.Texture
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object framebufferTextureMod {
  
  @JSImport("three/src/textures/FramebufferTexture", "FramebufferTexture")
  @js.native
  open class FramebufferTexture protected () extends Texture {
    def this(width: Double, height: Double, format: PixelFormat) = this()
    
    val isFramebufferTexture: `true` = js.native
  }
}
