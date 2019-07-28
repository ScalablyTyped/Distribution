package typings.textract.textractMod

import typings.node.Buffer
import typings.node.urlMod.URL
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("textract", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fromBufferWithMime(
    mimeType: String,
    buffer: Buffer,
    callback: js.Function2[/* error */ Error, /* text */ String, Unit]
  ): Unit = js.native
  def fromBufferWithMime(
    mimeType: String,
    buffer: Buffer,
    config: Config,
    callback: js.Function2[/* error */ Error, /* text */ String, Unit]
  ): Unit = js.native
  def fromBufferWithName(name: String, buffer: Buffer, callback: js.Function2[/* error */ Error, /* text */ String, Unit]): Unit = js.native
  def fromBufferWithName(
    name: String,
    buffer: Buffer,
    config: Config,
    callback: js.Function2[/* error */ Error, /* text */ String, Unit]
  ): Unit = js.native
  def fromFileWithMimeAndPath(
    mimeType: String,
    filePath: String,
    callback: js.Function2[/* error */ Error, /* text */ String, Unit]
  ): Unit = js.native
  def fromFileWithMimeAndPath(
    mimeType: String,
    filePath: String,
    config: Config,
    callback: js.Function2[/* error */ Error, /* text */ String, Unit]
  ): Unit = js.native
  def fromFileWithPath(filePath: String, callback: js.Function2[/* error */ Error, /* text */ String, Unit]): Unit = js.native
  def fromFileWithPath(
    filePath: String,
    config: Config,
    callback: js.Function2[/* error */ Error, /* text */ String, Unit]
  ): Unit = js.native
  def fromUrl(url: String, callback: js.Function2[/* error */ Error, /* text */ String, Unit]): Unit = js.native
  def fromUrl(url: String, config: URLConfig, callback: js.Function2[/* error */ Error, /* text */ String, Unit]): Unit = js.native
  def fromUrl(url: URL, callback: js.Function2[/* error */ Error, /* text */ String, Unit]): Unit = js.native
  def fromUrl(url: URL, config: URLConfig, callback: js.Function2[/* error */ Error, /* text */ String, Unit]): Unit = js.native
}

