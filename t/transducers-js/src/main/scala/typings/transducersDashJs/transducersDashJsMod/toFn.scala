package typings.transducersDashJs.transducersDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "toFn")
@js.native
object toFn extends js.Object {
  def apply[TResult, TInput, TOutput](xf: Transducer[TInput, TOutput], builder: Reducer[TResult, TOutput]): Reducer[TResult, TOutput] = js.native
  def apply[TResult, TInput, TOutput](xf: Transducer[TInput, TOutput], builder: Transformer[TResult, TOutput]): Reducer[TResult, TOutput] = js.native
}

