package typings
package threeLib.srcTexturesDataTextureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/textures/DataTexture", "DataTexture")
@js.native
class DataTexture protected ()
  extends threeLib.srcTexturesTextureMod.Texture {
  def this(data: stdLib.ArrayBuffer, width: scala.Double, height: scala.Double, format: js.UndefOr[threeLib.srcConstantsMod.PixelFormat], `type`: js.UndefOr[threeLib.srcConstantsMod.TextureDataType], mapping: js.UndefOr[threeLib.srcConstantsMod.Mapping], wrapS: js.UndefOr[threeLib.srcConstantsMod.Wrapping], wrapT: js.UndefOr[threeLib.srcConstantsMod.Wrapping], magFilter: js.UndefOr[threeLib.srcConstantsMod.TextureFilter], minFilter: js.UndefOr[threeLib.srcConstantsMod.TextureFilter], anisotropy: js.UndefOr[scala.Double], encoding: js.UndefOr[threeLib.srcConstantsMod.TextureEncoding]) = this()
  def this(data: threeLib.srcPolyfillsMod.TypedArray, width: scala.Double, height: scala.Double, format: js.UndefOr[threeLib.srcConstantsMod.PixelFormat], `type`: js.UndefOr[threeLib.srcConstantsMod.TextureDataType], mapping: js.UndefOr[threeLib.srcConstantsMod.Mapping], wrapS: js.UndefOr[threeLib.srcConstantsMod.Wrapping], wrapT: js.UndefOr[threeLib.srcConstantsMod.Wrapping], magFilter: js.UndefOr[threeLib.srcConstantsMod.TextureFilter], minFilter: js.UndefOr[threeLib.srcConstantsMod.TextureFilter], anisotropy: js.UndefOr[scala.Double], encoding: js.UndefOr[threeLib.srcConstantsMod.TextureEncoding]) = this()
  @JSName("image")
  var image_DataTexture: stdLib.ImageData = js.native
}

