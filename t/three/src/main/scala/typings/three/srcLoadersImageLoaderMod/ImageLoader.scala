package typings.three.srcLoadersImageLoaderMod

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.HTMLImageElement
import typings.std.ProgressEvent
import typings.three.srcLoadersLoaderMod.Loader
import typings.three.srcLoadersLoadingManagerMod.LoadingManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/ImageLoader", "ImageLoader")
@js.native
class ImageLoader () extends Loader {
  def this(manager: LoadingManager) = this()
  def load(url: String): HTMLImageElement = js.native
  def load(url: String, onLoad: js.Function1[/* image */ HTMLImageElement, Unit]): HTMLImageElement = js.native
  def load(
    url: String,
    onLoad: js.Function1[/* image */ HTMLImageElement, Unit],
    onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
  ): HTMLImageElement = js.native
  def load(
    url: String,
    onLoad: js.Function1[/* image */ HTMLImageElement, Unit],
    onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
    onError: js.Function1[/* event */ ErrorEvent, Unit]
  ): HTMLImageElement = js.native
}

