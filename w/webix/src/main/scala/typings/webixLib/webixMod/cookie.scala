package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cookie extends js.Object {
  def clear(): scala.Unit
  def get(name: java.lang.String): js.Any
  def put(name: java.lang.String, value: js.Any): scala.Unit
  def remove(name: java.lang.String): scala.Unit
}

object cookie {
  @scala.inline
  def apply(
    clear: () => scala.Unit,
    get: java.lang.String => js.Any,
    put: (java.lang.String, js.Any) => scala.Unit,
    remove: java.lang.String => scala.Unit
  ): cookie = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), put = js.Any.fromFunction2(put), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[cookie]
  }
}

