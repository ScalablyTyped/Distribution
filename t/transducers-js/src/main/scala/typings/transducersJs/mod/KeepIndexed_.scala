package typings.transducersJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("transducers-js", "KeepIndexed")
@js.native
class KeepIndexed_[TResult, TInput] protected () extends CompletingTransformer[TResult, TResult, TInput] {
  def this(f: js.Function2[/* i */ Double, /* x */ TInput, _], xf: Transformer[TResult, TInput]) = this()
}
