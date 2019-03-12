package typings
package transducersDotJsLib.transducersDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val LazyTransformer: LazyTransformerConstructor = js.native
  val Reduced: ReducedConstructor = js.native
  def cat[TResult, TInput](f: Transformer[TResult, TInput]): Transformer[TResult, stdLib.Iterable[TInput]] = js.native
  def compose(fs: (js.Function1[/* x */ js.Any, _])*): js.Function1[/* x */ js.Any, _] = js.native
  def dedupe[TInput](): Transducer[TInput, TInput] = js.native
  def drop[TInput](n: scala.Double): Transducer[TInput, TInput] = js.native
  def dropWhile[TInput](pred: js.Function1[/* x */ TInput, scala.Boolean]): Transducer[TInput, TInput] = js.native
  def filter[TInput](pred: js.Function1[/* x */ TInput, scala.Boolean]): Transducer[TInput, TInput] = js.native
  def interpose[TInput](sep: TInput): Transducer[TInput, TInput] = js.native
  def into[TInput](to: java.lang.String, xf: Transducer[TInput, java.lang.String], from: stdLib.Iterable[TInput]): java.lang.String = js.native
  def into[TInput, TOutput](to: js.Array[TOutput], xf: Transducer[TInput, TOutput], from: stdLib.Iterable[TInput]): js.Array[TOutput] = js.native
  def into[TInput, TOutput](
    to: org.scalablytyped.runtime.StringDictionary[TOutput],
    xf: Transducer[TInput, js.Tuple2[java.lang.String, TOutput]],
    from: stdLib.Iterable[TInput]
  ): org.scalablytyped.runtime.StringDictionary[TOutput] = js.native
  def isReduced(x: js.Any): scala.Boolean = js.native
  def iterator[T](coll: stdLib.Iterable[T]): stdLib.IterableIterator[T] = js.native
  def keep[TInput](): Transducer[js.UndefOr[TInput | scala.Null], TInput] = js.native
  def map[TInput, TOutput](f: js.Function1[/* x */ TInput, TOutput]): Transducer[TInput, TOutput] = js.native
  def mapcat[TInput, TOutput](f: js.Function1[/* x */ TInput, stdLib.Iterable[TOutput]]): Transducer[TInput, TOutput] = js.native
  def partition[TInput](n: scala.Double): Transducer[TInput, js.Array[TInput]] = js.native
  def partitionBy[TInput](f: js.Function1[/* x */ TInput, _]): Transducer[TInput, js.Array[TInput]] = js.native
  def push[T](arr: js.Array[T], x: T): js.Array[T] = js.native
  def range(n: scala.Double): js.Array[scala.Double] = js.native
  def reduce[TResult, TInput](
    coll: org.scalablytyped.runtime.StringDictionary[TInput],
    xf: Transformer[TResult, js.Tuple2[java.lang.String, TInput]],
    init: TResult
  ): TResult = js.native
  def reduce[TResult, TInput](coll: stdLib.Iterable[TInput], xf: Transformer[TResult, TInput], init: TResult): TResult = js.native
  @JSName("reduce")
  def reduce_TResultTCompleteResultTInputTCompleteResult[TResult, TCompleteResult, TInput](
    coll: org.scalablytyped.runtime.StringDictionary[TInput],
    xf: CompletingTransformer[TResult, TCompleteResult, js.Tuple2[java.lang.String, TInput]],
    init: TResult
  ): TCompleteResult = js.native
  @JSName("reduce")
  def reduce_TResultTCompleteResultTInputTCompleteResult[TResult, TCompleteResult, TInput](
    coll: stdLib.Iterable[TInput],
    xf: CompletingTransformer[TResult, TCompleteResult, TInput],
    init: TResult
  ): TCompleteResult = js.native
  def remove[TInput](pred: js.Function1[/* x */ TInput, scala.Boolean]): Transducer[TInput, TInput] = js.native
  def repeat[TInput](n: scala.Double): Transducer[TInput, TInput] = js.native
  def seq[TInput, TOutput](coll: js.Array[TInput], xf: Transducer[TInput, TOutput]): js.Array[TOutput] = js.native
  def seq[TInput, TOutput](
    coll: org.scalablytyped.runtime.StringDictionary[TInput],
    xf: Transducer[js.Tuple2[java.lang.String, TInput], js.Tuple2[java.lang.String, TOutput]]
  ): org.scalablytyped.runtime.StringDictionary[TOutput] = js.native
  def seq[TInput, TOutput](coll: stdLib.Iterable[TInput], xf: Transducer[TInput, TOutput]): stdLib.IterableIterator[TOutput] = js.native
  def take[TInput](n: scala.Double): Transducer[TInput, TInput] = js.native
  def takeNth[TInput](n: scala.Double): Transducer[TInput, TInput] = js.native
  def takeWhile[TInput](pred: js.Function1[/* x */ TInput, scala.Boolean]): Transducer[TInput, TInput] = js.native
  def toArray[TInput, TOutput](coll: org.scalablytyped.runtime.StringDictionary[TInput]): js.Array[TOutput] = js.native
  def toArray[TInput, TOutput](
    coll: org.scalablytyped.runtime.StringDictionary[TInput],
    xf: Transducer[js.Tuple2[java.lang.String, TInput], TOutput]
  ): js.Array[TOutput] = js.native
  def toArray[TInput, TOutput](coll: stdLib.Iterable[TInput]): js.Array[TOutput] = js.native
  def toArray[TInput, TOutput](coll: stdLib.Iterable[TInput], xf: Transducer[TInput, TOutput]): js.Array[TOutput] = js.native
  def toIter[TInput, TOutput](coll: org.scalablytyped.runtime.StringDictionary[TInput]): stdLib.IterableIterator[TOutput] = js.native
  def toIter[TInput, TOutput](
    coll: org.scalablytyped.runtime.StringDictionary[TInput],
    xf: Transducer[js.Tuple2[java.lang.String, TInput], TOutput]
  ): stdLib.IterableIterator[TOutput] = js.native
  def toIter[TInput, TOutput](coll: stdLib.Iterable[TInput]): stdLib.IterableIterator[TOutput] = js.native
  def toIter[TInput, TOutput](coll: stdLib.Iterable[TInput], xf: Transducer[TInput, TOutput]): stdLib.IterableIterator[TOutput] = js.native
  def toObj[TInput, TOutput](
    coll: org.scalablytyped.runtime.StringDictionary[TInput],
    xf: Transducer[js.Tuple2[java.lang.String, TInput], js.Tuple2[java.lang.String, TOutput]]
  ): org.scalablytyped.runtime.StringDictionary[TOutput] = js.native
  def toObj[TInput, TOutput](coll: stdLib.Iterable[TInput]): org.scalablytyped.runtime.StringDictionary[TOutput] = js.native
  def toObj[TInput, TOutput](coll: stdLib.Iterable[TInput], xf: Transducer[TInput, js.Tuple2[java.lang.String, TOutput]]): org.scalablytyped.runtime.StringDictionary[TOutput] = js.native
  def transduce[TResult, TInput, TOutput](
    coll: org.scalablytyped.runtime.StringDictionary[TInput],
    xf: Transducer[js.Tuple2[java.lang.String, TInput], TOutput],
    f: Reducer[TResult, TOutput],
    init: TResult
  ): TResult = js.native
  def transduce[TResult, TInput, TOutput](
    coll: stdLib.Iterable[TInput],
    xf: Transducer[TInput, TOutput],
    f: Reducer[TResult, TOutput],
    init: TResult
  ): TResult = js.native
  def transduce[TResult, TCompleteResult, TInput, TOutput](
    coll: org.scalablytyped.runtime.StringDictionary[TInput],
    xf: Transducer[js.Tuple2[java.lang.String, TInput], TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput]
  ): TCompleteResult = js.native
  def transduce[TResult, TCompleteResult, TInput, TOutput](
    coll: org.scalablytyped.runtime.StringDictionary[TInput],
    xf: Transducer[js.Tuple2[java.lang.String, TInput], TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput],
    init: TResult
  ): TCompleteResult = js.native
  def transduce[TResult, TCompleteResult, TInput, TOutput](
    coll: stdLib.Iterable[TInput],
    xf: Transducer[TInput, TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput]
  ): TCompleteResult = js.native
  def transduce[TResult, TCompleteResult, TInput, TOutput](
    coll: stdLib.Iterable[TInput],
    xf: Transducer[TInput, TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput],
    init: TResult
  ): TCompleteResult = js.native
  def transformer[TResult, TInput](reducer: Reducer[TResult, TInput]): Transformer[TResult, TInput] = js.native
}

