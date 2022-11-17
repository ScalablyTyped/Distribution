package typings.three

import typings.std.ImageData
import typings.three.srcConstantsMod.CompressedPixelFormat
import typings.three.srcConstantsMod.TextureDataType
import typings.three.srcConstantsMod.Wrapping
import typings.three.srcTexturesCompressedTextureMod.CompressedTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTexturesCompressedArrayTextureMod {
  
  @JSImport("three/src/textures/CompressedArrayTexture", "CompressedArrayTexture")
  @js.native
  open class CompressedArrayTexture protected () extends CompressedTexture {
    def this(mipmaps: js.Array[ImageData], width: Double, height: Double, depth: Double) = this()
    def this(
      mipmaps: js.Array[ImageData],
      width: Double,
      height: Double,
      depth: Double,
      format: CompressedPixelFormat
    ) = this()
    def this(
      mipmaps: js.Array[ImageData],
      width: Double,
      height: Double,
      depth: Double,
      format: Unit,
      `type`: TextureDataType
    ) = this()
    def this(
      mipmaps: js.Array[ImageData],
      width: Double,
      height: Double,
      depth: Double,
      format: CompressedPixelFormat,
      `type`: TextureDataType
    ) = this()
    
    var isCompressedArrayTexture: true = js.native
    
    var wrapR: Wrapping = js.native
  }
}
