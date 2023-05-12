package typings.three

import typings.three.srcConstantsMod.ColorSpace
import typings.three.srcConstantsMod.CubeTextureMapping
import typings.three.srcConstantsMod.MagnificationTextureFilter
import typings.three.srcConstantsMod.MinificationTextureFilter
import typings.three.srcConstantsMod.PixelFormat
import typings.three.srcConstantsMod.TextureDataType
import typings.three.srcConstantsMod.Wrapping
import typings.three.srcTexturesTextureMod.Texture
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTexturesCubeTextureMod {
  
  @JSImport("three/src/textures/CubeTexture", "CubeTexture")
  @js.native
  open class CubeTexture protected () extends Texture {
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
    
    /**
      * An image object, typically created using the {@link THREE.CubeTextureLoader.load | CubeTextureLoader.load()} method.
      * @see {@link Texture.image}
      */
    def images: Any = js.native
    def images_=(data: Any): Unit = js.native
    
    /**
      * Read-only flag to check if a given object is of type {@link CubeTexture}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isCubeTexture: `true` = js.native
    
    /**
      * @inheritDoc
      * @defaultValue {@link THREE.CubeReflectionMapping}
      */
    @JSName("mapping")
    var mapping_CubeTexture: CubeTextureMapping = js.native
  }
}
