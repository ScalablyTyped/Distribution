package typings.uploadcare

import typings.node.fsMod.ReadStream
import typings.std.Error
import typings.uploadcare.mod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFromUrl extends js.Object {
  def fromUrl(url: String, options: AnonStore, callback: js.Function2[/* err */ Error, /* res */ File, Unit]): Unit
  def upload(
    readStream: ReadStream,
    options: AnonStore,
    callback: js.Function2[/* err */ Error, /* res */ AnonFile, Unit]
  ): Unit
}

object AnonFromUrl {
  @scala.inline
  def apply(
    fromUrl: (String, AnonStore, js.Function2[/* err */ Error, /* res */ File, Unit]) => Unit,
    upload: (ReadStream, AnonStore, js.Function2[/* err */ Error, /* res */ AnonFile, Unit]) => Unit
  ): AnonFromUrl = {
    val __obj = js.Dynamic.literal(fromUrl = js.Any.fromFunction3(fromUrl), upload = js.Any.fromFunction3(upload))
    __obj.asInstanceOf[AnonFromUrl]
  }
}

