package typings.uploadcare

import typings.std.Error
import typings.uploadcare.uploadcareMod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackErr extends js.Object {
  def remove(uuid: String, callback: js.Function2[/* err */ Error, /* res */ File, Unit]): Unit
  def store(uuid: String, callback: js.Function2[/* err */ Error, /* res */ File, Unit]): Unit
}

object Anon_CallbackErr {
  @scala.inline
  def apply(
    remove: (String, js.Function2[/* err */ Error, /* res */ File, Unit]) => Unit,
    store: (String, js.Function2[/* err */ Error, /* res */ File, Unit]) => Unit
  ): Anon_CallbackErr = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction2(remove), store = js.Any.fromFunction2(store))
  
    __obj.asInstanceOf[Anon_CallbackErr]
  }
}

