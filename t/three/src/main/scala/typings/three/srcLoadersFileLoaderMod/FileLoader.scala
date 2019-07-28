package typings.three.srcLoadersFileLoaderMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.ArrayBuffer
import typings.std.ErrorEvent
import typings.std.MimeType
import typings.std.ProgressEvent
import typings.three.srcLoadersLoadingManagerMod.LoadingManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/FileLoader", "FileLoader")
@js.native
class FileLoader () extends js.Object {
  def this(manager: LoadingManager) = this()
  var manager: LoadingManager = js.native
  var mimeType: MimeType = js.native
  var path: String = js.native
  var responseType: String = js.native
  var withCredentials: String = js.native
  def load(url: String): js.Any = js.native
  def load(url: String, onLoad: js.Function1[/* response */ String | ArrayBuffer, Unit]): js.Any = js.native
  def load(
    url: String,
    onLoad: js.Function1[/* response */ String | ArrayBuffer, Unit],
    onProgress: js.Function1[/* request */ ProgressEvent, Unit]
  ): js.Any = js.native
  def load(
    url: String,
    onLoad: js.Function1[/* response */ String | ArrayBuffer, Unit],
    onProgress: js.Function1[/* request */ ProgressEvent, Unit],
    onError: js.Function1[/* event */ ErrorEvent, Unit]
  ): js.Any = js.native
  def setMimeType(mimeType: MimeType): FileLoader = js.native
  def setPath(path: String): FileLoader = js.native
  def setRequestHeader(value: StringDictionary[String]): FileLoader = js.native
  def setResponseType(responseType: String): FileLoader = js.native
  def setWithCredentials(value: String): FileLoader = js.native
}

