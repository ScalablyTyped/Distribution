package typings.transducersJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers.js", "transduce")
@js.native
object transduce extends js.Object {
  def apply[TResult, TInput, TOutput](
    coll: StringDictionary[TInput],
    xf: Transducer[js.Tuple2[String, TInput], TOutput],
    f: Reducer[TResult, TOutput],
    init: TResult
  ): TResult = js.native
  def apply[TResult, TInput, TOutput](
    coll: Iterable[TInput],
    xf: Transducer[TInput, TOutput],
    f: Reducer[TResult, TOutput],
    init: TResult
  ): TResult = js.native
  def apply[TResult, TCompleteResult, TInput, TOutput](
    coll: StringDictionary[TInput],
    xf: Transducer[js.Tuple2[String, TInput], TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput]
  ): TCompleteResult = js.native
  def apply[TResult, TCompleteResult, TInput, TOutput](
    coll: StringDictionary[TInput],
    xf: Transducer[js.Tuple2[String, TInput], TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput],
    init: TResult
  ): TCompleteResult = js.native
  def apply[TResult, TCompleteResult, TInput, TOutput](
    coll: Iterable[TInput],
    xf: Transducer[TInput, TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput]
  ): TCompleteResult = js.native
  def apply[TResult, TCompleteResult, TInput, TOutput](
    coll: Iterable[TInput],
    xf: Transducer[TInput, TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput],
    init: TResult
  ): TCompleteResult = js.native
}

