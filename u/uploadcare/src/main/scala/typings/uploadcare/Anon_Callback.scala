package typings.uploadcare

import typings.node.fsMod.ReadStream
import typings.std.Error
import typings.uploadcare.uploadcareMod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callback extends js.Object {
  def fromUrl(url: String, options: Anon_Store, callback: js.Function2[/* err */ Error, /* res */ File, Unit]): Unit
  def upload(
    readStream: ReadStream,
    options: Anon_Store,
    callback: js.Function2[/* err */ Error, /* res */ Anon_File, Unit]
  ): Unit
}

object Anon_Callback {
  @scala.inline
  def apply(
    fromUrl: (String, Anon_Store, js.Function2[/* err */ Error, /* res */ File, Unit]) => Unit,
    upload: (ReadStream, Anon_Store, js.Function2[/* err */ Error, /* res */ Anon_File, Unit]) => Unit
  ): Anon_Callback = {
    val __obj = js.Dynamic.literal(fromUrl = js.Any.fromFunction3(fromUrl), upload = js.Any.fromFunction3(upload))
  
    __obj.asInstanceOf[Anon_Callback]
  }
}

