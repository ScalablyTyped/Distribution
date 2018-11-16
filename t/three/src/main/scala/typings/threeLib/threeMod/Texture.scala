package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Texture")
@js.native
class Texture protected ()
  extends threeLib.threeDashCoreMod.Texture {
  def this(image: js.UndefOr[stdLib.HTMLCanvasElement | stdLib.HTMLImageElement | stdLib.HTMLVideoElement], mapping: js.UndefOr[threeLib.threeDashCoreMod.Mapping], wrapS: js.UndefOr[threeLib.threeDashCoreMod.Wrapping], wrapT: js.UndefOr[threeLib.threeDashCoreMod.Wrapping], magFilter: js.UndefOr[threeLib.threeDashCoreMod.TextureFilter], minFilter: js.UndefOr[threeLib.threeDashCoreMod.TextureFilter], format: js.UndefOr[threeLib.threeDashCoreMod.PixelFormat], `type`: js.UndefOr[threeLib.threeDashCoreMod.TextureDataType], anisotropy: js.UndefOr[scala.Double], encoding: js.UndefOr[threeLib.threeDashCoreMod.TextureEncoding]) = this()
}

@JSImport("three", "Texture")
@js.native
object Texture extends js.Object {
  var DEFAULT_IMAGE: js.Any = js.native
  var DEFAULT_MAPPING: js.Any = js.native
}

