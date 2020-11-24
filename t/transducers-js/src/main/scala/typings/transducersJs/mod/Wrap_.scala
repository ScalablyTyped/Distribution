package typings.transducersJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("transducers-js", "Wrap")
@js.native
class Wrap_[TResult, TInput] protected () extends CompletingTransformer[TResult, TResult, TInput] {
  def this(stepFn: Reducer[TResult, TInput]) = this()
}
