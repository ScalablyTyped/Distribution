package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "FileLoader")
@js.native
class FileLoader () extends js.Object {
  def this(manager: LoadingManager) = this()
  var manager: LoadingManager = js.native
  var mimeType: stdLib.MimeType = js.native
  var path: java.lang.String = js.native
  var responseType: java.lang.String = js.native
  var withCredentials: java.lang.String = js.native
  def load(url: java.lang.String): js.Any = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* response */ java.lang.String | stdLib.ArrayBuffer, scala.Unit]
  ): js.Any = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* response */ java.lang.String | stdLib.ArrayBuffer, scala.Unit],
    onProgress: js.Function1[/* request */ stdLib.ProgressEvent, scala.Unit]
  ): js.Any = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* response */ java.lang.String | stdLib.ArrayBuffer, scala.Unit],
    onProgress: js.Function1[/* request */ stdLib.ProgressEvent, scala.Unit],
    onError: js.Function1[/* event */ stdLib.ErrorEvent, scala.Unit]
  ): js.Any = js.native
  def setMimeType(mimeType: stdLib.MimeType): FileLoader = js.native
  def setPath(path: java.lang.String): FileLoader = js.native
  def setRequestHeader(value: org.scalablytyped.runtime.StringDictionary[java.lang.String]): FileLoader = js.native
  def setResponseType(responseType: java.lang.String): FileLoader = js.native
  def setWithCredentials(value: java.lang.String): FileLoader = js.native
}

