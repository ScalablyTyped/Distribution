package typings.typescriptTuple

import typings.typescriptTuple.utilsMod.Prepend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmptyLeft[Right /* <: js.Array[_] */, Left /* <: js.Array[_] */] extends js.Object {
  var emptyLeft: Right
  var infiniteLeft: AnonERROR
  var multiLeft: js.Any
  var singleLeft: Prepend[Right, _]
}

object AnonEmptyLeft {
  @scala.inline
  def apply[Right /* <: js.Array[_] */, Left /* <: js.Array[_] */](emptyLeft: Right, infiniteLeft: AnonERROR, multiLeft: js.Any, singleLeft: Prepend[Right, _]): AnonEmptyLeft[Right, Left] = {
    val __obj = js.Dynamic.literal(emptyLeft = emptyLeft.asInstanceOf[js.Any], infiniteLeft = infiniteLeft.asInstanceOf[js.Any], multiLeft = multiLeft.asInstanceOf[js.Any], singleLeft = singleLeft.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEmptyLeft[Right, Left]]
  }
}

