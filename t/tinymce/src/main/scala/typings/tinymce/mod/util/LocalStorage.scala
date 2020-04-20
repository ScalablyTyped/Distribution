package typings.tinymce.mod.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalStorage extends js.Object {
  var length: Double
  def clear(): Unit
  def getItem(key: String): String
  def key(index: Double): String
  def removeItem(key: String): Unit
  def setItem(key: String, value: String): Unit
}

object LocalStorage {
  @scala.inline
  def apply(
    clear: () => Unit,
    getItem: String => String,
    key: Double => String,
    length: Double,
    removeItem: String => Unit,
    setItem: (String, String) => Unit
  ): LocalStorage = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), getItem = js.Any.fromFunction1(getItem), key = js.Any.fromFunction1(key), length = length.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
    __obj.asInstanceOf[LocalStorage]
  }
}

