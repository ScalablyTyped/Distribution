package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ES6 Map interface, only read methods included. */
@js.native
trait ReadonlyESMap[K, V] extends ReadonlyCollection[K] {
  
  def entries(): Iterator[js.Tuple2[K, V]] = js.native
  
  def forEach(action: js.Function2[/* value */ V, /* key */ K, Unit]): Unit = js.native
  
  def get(key: K): js.UndefOr[V] = js.native
  
  def values(): Iterator[V] = js.native
}
object ReadonlyESMap {
  
  @scala.inline
  def apply[K, V](
    entries: () => Iterator[js.Tuple2[K, V]],
    forEach: js.Function2[/* value */ V, /* key */ K, Unit] => Unit,
    get: K => js.UndefOr[V],
    has: K => Boolean,
    keys: () => Iterator[K],
    size: Double,
    values: () => Iterator[V]
  ): ReadonlyESMap[K, V] = {
    val __obj = js.Dynamic.literal(entries = js.Any.fromFunction0(entries), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), size = size.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[ReadonlyESMap[K, V]]
  }
  
  @scala.inline
  implicit class ReadonlyESMapOps[Self <: ReadonlyESMap[_, _], K, V] (val x: Self with (ReadonlyESMap[K, V])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEntries(value: () => Iterator[js.Tuple2[K, V]]): Self = this.set("entries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setForEach(value: js.Function2[/* value */ V, /* key */ K, Unit] => Unit): Self = this.set("forEach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: K => js.UndefOr[V]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValues(value: () => Iterator[V]): Self = this.set("values", js.Any.fromFunction0(value))
  }
}
