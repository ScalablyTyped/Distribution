package typings.three.buildThreeDotmoduleDotminMod

import typings.three.srcConstantsMod.DeepTexturePixelFormat
import typings.three.srcConstantsMod.MagnificationTextureFilter
import typings.three.srcConstantsMod.Mapping
import typings.three.srcConstantsMod.MinificationTextureFilter
import typings.three.srcConstantsMod.TextureDataType
import typings.three.srcConstantsMod.Wrapping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.module.min", "DepthTexture")
@js.native
open class DepthTexture protected ()
  extends typings.three.srcThreeMod.DepthTexture {
  /**
    * Create a new instance of {@link DepthTexture}
    * @param width Width of the texture.
    * @param height Height of the texture.
    * @param type See {@link Texture.type | .type}. Default {@link THREE.UnsignedByteType} or {@link THREE.UnsignedInt248Type}
    * @param mapping See {@link Texture.mapping | .mapping}. Default {@link THREE.Texture.DEFAULT_MAPPING}
    * @param wrapS See {@link Texture.wrapS | .wrapS}. Default {@link THREE.ClampToEdgeWrapping}
    * @param wrapT See {@link Texture.wrapT | .wrapT}. Default {@link THREE.ClampToEdgeWrapping}
    * @param magFilter See {@link Texture.magFilter | .magFilter}. Default {@link THREE.NearestFilter}
    * @param minFilter  See {@link Texture.minFilter | .minFilter}. Default {@link THREE.NearestFilter}
    * @param anisotropy See {@link Texture.anisotropy | .anisotropy}. Default {@link THREE.Texture.DEFAULT_ANISOTROPY}
    * @param format See {@link DepthTexture.format | .format}. Default {@link THREE.DepthFormat}
    */
  def this(
    width: Double,
    height: Double,
    `type`: js.UndefOr[TextureDataType],
    mapping: js.UndefOr[Mapping],
    wrapS: js.UndefOr[Wrapping],
    wrapT: js.UndefOr[Wrapping],
    magFilter: js.UndefOr[MagnificationTextureFilter],
    minFilter: js.UndefOr[MinificationTextureFilter],
    anisotropy: js.UndefOr[Double],
    format: js.UndefOr[DeepTexturePixelFormat]
  ) = this()
}
