package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadonlyUnderscoreEscapedMap[T] extends js.Object {
  val size: Double = js.native
  def entries(): Iterator[js.Tuple2[String, T]] = js.native
  def forEach(action: js.Function2[/* value */ T, /* key */ String, Unit]): Unit = js.native
  def get(key: String): js.UndefOr[T] = js.native
  def has(key: String): Boolean = js.native
  def keys(): Iterator[String] = js.native
  def values(): Iterator[T] = js.native
}

object ReadonlyUnderscoreEscapedMap {
  @scala.inline
  def apply[T](
    entries: () => Iterator[js.Tuple2[String, T]],
    forEach: js.Function2[/* value */ T, /* key */ String, Unit] => Unit,
    get: String => js.UndefOr[T],
    has: String => Boolean,
    keys: () => Iterator[String],
    size: Double,
    values: () => Iterator[T]
  ): ReadonlyUnderscoreEscapedMap[T] = {
    val __obj = js.Dynamic.literal(entries = js.Any.fromFunction0(entries), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), size = size.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[ReadonlyUnderscoreEscapedMap[T]]
  }
  @scala.inline
  implicit class ReadonlyUnderscoreEscapedMapOps[Self <: ReadonlyUnderscoreEscapedMap[_], T] (val x: Self with ReadonlyUnderscoreEscapedMap[T]) extends AnyVal {
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
    def setEntries(value: () => Iterator[js.Tuple2[String, T]]): Self = this.set("entries", js.Any.fromFunction0(value))
    @scala.inline
    def setForEach(value: js.Function2[/* value */ T, /* key */ String, Unit] => Unit): Self = this.set("forEach", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: String => js.UndefOr[T]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setHas(value: String => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    @scala.inline
    def setKeys(value: () => Iterator[String]): Self = this.set("keys", js.Any.fromFunction0(value))
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setValues(value: () => Iterator[T]): Self = this.set("values", js.Any.fromFunction0(value))
  }
  
}

