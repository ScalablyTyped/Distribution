package typings.transducersDotJs.transducersDotJsMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val LazyTransformer: LazyTransformerConstructor = js.native
  val Reduced: ReducedConstructor = js.native
  def cat[TResult, TInput](f: Transformer[TResult, TInput]): Transformer[TResult, Iterable[TInput]] = js.native
  def compose(fs: (js.Function1[/* x */ js.Any, _])*): js.Function1[/* x */ js.Any, _] = js.native
  def dedupe[TInput](): Transducer[TInput, TInput] = js.native
  def drop[TInput](n: Double): Transducer[TInput, TInput] = js.native
  def dropWhile[TInput](pred: js.Function1[/* x */ TInput, Boolean]): Transducer[TInput, TInput] = js.native
  def filter[TInput](pred: js.Function1[/* x */ TInput, Boolean]): Transducer[TInput, TInput] = js.native
  def interpose[TInput](sep: TInput): Transducer[TInput, TInput] = js.native
  def into[TInput](to: String, xf: Transducer[TInput, String], from: Iterable[TInput]): String = js.native
  def into[TInput, TOutput](to: js.Array[TOutput], xf: Transducer[TInput, TOutput], from: Iterable[TInput]): js.Array[TOutput] = js.native
  def into[TInput, TOutput](
    to: StringDictionary[TOutput],
    xf: Transducer[TInput, js.Tuple2[String, TOutput]],
    from: Iterable[TInput]
  ): StringDictionary[TOutput] = js.native
  def isReduced(x: js.Any): Boolean = js.native
  def iterator[T](coll: Iterable[T]): IterableIterator[T] = js.native
  def keep[TInput](): Transducer[js.UndefOr[TInput | Null], TInput] = js.native
  def map[TInput, TOutput](f: js.Function1[/* x */ TInput, TOutput]): Transducer[TInput, TOutput] = js.native
  def mapcat[TInput, TOutput](f: js.Function1[/* x */ TInput, Iterable[TOutput]]): Transducer[TInput, TOutput] = js.native
  def partition[TInput](n: Double): Transducer[TInput, js.Array[TInput]] = js.native
  def partitionBy[TInput](f: js.Function1[/* x */ TInput, _]): Transducer[TInput, js.Array[TInput]] = js.native
  def push[T](arr: js.Array[T], x: T): js.Array[T] = js.native
  def range(n: Double): js.Array[Double] = js.native
  def reduce[TResult, TInput](coll: StringDictionary[TInput], xf: Transformer[TResult, js.Tuple2[String, TInput]], init: TResult): TResult = js.native
  def reduce[TResult, TInput](coll: Iterable[TInput], xf: Transformer[TResult, TInput], init: TResult): TResult = js.native
  @JSName("reduce")
  def reduce_TResultTCompleteResultTInput_TCompleteResult[TResult, TCompleteResult, TInput](
    coll: StringDictionary[TInput],
    xf: CompletingTransformer[TResult, TCompleteResult, js.Tuple2[String, TInput]],
    init: TResult
  ): TCompleteResult = js.native
  @JSName("reduce")
  def reduce_TResultTCompleteResultTInput_TCompleteResult[TResult, TCompleteResult, TInput](coll: Iterable[TInput], xf: CompletingTransformer[TResult, TCompleteResult, TInput], init: TResult): TCompleteResult = js.native
  def remove[TInput](pred: js.Function1[/* x */ TInput, Boolean]): Transducer[TInput, TInput] = js.native
  def repeat[TInput](n: Double): Transducer[TInput, TInput] = js.native
  def seq[TInput, TOutput](coll: js.Array[TInput], xf: Transducer[TInput, TOutput]): js.Array[TOutput] = js.native
  def seq[TInput, TOutput](
    coll: StringDictionary[TInput],
    xf: Transducer[js.Tuple2[String, TInput], js.Tuple2[String, TOutput]]
  ): StringDictionary[TOutput] = js.native
  def seq[TInput, TOutput](coll: Iterable[TInput], xf: Transducer[TInput, TOutput]): IterableIterator[TOutput] = js.native
  def take[TInput](n: Double): Transducer[TInput, TInput] = js.native
  def takeNth[TInput](n: Double): Transducer[TInput, TInput] = js.native
  def takeWhile[TInput](pred: js.Function1[/* x */ TInput, Boolean]): Transducer[TInput, TInput] = js.native
  def toArray[TInput, TOutput](coll: StringDictionary[TInput]): js.Array[TOutput] = js.native
  def toArray[TInput, TOutput](coll: StringDictionary[TInput], xf: Transducer[js.Tuple2[String, TInput], TOutput]): js.Array[TOutput] = js.native
  def toArray[TInput, TOutput](coll: Iterable[TInput]): js.Array[TOutput] = js.native
  def toArray[TInput, TOutput](coll: Iterable[TInput], xf: Transducer[TInput, TOutput]): js.Array[TOutput] = js.native
  def toIter[TInput, TOutput](coll: StringDictionary[TInput]): IterableIterator[TOutput] = js.native
  def toIter[TInput, TOutput](coll: StringDictionary[TInput], xf: Transducer[js.Tuple2[String, TInput], TOutput]): IterableIterator[TOutput] = js.native
  def toIter[TInput, TOutput](coll: Iterable[TInput]): IterableIterator[TOutput] = js.native
  def toIter[TInput, TOutput](coll: Iterable[TInput], xf: Transducer[TInput, TOutput]): IterableIterator[TOutput] = js.native
  def toObj[TInput, TOutput](
    coll: StringDictionary[TInput],
    xf: Transducer[js.Tuple2[String, TInput], js.Tuple2[String, TOutput]]
  ): StringDictionary[TOutput] = js.native
  def toObj[TInput, TOutput](coll: Iterable[TInput]): StringDictionary[TOutput] = js.native
  def toObj[TInput, TOutput](coll: Iterable[TInput], xf: Transducer[TInput, js.Tuple2[String, TOutput]]): StringDictionary[TOutput] = js.native
  def transduce[TResult, TInput, TOutput](
    coll: StringDictionary[TInput],
    xf: Transducer[js.Tuple2[String, TInput], TOutput],
    f: Reducer[TResult, TOutput],
    init: TResult
  ): TResult = js.native
  def transduce[TResult, TInput, TOutput](
    coll: Iterable[TInput],
    xf: Transducer[TInput, TOutput],
    f: Reducer[TResult, TOutput],
    init: TResult
  ): TResult = js.native
  def transduce[TResult, TCompleteResult, TInput, TOutput](
    coll: StringDictionary[TInput],
    xf: Transducer[js.Tuple2[String, TInput], TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput]
  ): TCompleteResult = js.native
  def transduce[TResult, TCompleteResult, TInput, TOutput](
    coll: StringDictionary[TInput],
    xf: Transducer[js.Tuple2[String, TInput], TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput],
    init: TResult
  ): TCompleteResult = js.native
  def transduce[TResult, TCompleteResult, TInput, TOutput](
    coll: Iterable[TInput],
    xf: Transducer[TInput, TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput]
  ): TCompleteResult = js.native
  def transduce[TResult, TCompleteResult, TInput, TOutput](
    coll: Iterable[TInput],
    xf: Transducer[TInput, TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput],
    init: TResult
  ): TCompleteResult = js.native
  def transformer[TResult, TInput](reducer: Reducer[TResult, TInput]): Transformer[TResult, TInput] = js.native
}

