package typings.threeTdsLoader.anon

import org.scalablytyped.runtime.Instantiable10
import typings.std.TexImageSource
import typings.three.mod.Texture
import typings.three.srcConstantsMod.ColorSpace
import typings.three.srcConstantsMod.MagnificationTextureFilter
import typings.three.srcConstantsMod.Mapping
import typings.three.srcConstantsMod.MinificationTextureFilter
import typings.three.srcConstantsMod.PixelFormat
import typings.three.srcConstantsMod.TextureDataType
import typings.three.srcConstantsMod.Wrapping
import typings.three.srcTexturesTextureMod.OffscreenCanvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTexture
  extends StObject
     with Instantiable10[
      /* image */ js.UndefOr[TexImageSource | OffscreenCanvas], 
      /* mapping */ js.UndefOr[Mapping], 
      /* wrapS */ js.UndefOr[Wrapping], 
      /* wrapT */ js.UndefOr[Wrapping], 
      /* magFilter */ js.UndefOr[MagnificationTextureFilter], 
      /* minFilter */ js.UndefOr[MinificationTextureFilter], 
      /* format */ js.UndefOr[PixelFormat], 
      /* type */ js.UndefOr[TextureDataType], 
      /* anisotropy */ js.UndefOr[Double], 
      /* colorSpace */ js.UndefOr[ColorSpace], 
      Texture
    ] {
  
  /**
    * The Global default value for {@link anisotropy | .anisotropy}.
    * @defaultValue `1`.
    */
  var DEFAULT_ANISOTROPY: Double = js.native
  
  /**
    * The Global default value for {@link Texture.image | .image}.
    * @defaultValue `null`.
    */
  var DEFAULT_IMAGE: Any = js.native
  
  /**
    * The Global default value for {@link mapping | .mapping}.
    * @defaultValue {@link THREE.UVMapping}
    */
  var DEFAULT_MAPPING: Mapping = js.native
}
