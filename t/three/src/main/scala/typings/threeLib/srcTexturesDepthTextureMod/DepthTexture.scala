package typings
package threeLib.srcTexturesDepthTextureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/textures/DepthTexture", "DepthTexture")
@js.native
class DepthTexture protected ()
  extends threeLib.srcTexturesTextureMod.Texture {
  def this(width: scala.Double, heighht: scala.Double, `type`: js.UndefOr[threeLib.srcConstantsMod.TextureDataType], mapping: js.UndefOr[threeLib.srcConstantsMod.Mapping], wrapS: js.UndefOr[threeLib.srcConstantsMod.Wrapping], wrapT: js.UndefOr[threeLib.srcConstantsMod.Wrapping], magFilter: js.UndefOr[threeLib.srcConstantsMod.TextureFilter], minFilter: js.UndefOr[threeLib.srcConstantsMod.TextureFilter], anisotropy: js.UndefOr[scala.Double]) = this()
  @JSName("image")
  var image_DepthTexture: threeLib.Anon_HeightWidth = js.native
}

