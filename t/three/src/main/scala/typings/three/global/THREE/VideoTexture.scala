package typings.three.global.THREE

import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.VideoTexture")
@js.native
open class VideoTexture protected ()
  extends typings.three.mod.VideoTexture {
  /**
    * @param video
    * @param [mapping=THREE.Texture.DEFAULT_MAPPING]
    * @param [wrapS=THREE.ClampToEdgeWrapping]
    * @param [wrapT=THREE.ClampToEdgeWrapping]
    * @param [magFilter=THREE.LinearFilter]
    * @param [minFilter=THREE.LinearFilter]
    * @param [format=THREE.RGBAFormat]
    * @param [type=THREE.UnsignedByteType]
    * @param [anisotropy=1]
    */
  def this(
    video: HTMLVideoElement,
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
