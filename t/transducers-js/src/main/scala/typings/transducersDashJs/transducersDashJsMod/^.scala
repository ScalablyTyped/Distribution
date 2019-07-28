package typings.transducersDashJs.transducersDashJsMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def cat[TResult, TInput](xf: Transformer[TResult, TInput]): Transformer[TResult, Iterable[TInput]] = js.native
  def comp(args: (js.Function1[/* x */ js.Any, _])*): js.Function1[/* x */ js.Any, _] = js.native
  def comp[A, B, C](a: Transducer[A, B], b: Transducer[B, C]): Transducer[A, C] = js.native
  def comp[A, B, C](b: js.Function1[/* b */ B, C], a: js.Function1[/* a */ A, B]): js.Function1[/* a */ A, C] = js.native
  def comp[A, B, C, D](a: Transducer[A, B], b: Transducer[B, C], c: Transducer[C, D]): Transducer[A, D] = js.native
  def comp[A, B, C, D](c: js.Function1[/* c */ C, D], b: js.Function1[/* b */ B, C], a: js.Function1[/* a */ A, B]): js.Function1[/* a */ A, D] = js.native
  def comp[A, B, C, D, E](a: Transducer[A, B], b: Transducer[B, C], c: Transducer[C, D], d: Transducer[D, E]): Transducer[A, E] = js.native
  def comp[A, B, C, D, E](
    d: js.Function1[/* d */ D, E],
    c: js.Function1[/* c */ C, D],
    b: js.Function1[/* b */ B, C],
    a: js.Function1[/* a */ A, B]
  ): js.Function1[/* a */ A, E] = js.native
  @JSName("comp")
  def comp_A_A[A](args: (js.Function1[/* a */ A, A])*): A = js.native
  @JSName("comp")
  def comp_A_Transducer[A](args: (Transducer[A, A])*): Transducer[A, A] = js.native
  def complement[T](f: js.Function1[/* x */ T, Boolean]): js.Function1[/* x */ T, Boolean] = js.native
  def completing[TResult, TCompleteResult, TInput](xf: Reducer[TResult, TInput], cf: js.Function1[/* result */ TResult, TCompleteResult]): CompletingTransformer[TResult, TCompleteResult, TInput] = js.native
  def completing[TResult, TCompleteResult, TInput](xf: Transformer[TResult, TInput], cf: js.Function1[/* result */ TResult, TCompleteResult]): CompletingTransformer[TResult, TCompleteResult, TInput] = js.native
  def deref[TResult](x: Reduced[TResult]): TResult = js.native
  def drop[TInput](n: Double): Transducer[TInput, TInput] = js.native
  def dropWhile[TInput](pred: js.Function1[/* input */ TInput, Boolean]): Transducer[TInput, TInput] = js.native
  def ensureReduced[TResult](x: TResult): Reduced[TResult] = js.native
  def ensureReduced[TResult](x: Reduced[TResult]): Reduced[TResult] = js.native
  def filter[TInput](pred: js.Function1[/* x */ TInput, Boolean]): Transducer[TInput, TInput] = js.native
  def first[TResult, TInput](): Wrap[TResult, TInput] = js.native
  def identity[T](arg: T): T = js.native
  def into[TInput](empty: String, xf: Transducer[js.Tuple2[String, TInput], String], coll: StringDictionary[TInput]): String = js.native
  def into[TInput](empty: String, xf: Transducer[TInput, String], coll: Iterable[TInput]): String = js.native
  def into[TInput, TOutput](
    empty: js.Array[TOutput],
    xf: Transducer[js.Tuple2[String, TInput], TOutput],
    coll: StringDictionary[TInput]
  ): js.Array[TOutput] = js.native
  def into[TInput, TOutput](empty: js.Array[TOutput], xf: Transducer[TInput, TOutput], coll: Iterable[TInput]): js.Array[TOutput] = js.native
  def into[TInput, TOutput](
    empty: StringDictionary[TOutput],
    xf: Transducer[js.Tuple2[String, TInput], js.Tuple2[String, TOutput]],
    coll: StringDictionary[TInput]
  ): StringDictionary[TOutput] = js.native
  def into[TInput, TOutput](
    empty: StringDictionary[TOutput],
    xf: Transducer[TInput, js.Tuple2[String, TOutput]],
    coll: Iterable[TInput]
  ): StringDictionary[TOutput] = js.native
  def isReduced(x: js.Any): Boolean = js.native
  def keep[TInput](f: js.Function1[/* x */ TInput, _]): Transducer[TInput, TInput] = js.native
  def keepIndexed[TInput](f: js.Function2[/* i */ Double, /* x */ TInput, _]): Transducer[TInput, TInput] = js.native
  def map[TInput, TOutput](f: js.Function1[/* x */ TInput, TOutput]): Transducer[TInput, TOutput] = js.native
  def mapcat[TResult, TInput, TOutput](f: js.Function1[/* arr */ TInput, Iterable[TOutput]]): Transducer[TInput, TOutput] = js.native
  def partitionAll[TResult, TInput](n: Double): Transducer[TInput, js.Array[TInput]] = js.native
  def partitionBy[TInput](f: js.Function1[/* input */ TInput, _]): Transducer[TInput, js.Array[TInput]] = js.native
  def reduce[TResult, TInput](xf: Reducer[TResult, js.Tuple2[String, TInput]], init: TResult, coll: StringDictionary[TInput]): TResult = js.native
  def reduce[TResult, TInput](xf: Reducer[TResult, TInput], init: TResult, coll: Iterable[TInput]): TResult = js.native
  def reduce[TResult, TInput](xf: Transformer[TResult, js.Tuple2[String, TInput]], init: TResult, coll: StringDictionary[TInput]): TResult = js.native
  def reduce[TResult, TInput](xf: Transformer[TResult, TInput], init: TResult, coll: Iterable[TInput]): TResult = js.native
  @JSName("reduce")
  def reduce_TResultTCompleteResultTInput_TCompleteResult[TResult, TCompleteResult, TInput](
    xf: CompletingTransformer[TResult, TCompleteResult, js.Tuple2[String, TInput]],
    init: TResult,
    coll: StringDictionary[TInput]
  ): TCompleteResult = js.native
  @JSName("reduce")
  def reduce_TResultTCompleteResultTInput_TCompleteResult[TResult, TCompleteResult, TInput](xf: CompletingTransformer[TResult, TCompleteResult, TInput], init: TResult, coll: Iterable[TInput]): TCompleteResult = js.native
  def reduced[TResult](x: TResult): Reduced[TResult] = js.native
  def remove[TInput](pred: js.Function1[/* x */ TInput, Boolean]): Transducer[TInput, TInput] = js.native
  def take[TInput](n: Double): Transducer[TInput, TInput] = js.native
  def takeNth[TInput](n: Double): Transducer[TInput, TInput] = js.native
  def takeWhile[TInput](pred: js.Function1[/* n */ TInput, Boolean]): Transducer[TInput, TInput] = js.native
  def toFn[TResult, TInput, TOutput](xf: Transducer[TInput, TOutput], builder: Reducer[TResult, TOutput]): Reducer[TResult, TOutput] = js.native
  def toFn[TResult, TInput, TOutput](xf: Transducer[TInput, TOutput], builder: Transformer[TResult, TOutput]): Reducer[TResult, TOutput] = js.native
  def transduce[TResult, TInput, TOutput](
    xf: Transducer[js.Tuple2[String, TInput], TOutput],
    f: Reducer[TResult, TOutput],
    init: TResult,
    coll: StringDictionary[TInput]
  ): TResult = js.native
  def transduce[TResult, TInput, TOutput](
    xf: Transducer[TInput, TOutput],
    f: Reducer[TResult, TOutput],
    init: TResult,
    coll: Iterable[TInput]
  ): TResult = js.native
  def transduce[TResult, TCompleteResult, TInput, TOutput](
    xf: Transducer[js.Tuple2[String, TInput], TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput],
    coll: StringDictionary[TInput]
  ): TCompleteResult = js.native
  def transduce[TResult, TCompleteResult, TInput, TOutput](
    xf: Transducer[TInput, TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput],
    coll: Iterable[TInput]
  ): TCompleteResult = js.native
  def transduce[TResult, TCompleteResult, TInput, TOutput](
    xf: Transducer[js.Tuple2[String, TInput], TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput],
    init: TResult,
    coll: StringDictionary[TInput]
  ): TCompleteResult = js.native
  def transduce[TResult, TCompleteResult, TInput, TOutput](
    xf: Transducer[TInput, TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput],
    init: TResult,
    coll: Iterable[TInput]
  ): TCompleteResult = js.native
  def unreduced[TResult](x: TResult): TResult = js.native
  def unreduced[TResult](x: Reduced[TResult]): TResult = js.native
  def wrap[TResult, TInput](stepFn: Reducer[TResult, TInput]): Transformer[TResult, TInput] = js.native
}

