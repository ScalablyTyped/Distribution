package typings
package threeLib.threeDashGltfloaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-gltfloader", "GLTFLoader")
@js.native
class GLTFLoader () extends js.Object {
  def this(manager: threeLib.threeDashCoreMod.LoadingManager) = this()
  var manager: threeLib.threeDashCoreMod.LoadingManager = js.native
  var path: java.lang.String = js.native
  def load(url: java.lang.String, onLoad: js.Function1[/* gltf */ GLTF, scala.Unit]): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* gltf */ GLTF, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit]
  ): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* gltf */ GLTF, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit],
    onError: js.Function1[/* event */ stdLib.ErrorEvent, scala.Unit]
  ): scala.Unit = js.native
  def parse(
    data: stdLib.ArrayBuffer,
    path: java.lang.String,
    onLoad: js.Function1[/* gltf */ GLTF, scala.Unit]
  ): scala.Unit = js.native
  def parse(
    data: stdLib.ArrayBuffer,
    path: java.lang.String,
    onLoad: js.Function1[/* gltf */ GLTF, scala.Unit],
    onError: js.Function1[/* event */ stdLib.ErrorEvent, scala.Unit]
  ): scala.Unit = js.native
  def setCrossOrigin(value: java.lang.String): scala.Unit = js.native
  def setDRACOLoader(dracoLoader: js.Object): scala.Unit = js.native
  def setPath(path: java.lang.String): GLTFLoader = js.native
  def setResourcePath(path: java.lang.String): GLTFLoader = js.native
}

