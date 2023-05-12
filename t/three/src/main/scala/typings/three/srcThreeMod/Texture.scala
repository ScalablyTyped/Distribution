package typings.three.srcThreeMod

import typings.std.TexImageSource
import typings.three.srcConstantsMod.ColorSpace
import typings.three.srcConstantsMod.MagnificationTextureFilter
import typings.three.srcConstantsMod.Mapping
import typings.three.srcConstantsMod.MinificationTextureFilter
import typings.three.srcConstantsMod.PixelFormat
import typings.three.srcConstantsMod.TextureDataType
import typings.three.srcConstantsMod.TextureEncoding
import typings.three.srcConstantsMod.Wrapping
import typings.three.srcTexturesTextureMod.OffscreenCanvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/Three", "Texture")
@js.native
open class Texture protected ()
  extends typings.three.srcTexturesTextureMod.Texture {
  /**
    * This creates a new {@link THREE.Texture | Texture} object.
    * @param image See {@link Texture.image | .image}. Default {@link THREE.Texture.DEFAULT_IMAGE}
    * @param mapping See {@link Texture.mapping | .mapping}. Default {@link THREE.Texture.DEFAULT_MAPPING}
    * @param wrapS See {@link Texture.wrapS | .wrapS}. Default {@link THREE.ClampToEdgeWrapping}
    * @param wrapT See {@link Texture.wrapT | .wrapT}. Default {@link THREE.ClampToEdgeWrapping}
    * @param magFilter See {@link Texture.magFilter | .magFilter}. Default {@link THREE.LinearFilter}
    * @param minFilter  See {@link Texture.minFilter | .minFilter}. Default {@link THREE.LinearMipmapLinearFilter}
    * @param format See {@link Texture.format | .format}. Default {@link THREE.RGBAFormat}
    * @param type See {@link Texture.type | .type}. Default {@link THREE.UnsignedByteType}
    * @param anisotropy See {@link Texture.anisotropy | .anisotropy}. Default {@link THREE.Texture.DEFAULT_ANISOTROPY}
    * @param colorSpace See {@link Texture.colorSpace | .colorSpace}. Default {@link THREE.NoColorSpace}
    */
  def this(
    image: js.UndefOr[TexImageSource | OffscreenCanvas],
    mapping: js.UndefOr[Mapping],
    wrapS: js.UndefOr[Wrapping],
    wrapT: js.UndefOr[Wrapping],
    magFilter: js.UndefOr[MagnificationTextureFilter],
    minFilter: js.UndefOr[MinificationTextureFilter],
    format: js.UndefOr[PixelFormat],
    `type`: js.UndefOr[TextureDataType],
    anisotropy: js.UndefOr[Double],
    colorSpace: js.UndefOr[ColorSpace]
  ) = this()
  /**
    * @deprecated
    */
  def this(
    image: TexImageSource,
    mapping: Mapping,
    wrapS: Wrapping,
    wrapT: Wrapping,
    magFilter: MagnificationTextureFilter,
    minFilter: MinificationTextureFilter,
    format: PixelFormat,
    `type`: TextureDataType,
    anisotropy: Double,
    encoding: TextureEncoding
  ) = this()
  def this(
    image: OffscreenCanvas,
    mapping: Mapping,
    wrapS: Wrapping,
    wrapT: Wrapping,
    magFilter: MagnificationTextureFilter,
    minFilter: MinificationTextureFilter,
    format: PixelFormat,
    `type`: TextureDataType,
    anisotropy: Double,
    encoding: TextureEncoding
  ) = this()
}
/* static members */
object Texture {
  
  @JSImport("three/src/Three", "Texture")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The Global default value for {@link anisotropy | .anisotropy}.
    * @defaultValue `1`.
    */
  @JSImport("three/src/Three", "Texture.DEFAULT_ANISOTROPY")
  @js.native
  def DEFAULT_ANISOTROPY: Double = js.native
  inline def DEFAULT_ANISOTROPY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ANISOTROPY")(x.asInstanceOf[js.Any])
  
  /**
    * The Global default value for {@link Texture.image | .image}.
    * @defaultValue `null`.
    */
  @JSImport("three/src/Three", "Texture.DEFAULT_IMAGE")
  @js.native
  def DEFAULT_IMAGE: Any = js.native
  inline def DEFAULT_IMAGE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_IMAGE")(x.asInstanceOf[js.Any])
  
  /**
    * The Global default value for {@link mapping | .mapping}.
    * @defaultValue {@link THREE.UVMapping}
    */
  @JSImport("three/src/Three", "Texture.DEFAULT_MAPPING")
  @js.native
  def DEFAULT_MAPPING: Mapping = js.native
  inline def DEFAULT_MAPPING_=(x: Mapping): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MAPPING")(x.asInstanceOf[js.Any])
}
