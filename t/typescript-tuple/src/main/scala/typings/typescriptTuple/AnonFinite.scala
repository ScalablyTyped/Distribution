package typings.typescriptTuple

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFinite[Holder /* <: js.Array[_] */, Tuple /* <: js.Array[_] */] extends js.Object {
  var finite: js.Tuple2[Tuple, js.Array[js.Any]]
  var matched: js.Tuple2[Holder, Tuple]
  var unmatched: js.Any
}

object AnonFinite {
  @scala.inline
  def apply[Holder /* <: js.Array[_] */, Tuple /* <: js.Array[_] */](finite: js.Tuple2[Tuple, js.Array[js.Any]], matched: js.Tuple2[Holder, Tuple], unmatched: js.Any): AnonFinite[Holder, Tuple] = {
    val __obj = js.Dynamic.literal(finite = finite.asInstanceOf[js.Any], matched = matched.asInstanceOf[js.Any], unmatched = unmatched.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFinite[Holder, Tuple]]
  }
}

