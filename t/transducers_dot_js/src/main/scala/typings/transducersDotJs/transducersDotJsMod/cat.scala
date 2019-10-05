package typings.transducersDotJs.transducersDotJsMod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers.js", "cat")
@js.native
object cat extends js.Object {
  def apply[TResult, TInput](f: Transformer[TResult, TInput]): Transformer[TResult, Iterable[TInput]] = js.native
}

