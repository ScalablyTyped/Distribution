package typings.twilioSync.servicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Storage extends js.Object {
  def read(`type`: String, id: String): js.Object
  def remove(`type`: String, sid: String, uniqueName: String): js.Any
  def store(`type`: String, id: String, value: js.Object): js.Any
  def update(`type`: String, id: String, uniqueName: String, patch: js.Object): js.Any
  def updateStorageId(storageId: String): js.Any
}

object Storage {
  @scala.inline
  def apply(
    read: (String, String) => js.Object,
    remove: (String, String, String) => js.Any,
    store: (String, String, js.Object) => js.Any,
    update: (String, String, String, js.Object) => js.Any,
    updateStorageId: String => js.Any
  ): Storage = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction2(read), remove = js.Any.fromFunction3(remove), store = js.Any.fromFunction3(store), update = js.Any.fromFunction4(update), updateStorageId = js.Any.fromFunction1(updateStorageId))
    __obj.asInstanceOf[Storage]
  }
}

