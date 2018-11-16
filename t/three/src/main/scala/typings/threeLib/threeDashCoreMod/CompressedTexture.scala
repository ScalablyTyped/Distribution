package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "CompressedTexture")
@js.native
class CompressedTexture protected () extends Texture {
  def this(mipmaps: js.Array[stdLib.ImageData], width: scala.Double, height: scala.Double, format: js.UndefOr[PixelFormat], `type`: js.UndefOr[TextureDataType], mapping: js.UndefOr[Mapping], wrapS: js.UndefOr[Wrapping], wrapT: js.UndefOr[Wrapping], magFilter: js.UndefOr[TextureFilter], minFilter: js.UndefOr[TextureFilter], anisotropy: js.UndefOr[scala.Double], encoding: js.UndefOr[TextureEncoding]) = this()
  @JSName("image")
  var image_CompressedTexture: threeLib.Anon_Height = js.native
}

