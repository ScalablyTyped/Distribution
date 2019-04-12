package typings
package threeLib.srcLoadersImageLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/ImageLoader", "ImageLoader")
@js.native
class ImageLoader () extends js.Object {
  def this(manager: threeLib.srcLoadersLoadingManagerMod.LoadingManager) = this()
  var crossOrigin: java.lang.String = js.native
  var manager: threeLib.srcLoadersLoadingManagerMod.LoadingManager = js.native
  var path: java.lang.String = js.native
  var withCredentials: java.lang.String = js.native
  /**
    * Begin loading from url
    * @param url
    */
  def load(url: java.lang.String): stdLib.HTMLImageElement = js.native
  def load(url: java.lang.String, onLoad: js.Function1[/* image */ stdLib.HTMLImageElement, scala.Unit]): stdLib.HTMLImageElement = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* image */ stdLib.HTMLImageElement, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit]
  ): stdLib.HTMLImageElement = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* image */ stdLib.HTMLImageElement, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit],
    onError: js.Function1[/* event */ stdLib.ErrorEvent, scala.Unit]
  ): stdLib.HTMLImageElement = js.native
  def setCrossOrigin(crossOrigin: java.lang.String): ImageLoader = js.native
  def setPath(value: java.lang.String): ImageLoader = js.native
  def setWithCredentials(value: java.lang.String): ImageLoader = js.native
}

