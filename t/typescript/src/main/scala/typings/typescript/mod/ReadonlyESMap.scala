package typings.typescript.mod

import org.scalablytyped.runtime.StObject
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
  implicit class ReadonlyESMapMutableBuilder[Self <: ReadonlyESMap[_, _], K, V] (val x: Self with (ReadonlyESMap[K, V])) extends AnyVal {
    
    @scala.inline
    def setEntries(value: () => Iterator[js.Tuple2[K, V]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setForEach(value: js.Function2[/* value */ V, /* key */ K, Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: K => js.UndefOr[V]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValues(value: () => Iterator[V]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
  }
}
