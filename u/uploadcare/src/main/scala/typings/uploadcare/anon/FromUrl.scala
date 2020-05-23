package typings.uploadcare.anon

import typings.node.fsMod.ReadStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FromUrl extends js.Object {
  def fromUrl(
    url: String,
    options: Store,
    callback: js.Function2[/* err */ Error, /* res */ typings.uploadcare.mod.File, Unit]
  ): Unit
  def upload(
    readStream: ReadStream,
    options: Store,
    callback: js.Function2[/* err */ Error, /* res */ File, Unit]
  ): Unit
}

object FromUrl {
  @scala.inline
  def apply(
    fromUrl: (String, Store, js.Function2[/* err */ Error, /* res */ typings.uploadcare.mod.File, Unit]) => Unit,
    upload: (ReadStream, Store, js.Function2[/* err */ Error, /* res */ File, Unit]) => Unit
  ): FromUrl = {
    val __obj = js.Dynamic.literal(fromUrl = js.Any.fromFunction3(fromUrl), upload = js.Any.fromFunction3(upload))
    __obj.asInstanceOf[FromUrl]
  }
}

