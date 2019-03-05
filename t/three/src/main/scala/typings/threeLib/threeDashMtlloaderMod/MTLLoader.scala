package typings
package threeLib.threeDashMtlloaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-mtlloader", "MTLLoader")
@js.native
class MTLLoader ()
  extends threeLib.threeDashCoreMod.EventDispatcher {
  def this(manager: threeLib.threeDashCoreMod.LoadingManager) = this()
  var crossOrigin: scala.Boolean = js.native
  var manager: threeLib.threeDashCoreMod.LoadingManager = js.native
  var materialOptions: MaterialCreatorOptions = js.native
  var path: java.lang.String = js.native
  var texturePath: java.lang.String = js.native
  def load(url: java.lang.String, onLoad: js.Function1[/* materialCreator */ MaterialCreator, scala.Unit]): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* materialCreator */ MaterialCreator, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit]
  ): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* materialCreator */ MaterialCreator, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit],
    onError: js.Function1[/* event */ stdLib.ErrorEvent, scala.Unit]
  ): scala.Unit = js.native
  def parse(text: java.lang.String): MaterialCreator = js.native
  def setBaseUrl(path: java.lang.String): scala.Unit = js.native
  def setCrossOrigin(value: scala.Boolean): scala.Unit = js.native
  def setMaterialOptions(value: MaterialCreatorOptions): scala.Unit = js.native
  def setPath(path: java.lang.String): scala.Unit = js.native
  def setTexturePath(path: java.lang.String): scala.Unit = js.native
}

