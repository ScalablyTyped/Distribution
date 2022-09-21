package typings.three.global.THREE

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.Texture")
@js.native
open class Texture protected ()
  extends typings.three.mod.Texture {
  /**
    * @param [image]
    * @param [mapping=THREE.Texture.DEFAULT_MAPPING]
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
    image: js.UndefOr[HTMLImageElement | HTMLCanvasElement | HTMLVideoElement],
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
/* static members */
object Texture {
  
  @JSGlobal("THREE.Texture")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("THREE.Texture.DEFAULT_IMAGE")
  @js.native
  def DEFAULT_IMAGE: Any = js.native
  inline def DEFAULT_IMAGE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_IMAGE")(x.asInstanceOf[js.Any])
  
  @JSGlobal("THREE.Texture.DEFAULT_MAPPING")
  @js.native
  def DEFAULT_MAPPING: Any = js.native
  inline def DEFAULT_MAPPING_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MAPPING")(x.asInstanceOf[js.Any])
}
