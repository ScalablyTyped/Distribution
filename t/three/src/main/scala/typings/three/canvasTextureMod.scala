package typings.three

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.three.constantsMod.Mapping
import typings.three.constantsMod.PixelFormat
import typings.three.constantsMod.TextureDataType
import typings.three.constantsMod.TextureFilter
import typings.three.constantsMod.Wrapping
import typings.three.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/textures/CanvasTexture", JSImport.Namespace)
@js.native
object canvasTextureMod extends js.Object {
  @js.native
  class CanvasTexture protected () extends Texture {
    def this(
      canvas: HTMLImageElement | HTMLCanvasElement | HTMLVideoElement,
      mapping: js.UndefOr[Mapping],
      wrapS: js.UndefOr[Wrapping],
      wrapT: js.UndefOr[Wrapping],
      magFilter: js.UndefOr[TextureFilter],
      minFilter: js.UndefOr[TextureFilter],
      format: js.UndefOr[PixelFormat],
      `type`: js.UndefOr[TextureDataType],
      anisotropy: js.UndefOr[Double]
    ) = this()
  }
  
}

