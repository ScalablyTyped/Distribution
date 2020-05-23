package typings.typescriptTuple.anon

import typings.typescriptTuple.utilsMod.Prepend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmptyLeft[Right /* <: js.Array[_] */, Left /* <: js.Array[_] */] extends js.Object {
  var emptyLeft: Right
  var infiniteLeft: ERROR
  var multiLeft: js.Any
  var singleLeft: Prepend[Right, _]
}

object EmptyLeft {
  @scala.inline
  def apply[Right, Left](emptyLeft: Right, infiniteLeft: ERROR, multiLeft: js.Any, singleLeft: Prepend[Right, _]): EmptyLeft[Right, Left] = {
    val __obj = js.Dynamic.literal(emptyLeft = emptyLeft.asInstanceOf[js.Any], infiniteLeft = infiniteLeft.asInstanceOf[js.Any], multiLeft = multiLeft.asInstanceOf[js.Any], singleLeft = singleLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyLeft[Right, Left]]
  }
}

