package typings
package threeLib.srcLoadersFontLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/FontLoader", "FontLoader")
@js.native
class FontLoader () extends js.Object {
  def this(manager: threeLib.srcLoadersLoadingManagerMod.LoadingManager) = this()
  var manager: threeLib.srcLoadersLoadingManagerMod.LoadingManager = js.native
  def load(url: java.lang.String): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* responseFont */ threeLib.srcExtrasCoreFontMod.Font, scala.Unit]
  ): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* responseFont */ threeLib.srcExtrasCoreFontMod.Font, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit]
  ): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* responseFont */ threeLib.srcExtrasCoreFontMod.Font, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit],
    onError: js.Function1[/* event */ stdLib.ErrorEvent, scala.Unit]
  ): scala.Unit = js.native
  def parse(json: js.Any): threeLib.srcExtrasCoreFontMod.Font = js.native
}

