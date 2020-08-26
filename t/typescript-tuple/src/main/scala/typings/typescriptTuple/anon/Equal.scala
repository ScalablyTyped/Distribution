package typings.typescriptTuple.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Equal[WhenEqual, Left /* <: js.Array[_] */, Right /* <: js.Array[_] */] extends js.Object {
  var equal: WhenEqual = js.native
  var shorterLeft: js.Tuple2[Left, Right] = js.native
  var shorterRight: js.Tuple2[Right, Left] = js.native
}

object Equal {
  @scala.inline
  def apply[WhenEqual, /* <: js.Array[_] */ Left, /* <: js.Array[_] */ Right](equal: WhenEqual, shorterLeft: js.Tuple2[Left, Right], shorterRight: js.Tuple2[Right, Left]): Equal[WhenEqual, Left, Right] = {
    val __obj = js.Dynamic.literal(equal = equal.asInstanceOf[js.Any], shorterLeft = shorterLeft.asInstanceOf[js.Any], shorterRight = shorterRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Equal[WhenEqual, Left, Right]]
  }
  @scala.inline
  implicit class EqualOps[Self <: Equal[_, _, _], WhenEqual, /* <: js.Array[_] */ Left, /* <: js.Array[_] */ Right] (val x: Self with (Equal[WhenEqual, Left, Right])) extends AnyVal {
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
    def setEqual(value: WhenEqual): Self = this.set("equal", value.asInstanceOf[js.Any])
    @scala.inline
    def setShorterLeft(value: js.Tuple2[Left, Right]): Self = this.set("shorterLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setShorterRight(value: js.Tuple2[Right, Left]): Self = this.set("shorterRight", value.asInstanceOf[js.Any])
  }
  
}

