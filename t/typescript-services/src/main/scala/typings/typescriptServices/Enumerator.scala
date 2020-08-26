package typings.typescriptServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Enumerator extends js.Object {
  def atEnd(): Boolean = js.native
  def item(): js.Any = js.native
  def moveNext(): Boolean = js.native
}

object Enumerator {
  @scala.inline
  def apply(atEnd: () => Boolean, item: () => js.Any, moveNext: () => Boolean): Enumerator = {
    val __obj = js.Dynamic.literal(atEnd = js.Any.fromFunction0(atEnd), item = js.Any.fromFunction0(item), moveNext = js.Any.fromFunction0(moveNext))
    __obj.asInstanceOf[Enumerator]
  }
  @scala.inline
  implicit class EnumeratorOps[Self <: Enumerator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAtEnd(value: () => Boolean): Self = this.set("atEnd", js.Any.fromFunction0(value))
    @scala.inline
    def setItem(value: () => js.Any): Self = this.set("item", js.Any.fromFunction0(value))
    @scala.inline
    def setMoveNext(value: () => Boolean): Self = this.set("moveNext", js.Any.fromFunction0(value))
  }
  
}

