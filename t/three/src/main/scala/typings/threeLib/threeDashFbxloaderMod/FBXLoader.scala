package typings
package threeLib.threeDashFbxloaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-fbxloader", "FBXLoader")
@js.native
class FBXLoader () extends js.Object {
  def this(manager: threeLib.threeDashCoreMod.LoadingManager) = this()
  var manager: threeLib.threeDashCoreMod.LoadingManager = js.native
  def load(url: java.lang.String, onLoad: js.Function1[/* group */ IFbxSceneGraph, scala.Unit]): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* group */ IFbxSceneGraph, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit]
  ): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* group */ IFbxSceneGraph, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit],
    onError: js.Function1[/* event */ stdLib.ErrorEvent, scala.Unit]
  ): scala.Unit = js.native
  def parse(FBXText: java.lang.String, resourceDirectory: java.lang.String): threeLib.threeDashCoreMod.Group = js.native
}

