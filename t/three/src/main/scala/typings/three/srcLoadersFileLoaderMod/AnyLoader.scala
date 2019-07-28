package typings.three.srcLoadersFileLoaderMod

import typings.std.ErrorEvent
import typings.std.ProgressEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnyLoader extends js.Object {
  def load(url: String): js.Any = js.native
  def load(url: String, onLoad: js.Function1[/* result */ js.Any, Unit]): js.Any = js.native
  def load(
    url: String,
    onLoad: js.Function1[/* result */ js.Any, Unit],
    onProgress: js.Function1[/* event */ ProgressEvent, Unit]
  ): js.Any = js.native
  def load(
    url: String,
    onLoad: js.Function1[/* result */ js.Any, Unit],
    onProgress: js.Function1[/* event */ ProgressEvent, Unit],
    onError: js.Function1[/* event */ ErrorEvent, Unit]
  ): js.Any = js.native
}

