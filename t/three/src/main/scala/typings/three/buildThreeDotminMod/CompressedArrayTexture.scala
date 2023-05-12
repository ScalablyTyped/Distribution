package typings.three.buildThreeDotminMod

import typings.std.ImageData
import typings.three.srcConstantsMod.CompressedPixelFormat
import typings.three.srcConstantsMod.TextureDataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.min", "CompressedArrayTexture")
@js.native
open class CompressedArrayTexture protected ()
  extends typings.three.srcThreeMod.CompressedArrayTexture {
  /**
    * Create a new instance of {@link CompressedArrayTexture}
    * @param mipmaps The mipmaps array should contain objects with data, width and height.
    * The mipmaps should be of the correct {@link format} and {@link type}. See {@link THREE.mipmaps}.
    * @param width The width of the biggest mipmap.
    * @param height The height of the biggest mipmap.
    * @param depth The number of layers of the 2D array texture
    * @param format The format used in the mipmaps. See {@link THREE.CompressedPixelFormat}.
    * @param type See {@link Texture.type | .type}. Default {@link THREE.UnsignedByteType}
    */
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
    format: CompressedPixelFormat,
    `type`: TextureDataType
  ) = this()
}
