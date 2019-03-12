package typings
package vegaDashUtilLib.vegaDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FastMap extends js.Object {
  var empty: scala.Double
  var size: scala.Double
  def clean(): scala.Unit
  def delete(f: java.lang.String): scala.Unit
  def get(f: java.lang.String): js.Any
  def has(f: java.lang.String): scala.Boolean
  def set(f: java.lang.String, v: js.Any): scala.Unit
}

object FastMap {
  @scala.inline
  def apply(
    clean: () => scala.Unit,
    delete: java.lang.String => scala.Unit,
    empty: scala.Double,
    get: java.lang.String => js.Any,
    has: java.lang.String => scala.Boolean,
    set: (java.lang.String, js.Any) => scala.Unit,
    size: scala.Double
  ): FastMap = {
    val __obj = js.Dynamic.literal(clean = js.Any.fromFunction0(clean), delete = js.Any.fromFunction1(delete), empty = empty, get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set), size = size)
  
    __obj.asInstanceOf[FastMap]
  }
}

