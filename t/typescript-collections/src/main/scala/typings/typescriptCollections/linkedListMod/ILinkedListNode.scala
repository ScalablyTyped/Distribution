package typings.typescriptCollections.linkedListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILinkedListNode[T] extends js.Object {
  var element: T = js.native
  var next: ILinkedListNode[T] | Null = js.native
}

object ILinkedListNode {
  @scala.inline
  def apply[T](element: T): ILinkedListNode[T] = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILinkedListNode[T]]
  }
  @scala.inline
  implicit class ILinkedListNodeOps[Self <: ILinkedListNode[_], T] (val x: Self with ILinkedListNode[T]) extends AnyVal {
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
    def setElement(value: T): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: ILinkedListNode[T]): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextNull: Self = this.set("next", null)
  }
  
}

