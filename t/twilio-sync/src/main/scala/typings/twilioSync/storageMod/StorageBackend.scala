package typings.twilioSync.storageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageBackend extends js.Object {
  def getItem(key: String): String
  def removeItem(key: String): Unit
  def setItem(key: String, value: String): Unit
}

object StorageBackend {
  @scala.inline
  def apply(getItem: String => String, removeItem: String => Unit, setItem: (String, String) => Unit): StorageBackend = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
    __obj.asInstanceOf[StorageBackend]
  }
}

