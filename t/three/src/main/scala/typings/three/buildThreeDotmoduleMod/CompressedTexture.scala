package typings.three.buildThreeDotmoduleMod

import typings.std.ImageData
import typings.three.srcConstantsMod.ColorSpace
import typings.three.srcConstantsMod.CompressedPixelFormat
import typings.three.srcConstantsMod.MagnificationTextureFilter
import typings.three.srcConstantsMod.Mapping
import typings.three.srcConstantsMod.MinificationTextureFilter
import typings.three.srcConstantsMod.TextureDataType
import typings.three.srcConstantsMod.Wrapping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.module", "CompressedTexture")
@js.native
open class CompressedTexture protected ()
  extends typings.three.srcThreeMod.CompressedTexture {
  /**
    * This creates a new {@link THREE.CompressedTexture | CompressedTexture} object.
    * @param mipmaps The mipmaps array should contain objects with data, width and height.
    * The mipmaps should be of the correct {@link format} and {@link type}. See {@link THREE.mipmaps}.
    * @param width The width of the biggest mipmap.
    * @param height The height of the biggest mipmap.
    * @param format The format used in the mipmaps. See {@link THREE.CompressedPixelFormat}.
    * @param type See {@link Texture.type | .type}. Default {@link THREE.UnsignedByteType}
    * @param mapping See {@link Texture.mapping | .mapping}. Default {@link THREE.Texture.DEFAULT_MAPPING}
    * @param wrapS See {@link Texture.wrapS | .wrapS}. Default {@link THREE.ClampToEdgeWrapping}
    * @param wrapT See {@link Texture.wrapT | .wrapT}. Default {@link THREE.ClampToEdgeWrapping}
    * @param magFilter See {@link Texture.magFilter | .magFilter}. Default {@link THREE.LinearFilter}
    * @param minFilter  See {@link Texture.minFilter | .minFilter}. Default {@link THREE.LinearMipmapLinearFilter}
    * @param anisotropy See {@link Texture.anisotropy | .anisotropy}. Default {@link THREE.Texture.DEFAULT_ANISOTROPY}
    * @param colorSpace See {@link Texture.colorSpace .colorSpace}. Default {@link NoColorSpace}
    */
  def this(
    mipmaps: js.Array[ImageData],
    width: Double,
    height: Double,
    format: CompressedPixelFormat,
    `type`: js.UndefOr[TextureDataType],
    mapping: js.UndefOr[Mapping],
    wrapS: js.UndefOr[Wrapping],
    wrapT: js.UndefOr[Wrapping],
    magFilter: js.UndefOr[MagnificationTextureFilter],
    minFilter: js.UndefOr[MinificationTextureFilter],
    anisotropy: js.UndefOr[Double],
    colorSpace: js.UndefOr[ColorSpace]
  ) = this()
}
