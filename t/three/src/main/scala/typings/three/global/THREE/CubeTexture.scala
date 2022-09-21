package typings.three.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.CubeTexture")
@js.native
open class CubeTexture protected ()
  extends typings.three.mod.CubeTexture {
  /**
    * @param [images=[]]
    * @param [mapping=THREE.CubeReflectionMapping]
    * @param [wrapS=THREE.ClampToEdgeWrapping]
    * @param [wrapT=THREE.ClampToEdgeWrapping]
    * @param [magFilter=THREE.LinearFilter]
    * @param [minFilter=THREE.LinearMipmapLinearFilter]
    * @param [format=THREE.RGBAFormat]
    * @param [type=THREE.UnsignedByteType]
    * @param [anisotropy=1]
    * @param [encoding=THREE.LinearEncoding]
    */
  def this(
    images: js.UndefOr[js.Array[Any]],
    // HTMLImageElement or HTMLCanvasElement
  mapping: js.UndefOr[typings.three.srcConstantsMod.Mapping],
    wrapS: js.UndefOr[typings.three.srcConstantsMod.Wrapping],
    wrapT: js.UndefOr[typings.three.srcConstantsMod.Wrapping],
    magFilter: js.UndefOr[typings.three.srcConstantsMod.TextureFilter],
    minFilter: js.UndefOr[typings.three.srcConstantsMod.TextureFilter],
    format: js.UndefOr[typings.three.srcConstantsMod.PixelFormat],
    `type`: js.UndefOr[typings.three.srcConstantsMod.TextureDataType],
    anisotropy: js.UndefOr[Double],
    encoding: js.UndefOr[typings.three.srcConstantsMod.TextureEncoding]
  ) = this()
}
