package typings
package transducersDashJsLib.transducersDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def cat[TResult, TInput](xf: transducersDashJsLib.transducersDashJsMod.Transformer[TResult, TInput]): transducersDashJsLib.transducersDashJsMod.Transformer[TResult, stdLib.Iterable[TInput]] = js.native
  def comp(args: (js.Function1[/* x */ js.Any, _])*): js.Function1[/* x */ js.Any, _] = js.native
  def comp[A, B, C](
    a: transducersDashJsLib.transducersDashJsMod.Transducer[A, B],
    b: transducersDashJsLib.transducersDashJsMod.Transducer[B, C]
  ): transducersDashJsLib.transducersDashJsMod.Transducer[A, C] = js.native
  def comp[A, B, C](b: js.Function1[/* b */ B, C], a: js.Function1[/* a */ A, B]): js.Function1[/* a */ A, C] = js.native
  def comp[A, B, C, D](
    a: transducersDashJsLib.transducersDashJsMod.Transducer[A, B],
    b: transducersDashJsLib.transducersDashJsMod.Transducer[B, C],
    c: transducersDashJsLib.transducersDashJsMod.Transducer[C, D]
  ): transducersDashJsLib.transducersDashJsMod.Transducer[A, D] = js.native
  def comp[A, B, C, D](c: js.Function1[/* c */ C, D], b: js.Function1[/* b */ B, C], a: js.Function1[/* a */ A, B]): js.Function1[/* a */ A, D] = js.native
  def comp[A, B, C, D, E](
    a: transducersDashJsLib.transducersDashJsMod.Transducer[A, B],
    b: transducersDashJsLib.transducersDashJsMod.Transducer[B, C],
    c: transducersDashJsLib.transducersDashJsMod.Transducer[C, D],
    d: transducersDashJsLib.transducersDashJsMod.Transducer[D, E]
  ): transducersDashJsLib.transducersDashJsMod.Transducer[A, E] = js.native
  def comp[A, B, C, D, E](
    d: js.Function1[/* d */ D, E],
    c: js.Function1[/* c */ C, D],
    b: js.Function1[/* b */ B, C],
    a: js.Function1[/* a */ A, B]
  ): js.Function1[/* a */ A, E] = js.native
  @JSName("comp")
  def comp_AA[A](args: (js.Function1[/* a */ A, A])*): A = js.native
  @JSName("comp")
  def comp_ATransducer[A](args: (transducersDashJsLib.transducersDashJsMod.Transducer[A, A])*): transducersDashJsLib.transducersDashJsMod.Transducer[A, A] = js.native
  def complement[T](f: js.Function1[/* x */ T, scala.Boolean]): js.Function1[/* x */ T, scala.Boolean] = js.native
  def completing[TResult, TCompleteResult, TInput](
    xf: transducersDashJsLib.transducersDashJsMod.Reducer[TResult, TInput],
    cf: js.Function1[/* result */ TResult, TCompleteResult]
  ): transducersDashJsLib.transducersDashJsMod.CompletingTransformer[TResult, TCompleteResult, TInput] = js.native
  def completing[TResult, TCompleteResult, TInput](
    xf: transducersDashJsLib.transducersDashJsMod.Transformer[TResult, TInput],
    cf: js.Function1[/* result */ TResult, TCompleteResult]
  ): transducersDashJsLib.transducersDashJsMod.CompletingTransformer[TResult, TCompleteResult, TInput] = js.native
  def deref[TResult](x: transducersDashJsLib.transducersDashJsMod.Reduced[TResult]): TResult = js.native
  def drop[TInput](n: scala.Double): transducersDashJsLib.transducersDashJsMod.Transducer[TInput, TInput] = js.native
  def dropWhile[TInput](pred: js.Function1[/* input */ TInput, scala.Boolean]): transducersDashJsLib.transducersDashJsMod.Transducer[TInput, TInput] = js.native
  def ensureReduced[TResult](x: TResult): transducersDashJsLib.transducersDashJsMod.Reduced[TResult] = js.native
  def ensureReduced[TResult](x: transducersDashJsLib.transducersDashJsMod.Reduced[TResult]): transducersDashJsLib.transducersDashJsMod.Reduced[TResult] = js.native
  def filter[TInput](pred: js.Function1[/* x */ TInput, scala.Boolean]): transducersDashJsLib.transducersDashJsMod.Transducer[TInput, TInput] = js.native
  def first[TResult, TInput](): transducersDashJsLib.transducersDashJsMod.Wrap[TResult, TInput] = js.native
  def identity[T](arg: T): T = js.native
  def into[TInput](
    empty: java.lang.String,
    xf: transducersDashJsLib.transducersDashJsMod.Transducer[js.Tuple2[java.lang.String, TInput], java.lang.String],
    coll: org.scalablytyped.runtime.StringDictionary[TInput]
  ): java.lang.String = js.native
  def into[TInput](
    empty: java.lang.String,
    xf: transducersDashJsLib.transducersDashJsMod.Transducer[TInput, java.lang.String],
    coll: stdLib.Iterable[TInput]
  ): java.lang.String = js.native
  def into[TInput, TOutput](
    empty: js.Array[TOutput],
    xf: transducersDashJsLib.transducersDashJsMod.Transducer[js.Tuple2[java.lang.String, TInput], TOutput],
    coll: org.scalablytyped.runtime.StringDictionary[TInput]
  ): js.Array[TOutput] = js.native
  def into[TInput, TOutput](
    empty: js.Array[TOutput],
    xf: transducersDashJsLib.transducersDashJsMod.Transducer[TInput, TOutput],
    coll: stdLib.Iterable[TInput]
  ): js.Array[TOutput] = js.native
  def into[TInput, TOutput](
    empty: org.scalablytyped.runtime.StringDictionary[TOutput],
    xf: transducersDashJsLib.transducersDashJsMod.Transducer[js.Tuple2[java.lang.String, TInput], js.Tuple2[java.lang.String, TOutput]],
    coll: org.scalablytyped.runtime.StringDictionary[TInput]
  ): org.scalablytyped.runtime.StringDictionary[TOutput] = js.native
  def into[TInput, TOutput](
    empty: org.scalablytyped.runtime.StringDictionary[TOutput],
    xf: transducersDashJsLib.transducersDashJsMod.Transducer[TInput, js.Tuple2[java.lang.String, TOutput]],
    coll: stdLib.Iterable[TInput]
  ): org.scalablytyped.runtime.StringDictionary[TOutput] = js.native
  def isReduced(x: js.Any): scala.Boolean = js.native
  def keep[TInput](f: js.Function1[/* x */ TInput, _]): transducersDashJsLib.transducersDashJsMod.Transducer[TInput, TInput] = js.native
  def keepIndexed[TInput](f: js.Function2[/* i */ scala.Double, /* x */ TInput, _]): transducersDashJsLib.transducersDashJsMod.Transducer[TInput, TInput] = js.native
  def map[TInput, TOutput](f: js.Function1[/* x */ TInput, TOutput]): transducersDashJsLib.transducersDashJsMod.Transducer[TInput, TOutput] = js.native
  def mapcat[TResult, TInput, TOutput](f: js.Function1[/* arr */ TInput, stdLib.Iterable[TOutput]]): transducersDashJsLib.transducersDashJsMod.Transducer[TInput, TOutput] = js.native
  def partitionAll[TResult, TInput](n: scala.Double): transducersDashJsLib.transducersDashJsMod.Transducer[TInput, js.Array[TInput]] = js.native
  def partitionBy[TInput](f: js.Function1[/* input */ TInput, _]): transducersDashJsLib.transducersDashJsMod.Transducer[TInput, js.Array[TInput]] = js.native
  def reduce[TResult, TInput](
    xf: transducersDashJsLib.transducersDashJsMod.Reducer[TResult, js.Tuple2[java.lang.String, TInput]],
    init: TResult,
    coll: org.scalablytyped.runtime.StringDictionary[TInput]
  ): TResult = js.native
  def reduce[TResult, TInput](
    xf: transducersDashJsLib.transducersDashJsMod.Reducer[TResult, TInput],
    init: TResult,
    coll: stdLib.Iterable[TInput]
  ): TResult = js.native
  def reduce[TResult, TInput](
    xf: transducersDashJsLib.transducersDashJsMod.Transformer[TResult, js.Tuple2[java.lang.String, TInput]],
    init: TResult,
    coll: org.scalablytyped.runtime.StringDictionary[TInput]
  ): TResult = js.native
  def reduce[TResult, TInput](
    xf: transducersDashJsLib.transducersDashJsMod.Transformer[TResult, TInput],
    init: TResult,
    coll: stdLib.Iterable[TInput]
  ): TResult = js.native
  @JSName("reduce")
  def reduce_TResultTCompleteResultTInputTCompleteResult[TResult, TCompleteResult, TInput](
    xf: transducersDashJsLib.transducersDashJsMod.CompletingTransformer[TResult, TCompleteResult, js.Tuple2[java.lang.String, TInput]],
    init: TResult,
    coll: org.scalablytyped.runtime.StringDictionary[TInput]
  ): TCompleteResult = js.native
  @JSName("reduce")
  def reduce_TResultTCompleteResultTInputTCompleteResult[TResult, TCompleteResult, TInput](
    xf: transducersDashJsLib.transducersDashJsMod.CompletingTransformer[TResult, TCompleteResult, TInput],
    init: TResult,
    coll: stdLib.Iterable[TInput]
  ): TCompleteResult = js.native
  def reduced[TResult](x: TResult): transducersDashJsLib.transducersDashJsMod.Reduced[TResult] = js.native
  def remove[TInput](pred: js.Function1[/* x */ TInput, scala.Boolean]): transducersDashJsLib.transducersDashJsMod.Transducer[TInput, TInput] = js.native
  def take[TInput](n: scala.Double): transducersDashJsLib.transducersDashJsMod.Transducer[TInput, TInput] = js.native
  def takeNth[TInput](n: scala.Double): transducersDashJsLib.transducersDashJsMod.Transducer[TInput, TInput] = js.native
  def takeWhile[TInput](pred: js.Function1[/* n */ TInput, scala.Boolean]): transducersDashJsLib.transducersDashJsMod.Transducer[TInput, TInput] = js.native
  def toFn[TResult, TInput, TOutput](
    xf: transducersDashJsLib.transducersDashJsMod.Transducer[TInput, TOutput],
    builder: transducersDashJsLib.transducersDashJsMod.Reducer[TResult, TOutput]
  ): transducersDashJsLib.transducersDashJsMod.Reducer[TResult, TOutput] = js.native
  def toFn[TResult, TInput, TOutput](
    xf: transducersDashJsLib.transducersDashJsMod.Transducer[TInput, TOutput],
    builder: transducersDashJsLib.transducersDashJsMod.Transformer[TResult, TOutput]
  ): transducersDashJsLib.transducersDashJsMod.Reducer[TResult, TOutput] = js.native
  def transduce[TResult, TInput, TOutput](
    xf: transducersDashJsLib.transducersDashJsMod.Transducer[js.Tuple2[java.lang.String, TInput], TOutput],
    f: transducersDashJsLib.transducersDashJsMod.Reducer[TResult, TOutput],
    init: TResult,
    coll: org.scalablytyped.runtime.StringDictionary[TInput]
  ): TResult = js.native
  def transduce[TResult, TInput, TOutput](
    xf: transducersDashJsLib.transducersDashJsMod.Transducer[TInput, TOutput],
    f: transducersDashJsLib.transducersDashJsMod.Reducer[TResult, TOutput],
    init: TResult,
    coll: stdLib.Iterable[TInput]
  ): TResult = js.native
  def transduce[TResult, TCompleteResult, TInput, TOutput](
    xf: transducersDashJsLib.transducersDashJsMod.Transducer[js.Tuple2[java.lang.String, TInput], TOutput],
    f: transducersDashJsLib.transducersDashJsMod.CompletingTransformer[TResult, TCompleteResult, TOutput],
    coll: org.scalablytyped.runtime.StringDictionary[TInput]
  ): TCompleteResult = js.native
  def transduce[TResult, TCompleteResult, TInput, TOutput](
    xf: transducersDashJsLib.transducersDashJsMod.Transducer[TInput, TOutput],
    f: transducersDashJsLib.transducersDashJsMod.CompletingTransformer[TResult, TCompleteResult, TOutput],
    coll: stdLib.Iterable[TInput]
  ): TCompleteResult = js.native
  def transduce[TResult, TCompleteResult, TInput, TOutput](
    xf: transducersDashJsLib.transducersDashJsMod.Transducer[js.Tuple2[java.lang.String, TInput], TOutput],
    f: transducersDashJsLib.transducersDashJsMod.CompletingTransformer[TResult, TCompleteResult, TOutput],
    init: TResult,
    coll: org.scalablytyped.runtime.StringDictionary[TInput]
  ): TCompleteResult = js.native
  def transduce[TResult, TCompleteResult, TInput, TOutput](
    xf: transducersDashJsLib.transducersDashJsMod.Transducer[TInput, TOutput],
    f: transducersDashJsLib.transducersDashJsMod.CompletingTransformer[TResult, TCompleteResult, TOutput],
    init: TResult,
    coll: stdLib.Iterable[TInput]
  ): TCompleteResult = js.native
  def unreduced[TResult](x: TResult): TResult = js.native
  def unreduced[TResult](x: transducersDashJsLib.transducersDashJsMod.Reduced[TResult]): TResult = js.native
  def wrap[TResult, TInput](stepFn: transducersDashJsLib.transducersDashJsMod.Reducer[TResult, TInput]): transducersDashJsLib.transducersDashJsMod.Transformer[TResult, TInput] = js.native
}

