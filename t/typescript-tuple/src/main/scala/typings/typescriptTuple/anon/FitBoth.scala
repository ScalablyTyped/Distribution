package typings.typescriptTuple.anon

import typings.typescriptTuple.typescriptTupleStrings.equal
import typings.typescriptTuple.typescriptTupleStrings.shorterLeft
import typings.typescriptTuple.typescriptTupleStrings.shorterRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FitBoth[Left /* <: js.Array[_] */, Right /* <: js.Array[_] */] extends js.Object {
  var fitBoth: equal = js.native
  var fitLeft: shorterLeft = js.native
  var fitRight: shorterRight = js.native
  var unfit: js.Any = js.native
}

object FitBoth {
  @scala.inline
  def apply[/* <: js.Array[_] */ Left, /* <: js.Array[_] */ Right](fitBoth: equal, fitLeft: shorterLeft, fitRight: shorterRight, unfit: js.Any): FitBoth[Left, Right] = {
    val __obj = js.Dynamic.literal(fitBoth = fitBoth.asInstanceOf[js.Any], fitLeft = fitLeft.asInstanceOf[js.Any], fitRight = fitRight.asInstanceOf[js.Any], unfit = unfit.asInstanceOf[js.Any])
    __obj.asInstanceOf[FitBoth[Left, Right]]
  }
  @scala.inline
  implicit class FitBothOps[Self <: FitBoth[_, _], /* <: js.Array[_] */ Left, /* <: js.Array[_] */ Right] (val x: Self with (FitBoth[Left, Right])) extends AnyVal {
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
    def setFitBoth(value: equal): Self = this.set("fitBoth", value.asInstanceOf[js.Any])
    @scala.inline
    def setFitLeft(value: shorterLeft): Self = this.set("fitLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setFitRight(value: shorterRight): Self = this.set("fitRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnfit(value: js.Any): Self = this.set("unfit", value.asInstanceOf[js.Any])
  }
  
}

