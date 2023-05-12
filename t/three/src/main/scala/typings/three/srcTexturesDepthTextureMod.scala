package typings.three

import typings.three.anon.Width
import typings.three.srcConstantsMod.DeepTexturePixelFormat
import typings.three.srcConstantsMod.MagnificationTextureFilter
import typings.three.srcConstantsMod.Mapping
import typings.three.srcConstantsMod.MinificationTextureFilter
import typings.three.srcConstantsMod.TextureDataType
import typings.three.srcConstantsMod.Wrapping
import typings.three.srcTexturesTextureMod.Texture
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTexturesDepthTextureMod {
  
  @JSImport("three/src/textures/DepthTexture", "DepthTexture")
  @js.native
  open class DepthTexture protected () extends Texture {
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
    
    /**
      * @override
      * @see {@link Texture.format | Texture.format}
      * @defaultValue {@link THREE.DepthFormat}.
      */
    @JSName("format")
    var format_DepthTexture: DeepTexturePixelFormat = js.native
    
    def image_=(value: Width): Unit = js.native
    
    /**
      * Read-only flag to check if a given object is of type {@link DepthTexture}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isDepthTexture: `true` = js.native
  }
}
