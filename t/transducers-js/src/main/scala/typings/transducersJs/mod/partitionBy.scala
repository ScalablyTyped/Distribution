package typings.transducersJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "partitionBy")
@js.native
object partitionBy extends js.Object {
  def apply[TInput](f: js.Function1[/* input */ TInput, _]): Transducer[TInput, js.Array[TInput]] = js.native
}

