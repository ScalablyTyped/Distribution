package typings.typescriptTuple.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Finite[Holder /* <: js.Array[_] */, Tuple /* <: js.Array[_] */] extends js.Object {
  var finite: js.Tuple2[Tuple, js.Array[js.Any]]
  var matched: js.Tuple2[Holder, Tuple]
  var unmatched: js.Any
}

object Finite {
  @scala.inline
  def apply[/* <: js.Array[_] */ Holder, /* <: js.Array[_] */ Tuple](finite: js.Tuple2[Tuple, js.Array[js.Any]], matched: js.Tuple2[Holder, Tuple], unmatched: js.Any): Finite[Holder, Tuple] = {
    val __obj = js.Dynamic.literal(finite = finite.asInstanceOf[js.Any], matched = matched.asInstanceOf[js.Any], unmatched = unmatched.asInstanceOf[js.Any])
    __obj.asInstanceOf[Finite[Holder, Tuple]]
  }
}

