package typings
package typescriptDashTupleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_1Equal[Left /* <: js.Array[_] */, Right /* <: js.Array[_] */] extends js.Object {
  var fitBoth: typescriptDashTupleLib.typescriptDashTupleLibStrings.equal
  var fitLeft: typescriptDashTupleLib.typescriptDashTupleLibStrings.shorterLeft
  var fitRight: typescriptDashTupleLib.typescriptDashTupleLibStrings.shorterRight
  var unfit: js.Any
}

object Anon_1Equal {
  @scala.inline
  def apply[Left /* <: js.Array[_] */, Right /* <: js.Array[_] */](
    fitBoth: typescriptDashTupleLib.typescriptDashTupleLibStrings.equal,
    fitLeft: typescriptDashTupleLib.typescriptDashTupleLibStrings.shorterLeft,
    fitRight: typescriptDashTupleLib.typescriptDashTupleLibStrings.shorterRight,
    unfit: js.Any
  ): Anon_1Equal[Left, Right] = {
    val __obj = js.Dynamic.literal(fitBoth = fitBoth, fitLeft = fitLeft, fitRight = fitRight, unfit = unfit)
  
    __obj.asInstanceOf[Anon_1Equal[Left, Right]]
  }
}

