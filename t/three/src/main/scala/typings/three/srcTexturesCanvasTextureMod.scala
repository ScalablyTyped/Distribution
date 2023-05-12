package typings.three

import typings.std.TexImageSource
import typings.three.srcConstantsMod.MagnificationTextureFilter
import typings.three.srcConstantsMod.Mapping
import typings.three.srcConstantsMod.MinificationTextureFilter
import typings.three.srcConstantsMod.PixelFormat
import typings.three.srcConstantsMod.TextureDataType
import typings.three.srcConstantsMod.Wrapping
import typings.three.srcTexturesTextureMod.OffscreenCanvas
import typings.three.srcTexturesTextureMod.Texture
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTexturesCanvasTextureMod {
  
  @JSImport("three/src/textures/CanvasTexture", "CanvasTexture")
  @js.native
  open class CanvasTexture protected () extends Texture {
    /**
      * This creates a new {@link THREE.CanvasTexture | CanvasTexture} object.
      * @param canvas The HTML canvas element from which to load the texture.
      * @param mapping See {@link Texture.mapping | .mapping}. Default {@link THREE.Texture.DEFAULT_MAPPING}
      * @param wrapS See {@link Texture.wrapS | .wrapS}. Default {@link THREE.ClampToEdgeWrapping}
      * @param wrapT See {@link Texture.wrapT | .wrapT}. Default {@link THREE.ClampToEdgeWrapping}
      * @param magFilter See {@link Texture.magFilter | .magFilter}. Default {@link THREE.LinearFilter}
      * @param minFilter  See {@link Texture.minFilter | .minFilter}. Default {@link THREE.LinearMipmapLinearFilter}
      * @param format See {@link Texture.format | .format}. Default {@link THREE.RGBAFormat}
      * @param type See {@link Texture.type | .type}. Default {@link THREE.UnsignedByteType}
      * @param anisotropy See {@link Texture.anisotropy | .anisotropy}. Default {@link THREE.Texture.DEFAULT_ANISOTROPY}
      */
    def this(
      canvas: TexImageSource | OffscreenCanvas,
      mapping: js.UndefOr[Mapping],
      wrapS: js.UndefOr[Wrapping],
      wrapT: js.UndefOr[Wrapping],
      magFilter: js.UndefOr[MagnificationTextureFilter],
      minFilter: js.UndefOr[MinificationTextureFilter],
      format: js.UndefOr[PixelFormat],
      `type`: js.UndefOr[TextureDataType],
      anisotropy: js.UndefOr[Double]
    ) = this()
    
    /**
      * Read-only flag to check if a given object is of type {@link CanvasTexture}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isCanvasTexture: `true` = js.native
  }
}
