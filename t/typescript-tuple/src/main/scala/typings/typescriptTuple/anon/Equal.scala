package typings.typescriptTuple.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Equal[WhenEqual, Left /* <: js.Array[_] */, Right /* <: js.Array[_] */] extends js.Object {
  var equal: WhenEqual
  var shorterLeft: js.Tuple2[Left, Right]
  var shorterRight: js.Tuple2[Right, Left]
}

object Equal {
  @scala.inline
  def apply[WhenEqual, /* <: js.Array[_] */ Left, /* <: js.Array[_] */ Right](equal: WhenEqual, shorterLeft: js.Tuple2[Left, Right], shorterRight: js.Tuple2[Right, Left]): Equal[WhenEqual, Left, Right] = {
    val __obj = js.Dynamic.literal(equal = equal.asInstanceOf[js.Any], shorterLeft = shorterLeft.asInstanceOf[js.Any], shorterRight = shorterRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Equal[WhenEqual, Left, Right]]
  }
}

