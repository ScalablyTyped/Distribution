package typings.transducersJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "PartitionBy")
@js.native
class PartitionBy_[TResult, TInput] protected () extends CompletingTransformer[TResult, TResult, TInput] {
  def this(f: js.Function1[/* input */ TInput, _], xf: Transformer[TResult, js.Array[TInput]]) = this()
}

