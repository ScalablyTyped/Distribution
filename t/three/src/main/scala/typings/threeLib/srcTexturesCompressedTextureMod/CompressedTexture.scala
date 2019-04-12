package typings
package threeLib.srcTexturesCompressedTextureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/textures/CompressedTexture", "CompressedTexture")
@js.native
class CompressedTexture protected ()
  extends threeLib.srcTexturesTextureMod.Texture {
  def this(mipmaps: js.Array[stdLib.ImageData], width: scala.Double, height: scala.Double, format: js.UndefOr[threeLib.srcConstantsMod.PixelFormat], `type`: js.UndefOr[threeLib.srcConstantsMod.TextureDataType], mapping: js.UndefOr[threeLib.srcConstantsMod.Mapping], wrapS: js.UndefOr[threeLib.srcConstantsMod.Wrapping], wrapT: js.UndefOr[threeLib.srcConstantsMod.Wrapping], magFilter: js.UndefOr[threeLib.srcConstantsMod.TextureFilter], minFilter: js.UndefOr[threeLib.srcConstantsMod.TextureFilter], anisotropy: js.UndefOr[scala.Double], encoding: js.UndefOr[threeLib.srcConstantsMod.TextureEncoding]) = this()
  @JSName("image")
  var image_CompressedTexture: threeLib.Anon_HeightWidth = js.native
}

