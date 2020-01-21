package typings.typescriptTuple

import typings.typescriptTuple.utilsMod.Prepend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1EmptyLeft[Right /* <: js.Array[_] */, Left /* <: js.Array[_] */] extends js.Object {
  var emptyLeft: Right
  var infiniteLeft: AnonCODENAMEERROR
  var multiLeft: js.Any
  var singleLeft: Prepend[Right, _]
}

object Anon1EmptyLeft {
  @scala.inline
  def apply[Right /* <: js.Array[_] */, Left /* <: js.Array[_] */](
    emptyLeft: Right,
    infiniteLeft: AnonCODENAMEERROR,
    multiLeft: js.Any,
    singleLeft: Prepend[Right, _]
  ): Anon1EmptyLeft[Right, Left] = {
    val __obj = js.Dynamic.literal(emptyLeft = emptyLeft.asInstanceOf[js.Any], infiniteLeft = infiniteLeft.asInstanceOf[js.Any], multiLeft = multiLeft.asInstanceOf[js.Any], singleLeft = singleLeft.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon1EmptyLeft[Right, Left]]
  }
}

