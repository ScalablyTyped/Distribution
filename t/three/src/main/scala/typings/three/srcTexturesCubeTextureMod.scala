package typings.three

import typings.three.srcConstantsMod.Mapping
import typings.three.srcConstantsMod.PixelFormat
import typings.three.srcConstantsMod.TextureDataType
import typings.three.srcConstantsMod.TextureEncoding
import typings.three.srcConstantsMod.TextureFilter
import typings.three.srcConstantsMod.Wrapping
import typings.three.srcTexturesTextureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/textures/CubeTexture", JSImport.Namespace)
@js.native
object srcTexturesCubeTextureMod extends js.Object {
  @js.native
  class CubeTexture protected () extends Texture {
    def this(
       // HTMLImageElement or HTMLCanvasElement
    images: js.UndefOr[js.Array[_]],
      mapping: js.UndefOr[Mapping],
      wrapS: js.UndefOr[Wrapping],
      wrapT: js.UndefOr[Wrapping],
      magFilter: js.UndefOr[TextureFilter],
      minFilter: js.UndefOr[TextureFilter],
      format: js.UndefOr[PixelFormat],
      `type`: js.UndefOr[TextureDataType],
      anisotropy: js.UndefOr[Double],
      encoding: js.UndefOr[TextureEncoding]
    ) = this()
    var images: js.Any = js.native
  }
  
}

