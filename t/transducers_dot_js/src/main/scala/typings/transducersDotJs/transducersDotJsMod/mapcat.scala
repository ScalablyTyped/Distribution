package typings.transducersDotJs.transducersDotJsMod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers.js", "mapcat")
@js.native
object mapcat extends js.Object {
  def apply[TInput, TOutput](f: js.Function1[/* x */ TInput, Iterable[TOutput]]): Transducer[TInput, TOutput] = js.native
}

