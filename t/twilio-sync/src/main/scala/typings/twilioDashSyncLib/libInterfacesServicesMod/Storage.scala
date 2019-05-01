package typings
package twilioDashSyncLib.libInterfacesServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Storage extends js.Object {
  def read(`type`: java.lang.String, id: java.lang.String): js.Object
  def remove(`type`: java.lang.String, sid: java.lang.String, uniqueName: java.lang.String): js.Any
  def store(`type`: java.lang.String, id: java.lang.String, value: js.Object): js.Any
  def update(`type`: java.lang.String, id: java.lang.String, uniqueName: java.lang.String, patch: js.Object): js.Any
  def updateStorageId(storageId: java.lang.String): js.Any
}

object Storage {
  @scala.inline
  def apply(
    read: (java.lang.String, java.lang.String) => js.Object,
    remove: (java.lang.String, java.lang.String, java.lang.String) => js.Any,
    store: (java.lang.String, java.lang.String, js.Object) => js.Any,
    update: (java.lang.String, java.lang.String, java.lang.String, js.Object) => js.Any,
    updateStorageId: java.lang.String => js.Any
  ): Storage = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction2(read), remove = js.Any.fromFunction3(remove), store = js.Any.fromFunction3(store), update = js.Any.fromFunction4(update), updateStorageId = js.Any.fromFunction1(updateStorageId))
  
    __obj.asInstanceOf[Storage]
  }
}

