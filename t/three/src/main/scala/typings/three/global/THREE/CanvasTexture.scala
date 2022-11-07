package typings.three.global.THREE

import typings.std.TexImageSource
import typings.three.srcTexturesTextureMod.OffscreenCanvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.CanvasTexture")
@js.native
open class CanvasTexture protected ()
  extends typings.three.mod.CanvasTexture {
  /**
    * @param canvas
    * @param [format=THREE.RGBAFormat]
    * @param [type=THREE.UnsignedByteType]
    * @param [mapping=THREE.Texture.DEFAULT_MAPPING]
    * @param [wrapS=THREE.ClampToEdgeWrapping]
    * @param [wrapT=THREE.ClampToEdgeWrapping]
    * @param [magFilter=THREE.LinearFilter]
    * @param [minFilter=THREE.LinearMipmapLinearFilter]
    * @param [anisotropy=1]
    * @param [encoding=THREE.LinearEncoding]
    */
  def this(
    canvas: TexImageSource | OffscreenCanvas,
    mapping: js.UndefOr[typings.three.srcConstantsMod.Mapping],
    wrapS: js.UndefOr[typings.three.srcConstantsMod.Wrapping],
    wrapT: js.UndefOr[typings.three.srcConstantsMod.Wrapping],
    magFilter: js.UndefOr[typings.three.srcConstantsMod.TextureFilter],
    minFilter: js.UndefOr[typings.three.srcConstantsMod.TextureFilter],
    format: js.UndefOr[typings.three.srcConstantsMod.PixelFormat],
    `type`: js.UndefOr[typings.three.srcConstantsMod.TextureDataType],
    anisotropy: js.UndefOr[Double]
  ) = this()
}
