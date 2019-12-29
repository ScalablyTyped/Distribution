package typings.vegaDashUtil.vegaDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FastMap extends js.Object {
  var empty: Double
  var size: Double
  def clean(): Unit
  def delete(f: String): Unit
  def get(f: String): js.Any
  def has(f: String): Boolean
  def set(f: String, v: js.Any): Unit
}

object FastMap {
  @scala.inline
  def apply(
    clean: () => Unit,
    delete: String => Unit,
    empty: Double,
    get: String => js.Any,
    has: String => Boolean,
    set: (String, js.Any) => Unit,
    size: Double
  ): FastMap = {
    val __obj = js.Dynamic.literal(clean = js.Any.fromFunction0(clean), delete = js.Any.fromFunction1(delete), empty = empty.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set), size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FastMap]
  }
}

@JSImport("vega-util", "fastmap")
@js.native
object fastmap extends js.Object {
  def apply(): FastMap = js.native
  def apply(_underscore: js.Object): FastMap = js.native
}

