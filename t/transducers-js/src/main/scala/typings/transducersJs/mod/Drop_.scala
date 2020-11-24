package typings.transducersJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("transducers-js", "Drop")
@js.native
class Drop_[TResult, TInput] protected () extends CompletingTransformer[TResult, TResult, TInput] {
  def this(n: Double, xf: Transformer[TResult, TInput]) = this()
}
