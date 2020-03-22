package typings.typescriptTuple

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmptyPrefix[Prefix /* <: js.Array[_] */, Tuple /* <: js.Array[_] */] extends js.Object {
  var empty: Prefix
  var infinite: AnonCODENAME
  var nonEmpty: js.Any
}

object AnonEmptyPrefix {
  @scala.inline
  def apply[Prefix /* <: js.Array[_] */, Tuple /* <: js.Array[_] */](empty: Prefix, infinite: AnonCODENAME, nonEmpty: js.Any): AnonEmptyPrefix[Prefix, Tuple] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEmptyPrefix[Prefix, Tuple]]
  }
}

