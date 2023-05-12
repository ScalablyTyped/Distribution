package typings.three.buildThreeDotminMod

import typings.three.srcConstantsMod.PixelFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.min", "FramebufferTexture")
@js.native
open class FramebufferTexture protected ()
  extends typings.three.srcThreeMod.FramebufferTexture {
  /**
    * Create a new instance of {@link FramebufferTexture}
    * @param width The width of the texture.
    * @param height The height of the texture.
    * @param format See {@link Texture.format | .format}. Default {@link THREE.RGBAFormat}.
    */
  def this(width: Double, height: Double, format: PixelFormat) = this()
}
