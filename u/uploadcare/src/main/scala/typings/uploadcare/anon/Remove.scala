package typings.uploadcare.anon

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Remove extends js.Object {
  def remove(uuid: String, callback: js.Function2[/* err */ Error, /* res */ typings.uploadcare.mod.File, Unit]): Unit
  def store(uuid: String, callback: js.Function2[/* err */ Error, /* res */ typings.uploadcare.mod.File, Unit]): Unit
}

object Remove {
  @scala.inline
  def apply(
    remove: (String, js.Function2[/* err */ Error, /* res */ typings.uploadcare.mod.File, Unit]) => Unit,
    store: (String, js.Function2[/* err */ Error, /* res */ typings.uploadcare.mod.File, Unit]) => Unit
  ): Remove = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction2(remove), store = js.Any.fromFunction2(store))
    __obj.asInstanceOf[Remove]
  }
}

