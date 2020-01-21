package typings.threeTdsLoader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofCache extends js.Object {
  var enabled: Boolean
  var files: js.Any
  def add(key: String, file: js.Any): Unit
  def clear(): Unit
  def get(key: String): js.Any
  def remove(key: String): Unit
}

object TypeofCache {
  @scala.inline
  def apply(
    add: (String, js.Any) => Unit,
    clear: () => Unit,
    enabled: Boolean,
    files: js.Any,
    get: String => js.Any,
    remove: String => Unit
  ): TypeofCache = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), clear = js.Any.fromFunction0(clear), enabled = enabled.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[TypeofCache]
  }
}

