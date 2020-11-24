package typings.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "DepthTexture")
@js.native
class DepthTexture protected ()
  extends typings.three.depthTextureMod.DepthTexture {
  /**
  	 * @param width
  	 * @param height
  	 * @param type
  	 * @param [mapping=THREE.Texture.DEFAULT_MAPPING]
  	 * @param [wrapS=THREE.ClampToEdgeWrapping]
  	 * @param [wrapT=THREE.ClampToEdgeWrapping]
  	 * @param [magFilter=THREE.NearestFilter]
  	 * @param [minFilter=THREE.NearestFilter]
  	 * @param [anisotropy=1]
  	 */
  def this(
    width: Double,
    height: Double,
    `type`: js.UndefOr[typings.three.constantsMod.TextureDataType],
    mapping: js.UndefOr[typings.three.constantsMod.Mapping],
    wrapS: js.UndefOr[typings.three.constantsMod.Wrapping],
    wrapT: js.UndefOr[typings.three.constantsMod.Wrapping],
    magFilter: js.UndefOr[typings.three.constantsMod.TextureFilter],
    minFilter: js.UndefOr[typings.three.constantsMod.TextureFilter],
    anisotropy: js.UndefOr[Double]
  ) = this()
}
