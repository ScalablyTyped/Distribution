package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "Texture")
@js.native
class Texture protected () extends EventDispatcher {
  def this(image: js.UndefOr[stdLib.HTMLCanvasElement | stdLib.HTMLImageElement | stdLib.HTMLVideoElement], mapping: js.UndefOr[Mapping], wrapS: js.UndefOr[Wrapping], wrapT: js.UndefOr[Wrapping], magFilter: js.UndefOr[TextureFilter], minFilter: js.UndefOr[TextureFilter], format: js.UndefOr[PixelFormat], `type`: js.UndefOr[TextureDataType], anisotropy: js.UndefOr[scala.Double], encoding: js.UndefOr[TextureEncoding]) = this()
  var anisotropy: scala.Double = js.native
  var center: Vector2 = js.native
  var encoding: TextureEncoding = js.native
  var flipY: scala.Boolean = js.native
  var format: PixelFormat = js.native
  var generateMipmaps: scala.Boolean = js.native
  var id: scala.Double = js.native
  var image: js.Any = js.native
  var magFilter: TextureFilter = js.native
  var mapping: Mapping = js.native
  var minFilter: TextureFilter = js.native
   // HTMLImageElement or ImageData or { width: number, height: number } in some children;
  var mipmaps: js.Array[stdLib.ImageData] = js.native
  var name: java.lang.String = js.native
  var needsUpdate: scala.Boolean = js.native
  var offset: Vector2 = js.native
  var premultiplyAlpha: scala.Boolean = js.native
  var repeat: Vector2 = js.native
  var rotation: scala.Double = js.native
  var sourceFile: java.lang.String = js.native
  var `type`: TextureDataType = js.native
  var unpackAlignment: scala.Double = js.native
  var uuid: java.lang.String = js.native
  var version: scala.Double = js.native
  var wrapS: Wrapping = js.native
  var wrapT: Wrapping = js.native
  def copy(source: Texture): this.type = js.native
  def dispose(): scala.Unit = js.native
  def onUpdate(): scala.Unit = js.native
  def toJSON(meta: js.Any): js.Any = js.native
  def transformUv(uv: Vector): scala.Unit = js.native
}

/* static members */
@JSImport("three/three-core", "Texture")
@js.native
object Texture extends js.Object {
  var DEFAULT_IMAGE: js.Any = js.native
  var DEFAULT_MAPPING: js.Any = js.native
}

