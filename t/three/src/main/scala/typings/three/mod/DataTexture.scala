package typings.three.mod

import typings.three.polyfillsMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "DataTexture")
@js.native
class DataTexture protected ()
  extends typings.three.dataTextureMod.DataTexture {
  /**
  	 * @param data
  	 * @param width
  	 * @param height
  	 * @param [format=THREE.RGBAFormat]
  	 * @param [type=THREE.UnsignedByteType]
  	 * @param [mapping=THREE.Texture.DEFAULT_MAPPING]
  	 * @param [wrapS=THREE.ClampToEdgeWrapping]
  	 * @param [wrapT=THREE.ClampToEdgeWrapping]
  	 * @param [magFilter=THREE.NearestFilter]
  	 * @param [minFilter=THREE.NearestFilter]
  	 * @param [anisotropy=1]
  	 * @param [encoding=THREE.LinearEncoding]
  	 */
  def this(
    data: TypedArray,
    width: Double,
    height: Double,
    format: js.UndefOr[typings.three.constantsMod.PixelFormat],
    `type`: js.UndefOr[typings.three.constantsMod.TextureDataType],
    mapping: js.UndefOr[typings.three.constantsMod.Mapping],
    wrapS: js.UndefOr[typings.three.constantsMod.Wrapping],
    wrapT: js.UndefOr[typings.three.constantsMod.Wrapping],
    magFilter: js.UndefOr[typings.three.constantsMod.TextureFilter],
    minFilter: js.UndefOr[typings.three.constantsMod.TextureFilter],
    anisotropy: js.UndefOr[Double],
    encoding: js.UndefOr[typings.three.constantsMod.TextureEncoding]
  ) = this()
}
