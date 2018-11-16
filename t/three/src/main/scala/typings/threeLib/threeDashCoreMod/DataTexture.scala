package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "DataTexture")
@js.native
class DataTexture protected () extends Texture {
  def this(data: stdLib.ArrayBuffer, width: scala.Double, height: scala.Double, format: js.UndefOr[PixelFormat], `type`: js.UndefOr[TextureDataType], mapping: js.UndefOr[Mapping], wrapS: js.UndefOr[Wrapping], wrapT: js.UndefOr[Wrapping], magFilter: js.UndefOr[TextureFilter], minFilter: js.UndefOr[TextureFilter], anisotropy: js.UndefOr[scala.Double], encoding: js.UndefOr[TextureEncoding]) = this()
  def this(data: TypedArray, width: scala.Double, height: scala.Double, format: js.UndefOr[PixelFormat], `type`: js.UndefOr[TextureDataType], mapping: js.UndefOr[Mapping], wrapS: js.UndefOr[Wrapping], wrapT: js.UndefOr[Wrapping], magFilter: js.UndefOr[TextureFilter], minFilter: js.UndefOr[TextureFilter], anisotropy: js.UndefOr[scala.Double], encoding: js.UndefOr[TextureEncoding]) = this()
  @JSName("image")
  var image_DataTexture: stdLib.ImageData = js.native
}

