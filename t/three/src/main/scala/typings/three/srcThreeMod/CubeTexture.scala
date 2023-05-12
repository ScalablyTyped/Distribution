package typings.three.srcThreeMod

import typings.three.srcConstantsMod.ColorSpace
import typings.three.srcConstantsMod.CubeTextureMapping
import typings.three.srcConstantsMod.MagnificationTextureFilter
import typings.three.srcConstantsMod.MinificationTextureFilter
import typings.three.srcConstantsMod.PixelFormat
import typings.three.srcConstantsMod.TextureDataType
import typings.three.srcConstantsMod.Wrapping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/Three", "CubeTexture")
@js.native
open class CubeTexture protected ()
  extends typings.three.srcTexturesCubeTextureMod.CubeTexture {
  /**
    * This creates a new {@link THREE.CubeTexture | CubeTexture} object.
    * @param images
    * @param mapping See {@link CubeTexture.mapping | .mapping}. Default {@link THREE.CubeReflectionMapping}
    * @param wrapS See {@link Texture.wrapS | .wrapS}. Default {@link THREE.ClampToEdgeWrapping}
    * @param wrapT See {@link Texture.wrapT | .wrapT}. Default {@link THREE.ClampToEdgeWrapping}
    * @param magFilter See {@link Texture.magFilter | .magFilter}. Default {@link THREE.LinearFilter}
    * @param minFilter  See {@link Texture.minFilter | .minFilter}. Default {@link THREE.LinearMipmapLinearFilter}
    * @param format See {@link Texture.format | .format}. Default {@link THREE.RGBAFormat}
    * @param type See {@link Texture.type | .type}. Default {@link THREE.UnsignedByteType}
    * @param anisotropy See {@link Texture.anisotropy | .anisotropy}. Default {@link THREE.Texture.DEFAULT_ANISOTROPY}
    * @param colorSpace See {@link Texture.colorSpace | .colorSpace}. Default {@link NoColorSpace}
    */
  def this(
    images: js.UndefOr[js.Array[Any]],
    // HTMLImageElement or HTMLCanvasElement
  mapping: js.UndefOr[CubeTextureMapping],
    wrapS: js.UndefOr[Wrapping],
    wrapT: js.UndefOr[Wrapping],
    magFilter: js.UndefOr[MagnificationTextureFilter],
    minFilter: js.UndefOr[MinificationTextureFilter],
    format: js.UndefOr[PixelFormat],
    `type`: js.UndefOr[TextureDataType],
    anisotropy: js.UndefOr[Double],
    colorSpace: js.UndefOr[ColorSpace]
  ) = this()
}
