package typings.transducersJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers.js", "toIter")
@js.native
object toIter extends js.Object {
  def apply[TInput, TOutput](coll: StringDictionary[TInput]): IterableIterator[TOutput] = js.native
  def apply[TInput, TOutput](coll: StringDictionary[TInput], xf: Transducer[js.Tuple2[String, TInput], TOutput]): IterableIterator[TOutput] = js.native
  def apply[TInput, TOutput](coll: Iterable[TInput]): IterableIterator[TOutput] = js.native
  def apply[TInput, TOutput](coll: Iterable[TInput], xf: Transducer[TInput, TOutput]): IterableIterator[TOutput] = js.native
}

