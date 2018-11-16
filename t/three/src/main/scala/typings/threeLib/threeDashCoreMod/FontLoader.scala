package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "FontLoader")
@js.native
class FontLoader () extends js.Object {
  def this(manager: LoadingManager) = this()
  var manager: LoadingManager = js.native
  def load(url: java.lang.String): scala.Unit = js.native
  def load(url: java.lang.String, onLoad: js.Function1[/* responseFont */ Font, scala.Unit]): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* responseFont */ Font, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit]
  ): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* responseFont */ Font, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit],
    onError: js.Function1[/* event */ stdLib.ErrorEvent, scala.Unit]
  ): scala.Unit = js.native
  def parse(json: js.Any): Font = js.native
}

