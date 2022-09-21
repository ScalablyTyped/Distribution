package typings.three.mod

import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "CompressedTexture")
@js.native
open class CompressedTexture protected ()
  extends typings.three.threeMod.CompressedTexture {
  /**
    * @param mipmaps
    * @param width
    * @param height
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
    mipmaps: js.Array[ImageData],
    width: Double,
    height: Double,
    format: js.UndefOr[typings.three.srcConstantsMod.CompressedPixelFormat],
    `type`: js.UndefOr[typings.three.srcConstantsMod.TextureDataType],
    mapping: js.UndefOr[typings.three.srcConstantsMod.Mapping],
    wrapS: js.UndefOr[typings.three.srcConstantsMod.Wrapping],
    wrapT: js.UndefOr[typings.three.srcConstantsMod.Wrapping],
    magFilter: js.UndefOr[typings.three.srcConstantsMod.TextureFilter],
    minFilter: js.UndefOr[typings.three.srcConstantsMod.TextureFilter],
    anisotropy: js.UndefOr[Double],
    encoding: js.UndefOr[typings.three.srcConstantsMod.TextureEncoding]
  ) = this()
}
