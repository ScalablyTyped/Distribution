package typings
package threeLib.srcLoadersFileLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnyLoader extends js.Object {
  def load(url: java.lang.String): js.Any = js.native
  def load(url: java.lang.String, onLoad: js.Function1[/* result */ js.Any, scala.Unit]): js.Any = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* result */ js.Any, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit]
  ): js.Any = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* result */ js.Any, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit],
    onError: js.Function1[/* event */ stdLib.ErrorEvent, scala.Unit]
  ): js.Any = js.native
}

