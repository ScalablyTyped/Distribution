package typings.three.srcLoadersFontLoaderMod

import typings.std.ErrorEvent
import typings.std.ProgressEvent
import typings.three.srcExtrasCoreFontMod.Font
import typings.three.srcLoadersLoadingManagerMod.LoadingManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/FontLoader", "FontLoader")
@js.native
class FontLoader () extends js.Object {
  def this(manager: LoadingManager) = this()
  var manager: LoadingManager = js.native
  def load(url: String): Unit = js.native
  def load(url: String, onLoad: js.Function1[/* responseFont */ Font, Unit]): Unit = js.native
  def load(
    url: String,
    onLoad: js.Function1[/* responseFont */ Font, Unit],
    onProgress: js.Function1[/* event */ ProgressEvent, Unit]
  ): Unit = js.native
  def load(
    url: String,
    onLoad: js.Function1[/* responseFont */ Font, Unit],
    onProgress: js.Function1[/* event */ ProgressEvent, Unit],
    onError: js.Function1[/* event */ ErrorEvent, Unit]
  ): Unit = js.native
  def parse(json: js.Any): Font = js.native
}

