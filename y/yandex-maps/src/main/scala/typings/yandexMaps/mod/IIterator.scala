package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIterator extends js.Object {
  def getNext(): js.Object | Null = js.native
}

object IIterator {
  @scala.inline
  def apply(getNext: () => js.Object | Null): IIterator = {
    val __obj = js.Dynamic.literal(getNext = js.Any.fromFunction0(getNext))
    __obj.asInstanceOf[IIterator]
  }
  @scala.inline
  implicit class IIteratorOps[Self <: IIterator] (val x: Self) extends AnyVal {
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
    def setGetNext(value: () => js.Object | Null): Self = this.set("getNext", js.Any.fromFunction0(value))
  }
  
}

