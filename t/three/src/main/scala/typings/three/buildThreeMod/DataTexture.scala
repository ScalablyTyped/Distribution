package typings.three.buildThreeMod

import typings.std.BufferSource
import typings.three.srcConstantsMod.ColorSpace
import typings.three.srcConstantsMod.MagnificationTextureFilter
import typings.three.srcConstantsMod.Mapping
import typings.three.srcConstantsMod.MinificationTextureFilter
import typings.three.srcConstantsMod.PixelFormat
import typings.three.srcConstantsMod.TextureDataType
import typings.three.srcConstantsMod.Wrapping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three", "DataTexture")
@js.native
open class DataTexture protected ()
  extends typings.three.srcThreeMod.DataTexture {
  /**
    * @param data {@link https://developer.mozilla.org/en-US/docs/Web/API/ArrayBufferView | ArrayBufferView} of the texture. Default `null`.
    * @param width Width of the texture. Default `1`.
    * @param height Height of the texture. Default `1`.
    * @param format See {@link Texture.format | .format}. Default {@link THREE.RGBAFormat}
    * @param type See {@link Texture.type | .type}. Default {@link THREE.UnsignedByteType}
    * @param mapping See {@link Texture.mapping | .mapping}. Default {@link THREE.Texture.DEFAULT_MAPPING}
    * @param wrapS See {@link Texture.wrapS | .wrapS}. Default {@link THREE.ClampToEdgeWrapping}
    * @param wrapT See {@link Texture.wrapT | .wrapT}. Default {@link THREE.ClampToEdgeWrapping}
    * @param magFilter See {@link Texture.magFilter | .magFilter}. Default {@link THREE.NearestFilter}
    * @param minFilter  See {@link Texture.minFilter | .minFilter}. Default {@link THREE.NearestFilter}
    * @param anisotropy See {@link Texture.anisotropy | .anisotropy}. Default {@link THREE.Texture.DEFAULT_ANISOTROPY}
    * @param colorSpace See {@link Texture.colorSpace | .colorSpace}. Default {@link NoColorSpace}
    */
  def this(
    data: js.UndefOr[BufferSource | Null],
    width: js.UndefOr[Double],
    height: js.UndefOr[Double],
    format: js.UndefOr[PixelFormat],
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
