package typings.symbolTree.treeIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeIteratorResult[T] extends js.Object {
  var done: Boolean
  var value: T
}

object TreeIteratorResult {
  @scala.inline
  def apply[T](done: Boolean, value: T): TreeIteratorResult[T] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TreeIteratorResult[T]]
  }
}

