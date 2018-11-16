package typings
package threeLib.threeDashTgaloaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-tgaloader", "TGALoader")
@js.native
class TGALoader () extends js.Object {
  def this(manager: threeLib.threeDashCoreMod.LoadingManager) = this()
  var manager: threeLib.threeDashCoreMod.LoadingManager = js.native
  def load(url: java.lang.String): threeLib.threeDashCoreMod.Texture = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* texture */ threeLib.threeDashCoreMod.Texture, scala.Unit]
  ): threeLib.threeDashCoreMod.Texture = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* texture */ threeLib.threeDashCoreMod.Texture, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit]
  ): threeLib.threeDashCoreMod.Texture = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* texture */ threeLib.threeDashCoreMod.Texture, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit],
    onError: js.Function1[/* event */ stdLib.ErrorEvent, scala.Unit]
  ): threeLib.threeDashCoreMod.Texture = js.native
}

