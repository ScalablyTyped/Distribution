package typings.typescriptDashTuple

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Equal[WhenEqual, Left /* <: js.Array[_] */, Right /* <: js.Array[_] */] extends js.Object {
  var equal: WhenEqual
  var shorterLeft: js.Tuple2[Left, Right]
  var shorterRight: js.Tuple2[Right, Left]
}

object Anon_Equal {
  @scala.inline
  def apply[WhenEqual, Left /* <: js.Array[_] */, Right /* <: js.Array[_] */](equal: WhenEqual, shorterLeft: js.Tuple2[Left, Right], shorterRight: js.Tuple2[Right, Left]): Anon_Equal[WhenEqual, Left, Right] = {
    val __obj = js.Dynamic.literal(equal = equal.asInstanceOf[js.Any], shorterLeft = shorterLeft.asInstanceOf[js.Any], shorterRight = shorterRight.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Equal[WhenEqual, Left, Right]]
  }
}

