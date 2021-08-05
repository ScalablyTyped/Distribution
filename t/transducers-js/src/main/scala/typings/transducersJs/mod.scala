package typings.transducersJs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("transducers-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("transducers-js", "Completing")
  @js.native
  class Completing_[TResult, TCompleteResult, TInput] protected ()
    extends StObject
       with CompletingTransformer[TResult, TCompleteResult, TInput] {
    def this(cf: js.Function1[/* result */ TResult, TCompleteResult], xf: Transformer[TResult, TInput]) = this()
    
    /* CompleteClass */
    @JSName("@@transducer/init")
    override def `@@transducerSlashinit`(): TResult | Unit = js.native
    
    /* CompleteClass */
    @JSName("@@transducer/result")
    override def `@@transducerSlashresult`(result: TResult): TCompleteResult = js.native
    
    /* CompleteClass */
    @JSName("@@transducer/step")
    override def `@@transducerSlashstep`(result: TResult, input: TInput): TResult | Reduced_[TResult] = js.native
  }
  
  @JSImport("transducers-js", "DropWhile")
  @js.native
  class DropWhile_[TResult, TInput] protected ()
    extends StObject
       with CompletingTransformer[TResult, TResult, TInput] {
    def this(pred: js.Function1[/* input */ TInput, Boolean], xf: Transformer[TResult, TInput]) = this()
    
    /* CompleteClass */
    @JSName("@@transducer/init")
    override def `@@transducerSlashinit`(): TResult | Unit = js.native
    
    /* CompleteClass */
    @JSName("@@transducer/result")
    override def `@@transducerSlashresult`(result: TResult): TResult = js.native
    
    /* CompleteClass */
    @JSName("@@transducer/step")
    override def `@@transducerSlashstep`(result: TResult, input: TInput): TResult | Reduced_[TResult] = js.native
  }
  
  @JSImport("transducers-js", "Drop")
  @js.native
  class Drop_[TResult, TInput] protected ()
    extends StObject
       with CompletingTransformer[TResult, TResult, TInput] {
    def this(n: Double, xf: Transformer[TResult, TInput]) = this()
    
    /* CompleteClass */
    @JSName("@@transducer/init")
    override def `@@transducerSlashinit`(): TResult | Unit = js.native
    
    /* CompleteClass */
    @JSName("@@transducer/result")
    override def `@@transducerSlashresult`(result: TResult): TResult = js.native
    
    /* CompleteClass */
    @JSName("@@transducer/step")
    override def `@@transducerSlashstep`(result: TResult, input: TInput): TResult | Reduced_[TResult] = js.native
  }
  
  @JSImport("transducers-js", "Filter")
  @js.native
  class Filter_[TResult, TInput] protected ()
    extends StObject
       with CompletingTransformer[TResult, TResult, TInput] {
    def this(pred: js.Function1[/* x */ TInput, Boolean], xf: Transformer[TResult, TInput]) = this()
    
    /* CompleteClass */
    @JSName("@@transducer/init")
    override def `@@transducerSlashinit`(): TResult | Unit = js.native
    
    /* CompleteClass */
    @JSName("@@transducer/result")
    override def `@@transducerSlashresult`(result: TResult): TResult = js.native
    
    /* CompleteClass */
    @JSName("@@transducer/step")
    override def `@@transducerSlashstep`(result: TResult, input: TInput): TResult | Reduced_[TResult] = js.native
  }
  
  @JSImport("transducers-js", "KeepIndexed")
  @js.native
  class KeepIndexed_[TResult, TInput] protected ()
    extends StObject
       with CompletingTransformer[TResult, TResult, TInput] {
    def this(f: js.Function2[/* i */ Double, /* x */ TInput, js.Any], xf: Transformer[TResult, TInput]) = this()
    
    /* CompleteClass */
    @JSName("@@transducer/init")
    override def `@@transducerSlashinit`(): TResult | Unit = js.native
    
    /* CompleteClass */
    @JSName("@@transducer/result")
    override def `@@transducerSlashresult`(result: TResult): TResult = js.native
    
    /* CompleteClass */
    @JSName("@@transducer/step")
    override def `@@transducerSlashstep`(result: TResult, input: TInput): TResult | Reduced_[TResult] = js.native
  }
  
  @JSImport("transducers-js", "Keep")
  @js.native
  class Keep_[TResult, TInput] protected ()
    extends StObject
       with CompletingTransformer[TResult, TResult, TInput] {
    def this(f: js.Function1[/* x */ TInput, js.Any], xf: Transformer[TResult, TInput]) = this()
    
    /* CompleteClass */
    @JSName("@@transducer/init")
    override def `@@transducerSlashinit`(): TResult | Unit = js.native
    
    /* CompleteClass */
    @JSName("@@transducer/result")
    override def `@@transducerSlashresult`(result: TResult): TResult = js.native
    
    /* CompleteClass */
    @JSName("@@transducer/step")
    override def `@@transducerSlashstep`(result: TResult, input: TInput): TResult | Reduced_[TResult] = js.native
  }
  
  @JSImport("transducers-js", "Map")
  @js.native
  class Map_[TResult, TInput, TOutput] protected ()
    extends StObject
       with CompletingTransformer[TResult, TResult, TInput] {
    def this(f: js.Function1[/* x */ TInput, TOutput], xf: Transformer[TResult, TOutput]) = this()
    
    /* CompleteClass */
    @JSName("@@transducer/init")
    override def `@@transducerSlashinit`(): TResult | Unit = js.native
    
    /* CompleteClass */
    @JSName("@@transducer/result")
    override def `@@transducerSlashresult`(result: TResult): TResult = js.native
    
    /* CompleteClass */
    @JSName("@@transducer/step")
    override def `@@transducerSlashstep`(result: TResult, input: TInput): TResult | Reduced_[TResult] = js.native
  }
  
  @JSImport("transducers-js", "PartitionAll")
  @js.native
  class PartitionAll_[TResult, TInput] protected ()
    extends StObject
       with CompletingTransformer[TResult, TResult, TInput] {
    def this(n: Double, xf: Transformer[TResult, js.Array[TInput]]) = this()
    
    /* CompleteClass */
    @JSName("@@transducer/init")
    override def `@@transducerSlashinit`(): TResult | Unit = js.native
    
    /* CompleteClass */
    @JSName("@@transducer/result")
    override def `@@transducerSlashresult`(result: TResult): TResult = js.native
    
    /* CompleteClass */
    @JSName("@@transducer/step")
    override def `@@transducerSlashstep`(result: TResult, input: TInput): TResult | Reduced_[TResult] = js.native
  }
  
  @JSImport("transducers-js", "PartitionBy")
  @js.native
  class PartitionBy_[TResult, TInput] protected ()
    extends StObject
       with CompletingTransformer[TResult, TResult, TInput] {
    def this(f: js.Function1[/* input */ TInput, js.Any], xf: Transformer[TResult, js.Array[TInput]]) = this()
    
    /* CompleteClass */
    @JSName("@@transducer/init")
    override def `@@transducerSlashinit`(): TResult | Unit = js.native
    
    /* CompleteClass */
    @JSName("@@transducer/result")
    override def `@@transducerSlashresult`(result: TResult): TResult = js.native
    
    /* CompleteClass */
    @JSName("@@transducer/step")
    override def `@@transducerSlashstep`(result: TResult, input: TInput): TResult | Reduced_[TResult] = js.native
  }
  
  @JSImport("transducers-js", "TakeNth")
  @js.native
  class TakeNth_[TResult, TInput] protected ()
    extends StObject
       with CompletingTransformer[TResult, TResult, TInput] {
    def this(n: Double, xf: Transformer[TResult, TInput]) = this()
    
    /* CompleteClass */
    @JSName("@@transducer/init")
    override def `@@transducerSlashinit`(): TResult | Unit = js.native
    
    /* CompleteClass */
    @JSName("@@transducer/result")
    override def `@@transducerSlashresult`(result: TResult): TResult = js.native
    
    /* CompleteClass */
    @JSName("@@transducer/step")
    override def `@@transducerSlashstep`(result: TResult, input: TInput): TResult | Reduced_[TResult] = js.native
  }
  
  @JSImport("transducers-js", "TakeWhile")
  @js.native
  class TakeWhile_[TResult, TInput] protected ()
    extends StObject
       with CompletingTransformer[TResult, TResult, TInput] {
    def this(pred: js.Function1[/* n */ TInput, Boolean], xf: Transformer[TResult, TInput]) = this()
    
    /* CompleteClass */
    @JSName("@@transducer/init")
    override def `@@transducerSlashinit`(): TResult | Unit = js.native
    
    /* CompleteClass */
    @JSName("@@transducer/result")
    override def `@@transducerSlashresult`(result: TResult): TResult = js.native
    
    /* CompleteClass */
    @JSName("@@transducer/step")
    override def `@@transducerSlashstep`(result: TResult, input: TInput): TResult | Reduced_[TResult] = js.native
  }
  
  @JSImport("transducers-js", "Take")
  @js.native
  class Take_[TResult, TInput] protected ()
    extends StObject
       with CompletingTransformer[TResult, TResult, TInput] {
    def this(n: Double, xf: Transformer[TResult, TInput]) = this()
    
    /* CompleteClass */
    @JSName("@@transducer/init")
    override def `@@transducerSlashinit`(): TResult | Unit = js.native
    
    /* CompleteClass */
    @JSName("@@transducer/result")
    override def `@@transducerSlashresult`(result: TResult): TResult = js.native
    
    /* CompleteClass */
    @JSName("@@transducer/step")
    override def `@@transducerSlashstep`(result: TResult, input: TInput): TResult | Reduced_[TResult] = js.native
  }
  
  @JSImport("transducers-js", "Wrap")
  @js.native
  class Wrap_[TResult, TInput] protected ()
    extends StObject
       with CompletingTransformer[TResult, TResult, TInput] {
    def this(stepFn: Reducer[TResult, TInput]) = this()
    
    /* CompleteClass */
    @JSName("@@transducer/init")
    override def `@@transducerSlashinit`(): TResult | Unit = js.native
    
    /* CompleteClass */
    @JSName("@@transducer/result")
    override def `@@transducerSlashresult`(result: TResult): TResult = js.native
    
    /* CompleteClass */
    @JSName("@@transducer/step")
    override def `@@transducerSlashstep`(result: TResult, input: TInput): TResult | Reduced_[TResult] = js.native
  }
  
  inline def cat[TResult, TInput](xf: Transformer[TResult, TInput]): Transformer[TResult, Iterable[TInput]] = ^.asInstanceOf[js.Dynamic].applyDynamic("cat")(xf.asInstanceOf[js.Any]).asInstanceOf[Transformer[TResult, Iterable[TInput]]]
  
  inline def comp(args: (js.Function1[/* x */ js.Any, js.Any])*): js.Function1[/* x */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("comp")(args.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* x */ js.Any, js.Any]]
  inline def comp[A, B, C](a: Transducer[A, B], b: Transducer[B, C]): Transducer[A, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("comp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Transducer[A, C]]
  inline def comp[A, B, C](b: js.Function1[/* b */ B, C], a: js.Function1[/* a */ A, B]): js.Function1[/* a */ A, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("comp")(b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, C]]
  inline def comp[A, B, C, D](a: Transducer[A, B], b: Transducer[B, C], c: Transducer[C, D]): Transducer[A, D] = (^.asInstanceOf[js.Dynamic].applyDynamic("comp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Transducer[A, D]]
  inline def comp[A, B, C, D](c: js.Function1[/* c */ C, D], b: js.Function1[/* b */ B, C], a: js.Function1[/* a */ A, B]): js.Function1[/* a */ A, D] = (^.asInstanceOf[js.Dynamic].applyDynamic("comp")(c.asInstanceOf[js.Any], b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, D]]
  inline def comp[A, B, C, D, E](a: Transducer[A, B], b: Transducer[B, C], c: Transducer[C, D], d: Transducer[D, E]): Transducer[A, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("comp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Transducer[A, E]]
  inline def comp[A, B, C, D, E](
    d: js.Function1[/* d */ D, E],
    c: js.Function1[/* c */ C, D],
    b: js.Function1[/* b */ B, C],
    a: js.Function1[/* a */ A, B]
  ): js.Function1[/* a */ A, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("comp")(d.asInstanceOf[js.Any], c.asInstanceOf[js.Any], b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, E]]
  
  inline def comp_A_A[A](args: (js.Function1[/* a */ A, A])*): A = ^.asInstanceOf[js.Dynamic].applyDynamic("comp")(args.asInstanceOf[js.Any]).asInstanceOf[A]
  
  inline def comp_A_Transducer[A](args: (Transducer[A, A])*): Transducer[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("comp")(args.asInstanceOf[js.Any]).asInstanceOf[Transducer[A, A]]
  
  inline def complement[T](f: js.Function1[/* x */ T, Boolean]): js.Function1[/* x */ T, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("complement")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* x */ T, Boolean]]
  
  inline def completing[TResult, TCompleteResult, TInput](xf: Reducer[TResult, TInput], cf: js.Function1[/* result */ TResult, TCompleteResult]): CompletingTransformer[TResult, TCompleteResult, TInput] = (^.asInstanceOf[js.Dynamic].applyDynamic("completing")(xf.asInstanceOf[js.Any], cf.asInstanceOf[js.Any])).asInstanceOf[CompletingTransformer[TResult, TCompleteResult, TInput]]
  inline def completing[TResult, TCompleteResult, TInput](xf: Transformer[TResult, TInput], cf: js.Function1[/* result */ TResult, TCompleteResult]): CompletingTransformer[TResult, TCompleteResult, TInput] = (^.asInstanceOf[js.Dynamic].applyDynamic("completing")(xf.asInstanceOf[js.Any], cf.asInstanceOf[js.Any])).asInstanceOf[CompletingTransformer[TResult, TCompleteResult, TInput]]
  
  inline def deref[TResult](x: Reduced_[TResult]): TResult = ^.asInstanceOf[js.Dynamic].applyDynamic("deref")(x.asInstanceOf[js.Any]).asInstanceOf[TResult]
  
  inline def drop[TInput](n: Double): Transducer[TInput, TInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("drop")(n.asInstanceOf[js.Any]).asInstanceOf[Transducer[TInput, TInput]]
  
  inline def dropWhile[TInput](pred: js.Function1[/* input */ TInput, Boolean]): Transducer[TInput, TInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("dropWhile")(pred.asInstanceOf[js.Any]).asInstanceOf[Transducer[TInput, TInput]]
  
  inline def ensureReduced[TResult](x: TResult): Reduced_[TResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureReduced")(x.asInstanceOf[js.Any]).asInstanceOf[Reduced_[TResult]]
  inline def ensureReduced[TResult](x: Reduced_[TResult]): Reduced_[TResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureReduced")(x.asInstanceOf[js.Any]).asInstanceOf[Reduced_[TResult]]
  
  inline def filter[TInput](pred: js.Function1[/* x */ TInput, Boolean]): Transducer[TInput, TInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(pred.asInstanceOf[js.Any]).asInstanceOf[Transducer[TInput, TInput]]
  
  inline def first[TResult, TInput](): Wrap_[TResult, TInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("first")().asInstanceOf[Wrap_[TResult, TInput]]
  
  inline def identity[T](arg: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(arg.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def into[TInput](empty: String, xf: Transducer[js.Tuple2[String, TInput], String], coll: StringDictionary[TInput]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("into")(empty.asInstanceOf[js.Any], xf.asInstanceOf[js.Any], coll.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def into[TInput](empty: String, xf: Transducer[TInput, String], coll: Iterable[TInput]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("into")(empty.asInstanceOf[js.Any], xf.asInstanceOf[js.Any], coll.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def into[TInput, TOutput](
    empty: js.Array[TOutput],
    xf: Transducer[js.Tuple2[String, TInput], TOutput],
    coll: StringDictionary[TInput]
  ): js.Array[TOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("into")(empty.asInstanceOf[js.Any], xf.asInstanceOf[js.Any], coll.asInstanceOf[js.Any])).asInstanceOf[js.Array[TOutput]]
  inline def into[TInput, TOutput](empty: js.Array[TOutput], xf: Transducer[TInput, TOutput], coll: Iterable[TInput]): js.Array[TOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("into")(empty.asInstanceOf[js.Any], xf.asInstanceOf[js.Any], coll.asInstanceOf[js.Any])).asInstanceOf[js.Array[TOutput]]
  inline def into[TInput, TOutput](
    empty: StringDictionary[TOutput],
    xf: Transducer[js.Tuple2[String, TInput], js.Tuple2[String, TOutput]],
    coll: StringDictionary[TInput]
  ): StringDictionary[TOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("into")(empty.asInstanceOf[js.Any], xf.asInstanceOf[js.Any], coll.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[TOutput]]
  inline def into[TInput, TOutput](
    empty: StringDictionary[TOutput],
    xf: Transducer[TInput, js.Tuple2[String, TOutput]],
    coll: Iterable[TInput]
  ): StringDictionary[TOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("into")(empty.asInstanceOf[js.Any], xf.asInstanceOf[js.Any], coll.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[TOutput]]
  
  inline def isReduced(x: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReduced")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def keep[TInput](f: js.Function1[/* x */ TInput, js.Any]): Transducer[TInput, TInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("keep")(f.asInstanceOf[js.Any]).asInstanceOf[Transducer[TInput, TInput]]
  
  inline def keepIndexed[TInput](f: js.Function2[/* i */ Double, /* x */ TInput, js.Any]): Transducer[TInput, TInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("keepIndexed")(f.asInstanceOf[js.Any]).asInstanceOf[Transducer[TInput, TInput]]
  
  inline def map[TInput, TOutput](f: js.Function1[/* x */ TInput, TOutput]): Transducer[TInput, TOutput] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[Transducer[TInput, TOutput]]
  
  inline def mapcat[TResult, TInput, TOutput](f: js.Function1[/* arr */ TInput, Iterable[TOutput]]): Transducer[TInput, TOutput] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapcat")(f.asInstanceOf[js.Any]).asInstanceOf[Transducer[TInput, TOutput]]
  
  inline def partitionAll[TResult, TInput](n: Double): Transducer[TInput, js.Array[TInput]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partitionAll")(n.asInstanceOf[js.Any]).asInstanceOf[Transducer[TInput, js.Array[TInput]]]
  
  inline def partitionBy[TInput](f: js.Function1[/* input */ TInput, js.Any]): Transducer[TInput, js.Array[TInput]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partitionBy")(f.asInstanceOf[js.Any]).asInstanceOf[Transducer[TInput, js.Array[TInput]]]
  
  inline def reduce[TResult, TInput](xf: Reducer[TResult, js.Tuple2[String, TInput]], init: TResult, coll: StringDictionary[TInput]): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(xf.asInstanceOf[js.Any], init.asInstanceOf[js.Any], coll.asInstanceOf[js.Any])).asInstanceOf[TResult]
  inline def reduce[TResult, TInput](xf: Reducer[TResult, TInput], init: TResult, coll: Iterable[TInput]): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(xf.asInstanceOf[js.Any], init.asInstanceOf[js.Any], coll.asInstanceOf[js.Any])).asInstanceOf[TResult]
  inline def reduce[TResult, TInput](xf: Transformer[TResult, js.Tuple2[String, TInput]], init: TResult, coll: StringDictionary[TInput]): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(xf.asInstanceOf[js.Any], init.asInstanceOf[js.Any], coll.asInstanceOf[js.Any])).asInstanceOf[TResult]
  inline def reduce[TResult, TInput](xf: Transformer[TResult, TInput], init: TResult, coll: Iterable[TInput]): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(xf.asInstanceOf[js.Any], init.asInstanceOf[js.Any], coll.asInstanceOf[js.Any])).asInstanceOf[TResult]
  
  inline def reduce_TResultTCompleteResultTInput_TCompleteResult[TResult, TCompleteResult, TInput](
    xf: CompletingTransformer[TResult, TCompleteResult, js.Tuple2[String, TInput]],
    init: TResult,
    coll: StringDictionary[TInput]
  ): TCompleteResult = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(xf.asInstanceOf[js.Any], init.asInstanceOf[js.Any], coll.asInstanceOf[js.Any])).asInstanceOf[TCompleteResult]
  inline def reduce_TResultTCompleteResultTInput_TCompleteResult[TResult, TCompleteResult, TInput](xf: CompletingTransformer[TResult, TCompleteResult, TInput], init: TResult, coll: Iterable[TInput]): TCompleteResult = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(xf.asInstanceOf[js.Any], init.asInstanceOf[js.Any], coll.asInstanceOf[js.Any])).asInstanceOf[TCompleteResult]
  
  inline def reduced[TResult](x: TResult): Reduced_[TResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("reduced")(x.asInstanceOf[js.Any]).asInstanceOf[Reduced_[TResult]]
  
  inline def remove[TInput](pred: js.Function1[/* x */ TInput, Boolean]): Transducer[TInput, TInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(pred.asInstanceOf[js.Any]).asInstanceOf[Transducer[TInput, TInput]]
  
  inline def take[TInput](n: Double): Transducer[TInput, TInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("take")(n.asInstanceOf[js.Any]).asInstanceOf[Transducer[TInput, TInput]]
  
  inline def takeNth[TInput](n: Double): Transducer[TInput, TInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeNth")(n.asInstanceOf[js.Any]).asInstanceOf[Transducer[TInput, TInput]]
  
  inline def takeWhile[TInput](pred: js.Function1[/* n */ TInput, Boolean]): Transducer[TInput, TInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(pred.asInstanceOf[js.Any]).asInstanceOf[Transducer[TInput, TInput]]
  
  inline def toFn[TResult, TInput, TOutput](xf: Transducer[TInput, TOutput], builder: Reducer[TResult, TOutput]): Reducer[TResult, TOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("toFn")(xf.asInstanceOf[js.Any], builder.asInstanceOf[js.Any])).asInstanceOf[Reducer[TResult, TOutput]]
  inline def toFn[TResult, TInput, TOutput](xf: Transducer[TInput, TOutput], builder: Transformer[TResult, TOutput]): Reducer[TResult, TOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("toFn")(xf.asInstanceOf[js.Any], builder.asInstanceOf[js.Any])).asInstanceOf[Reducer[TResult, TOutput]]
  
  inline def transduce[TResult, TInput, TOutput](
    xf: Transducer[js.Tuple2[String, TInput], TOutput],
    f: Reducer[TResult, TOutput],
    init: TResult,
    coll: StringDictionary[TInput]
  ): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("transduce")(xf.asInstanceOf[js.Any], f.asInstanceOf[js.Any], init.asInstanceOf[js.Any], coll.asInstanceOf[js.Any])).asInstanceOf[TResult]
  inline def transduce[TResult, TInput, TOutput](
    xf: Transducer[TInput, TOutput],
    f: Reducer[TResult, TOutput],
    init: TResult,
    coll: Iterable[TInput]
  ): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("transduce")(xf.asInstanceOf[js.Any], f.asInstanceOf[js.Any], init.asInstanceOf[js.Any], coll.asInstanceOf[js.Any])).asInstanceOf[TResult]
  inline def transduce[TResult, TCompleteResult, TInput, TOutput](
    xf: Transducer[js.Tuple2[String, TInput], TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput],
    coll: StringDictionary[TInput]
  ): TCompleteResult = (^.asInstanceOf[js.Dynamic].applyDynamic("transduce")(xf.asInstanceOf[js.Any], f.asInstanceOf[js.Any], coll.asInstanceOf[js.Any])).asInstanceOf[TCompleteResult]
  inline def transduce[TResult, TCompleteResult, TInput, TOutput](
    xf: Transducer[TInput, TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput],
    coll: Iterable[TInput]
  ): TCompleteResult = (^.asInstanceOf[js.Dynamic].applyDynamic("transduce")(xf.asInstanceOf[js.Any], f.asInstanceOf[js.Any], coll.asInstanceOf[js.Any])).asInstanceOf[TCompleteResult]
  inline def transduce[TResult, TCompleteResult, TInput, TOutput](
    xf: Transducer[js.Tuple2[String, TInput], TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput],
    init: TResult,
    coll: StringDictionary[TInput]
  ): TCompleteResult = (^.asInstanceOf[js.Dynamic].applyDynamic("transduce")(xf.asInstanceOf[js.Any], f.asInstanceOf[js.Any], init.asInstanceOf[js.Any], coll.asInstanceOf[js.Any])).asInstanceOf[TCompleteResult]
  inline def transduce[TResult, TCompleteResult, TInput, TOutput](
    xf: Transducer[TInput, TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput],
    init: TResult,
    coll: Iterable[TInput]
  ): TCompleteResult = (^.asInstanceOf[js.Dynamic].applyDynamic("transduce")(xf.asInstanceOf[js.Any], f.asInstanceOf[js.Any], init.asInstanceOf[js.Any], coll.asInstanceOf[js.Any])).asInstanceOf[TCompleteResult]
  
  inline def unreduced[TResult](x: TResult): TResult = ^.asInstanceOf[js.Dynamic].applyDynamic("unreduced")(x.asInstanceOf[js.Any]).asInstanceOf[TResult]
  inline def unreduced[TResult](x: Reduced_[TResult]): TResult = ^.asInstanceOf[js.Dynamic].applyDynamic("unreduced")(x.asInstanceOf[js.Any]).asInstanceOf[TResult]
  
  inline def wrap[TResult, TInput](stepFn: Reducer[TResult, TInput]): Transformer[TResult, TInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(stepFn.asInstanceOf[js.Any]).asInstanceOf[Transformer[TResult, TInput]]
  
  trait CompletingTransformer[TResult, TCompleteResult, TInput] extends StObject {
    
    @JSName("@@transducer/init")
    def `@@transducerSlashinit`(): TResult | Unit
    
    @JSName("@@transducer/result")
    def `@@transducerSlashresult`(result: TResult): TCompleteResult
    
    @JSName("@@transducer/step")
    def `@@transducerSlashstep`(result: TResult, input: TInput): TResult | Reduced_[TResult]
  }
  object CompletingTransformer {
    
    inline def apply[TResult, TCompleteResult, TInput](
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
    
    extension [Self <: CompletingTransformer[?, ?, ?], TResult, TCompleteResult, TInput](x: Self & (CompletingTransformer[TResult, TCompleteResult, TInput])) {
      
      inline def `set@@transducerSlashinit`(value: () => TResult | Unit): Self = StObject.set(x, "@@transducer/init", js.Any.fromFunction0(value))
      
      inline def `set@@transducerSlashresult`(value: TResult => TCompleteResult): Self = StObject.set(x, "@@transducer/result", js.Any.fromFunction1(value))
      
      inline def `set@@transducerSlashstep`(value: (TResult, TInput) => TResult | Reduced_[TResult]): Self = StObject.set(x, "@@transducer/step", js.Any.fromFunction2(value))
    }
  }
  
  trait Reduced_[TResult] extends StObject {
    
    @JSName("@@transducer/reduced")
    var `@@transducerSlashreduced`: Boolean
    
    @JSName("@@transducer/value")
    var `@@transducerSlashvalue`: TResult
  }
  object Reduced_ {
    
    inline def apply[TResult](`@@transducerSlashreduced`: Boolean, `@@transducerSlashvalue`: TResult): Reduced_[TResult] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@@transducer/reduced")(`@@transducerSlashreduced`.asInstanceOf[js.Any])
      __obj.updateDynamic("@@transducer/value")(`@@transducerSlashvalue`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reduced_[TResult]]
    }
    
    extension [Self <: Reduced_[?], TResult](x: Self & Reduced_[TResult]) {
      
      inline def `set@@transducerSlashreduced`(value: Boolean): Self = StObject.set(x, "@@transducer/reduced", value.asInstanceOf[js.Any])
      
      inline def `set@@transducerSlashvalue`(value: TResult): Self = StObject.set(x, "@@transducer/value", value.asInstanceOf[js.Any])
    }
  }
  
  type Reducer[TResult, TInput] = js.Function2[/* result */ TResult, /* input */ TInput, TResult]
  
  @js.native
  trait Transducer[TInput, TOutput] extends StObject {
    
    def apply[TResult](xf: Transformer[TResult, TOutput]): Transformer[TResult, TInput] = js.native
  }
  
  type Transformer[TResult, TInput] = CompletingTransformer[TResult, TResult, TInput]
}
