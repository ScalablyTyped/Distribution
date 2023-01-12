package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ES6 Map interface, only read methods included. */
trait ReadonlyESMap[K, V]
  extends StObject
     with ReadonlyCollection[K] {
  
  def entries(): Iterator[js.Tuple2[K, V]]
  
  def forEach(action: js.Function2[/* value */ V, /* key */ K, Unit]): Unit
  
  def get(key: K): js.UndefOr[V]
  
  def values(): Iterator[V]
}
object ReadonlyESMap {
  
  inline def apply[K, V](
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
  implicit open class MutableBuilder[Self <: ReadonlyESMap[?, ?], K, V] (val x: Self & (ReadonlyESMap[K, V])) extends AnyVal {
    
    inline def setEntries(value: () => Iterator[js.Tuple2[K, V]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
    
    inline def setForEach(value: js.Function2[/* value */ V, /* key */ K, Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
    
    inline def setGet(value: K => js.UndefOr[V]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setValues(value: () => Iterator[V]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
  }
}
