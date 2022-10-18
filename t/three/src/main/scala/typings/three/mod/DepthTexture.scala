package typings.three.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "DepthTexture")
@js.native
open class DepthTexture protected ()
  extends typings.three.srcThreeMod.DepthTexture {
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
    `type`: js.UndefOr[typings.three.srcConstantsMod.TextureDataType],
    mapping: js.UndefOr[typings.three.srcConstantsMod.Mapping],
    wrapS: js.UndefOr[typings.three.srcConstantsMod.Wrapping],
    wrapT: js.UndefOr[typings.three.srcConstantsMod.Wrapping],
    magFilter: js.UndefOr[typings.three.srcConstantsMod.TextureFilter],
    minFilter: js.UndefOr[typings.three.srcConstantsMod.TextureFilter],
    anisotropy: js.UndefOr[Double]
  ) = this()
}
