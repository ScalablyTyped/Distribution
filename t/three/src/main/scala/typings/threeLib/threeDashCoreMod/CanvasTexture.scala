package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "CanvasTexture")
@js.native
class CanvasTexture protected () extends Texture {
  def this(canvas: stdLib.HTMLCanvasElement, mapping: js.UndefOr[Mapping], wrapS: js.UndefOr[Wrapping], wrapT: js.UndefOr[Wrapping], magFilter: js.UndefOr[TextureFilter], minFilter: js.UndefOr[TextureFilter], format: js.UndefOr[PixelFormat], `type`: js.UndefOr[TextureDataType], anisotropy: js.UndefOr[scala.Double]) = this()
  def this(canvas: stdLib.HTMLImageElement, mapping: js.UndefOr[Mapping], wrapS: js.UndefOr[Wrapping], wrapT: js.UndefOr[Wrapping], magFilter: js.UndefOr[TextureFilter], minFilter: js.UndefOr[TextureFilter], format: js.UndefOr[PixelFormat], `type`: js.UndefOr[TextureDataType], anisotropy: js.UndefOr[scala.Double]) = this()
  def this(canvas: stdLib.HTMLVideoElement, mapping: js.UndefOr[Mapping], wrapS: js.UndefOr[Wrapping], wrapT: js.UndefOr[Wrapping], magFilter: js.UndefOr[TextureFilter], minFilter: js.UndefOr[TextureFilter], format: js.UndefOr[PixelFormat], `type`: js.UndefOr[TextureDataType], anisotropy: js.UndefOr[scala.Double]) = this()
}

