package typings.typescriptTuple

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEqual[WhenEqual, Left /* <: js.Array[_] */, Right /* <: js.Array[_] */] extends js.Object {
  var equal: WhenEqual
  var shorterLeft: js.Tuple2[Left, Right]
  var shorterRight: js.Tuple2[Right, Left]
}

object AnonEqual {
  @scala.inline
  def apply[WhenEqual, Left /* <: js.Array[_] */, Right /* <: js.Array[_] */](equal: WhenEqual, shorterLeft: js.Tuple2[Left, Right], shorterRight: js.Tuple2[Right, Left]): AnonEqual[WhenEqual, Left, Right] = {
    val __obj = js.Dynamic.literal(equal = equal.asInstanceOf[js.Any], shorterLeft = shorterLeft.asInstanceOf[js.Any], shorterRight = shorterRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEqual[WhenEqual, Left, Right]]
  }
}

