package typings.transducersJs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.std.IterableIterator
import typings.transducersJs.transducersJsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("transducers.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("transducers.js", "LazyTransformer")
  @js.native
  open class LazyTransformer[TInput, TOutput] protected ()
    extends StObject
       with IterableIterator[TOutput] {
    def this(xf: Transducer[TInput, TOutput], coll: js.Iterable[TInput]) = this()
  }
  @JSImport("transducers.js", "LazyTransformer")
  @js.native
  val LazyTransformer: LazyTransformerConstructor = js.native
  
  trait Reduced[T] extends StObject {
    
    @JSName("@@transducer/reduced")
    var `@@transducerSlashreduced`: `true`
    
    @JSName("@@transducer/value")
    var `@@transducerSlashvalue`: T
  }
  object Reduced {
    
    @JSImport("transducers.js", "Reduced")
    @js.native
    val ^ : ReducedConstructor = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Reduced[?], T] (val x: Self & Reduced[T]) extends AnyVal {
      
      inline def `set@@transducerSlashreduced`(value: `true`): Self = StObject.set(x, "@@transducer/reduced", value.asInstanceOf[js.Any])
      
      inline def `set@@transducerSlashvalue`(value: T): Self = StObject.set(x, "@@transducer/value", value.asInstanceOf[js.Any])
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("transducers.js", "Reduced")
  @js.native
  open class ReducedCls[T] protected ()
    extends StObject
       with Reduced[T] {
    def this(value: T) = this()
    
    /* CompleteClass */
    @JSName("@@transducer/reduced")
    var `@@transducerSlashreduced`: `true` = js.native
    
    /* CompleteClass */
    @JSName("@@transducer/value")
    var `@@transducerSlashvalue`: T = js.native
  }
  
  inline def cat[TResult, TInput](f: Transformer_[TResult, TInput]): Transformer_[TResult, js.Iterable[TInput]] = ^.asInstanceOf[js.Dynamic].applyDynamic("cat")(f.asInstanceOf[js.Any]).asInstanceOf[Transformer_[TResult, js.Iterable[TInput]]]
  
  inline def compose(fs: (js.Function1[/* x */ Any, Any])*): js.Function1[/* x */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(fs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[/* x */ Any, Any]]
  
  inline def dedupe[TInput](): Transducer[TInput, TInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("dedupe")().asInstanceOf[Transducer[TInput, TInput]]
  
  inline def drop[TInput](n: Double): Transducer[TInput, TInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("drop")(n.asInstanceOf[js.Any]).asInstanceOf[Transducer[TInput, TInput]]
  
  inline def dropWhile[TInput](pred: js.Function1[/* x */ TInput, Boolean]): Transducer[TInput, TInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("dropWhile")(pred.asInstanceOf[js.Any]).asInstanceOf[Transducer[TInput, TInput]]
  
  inline def filter[TInput](pred: js.Function1[/* x */ TInput, Boolean]): Transducer[TInput, TInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(pred.asInstanceOf[js.Any]).asInstanceOf[Transducer[TInput, TInput]]
  
  inline def interpose[TInput](sep: TInput): Transducer[TInput, TInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("interpose")(sep.asInstanceOf[js.Any]).asInstanceOf[Transducer[TInput, TInput]]
  
  inline def into[TInput](to: String, xf: Transducer[TInput, String], from: js.Iterable[TInput]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("into")(to.asInstanceOf[js.Any], xf.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def into[TInput, TOutput](to: js.Array[TOutput], xf: Transducer[TInput, TOutput], from: js.Iterable[TInput]): js.Array[TOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("into")(to.asInstanceOf[js.Any], xf.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[js.Array[TOutput]]
  inline def into[TInput, TOutput](
    to: StringDictionary[TOutput],
    xf: Transducer[TInput, js.Tuple2[String, TOutput]],
    from: js.Iterable[TInput]
  ): StringDictionary[TOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("into")(to.asInstanceOf[js.Any], xf.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[TOutput]]
  
  inline def isReduced(x: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReduced")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def iterator[T](coll: js.Iterable[T]): IterableIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("iterator")(coll.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[T]]
  
  inline def keep[TInput](): Transducer[js.UndefOr[TInput | Null], TInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("keep")().asInstanceOf[Transducer[js.UndefOr[TInput | Null], TInput]]
  
  inline def map[TInput, TOutput](f: js.Function1[/* x */ TInput, TOutput]): Transducer[TInput, TOutput] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[Transducer[TInput, TOutput]]
  
  inline def mapcat[TInput, TOutput](f: js.Function1[/* x */ TInput, js.Iterable[TOutput]]): Transducer[TInput, TOutput] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapcat")(f.asInstanceOf[js.Any]).asInstanceOf[Transducer[TInput, TOutput]]
  
  inline def partition[TInput](n: Double): Transducer[TInput, js.Array[TInput]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(n.asInstanceOf[js.Any]).asInstanceOf[Transducer[TInput, js.Array[TInput]]]
  
  inline def partitionBy[TInput](f: js.Function1[/* x */ TInput, Any]): Transducer[TInput, js.Array[TInput]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partitionBy")(f.asInstanceOf[js.Any]).asInstanceOf[Transducer[TInput, js.Array[TInput]]]
  
  inline def push[T](arr: js.Array[T], x: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(arr.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def range(n: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(n.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def reduce[TResult, TInput](coll: js.Iterable[TInput], xf: Transformer_[TResult, TInput], init: TResult): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(coll.asInstanceOf[js.Any], xf.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[TResult]
  inline def reduce[TResult, TInput](
    coll: StringDictionary[TInput],
    xf: Transformer_[TResult, js.Tuple2[String, TInput]],
    init: TResult
  ): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(coll.asInstanceOf[js.Any], xf.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[TResult]
  
  inline def reduce_TResultTCompleteResultTInput_TCompleteResult[TResult, TCompleteResult, TInput](
    coll: js.Iterable[TInput],
    xf: CompletingTransformer[TResult, TCompleteResult, TInput],
    init: TResult
  ): TCompleteResult = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(coll.asInstanceOf[js.Any], xf.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[TCompleteResult]
  inline def reduce_TResultTCompleteResultTInput_TCompleteResult[TResult, TCompleteResult, TInput](
    coll: StringDictionary[TInput],
    xf: CompletingTransformer[TResult, TCompleteResult, js.Tuple2[String, TInput]],
    init: TResult
  ): TCompleteResult = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(coll.asInstanceOf[js.Any], xf.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[TCompleteResult]
  
  inline def remove[TInput](pred: js.Function1[/* x */ TInput, Boolean]): Transducer[TInput, TInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(pred.asInstanceOf[js.Any]).asInstanceOf[Transducer[TInput, TInput]]
  
  inline def repeat[TInput](n: Double): Transducer[TInput, TInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(n.asInstanceOf[js.Any]).asInstanceOf[Transducer[TInput, TInput]]
  
  inline def seq[TInput, TOutput](coll: js.Array[TInput], xf: Transducer[TInput, TOutput]): js.Array[TOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("seq")(coll.asInstanceOf[js.Any], xf.asInstanceOf[js.Any])).asInstanceOf[js.Array[TOutput]]
  inline def seq[TInput, TOutput](coll: js.Iterable[TInput], xf: Transducer[TInput, TOutput]): IterableIterator[TOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("seq")(coll.asInstanceOf[js.Any], xf.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[TOutput]]
  inline def seq[TInput, TOutput](
    coll: StringDictionary[TInput],
    xf: Transducer[js.Tuple2[String, TInput], js.Tuple2[String, TOutput]]
  ): StringDictionary[TOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("seq")(coll.asInstanceOf[js.Any], xf.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[TOutput]]
  
  inline def take[TInput](n: Double): Transducer[TInput, TInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("take")(n.asInstanceOf[js.Any]).asInstanceOf[Transducer[TInput, TInput]]
  
  inline def takeNth[TInput](n: Double): Transducer[TInput, TInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeNth")(n.asInstanceOf[js.Any]).asInstanceOf[Transducer[TInput, TInput]]
  
  inline def takeWhile[TInput](pred: js.Function1[/* x */ TInput, Boolean]): Transducer[TInput, TInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(pred.asInstanceOf[js.Any]).asInstanceOf[Transducer[TInput, TInput]]
  
  inline def toArray[TInput, TOutput](coll: js.Iterable[TInput]): js.Array[TOutput] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(coll.asInstanceOf[js.Any]).asInstanceOf[js.Array[TOutput]]
  inline def toArray[TInput, TOutput](coll: js.Iterable[TInput], xf: Transducer[TInput, TOutput]): js.Array[TOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(coll.asInstanceOf[js.Any], xf.asInstanceOf[js.Any])).asInstanceOf[js.Array[TOutput]]
  inline def toArray[TInput, TOutput](coll: StringDictionary[TInput]): js.Array[TOutput] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(coll.asInstanceOf[js.Any]).asInstanceOf[js.Array[TOutput]]
  inline def toArray[TInput, TOutput](coll: StringDictionary[TInput], xf: Transducer[js.Tuple2[String, TInput], TOutput]): js.Array[TOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(coll.asInstanceOf[js.Any], xf.asInstanceOf[js.Any])).asInstanceOf[js.Array[TOutput]]
  
  inline def toIter[TInput, TOutput](coll: js.Iterable[TInput]): IterableIterator[TOutput] = ^.asInstanceOf[js.Dynamic].applyDynamic("toIter")(coll.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[TOutput]]
  inline def toIter[TInput, TOutput](coll: js.Iterable[TInput], xf: Transducer[TInput, TOutput]): IterableIterator[TOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIter")(coll.asInstanceOf[js.Any], xf.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[TOutput]]
  inline def toIter[TInput, TOutput](coll: StringDictionary[TInput]): IterableIterator[TOutput] = ^.asInstanceOf[js.Dynamic].applyDynamic("toIter")(coll.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[TOutput]]
  inline def toIter[TInput, TOutput](coll: StringDictionary[TInput], xf: Transducer[js.Tuple2[String, TInput], TOutput]): IterableIterator[TOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIter")(coll.asInstanceOf[js.Any], xf.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[TOutput]]
  
  inline def toObj[TInput, TOutput](coll: js.Iterable[TInput]): StringDictionary[TOutput] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObj")(coll.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[TOutput]]
  inline def toObj[TInput, TOutput](coll: js.Iterable[TInput], xf: Transducer[TInput, js.Tuple2[String, TOutput]]): StringDictionary[TOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObj")(coll.asInstanceOf[js.Any], xf.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[TOutput]]
  inline def toObj[TInput, TOutput](
    coll: StringDictionary[TInput],
    xf: Transducer[js.Tuple2[String, TInput], js.Tuple2[String, TOutput]]
  ): StringDictionary[TOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObj")(coll.asInstanceOf[js.Any], xf.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[TOutput]]
  
  inline def transduce[TResult, TInput, TOutput](
    coll: js.Iterable[TInput],
    xf: Transducer[TInput, TOutput],
    f: Reducer[TResult, TOutput],
    init: TResult
  ): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("transduce")(coll.asInstanceOf[js.Any], xf.asInstanceOf[js.Any], f.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[TResult]
  inline def transduce[TResult, TInput, TOutput](
    coll: StringDictionary[TInput],
    xf: Transducer[js.Tuple2[String, TInput], TOutput],
    f: Reducer[TResult, TOutput],
    init: TResult
  ): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("transduce")(coll.asInstanceOf[js.Any], xf.asInstanceOf[js.Any], f.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[TResult]
  inline def transduce[TResult, TCompleteResult, TInput, TOutput](
    coll: js.Iterable[TInput],
    xf: Transducer[TInput, TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput]
  ): TCompleteResult = (^.asInstanceOf[js.Dynamic].applyDynamic("transduce")(coll.asInstanceOf[js.Any], xf.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[TCompleteResult]
  inline def transduce[TResult, TCompleteResult, TInput, TOutput](
    coll: js.Iterable[TInput],
    xf: Transducer[TInput, TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput],
    init: TResult
  ): TCompleteResult = (^.asInstanceOf[js.Dynamic].applyDynamic("transduce")(coll.asInstanceOf[js.Any], xf.asInstanceOf[js.Any], f.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[TCompleteResult]
  inline def transduce[TResult, TCompleteResult, TInput, TOutput](
    coll: StringDictionary[TInput],
    xf: Transducer[js.Tuple2[String, TInput], TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput]
  ): TCompleteResult = (^.asInstanceOf[js.Dynamic].applyDynamic("transduce")(coll.asInstanceOf[js.Any], xf.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[TCompleteResult]
  inline def transduce[TResult, TCompleteResult, TInput, TOutput](
    coll: StringDictionary[TInput],
    xf: Transducer[js.Tuple2[String, TInput], TOutput],
    f: CompletingTransformer[TResult, TCompleteResult, TOutput],
    init: TResult
  ): TCompleteResult = (^.asInstanceOf[js.Dynamic].applyDynamic("transduce")(coll.asInstanceOf[js.Any], xf.asInstanceOf[js.Any], f.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[TCompleteResult]
  
  inline def transformer[TResult, TInput](reducer: Reducer[TResult, TInput]): Transformer_[TResult, TInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformer")(reducer.asInstanceOf[js.Any]).asInstanceOf[Transformer_[TResult, TInput]]
  
  trait CompletingTransformer[TResult, TCompleteResult, TInput] extends StObject {
    
    @JSName("@@transducer/init")
    def `@@transducerSlashinit`(): TResult | Unit
    
    @JSName("@@transducer/result")
    def `@@transducerSlashresult`(result: TResult): TCompleteResult
    
    @JSName("@@transducer/step")
    def `@@transducerSlashstep`(result: TResult, input: TInput): TResult | Reduced[TResult]
  }
  object CompletingTransformer {
    
    inline def apply[TResult, TCompleteResult, TInput](
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
    implicit open class MutableBuilder[Self <: CompletingTransformer[?, ?, ?], TResult, TCompleteResult, TInput] (val x: Self & (CompletingTransformer[TResult, TCompleteResult, TInput])) extends AnyVal {
      
      inline def `set@@transducerSlashinit`(value: () => TResult | Unit): Self = StObject.set(x, "@@transducer/init", js.Any.fromFunction0(value))
      
      inline def `set@@transducerSlashresult`(value: TResult => TCompleteResult): Self = StObject.set(x, "@@transducer/result", js.Any.fromFunction1(value))
      
      inline def `set@@transducerSlashstep`(value: (TResult, TInput) => TResult | Reduced[TResult]): Self = StObject.set(x, "@@transducer/step", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait LazyTransformerConstructor
    extends StObject
       with Instantiable2[
          /* xf */ Transducer[js.Object, js.Object], 
          /* coll */ js.Iterable[js.Object], 
          IterableIterator[js.Object]
        ]
  
  @js.native
  trait ReducedConstructor
    extends StObject
       with Instantiable1[/* value */ js.Object, Reduced[js.Object]]
  
  type Reducer[TResult, TInput] = js.Function2[/* result */ TResult, /* input */ TInput, TResult]
  
  type Transducer[TInput, TOutput] = js.Function1[/* xf */ Transformer_[Any, TOutput], Transformer_[Any, TInput]]
  
  type Transformer_[TResult, TInput] = CompletingTransformer[TResult, TResult, TInput]
}
