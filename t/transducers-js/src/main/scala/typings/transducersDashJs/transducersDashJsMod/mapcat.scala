package typings.transducersDashJs.transducersDashJsMod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "mapcat")
@js.native
object mapcat extends js.Object {
  def apply[TResult, TInput, TOutput](f: js.Function1[/* arr */ TInput, Iterable[TOutput]]): Transducer[TInput, TOutput] = js.native
}

