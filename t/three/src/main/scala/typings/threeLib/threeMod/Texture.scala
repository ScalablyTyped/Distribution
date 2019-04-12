package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Texture")
@js.native
class Texture protected ()
  extends threeLib.srcTexturesTextureMod.Texture {
  def this(image: js.UndefOr[stdLib.HTMLCanvasElement | stdLib.HTMLImageElement | stdLib.HTMLVideoElement], mapping: js.UndefOr[threeLib.srcConstantsMod.Mapping], wrapS: js.UndefOr[threeLib.srcConstantsMod.Wrapping], wrapT: js.UndefOr[threeLib.srcConstantsMod.Wrapping], magFilter: js.UndefOr[threeLib.srcConstantsMod.TextureFilter], minFilter: js.UndefOr[threeLib.srcConstantsMod.TextureFilter], format: js.UndefOr[threeLib.srcConstantsMod.PixelFormat], `type`: js.UndefOr[threeLib.srcConstantsMod.TextureDataType], anisotropy: js.UndefOr[scala.Double], encoding: js.UndefOr[threeLib.srcConstantsMod.TextureEncoding]) = this()
}

/* static members */
@JSImport("three", "Texture")
@js.native
object Texture extends js.Object {
  var DEFAULT_IMAGE: js.Any = js.native
  var DEFAULT_MAPPING: js.Any = js.native
}

