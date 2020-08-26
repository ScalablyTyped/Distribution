package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ES6 Map interface. */
@js.native
trait Map[T] extends ReadonlyMap[T] {
  def clear(): Unit = js.native
  def delete(key: java.lang.String): Boolean = js.native
  def set(key: java.lang.String, value: T): this.type = js.native
}

object Map {
  @scala.inline
  def apply[T](
    clear: () => Unit,
    delete: java.lang.String => Boolean,
    entries: () => Iterator[js.Tuple2[java.lang.String, T]],
    forEach: js.Function2[T, /* key */ java.lang.String, Unit] => Unit,
    get: java.lang.String => js.UndefOr[T],
    has: java.lang.String => Boolean,
    keys: () => Iterator[java.lang.String],
    set: (java.lang.String, T) => Map[T],
    size: Double,
    values: () => Iterator[T]
  ): Map[T] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), entries = js.Any.fromFunction0(entries), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), set = js.Any.fromFunction2(set), size = size.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[Map[T]]
  }
  @scala.inline
  implicit class MapOps[Self <: Map[_], T] (val x: Self with Map[T]) extends AnyVal {
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
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setDelete(value: java.lang.String => Boolean): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: (java.lang.String, T) => Map[T]): Self = this.set("set", js.Any.fromFunction2(value))
  }
  
}

