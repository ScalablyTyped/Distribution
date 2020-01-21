package typings.webix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cookie extends js.Object {
  def clear(): Unit
  def get(name: String): js.Any
  def put(name: String, value: js.Any): Unit
  def remove(name: String): Unit
}

object cookie {
  @scala.inline
  def apply(clear: () => Unit, get: String => js.Any, put: (String, js.Any) => Unit, remove: String => Unit): cookie = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), put = js.Any.fromFunction2(put), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[cookie]
  }
}

