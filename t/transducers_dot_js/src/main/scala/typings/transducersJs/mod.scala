package typings.transducersJs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import typings.std.IterableIterator
import typings.transducersJs.transducersJsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("transducers.js", "LazyTransformer")
  @js.native
  class LazyTransformer[TInput, TOutput] protected () extends IterableIterator[TOutput] {
    def this(xf: Transducer[TInput, TOutput], coll: Iterable[TInput]) = this()
  }
  @JSImport("transducers.js", "LazyTransformer")
  @js.native
  val LazyTransformer: LazyTransformerConstructor = js.native
  
  @js.native
  trait Reduced[T] extends StObject {
    
    @JSName("@@transducer/reduced")
    var `@@transducerSlashreduced`: `true` = js.native
    
    @JSName("@@transducer/value")
    var `@@transducerSlashvalue`: T = js.native
  }
  object Reduced {
    
    @JSImport("transducers.js", "Reduced")
    @js.native
    val ^ : ReducedConstructor = js.native
    
    @scala.inline
    implicit class ReducedMutableBuilder[Self <: Reduced[_], T] (val x: Self with Reduced[T]) extends AnyVal {
      
      @scala.inline
      def `set@@transducerSlashreduced`(value: `true`): Self = StObject.set(x, "@@transducer/reduced", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set@@transducerSlashvalue`(value: T): Self = StObject.set(x, "@@transducer/value", value.asInstanceOf[js.Any])
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("transducers.js", "Reduced")
  @js.native
  class ReducedCls[T] protected () extends Reduced[T] {
    def this(value: T) = this()
  }
  
  @JSImport("transducers.js", "cat")
  @js.native
  def cat[TResult, TInput](f: Transformer_[TResult, TInput]): Transformer_[TResult, Iterable[TInput]] = js.native
  
  @JSImport("transducers.js", "compose")
  @js.native
  def compose(fs: (js.Function1[/* x */ js.Any, _])*): js.Function1[/* x */ js.Any, _] = js.native
  
  @JSImport("transducers.js", "dedupe")
  @js.native
  def dedupe[TInput](): Transducer[TInput, TInput] = js.native
  
  @JSImport("transducers.js", "drop")
  @js.native
  def drop[TInput](n: Double): Transducer[TInput, TInput] = js.native
  
  @JSImport("transducers.js", "dropWhile")
  @js.native
  def dropWhile[TInput](pred: js.Function1[/* x */ TInput, Boolean]): Transducer[TInput, TInput] = js.native
  
  @JSImport("transducers.js", "filter")
  @js.native
  def filter[TInput](pred: js.Function1[/* x */ TInput, Boolean]): Transducer[TInput, TInput] = js.native
  
  @JSImport("transducers.js", "interpose")
  @js.native
  def interpose[TInput](sep: TInput): Transducer[TInput, TInput] = js.native
  
  @JSImport("transducers.js", "into")
  @js.native
  def into[TInput](to: String, xf: Transducer[TInput, String], from: Iterable[TInput]): String = js.native
  @JSImport("transducers.js", "into")
  @js.native
  def into[TInput, TOutput](to: js.Array[TOutput], xf: Transducer[TInput, TOutput], from: Iterable[TInput]): js.Array[TOutput] = js.native
  @JSImport("transducers.js", "into")
  @js.native
  def into[TInput, TOutput](
    to: StringDictionary[TOutput],
    xf: Transducer[TInput, js.Tuple2[String, TOutput]],
    from: Iterable[TInput]
  ): StringDictionary[TOutput] = js.native
  
  @JSImport("transducers.js", "isReduced")
  @js.native
  def isReduced(x: js.Any): Boolean = js.native
  
  @JSImport("transducers.js", "iterator")
  @js.native
  def iterator[T](coll: Iterable[T]): IterableIterator[T] = js.native
  
  @JSImport("transducers.js", "keep")
  @js.native
  def keep[TInput](): Transducer[js.UndefOr[TInput | Null], TInput] = js.native
  
  @JSImport("transducers.js", "map")
  @js.native
  def map[TInput, TOutput](f: js.Function1[/* x */ TInput, TOutput]): Transducer[TInput, TOutput] = js.native
  
  @JSImport("transducers.js", "mapcat")
  @js.native
  def mapcat[TInput, TOutput](f: js.Function1[/* x */ TInput, Iterable[TOutput]]): Transducer[TInput, TOutput] = js.native
  
  @JSImport("transducers.js", "partition")
  @js.native
  def partition[TInput](n: Double): Transducer[TInput, js.Array[TInput]] = js.native
  
  @JSImport("transducers.js", "partitionBy")
  @js.native
  def partitionBy[TInput](f: js.Function1[/* x */ TInput, _]): Transducer[TInput, js.Array[TInput]] = js.native
  
  @JSImport("transducers.js", "push")
  @js.native
  def push[T](arr: js.Array[T], x: T): js.Array[T] = js.native
  
  @JSImport("transducers.js", "range")
  @js.native
  def range(n: Double): js.Array[Double] = js.native
  
  @JSImport("transducers.js", "reduce")
  @js.native
  def reduce[TResult, TInput](
    coll: StringDictionary[TInput],
    xf: Transformer_[TResult, js.Tuple2[String, TInput]],
    init: TResult
  ): TResult = js.native
  @JSImport("transducers.js", "reduce")
  @js.native
  def reduce[TResult, TInput](coll: Iterable[TInput], xf: Transformer_[TResult, TInput], init: TResult): TResult = js.native
  @JSImport("transducers.js", "reduce")
  @js.native
  def reduce_TResultTCompleteResultTInput_TCompleteResult[TResult, TCompleteResult, TInput](
    coll: StringDictionary[TInput],
    xf: CompletingTransformer[TResult, TCompleteResult, js.Tuple2[String, TInput]],
    init: TResult
  ): TCompleteResult = js.native
  @JSImport("transducers.js", "reduce")
  @js.native
  def reduce_TResultTCompleteResultTInput_TCompleteResult[TResult, TCompleteResult, TInput](coll: Iterable[TInput], xf: CompletingTransformer[TResult, TCompleteResult, TInput], init: TResult): TCompleteResult = js.native
  
  @JSImport("transducers.js", "remove")
  @js.native
  def remove[TInput](pred: js.Function1[/* x */ TInput, Boolean]): Transducer[TInput, TInput] = js.native
  
  @JSImport("transducers.js", "repeat")
  @js.native
  def repeat[TInput](n: Double): Transducer[TInput, TInput] = js.native
  
  @JSImport("transducers.js", "seq")
  @js.native
  def seq[TInput, TOutput](coll: js.Array[TInput], xf: Transducer[TInput, TOutput]): js.Array[TOutput] = js.native
  @JSImport("transducers.js", "seq")
  @js.native
  def seq[TInput, TOutput](
    coll: StringDictionary[TInput],
    xf: Transducer[js.Tuple2[String, TInput], js.Tuple2[String, TOutput]]
  ): StringDictionary[TOutput] = js.native
  @JSImport("transducers.js", "seq")
  @js.native
  def seq[TInput, TOutput](coll: Iterable[TInput], xf: Transducer[TInput, TOutput]): IterableIterator[TOutput] = js.native
  
  @JSImport("transducers.js", "take")
  @js.native
  def take[TInput](n: Double): Transducer[TInput, TInput] = js.native
  
  @JSImport("transducers.js", "takeNth")
  @js.native
  def takeNth[TInput](n: Double): Transducer[TInput, TInput] = js.native
  
  @JSImport("transducers.js", "takeWhile")
  @js.native
  def takeWhile[TInput](pred: js.Function1[/* x */ TInput, Boolean]): Transducer[TInput, TInput] = js.native
  
  @JSImport("transducers.js", "toArray")
  @js.native
  def toArray[TInput, TOutput](coll: StringDictionary[TInput]): js.Array[TOutput] = js.native
  @JSImport("transducers.js", "toArray")
  @js.native
  def toArray[TInput, TOutput](coll: StringDictionary[TInput], xf: Transducer[js.Tuple2[String, TInput], TOutput]): js.Array[TOutput] = js.native
  @JSImport("transducers.js", "toArray")
  @js.native
  def toArray[TInput, TOutput](coll: Iterable[TInput]): js.Array[TOutput] = js.native
  @JSImport("transducers.js", "toArray")
  @js.native
  def toArray[TInput, TOutput](coll: Iterable[TInput], xf: Transducer[TInput, TOutput]): js.Array[TOutput] = js.native
  
  @JSImport("transducers.js", "toIter")
  @js.native
  def toIter[TInput, TOutput](coll: StringDictionary[TInput]): IterableIterator[TOutput] = js.native
  @JSImport("transducers.js", "toIter")
  @js.native
  def toIter[TInput, TOutput](coll: StringDictionary[TInput], xf: Transducer[js.Tuple2[String, TInput], TOutput]): IterableIterator[TOutput] = js.native
  @JSImport("transducers.js", "toIter")
  @js.native
  def toIter[TInput, TOutput](coll: Iterable[TInput]): IterableIterator[TOutput] = js.native
  @JSImport("transducers.js", "toIter")
  @js.native
  def toIter[TInput, TOutput](coll: Iterable[TInput], xf: Transducer[TInput, TOutput]): IterableIterator[TOutput] = js.native
  
  @JSImport("transducers.js", "toObj")
  @js.native
  def toObj[TInput, TOutput](
    coll: StringDictionary[TInput],
    xf: Transducer[js.Tuple2[String, TInput], js.Tuple2[String, TOutput]]
  ): StringDictionary[TOutput] = js.native
  @JSImport("transducers.js", "toObj")
  @js.native
  def toObj[TInput, TOutput](coll: Iterable[TInput]): StringDictionary[TOutput] = js.native
  @JSImport("transducers.js", "toObj")
  @js.native
  def toObj[TInput, TOutput](coll: Iterable[TInput], xf: Transducer[TInput, js.Tuple2[String, TOutput]]): StringDictionary[TOutput] = js.native
  
  @JSImport("transducers.js", "transduce")
  @js.native
  def transduce[TResult, TInput, TOutput](
    coll: StringDictionary[TInput],
    xf: Transducer[js.Tuple2[String, TInput], TOutput],
    f: Reducer[TResult, TOutput],
    init: TResult
  ): TResult = js.native
  @JSImport("transducers.js", "transduce")
  @js.native
  def transduce[TResult, TInput, TOutput](
    coll: Iterable[TInput],
    xf: Transducer[TInput, TOutput],
    f: Reducer[TResult, TOutput],
    init: TResult
  ): TResult = js.native
  @JSImport("transducers.js", "transduce")
  @js.native
  def transduce[TResult, TCompleteResult, TInput, TOutput](
    coll: StringDictionary[TInput],
    xf: Transducer[js.Tuple2[String, TInput], TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput]
  ): TCompleteResult = js.native
  @JSImport("transducers.js", "transduce")
  @js.native
  def transduce[TResult, TCompleteResult, TInput, TOutput](
    coll: StringDictionary[TInput],
    xf: Transducer[js.Tuple2[String, TInput], TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput],
    init: TResult
  ): TCompleteResult = js.native
  @JSImport("transducers.js", "transduce")
  @js.native
  def transduce[TResult, TCompleteResult, TInput, TOutput](
    coll: Iterable[TInput],
    xf: Transducer[TInput, TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput]
  ): TCompleteResult = js.native
  @JSImport("transducers.js", "transduce")
  @js.native
  def transduce[TResult, TCompleteResult, TInput, TOutput](
    coll: Iterable[TInput],
    xf: Transducer[TInput, TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput],
    init: TResult
  ): TCompleteResult = js.native
  
  @JSImport("transducers.js", "transformer")
  @js.native
  def transformer[TResult, TInput](reducer: Reducer[TResult, TInput]): Transformer_[TResult, TInput] = js.native
  
  @js.native
  trait CompletingTransformer[TResult, TCompleteResult, TInput] extends StObject {
    
    @JSName("@@transducer/init")
    def `@@transducerSlashinit`(): TResult | Unit = js.native
    
    @JSName("@@transducer/result")
    def `@@transducerSlashresult`(result: TResult): TCompleteResult = js.native
    
    @JSName("@@transducer/step")
    def `@@transducerSlashstep`(result: TResult, input: TInput): TResult | Reduced[TResult] = js.native
  }
  object CompletingTransformer {
    
    @scala.inline
    def apply[TResult, TCompleteResult, TInput](
      `@@transducerSlashinit`: () => TResult | Unit,
      `@@transducerSlashresult`: TResult => TCompleteResult,
      `@@transducerSlashstep`: (TResult, TInput) => TResult | Reduced[TResult]
    ): CompletingTransformer[TResult, TCompleteResult, TInput] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@@transducer/init")(js.Any.fromFunction0(`@@transducerSlashinit`))
      __obj.updateDynamic("@@transducer/result")(js.Any.fromFunction1(`@@transducerSlashresult`))
      __obj.updateDynamic("@@transducer/step")(js.Any.fromFunction2(`@@transducerSlashstep`))
      __obj.asInstanceOf[CompletingTransformer[TResult, TCompleteResult, TInput]]
    }
    
    @scala.inline
    implicit class CompletingTransformerMutableBuilder[Self <: CompletingTransformer[_, _, _], TResult, TCompleteResult, TInput] (val x: Self with (CompletingTransformer[TResult, TCompleteResult, TInput])) extends AnyVal {
      
      @scala.inline
      def `set@@transducerSlashinit`(value: () => TResult | Unit): Self = StObject.set(x, "@@transducer/init", js.Any.fromFunction0(value))
      
      @scala.inline
      def `set@@transducerSlashresult`(value: TResult => TCompleteResult): Self = StObject.set(x, "@@transducer/result", js.Any.fromFunction1(value))
      
      @scala.inline
      def `set@@transducerSlashstep`(value: (TResult, TInput) => TResult | Reduced[TResult]): Self = StObject.set(x, "@@transducer/step", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait LazyTransformerConstructor
    extends Instantiable2[
          /* xf */ Transducer[js.Object, js.Object], 
          /* coll */ Iterable[js.Object], 
          IterableIterator[js.Object]
        ]
  
  @js.native
  trait ReducedConstructor
    extends Instantiable1[/* value */ js.Object, Reduced[js.Object]]
  
  type Reducer[TResult, TInput] = js.Function2[/* result */ TResult, /* input */ TInput, TResult]
  
  type Transducer[TInput, TOutput] = js.Function1[/* xf */ Transformer_[js.Any, TOutput], Transformer_[js.Any, TInput]]
  
  type Transformer_[TResult, TInput] = CompletingTransformer[TResult, TResult, TInput]
}
