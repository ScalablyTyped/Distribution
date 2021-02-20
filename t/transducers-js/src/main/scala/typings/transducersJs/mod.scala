package typings.transducersJs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("transducers-js", "Completing")
  @js.native
  class Completing_[TResult, TCompleteResult, TInput] protected () extends CompletingTransformer[TResult, TCompleteResult, TInput] {
    def this(cf: js.Function1[/* result */ TResult, TCompleteResult], xf: Transformer[TResult, TInput]) = this()
  }
  
  @JSImport("transducers-js", "DropWhile")
  @js.native
  class DropWhile_[TResult, TInput] protected () extends CompletingTransformer[TResult, TResult, TInput] {
    def this(pred: js.Function1[/* input */ TInput, Boolean], xf: Transformer[TResult, TInput]) = this()
  }
  
  @JSImport("transducers-js", "Drop")
  @js.native
  class Drop_[TResult, TInput] protected () extends CompletingTransformer[TResult, TResult, TInput] {
    def this(n: Double, xf: Transformer[TResult, TInput]) = this()
  }
  
  @JSImport("transducers-js", "Filter")
  @js.native
  class Filter_[TResult, TInput] protected () extends CompletingTransformer[TResult, TResult, TInput] {
    def this(pred: js.Function1[/* x */ TInput, Boolean], xf: Transformer[TResult, TInput]) = this()
  }
  
  @JSImport("transducers-js", "KeepIndexed")
  @js.native
  class KeepIndexed_[TResult, TInput] protected () extends CompletingTransformer[TResult, TResult, TInput] {
    def this(f: js.Function2[/* i */ Double, /* x */ TInput, _], xf: Transformer[TResult, TInput]) = this()
  }
  
  @JSImport("transducers-js", "Keep")
  @js.native
  class Keep_[TResult, TInput] protected () extends CompletingTransformer[TResult, TResult, TInput] {
    def this(f: js.Function1[/* x */ TInput, _], xf: Transformer[TResult, TInput]) = this()
  }
  
  @JSImport("transducers-js", "Map")
  @js.native
  class Map_[TResult, TInput, TOutput] protected () extends CompletingTransformer[TResult, TResult, TInput] {
    def this(f: js.Function1[/* x */ TInput, TOutput], xf: Transformer[TResult, TOutput]) = this()
  }
  
  @JSImport("transducers-js", "PartitionAll")
  @js.native
  class PartitionAll_[TResult, TInput] protected () extends CompletingTransformer[TResult, TResult, TInput] {
    def this(n: Double, xf: Transformer[TResult, js.Array[TInput]]) = this()
  }
  
  @JSImport("transducers-js", "PartitionBy")
  @js.native
  class PartitionBy_[TResult, TInput] protected () extends CompletingTransformer[TResult, TResult, TInput] {
    def this(f: js.Function1[/* input */ TInput, _], xf: Transformer[TResult, js.Array[TInput]]) = this()
  }
  
  @JSImport("transducers-js", "TakeNth")
  @js.native
  class TakeNth_[TResult, TInput] protected () extends CompletingTransformer[TResult, TResult, TInput] {
    def this(n: Double, xf: Transformer[TResult, TInput]) = this()
  }
  
  @JSImport("transducers-js", "TakeWhile")
  @js.native
  class TakeWhile_[TResult, TInput] protected () extends CompletingTransformer[TResult, TResult, TInput] {
    def this(pred: js.Function1[/* n */ TInput, Boolean], xf: Transformer[TResult, TInput]) = this()
  }
  
  @JSImport("transducers-js", "Take")
  @js.native
  class Take_[TResult, TInput] protected () extends CompletingTransformer[TResult, TResult, TInput] {
    def this(n: Double, xf: Transformer[TResult, TInput]) = this()
  }
  
  @JSImport("transducers-js", "Wrap")
  @js.native
  class Wrap_[TResult, TInput] protected () extends CompletingTransformer[TResult, TResult, TInput] {
    def this(stepFn: Reducer[TResult, TInput]) = this()
  }
  
  @JSImport("transducers-js", "cat")
  @js.native
  def cat[TResult, TInput](xf: Transformer[TResult, TInput]): Transformer[TResult, Iterable[TInput]] = js.native
  
  @JSImport("transducers-js", "comp")
  @js.native
  def comp(args: (js.Function1[/* x */ js.Any, _])*): js.Function1[/* x */ js.Any, _] = js.native
  @JSImport("transducers-js", "comp")
  @js.native
  def comp[A, B, C](a: Transducer[A, B], b: Transducer[B, C]): Transducer[A, C] = js.native
  @JSImport("transducers-js", "comp")
  @js.native
  def comp[A, B, C](b: js.Function1[/* b */ B, C], a: js.Function1[/* a */ A, B]): js.Function1[/* a */ A, C] = js.native
  @JSImport("transducers-js", "comp")
  @js.native
  def comp[A, B, C, D](a: Transducer[A, B], b: Transducer[B, C], c: Transducer[C, D]): Transducer[A, D] = js.native
  @JSImport("transducers-js", "comp")
  @js.native
  def comp[A, B, C, D](c: js.Function1[/* c */ C, D], b: js.Function1[/* b */ B, C], a: js.Function1[/* a */ A, B]): js.Function1[/* a */ A, D] = js.native
  @JSImport("transducers-js", "comp")
  @js.native
  def comp[A, B, C, D, E](a: Transducer[A, B], b: Transducer[B, C], c: Transducer[C, D], d: Transducer[D, E]): Transducer[A, E] = js.native
  @JSImport("transducers-js", "comp")
  @js.native
  def comp[A, B, C, D, E](
    d: js.Function1[/* d */ D, E],
    c: js.Function1[/* c */ C, D],
    b: js.Function1[/* b */ B, C],
    a: js.Function1[/* a */ A, B]
  ): js.Function1[/* a */ A, E] = js.native
  @JSImport("transducers-js", "comp")
  @js.native
  def comp_A_A[A](args: (js.Function1[/* a */ A, A])*): A = js.native
  @JSImport("transducers-js", "comp")
  @js.native
  def comp_A_Transducer[A](args: (Transducer[A, A])*): Transducer[A, A] = js.native
  
  @JSImport("transducers-js", "complement")
  @js.native
  def complement[T](f: js.Function1[/* x */ T, Boolean]): js.Function1[/* x */ T, Boolean] = js.native
  
  @JSImport("transducers-js", "completing")
  @js.native
  def completing[TResult, TCompleteResult, TInput](xf: Reducer[TResult, TInput], cf: js.Function1[/* result */ TResult, TCompleteResult]): CompletingTransformer[TResult, TCompleteResult, TInput] = js.native
  @JSImport("transducers-js", "completing")
  @js.native
  def completing[TResult, TCompleteResult, TInput](xf: Transformer[TResult, TInput], cf: js.Function1[/* result */ TResult, TCompleteResult]): CompletingTransformer[TResult, TCompleteResult, TInput] = js.native
  
  @JSImport("transducers-js", "deref")
  @js.native
  def deref[TResult](x: Reduced_[TResult]): TResult = js.native
  
  @JSImport("transducers-js", "drop")
  @js.native
  def drop[TInput](n: Double): Transducer[TInput, TInput] = js.native
  
  @JSImport("transducers-js", "dropWhile")
  @js.native
  def dropWhile[TInput](pred: js.Function1[/* input */ TInput, Boolean]): Transducer[TInput, TInput] = js.native
  
  @JSImport("transducers-js", "ensureReduced")
  @js.native
  def ensureReduced[TResult](x: TResult): Reduced_[TResult] = js.native
  @JSImport("transducers-js", "ensureReduced")
  @js.native
  def ensureReduced[TResult](x: Reduced_[TResult]): Reduced_[TResult] = js.native
  
  @JSImport("transducers-js", "filter")
  @js.native
  def filter[TInput](pred: js.Function1[/* x */ TInput, Boolean]): Transducer[TInput, TInput] = js.native
  
  @JSImport("transducers-js", "first")
  @js.native
  def first[TResult, TInput](): Wrap_[TResult, TInput] = js.native
  
  @JSImport("transducers-js", "identity")
  @js.native
  def identity[T](arg: T): T = js.native
  
  @JSImport("transducers-js", "into")
  @js.native
  def into[TInput](empty: String, xf: Transducer[js.Tuple2[String, TInput], String], coll: StringDictionary[TInput]): String = js.native
  @JSImport("transducers-js", "into")
  @js.native
  def into[TInput](empty: String, xf: Transducer[TInput, String], coll: Iterable[TInput]): String = js.native
  @JSImport("transducers-js", "into")
  @js.native
  def into[TInput, TOutput](
    empty: js.Array[TOutput],
    xf: Transducer[js.Tuple2[String, TInput], TOutput],
    coll: StringDictionary[TInput]
  ): js.Array[TOutput] = js.native
  @JSImport("transducers-js", "into")
  @js.native
  def into[TInput, TOutput](empty: js.Array[TOutput], xf: Transducer[TInput, TOutput], coll: Iterable[TInput]): js.Array[TOutput] = js.native
  @JSImport("transducers-js", "into")
  @js.native
  def into[TInput, TOutput](
    empty: StringDictionary[TOutput],
    xf: Transducer[js.Tuple2[String, TInput], js.Tuple2[String, TOutput]],
    coll: StringDictionary[TInput]
  ): StringDictionary[TOutput] = js.native
  @JSImport("transducers-js", "into")
  @js.native
  def into[TInput, TOutput](
    empty: StringDictionary[TOutput],
    xf: Transducer[TInput, js.Tuple2[String, TOutput]],
    coll: Iterable[TInput]
  ): StringDictionary[TOutput] = js.native
  
  @JSImport("transducers-js", "isReduced")
  @js.native
  def isReduced(x: js.Any): Boolean = js.native
  
  @JSImport("transducers-js", "keep")
  @js.native
  def keep[TInput](f: js.Function1[/* x */ TInput, _]): Transducer[TInput, TInput] = js.native
  
  @JSImport("transducers-js", "keepIndexed")
  @js.native
  def keepIndexed[TInput](f: js.Function2[/* i */ Double, /* x */ TInput, _]): Transducer[TInput, TInput] = js.native
  
  @JSImport("transducers-js", "map")
  @js.native
  def map[TInput, TOutput](f: js.Function1[/* x */ TInput, TOutput]): Transducer[TInput, TOutput] = js.native
  
  @JSImport("transducers-js", "mapcat")
  @js.native
  def mapcat[TResult, TInput, TOutput](f: js.Function1[/* arr */ TInput, Iterable[TOutput]]): Transducer[TInput, TOutput] = js.native
  
  @JSImport("transducers-js", "partitionAll")
  @js.native
  def partitionAll[TResult, TInput](n: Double): Transducer[TInput, js.Array[TInput]] = js.native
  
  @JSImport("transducers-js", "partitionBy")
  @js.native
  def partitionBy[TInput](f: js.Function1[/* input */ TInput, _]): Transducer[TInput, js.Array[TInput]] = js.native
  
  @JSImport("transducers-js", "reduce")
  @js.native
  def reduce[TResult, TInput](xf: Reducer[TResult, js.Tuple2[String, TInput]], init: TResult, coll: StringDictionary[TInput]): TResult = js.native
  @JSImport("transducers-js", "reduce")
  @js.native
  def reduce[TResult, TInput](xf: Reducer[TResult, TInput], init: TResult, coll: Iterable[TInput]): TResult = js.native
  @JSImport("transducers-js", "reduce")
  @js.native
  def reduce[TResult, TInput](xf: Transformer[TResult, js.Tuple2[String, TInput]], init: TResult, coll: StringDictionary[TInput]): TResult = js.native
  @JSImport("transducers-js", "reduce")
  @js.native
  def reduce[TResult, TInput](xf: Transformer[TResult, TInput], init: TResult, coll: Iterable[TInput]): TResult = js.native
  @JSImport("transducers-js", "reduce")
  @js.native
  def reduce_TResultTCompleteResultTInput_TCompleteResult[TResult, TCompleteResult, TInput](
    xf: CompletingTransformer[TResult, TCompleteResult, js.Tuple2[String, TInput]],
    init: TResult,
    coll: StringDictionary[TInput]
  ): TCompleteResult = js.native
  @JSImport("transducers-js", "reduce")
  @js.native
  def reduce_TResultTCompleteResultTInput_TCompleteResult[TResult, TCompleteResult, TInput](xf: CompletingTransformer[TResult, TCompleteResult, TInput], init: TResult, coll: Iterable[TInput]): TCompleteResult = js.native
  
  @JSImport("transducers-js", "reduced")
  @js.native
  def reduced[TResult](x: TResult): Reduced_[TResult] = js.native
  
  @JSImport("transducers-js", "remove")
  @js.native
  def remove[TInput](pred: js.Function1[/* x */ TInput, Boolean]): Transducer[TInput, TInput] = js.native
  
  @JSImport("transducers-js", "take")
  @js.native
  def take[TInput](n: Double): Transducer[TInput, TInput] = js.native
  
  @JSImport("transducers-js", "takeNth")
  @js.native
  def takeNth[TInput](n: Double): Transducer[TInput, TInput] = js.native
  
  @JSImport("transducers-js", "takeWhile")
  @js.native
  def takeWhile[TInput](pred: js.Function1[/* n */ TInput, Boolean]): Transducer[TInput, TInput] = js.native
  
  @JSImport("transducers-js", "toFn")
  @js.native
  def toFn[TResult, TInput, TOutput](xf: Transducer[TInput, TOutput], builder: Reducer[TResult, TOutput]): Reducer[TResult, TOutput] = js.native
  @JSImport("transducers-js", "toFn")
  @js.native
  def toFn[TResult, TInput, TOutput](xf: Transducer[TInput, TOutput], builder: Transformer[TResult, TOutput]): Reducer[TResult, TOutput] = js.native
  
  @JSImport("transducers-js", "transduce")
  @js.native
  def transduce[TResult, TInput, TOutput](
    xf: Transducer[js.Tuple2[String, TInput], TOutput],
    f: Reducer[TResult, TOutput],
    init: TResult,
    coll: StringDictionary[TInput]
  ): TResult = js.native
  @JSImport("transducers-js", "transduce")
  @js.native
  def transduce[TResult, TInput, TOutput](
    xf: Transducer[TInput, TOutput],
    f: Reducer[TResult, TOutput],
    init: TResult,
    coll: Iterable[TInput]
  ): TResult = js.native
  @JSImport("transducers-js", "transduce")
  @js.native
  def transduce[TResult, TCompleteResult, TInput, TOutput](
    xf: Transducer[js.Tuple2[String, TInput], TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput],
    coll: StringDictionary[TInput]
  ): TCompleteResult = js.native
  @JSImport("transducers-js", "transduce")
  @js.native
  def transduce[TResult, TCompleteResult, TInput, TOutput](
    xf: Transducer[TInput, TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput],
    coll: Iterable[TInput]
  ): TCompleteResult = js.native
  @JSImport("transducers-js", "transduce")
  @js.native
  def transduce[TResult, TCompleteResult, TInput, TOutput](
    xf: Transducer[js.Tuple2[String, TInput], TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput],
    init: TResult,
    coll: StringDictionary[TInput]
  ): TCompleteResult = js.native
  @JSImport("transducers-js", "transduce")
  @js.native
  def transduce[TResult, TCompleteResult, TInput, TOutput](
    xf: Transducer[TInput, TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput],
    init: TResult,
    coll: Iterable[TInput]
  ): TCompleteResult = js.native
  
  @JSImport("transducers-js", "unreduced")
  @js.native
  def unreduced[TResult](x: TResult): TResult = js.native
  @JSImport("transducers-js", "unreduced")
  @js.native
  def unreduced[TResult](x: Reduced_[TResult]): TResult = js.native
  
  @JSImport("transducers-js", "wrap")
  @js.native
  def wrap[TResult, TInput](stepFn: Reducer[TResult, TInput]): Transformer[TResult, TInput] = js.native
  
  @js.native
  trait CompletingTransformer[TResult, TCompleteResult, TInput] extends StObject {
    
    @JSName("@@transducer/init")
    def `@@transducerSlashinit`(): TResult | Unit = js.native
    
    @JSName("@@transducer/result")
    def `@@transducerSlashresult`(result: TResult): TCompleteResult = js.native
    
    @JSName("@@transducer/step")
    def `@@transducerSlashstep`(result: TResult, input: TInput): TResult | Reduced_[TResult] = js.native
  }
  object CompletingTransformer {
    
    @scala.inline
    def apply[TResult, TCompleteResult, TInput](
      `@@transducerSlashinit`: () => TResult | Unit,
      `@@transducerSlashresult`: TResult => TCompleteResult,
      `@@transducerSlashstep`: (TResult, TInput) => TResult | Reduced_[TResult]
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
      def `set@@transducerSlashstep`(value: (TResult, TInput) => TResult | Reduced_[TResult]): Self = StObject.set(x, "@@transducer/step", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Reduced_[TResult] extends StObject {
    
    @JSName("@@transducer/reduced")
    var `@@transducerSlashreduced`: Boolean = js.native
    
    @JSName("@@transducer/value")
    var `@@transducerSlashvalue`: TResult = js.native
  }
  object Reduced_ {
    
    @scala.inline
    def apply[TResult](`@@transducerSlashreduced`: Boolean, `@@transducerSlashvalue`: TResult): Reduced_[TResult] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@@transducer/reduced")(`@@transducerSlashreduced`.asInstanceOf[js.Any])
      __obj.updateDynamic("@@transducer/value")(`@@transducerSlashvalue`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reduced_[TResult]]
    }
    
    @scala.inline
    implicit class Reduced_MutableBuilder[Self <: Reduced_[_], TResult] (val x: Self with Reduced_[TResult]) extends AnyVal {
      
      @scala.inline
      def `set@@transducerSlashreduced`(value: Boolean): Self = StObject.set(x, "@@transducer/reduced", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set@@transducerSlashvalue`(value: TResult): Self = StObject.set(x, "@@transducer/value", value.asInstanceOf[js.Any])
    }
  }
  
  type Reducer[TResult, TInput] = js.Function2[/* result */ TResult, /* input */ TInput, TResult]
  
  @js.native
  trait Transducer[TInput, TOutput] extends StObject {
    
    def apply[TResult](xf: Transformer[TResult, TOutput]): Transformer[TResult, TInput] = js.native
  }
  
  type Transformer[TResult, TInput] = CompletingTransformer[TResult, TResult, TInput]
}
