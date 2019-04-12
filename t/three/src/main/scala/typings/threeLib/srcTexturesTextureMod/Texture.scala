package typings
package threeLib.srcTexturesTextureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/textures/Texture", "Texture")
@js.native
class Texture protected ()
  extends threeLib.srcCoreEventDispatcherMod.EventDispatcher {
  def this(image: js.UndefOr[stdLib.HTMLCanvasElement | stdLib.HTMLImageElement | stdLib.HTMLVideoElement], mapping: js.UndefOr[threeLib.srcConstantsMod.Mapping], wrapS: js.UndefOr[threeLib.srcConstantsMod.Wrapping], wrapT: js.UndefOr[threeLib.srcConstantsMod.Wrapping], magFilter: js.UndefOr[threeLib.srcConstantsMod.TextureFilter], minFilter: js.UndefOr[threeLib.srcConstantsMod.TextureFilter], format: js.UndefOr[threeLib.srcConstantsMod.PixelFormat], `type`: js.UndefOr[threeLib.srcConstantsMod.TextureDataType], anisotropy: js.UndefOr[scala.Double], encoding: js.UndefOr[threeLib.srcConstantsMod.TextureEncoding]) = this()
  var anisotropy: scala.Double = js.native
  var center: threeLib.srcMathVector2Mod.Vector2 = js.native
  var encoding: threeLib.srcConstantsMod.TextureEncoding = js.native
  var flipY: scala.Boolean = js.native
  var format: threeLib.srcConstantsMod.PixelFormat = js.native
  var generateMipmaps: scala.Boolean = js.native
  var id: scala.Double = js.native
  var image: js.Any = js.native
  var magFilter: threeLib.srcConstantsMod.TextureFilter = js.native
  var mapping: threeLib.srcConstantsMod.Mapping = js.native
  var minFilter: threeLib.srcConstantsMod.TextureFilter = js.native
   // HTMLImageElement or ImageData or { width: number, height: number } in some children;
  var mipmaps: js.Array[stdLib.ImageData] = js.native
  var name: java.lang.String = js.native
  var needsUpdate: scala.Boolean = js.native
  var offset: threeLib.srcMathVector2Mod.Vector2 = js.native
  var premultiplyAlpha: scala.Boolean = js.native
  var repeat: threeLib.srcMathVector2Mod.Vector2 = js.native
  var rotation: scala.Double = js.native
  var sourceFile: java.lang.String = js.native
  var `type`: threeLib.srcConstantsMod.TextureDataType = js.native
  var unpackAlignment: scala.Double = js.native
  var uuid: java.lang.String = js.native
  var version: scala.Double = js.native
  var wrapS: threeLib.srcConstantsMod.Wrapping = js.native
  var wrapT: threeLib.srcConstantsMod.Wrapping = js.native
  def copy(source: Texture): this.type = js.native
  def dispose(): scala.Unit = js.native
  def onUpdate(): scala.Unit = js.native
  def toJSON(meta: js.Any): js.Any = js.native
  def transformUv(uv: threeLib.srcMathVector2Mod.Vector): scala.Unit = js.native
}

/* static members */
@JSImport("three/src/textures/Texture", "Texture")
@js.native
object Texture extends js.Object {
  var DEFAULT_IMAGE: js.Any = js.native
  var DEFAULT_MAPPING: js.Any = js.native
}

