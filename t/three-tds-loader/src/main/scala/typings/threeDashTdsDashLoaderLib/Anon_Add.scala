package typings
package threeDashTdsDashLoaderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Add extends js.Object {
  var enabled: scala.Boolean
  var files: js.Any
  def add(key: java.lang.String, file: js.Any): scala.Unit
  def clear(): scala.Unit
  def get(key: java.lang.String): js.Any
  def remove(key: java.lang.String): scala.Unit
}

object Anon_Add {
  @scala.inline
  def apply(
    add: js.Function2[java.lang.String, js.Any, scala.Unit],
    clear: js.Function0[scala.Unit],
    enabled: scala.Boolean,
    files: js.Any,
    get: js.Function1[java.lang.String, js.Any],
    remove: js.Function1[java.lang.String, scala.Unit]
  ): Anon_Add = {
    val __obj = js.Dynamic.literal(add = add, clear = clear, enabled = enabled, files = files, get = get, remove = remove)
  
    __obj.asInstanceOf[Anon_Add]
  }
}

