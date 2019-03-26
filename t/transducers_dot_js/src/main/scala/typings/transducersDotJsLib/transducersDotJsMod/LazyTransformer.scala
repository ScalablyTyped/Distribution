package typings
package transducersDotJsLib.transducersDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers.js", "LazyTransformer")
@js.native
class LazyTransformer[TInput, TOutput] protected ()
  extends stdLib.IterableIterator[TOutput] {
  def this(xf: Transducer[TInput, TOutput], coll: stdLib.Iterable[TInput]) = this()
}

