package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ES6 Set interface, only read methods included. */
trait ReadonlySet[T]
  extends StObject
     with ReadonlyCollection[T] {
  
  def entries(): Iterator[js.Tuple2[T, T]]
  
  def forEach(action: js.Function2[/* value */ T, /* key */ T, Unit]): Unit
  
  def values(): Iterator[T]
}
object ReadonlySet {
  
  @scala.inline
  def apply[T](
    entries: () => Iterator[js.Tuple2[T, T]],
    forEach: js.Function2[/* value */ T, /* key */ T, Unit] => Unit,
    has: T => Boolean,
    keys: () => Iterator[T],
    size: Double,
    values: () => Iterator[T]
  ): ReadonlySet[T] = {
    val __obj = js.Dynamic.literal(entries = js.Any.fromFunction0(entries), forEach = js.Any.fromFunction1(forEach), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), size = size.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[ReadonlySet[T]]
  }
  
  @scala.inline
  implicit class ReadonlySetMutableBuilder[Self <: ReadonlySet[?], T] (val x: Self & ReadonlySet[T]) extends AnyVal {
    
    @scala.inline
    def setEntries(value: () => Iterator[js.Tuple2[T, T]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setForEach(value: js.Function2[/* value */ T, /* key */ T, Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValues(value: () => Iterator[T]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
  }
}
