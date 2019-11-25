package typings.typescriptDashCollections.distLibLinkedListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILinkedListNode[T] extends js.Object {
  var element: T
  var next: ILinkedListNode[T] | Null
}

object ILinkedListNode {
  @scala.inline
  def apply[T](element: T, next: ILinkedListNode[T] = null): ILinkedListNode[T] = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILinkedListNode[T]]
  }
}

