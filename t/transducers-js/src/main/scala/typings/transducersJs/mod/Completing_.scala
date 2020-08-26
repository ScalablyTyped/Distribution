package typings.transducersJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "Completing")
@js.native
class Completing_[TResult, TCompleteResult, TInput] protected () extends CompletingTransformer[TResult, TCompleteResult, TInput] {
  def this(cf: js.Function1[/* result */ TResult, TCompleteResult], xf: Transformer[TResult, TInput]) = this()
}

