package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnderscoreEscapedMap[T] extends ReadonlyUnderscoreEscapedMap[T] {
  def clear(): Unit = js.native
  def delete(key: String): Boolean = js.native
  def set(key: String, value: T): this.type = js.native
}

object UnderscoreEscapedMap {
  @scala.inline
  def apply[T](
    clear: () => Unit,
    delete: String => Boolean,
    entries: () => Iterator[js.Tuple2[String, T]],
    forEach: js.Function2[T, /* key */ String, Unit] => Unit,
    get: String => js.UndefOr[T],
    has: String => Boolean,
    keys: () => Iterator[String],
    set: (String, T) => UnderscoreEscapedMap[T],
    size: Double,
    values: () => Iterator[T]
  ): UnderscoreEscapedMap[T] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), entries = js.Any.fromFunction0(entries), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), set = js.Any.fromFunction2(set), size = size.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[UnderscoreEscapedMap[T]]
  }
  @scala.inline
  implicit class UnderscoreEscapedMapOps[Self <: UnderscoreEscapedMap[_], T] (val x: Self with UnderscoreEscapedMap[T]) extends AnyVal {
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
    def setDelete(value: String => Boolean): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: (String, T) => UnderscoreEscapedMap[T]): Self = this.set("set", js.Any.fromFunction2(value))
  }
  
}

