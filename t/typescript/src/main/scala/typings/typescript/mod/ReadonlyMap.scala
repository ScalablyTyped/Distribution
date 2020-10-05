package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ES6 Map interface, only read methods included. */
@js.native
trait ReadonlyMap[T] extends js.Object {
  val size: Double = js.native
  def entries(): Iterator[js.Tuple2[java.lang.String, T]] = js.native
  def forEach(action: js.Function2[/* value */ T, /* key */ java.lang.String, Unit]): Unit = js.native
  def get(key: java.lang.String): js.UndefOr[T] = js.native
  def has(key: java.lang.String): Boolean = js.native
  def keys(): Iterator[java.lang.String] = js.native
  def values(): Iterator[T] = js.native
}

object ReadonlyMap {
  @scala.inline
  def apply[T](
    entries: () => Iterator[js.Tuple2[java.lang.String, T]],
    forEach: js.Function2[/* value */ T, /* key */ java.lang.String, Unit] => Unit,
    get: java.lang.String => js.UndefOr[T],
    has: java.lang.String => Boolean,
    keys: () => Iterator[java.lang.String],
    size: Double,
    values: () => Iterator[T]
  ): ReadonlyMap[T] = {
    val __obj = js.Dynamic.literal(entries = js.Any.fromFunction0(entries), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), size = size.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[ReadonlyMap[T]]
  }
  @scala.inline
  implicit class ReadonlyMapOps[Self <: ReadonlyMap[_], T] (val x: Self with ReadonlyMap[T]) extends AnyVal {
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
    def setEntries(value: () => Iterator[js.Tuple2[java.lang.String, T]]): Self = this.set("entries", js.Any.fromFunction0(value))
    @scala.inline
    def setForEach(value: js.Function2[/* value */ T, /* key */ java.lang.String, Unit] => Unit): Self = this.set("forEach", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: java.lang.String => js.UndefOr[T]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setHas(value: java.lang.String => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    @scala.inline
    def setKeys(value: () => Iterator[java.lang.String]): Self = this.set("keys", js.Any.fromFunction0(value))
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setValues(value: () => Iterator[T]): Self = this.set("values", js.Any.fromFunction0(value))
  }
  
}

