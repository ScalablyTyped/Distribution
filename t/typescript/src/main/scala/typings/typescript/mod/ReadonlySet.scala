package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ES6 Set interface, only read methods included. */
@js.native
trait ReadonlySet[T] extends ReadonlyCollection[T] {
  
  def entries(): Iterator[js.Tuple2[T, T]] = js.native
  
  def forEach(action: js.Function2[/* value */ T, /* key */ T, Unit]): Unit = js.native
  
  def values(): Iterator[T] = js.native
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
  implicit class ReadonlySetOps[Self <: ReadonlySet[_], T] (val x: Self with ReadonlySet[T]) extends AnyVal {
    
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
    def setEntries(value: () => Iterator[js.Tuple2[T, T]]): Self = this.set("entries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setForEach(value: js.Function2[/* value */ T, /* key */ T, Unit] => Unit): Self = this.set("forEach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValues(value: () => Iterator[T]): Self = this.set("values", js.Any.fromFunction0(value))
  }
}
