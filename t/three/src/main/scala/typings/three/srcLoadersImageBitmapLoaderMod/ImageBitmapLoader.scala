package typings.three.srcLoadersImageBitmapLoaderMod

import typings.std.ArrayBuffer
import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.srcLoadersLoadingManagerMod.LoadingManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/ImageBitmapLoader", "ImageBitmapLoader")
@js.native
class ImageBitmapLoader () extends js.Object {
  def this(manager: LoadingManager) = this()
  var manager: LoadingManager = js.native
  def load(url: String): js.Any = js.native
  def load(url: String, onLoad: js.Function1[/* response */ String | ArrayBuffer, Unit]): js.Any = js.native
  def load(
    url: String,
    onLoad: js.Function1[/* response */ String | ArrayBuffer, Unit],
    onProgress: js.Function1[/* request */ ProgressEvent[EventTarget], Unit]
  ): js.Any = js.native
  def load(
    url: String,
    onLoad: js.Function1[/* response */ String | ArrayBuffer, Unit],
    onProgress: js.Function1[/* request */ ProgressEvent[EventTarget], Unit],
    onError: js.Function1[/* event */ ErrorEvent, Unit]
  ): js.Any = js.native
  def setCrossOrigin(): ImageBitmapLoader = js.native
  def setOptions(options: js.Any): ImageBitmapLoader = js.native
  def setPath(path: String): ImageBitmapLoader = js.native
}

