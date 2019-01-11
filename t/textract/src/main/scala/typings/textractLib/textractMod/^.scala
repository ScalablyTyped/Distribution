package typings
package textractLib.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("textract", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fromBufferWithMime(
    mimeType: java.lang.String,
    buffer: nodeLib.Buffer,
    callback: js.Function2[/* error */ nodeLib.Error, /* text */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def fromBufferWithMime(
    mimeType: java.lang.String,
    buffer: nodeLib.Buffer,
    config: textractLib.textractMod.Config,
    callback: js.Function2[/* error */ nodeLib.Error, /* text */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def fromBufferWithName(
    name: java.lang.String,
    buffer: nodeLib.Buffer,
    callback: js.Function2[/* error */ nodeLib.Error, /* text */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def fromBufferWithName(
    name: java.lang.String,
    buffer: nodeLib.Buffer,
    config: textractLib.textractMod.Config,
    callback: js.Function2[/* error */ nodeLib.Error, /* text */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def fromFileWithMimeAndPath(
    mimeType: java.lang.String,
    filePath: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error, /* text */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def fromFileWithMimeAndPath(
    mimeType: java.lang.String,
    filePath: java.lang.String,
    config: textractLib.textractMod.Config,
    callback: js.Function2[/* error */ nodeLib.Error, /* text */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def fromFileWithPath(
    filePath: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error, /* text */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def fromFileWithPath(
    filePath: java.lang.String,
    config: textractLib.textractMod.Config,
    callback: js.Function2[/* error */ nodeLib.Error, /* text */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def fromUrl(
    url: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error, /* text */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def fromUrl(
    url: java.lang.String,
    config: textractLib.textractMod.URLConfig,
    callback: js.Function2[/* error */ nodeLib.Error, /* text */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def fromUrl(
    url: nodeLib.urlMod.URL,
    callback: js.Function2[/* error */ nodeLib.Error, /* text */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def fromUrl(
    url: nodeLib.urlMod.URL,
    config: textractLib.textractMod.URLConfig,
    callback: js.Function2[/* error */ nodeLib.Error, /* text */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
}

