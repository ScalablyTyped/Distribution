package typings.typescriptTuple

import typings.typescriptTuple.typescriptTupleStrings.equal
import typings.typescriptTuple.typescriptTupleStrings.shorterLeft
import typings.typescriptTuple.typescriptTupleStrings.shorterRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFitBoth[Left /* <: js.Array[_] */, Right /* <: js.Array[_] */] extends js.Object {
  var fitBoth: equal
  var fitLeft: shorterLeft
  var fitRight: shorterRight
  var unfit: js.Any
}

object AnonFitBoth {
  @scala.inline
  def apply[Left /* <: js.Array[_] */, Right /* <: js.Array[_] */](fitBoth: equal, fitLeft: shorterLeft, fitRight: shorterRight, unfit: js.Any): AnonFitBoth[Left, Right] = {
    val __obj = js.Dynamic.literal(fitBoth = fitBoth.asInstanceOf[js.Any], fitLeft = fitLeft.asInstanceOf[js.Any], fitRight = fitRight.asInstanceOf[js.Any], unfit = unfit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFitBoth[Left, Right]]
  }
}

