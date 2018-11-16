package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "ObjectLoader")
@js.native
class ObjectLoader () extends js.Object {
  def this(manager: LoadingManager) = this()
  var crossOrigin: java.lang.String = js.native
  var manager: LoadingManager = js.native
  var texturePass: java.lang.String = js.native
  def load(url: java.lang.String): scala.Unit = js.native
  def load(url: java.lang.String, onLoad: js.Function1[/* object */ Object3D, scala.Unit]): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* object */ Object3D, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit]
  ): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* object */ Object3D, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit],
    onError: js.Function1[/* event */ stdLib.Error | stdLib.ErrorEvent, scala.Unit]
  ): scala.Unit = js.native
  def parse[T /* <: Object3D */](json: js.Any): T = js.native
  def parse[T /* <: Object3D */](json: js.Any, onLoad: js.Function1[/* object */ Object3D, scala.Unit]): T = js.native
   // Array of Classes that inherits from Matrial.
  def parseAnimations(json: js.Any): js.Array[AnimationClip] = js.native
  def parseGeometries(json: js.Any): js.Array[_] = js.native
  def parseImages(json: js.Any, onLoad: js.Function0[scala.Unit]): ScalablyTyped.runtime.StringDictionary[stdLib.HTMLImageElement] = js.native
   // Array of BufferGeometry or Geometry or Geometry2.
  def parseMaterials(json: js.Any, textures: js.Array[Texture]): js.Array[Material] = js.native
  def parseObject[T /* <: Object3D */](data: js.Any, geometries: js.Array[_], materials: js.Array[Material]): T = js.native
  def parseTextures(json: js.Any, images: js.Any): js.Array[Texture] = js.native
  def setCrossOrigin(crossOrigin: java.lang.String): scala.Unit = js.native
  def setTexturePath(value: java.lang.String): scala.Unit = js.native
}

