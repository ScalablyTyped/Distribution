package typings.three.srcLoadersImageLoaderMod

import typings.std.ErrorEvent
import typings.std.HTMLImageElement
import typings.std.ProgressEvent
import typings.three.srcLoadersLoadingManagerMod.LoadingManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/ImageLoader", "ImageLoader")
@js.native
class ImageLoader () extends js.Object {
  def this(manager: LoadingManager) = this()
  var crossOrigin: String = js.native
  var manager: LoadingManager = js.native
  var path: String = js.native
  var withCredentials: String = js.native
  /**
  	 * Begin loading from url
  	 * @param url
  	 */
  def load(url: String): HTMLImageElement = js.native
  def load(url: String, onLoad: js.Function1[/* image */ HTMLImageElement, Unit]): HTMLImageElement = js.native
  def load(
    url: String,
    onLoad: js.Function1[/* image */ HTMLImageElement, Unit],
    onProgress: js.Function1[/* event */ ProgressEvent, Unit]
  ): HTMLImageElement = js.native
  def load(
    url: String,
    onLoad: js.Function1[/* image */ HTMLImageElement, Unit],
    onProgress: js.Function1[/* event */ ProgressEvent, Unit],
    onError: js.Function1[/* event */ ErrorEvent, Unit]
  ): HTMLImageElement = js.native
  def setCrossOrigin(crossOrigin: String): ImageLoader = js.native
  def setPath(value: String): ImageLoader = js.native
  def setWithCredentials(value: String): ImageLoader = js.native
}

