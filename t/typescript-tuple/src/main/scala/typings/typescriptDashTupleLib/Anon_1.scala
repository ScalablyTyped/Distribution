package typings
package typescriptDashTupleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_1[Holder /* <: js.Array[_] */, Tuple /* <: js.Array[_] */] extends js.Object {
  var finite: js.Tuple2[Tuple, js.Array[js.Any]]
  var matched: js.Tuple2[Holder, Tuple]
  var unmatched: js.Any
}

object Anon_1 {
  @scala.inline
  def apply[Holder /* <: js.Array[_] */, Tuple /* <: js.Array[_] */](finite: js.Tuple2[Tuple, js.Array[js.Any]], matched: js.Tuple2[Holder, Tuple], unmatched: js.Any): Anon_1[Holder, Tuple] = {
    val __obj = js.Dynamic.literal(finite = finite, matched = matched, unmatched = unmatched)
  
    __obj.asInstanceOf[Anon_1[Holder, Tuple]]
  }
}

