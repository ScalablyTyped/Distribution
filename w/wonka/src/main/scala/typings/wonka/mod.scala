package typings.wonka

import org.scalablytyped.runtime.StringDictionary
import typings.std.AsyncIterable
import typings.std.Event
import typings.std.HTMLElement
import typings.wonka.distTypesCallbagMod.Callbag
import typings.wonka.distTypesCombineMod.TypeOfSourceArray
import typings.wonka.distTypesObservableMod.Observable
import typings.wonka.distTypesPipeMod.UnaryFn
import typings.wonka.distTypesTypesMod.Observer
import typings.wonka.distTypesTypesMod.Operator
import typings.wonka.distTypesTypesMod.Source
import typings.wonka.distTypesTypesMod.Subject
import typings.wonka.distTypesTypesMod.Subscription
import typings.wonka.distTypesTypesMod.TeardownFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wonka", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buffer[S, T](notifier: Source[S]): Operator[T, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(notifier.asInstanceOf[js.Any]).asInstanceOf[Operator[T, js.Array[T]]]
  
  inline def combine[Sources /* <: js.Array[Source[Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param sources because its type Sources is not an array type */ sources: Sources
  ): Source[TypeOfSourceArray[Sources]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")(sources.asInstanceOf[js.Any]).asInstanceOf[Source[TypeOfSourceArray[Sources]]]
  
  inline def concat[T](sources: js.Array[Source[T]]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(sources.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def concatAll[T](source: Source[Source[T]]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatAll")(source.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def concatMap[In, Out](map: js.Function1[/* value */ In, Source[Out]]): Operator[In, Out] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatMap")(map.asInstanceOf[js.Any]).asInstanceOf[Operator[In, Out]]
  
  inline def debounce[T](timing: js.Function1[/* value */ T, Double]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(timing.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  inline def delay[T](wait: Double): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(wait.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  @JSImport("wonka", "empty")
  @js.native
  val empty: Source[Any] = js.native
  
  inline def filter[T](predicate: js.Function1[/* value */ T, Boolean]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  inline def flatten[T](source: Source[Source[T]]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(source.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def forEach[T](subscriber: js.Function1[/* value */ T, Unit]): js.Function1[/* source */ Source[T], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(subscriber.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* source */ Source[T], Unit]]
  
  inline def fromArray[T](array: js.Array[T]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def fromAsyncIterable[T](iterable: AsyncIterable[T]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAsyncIterable")(iterable.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def fromCallbag[T](callbag: Callbag[Any, T]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCallbag")(callbag.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def fromDomEvent(element: HTMLElement, event: String): Source[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDomEvent")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Source[Event]]
  
  inline def fromIterable[T](iterable: js.Iterable[T]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIterable")(iterable.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  inline def fromIterable[T](iterable: AsyncIterable[T]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIterable")(iterable.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def fromObservable[T](input: Observable[T]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObservable")(input.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def fromPromise[T](promise: js.Promise[T]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPromise")(promise.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def fromValue[T](value: T): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def interval(ms: Double): Source[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("interval")(ms.asInstanceOf[js.Any]).asInstanceOf[Source[Double]]
  
  inline def `lazy`[T](make: js.Function0[Source[T]]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(make.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def make[T](produce: js.Function1[/* observer */ Observer[T], TeardownFn]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("make")(produce.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def makeSubject[T](): Subject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSubject")().asInstanceOf[Subject[T]]
  
  inline def map[In, Out](map: js.Function1[/* value */ In, Out]): Operator[In, Out] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(map.asInstanceOf[js.Any]).asInstanceOf[Operator[In, Out]]
  
  inline def merge[T](sources: js.Array[Source[T]]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(sources.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def mergeAll[T](source: Source[Source[T]]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeAll")(source.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def mergeMap[In, Out](map: js.Function1[/* value */ In, Source[Out]]): Operator[In, Out] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeMap")(map.asInstanceOf[js.Any]).asInstanceOf[Operator[In, Out]]
  
  @JSImport("wonka", "never")
  @js.native
  val never: Source[Any] = js.native
  
  inline def onEnd[T](callback: js.Function0[Unit]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("onEnd")(callback.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  inline def onPush[T](callback: js.Function1[/* value */ T, Unit]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("onPush")(callback.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  inline def onStart[T](callback: js.Function0[Unit]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("onStart")(callback.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  inline def pipe[T, A](source: Source[T], op1: UnaryFn[Source[T], Source[A]]): Source[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], op1.asInstanceOf[js.Any])).asInstanceOf[Source[A]]
  inline def pipe[T, A, R](source: Source[T], op1: UnaryFn[Source[T], Source[A]], consumer: UnaryFn[Source[A], R]): R = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], op1.asInstanceOf[js.Any], consumer.asInstanceOf[js.Any])).asInstanceOf[R]
  inline def pipe[T, A, B, C](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]]
  ): Source[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], op1.asInstanceOf[js.Any], op2.asInstanceOf[js.Any], op3.asInstanceOf[js.Any])).asInstanceOf[Source[C]]
  inline def pipe[T, A, B, C, R](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]],
    consumer: UnaryFn[Source[C], R]
  ): R = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], op1.asInstanceOf[js.Any], op2.asInstanceOf[js.Any], op3.asInstanceOf[js.Any], consumer.asInstanceOf[js.Any])).asInstanceOf[R]
  inline def pipe[T, A, B, C, D, R](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]],
    op4: UnaryFn[Source[C], Source[D]],
    consumer: UnaryFn[Source[D], R]
  ): R = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], op1.asInstanceOf[js.Any], op2.asInstanceOf[js.Any], op3.asInstanceOf[js.Any], op4.asInstanceOf[js.Any], consumer.asInstanceOf[js.Any])).asInstanceOf[R]
  inline def pipe[T, A, B, C, D, E, F](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]],
    op4: UnaryFn[Source[C], Source[D]],
    op5: UnaryFn[Source[D], Source[E]],
    op6: UnaryFn[Source[E], Source[F]]
  ): Source[F] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], op1.asInstanceOf[js.Any], op2.asInstanceOf[js.Any], op3.asInstanceOf[js.Any], op4.asInstanceOf[js.Any], op5.asInstanceOf[js.Any], op6.asInstanceOf[js.Any])).asInstanceOf[Source[F]]
  inline def pipe[T, A, B, C, D, E, F, R](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]],
    op4: UnaryFn[Source[C], Source[D]],
    op5: UnaryFn[Source[D], Source[E]],
    op6: UnaryFn[Source[E], Source[F]],
    consumer: UnaryFn[Source[F], R]
  ): R = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], op1.asInstanceOf[js.Any], op2.asInstanceOf[js.Any], op3.asInstanceOf[js.Any], op4.asInstanceOf[js.Any], op5.asInstanceOf[js.Any], op6.asInstanceOf[js.Any], consumer.asInstanceOf[js.Any])).asInstanceOf[R]
  inline def pipe[T, A, B, C, D, E, F, G, H](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]],
    op4: UnaryFn[Source[C], Source[D]],
    op5: UnaryFn[Source[D], Source[E]],
    op6: UnaryFn[Source[E], Source[F]],
    op7: UnaryFn[Source[F], Source[G]],
    op8: UnaryFn[Source[G], Source[H]]
  ): Source[H] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], op1.asInstanceOf[js.Any], op2.asInstanceOf[js.Any], op3.asInstanceOf[js.Any], op4.asInstanceOf[js.Any], op5.asInstanceOf[js.Any], op6.asInstanceOf[js.Any], op7.asInstanceOf[js.Any], op8.asInstanceOf[js.Any])).asInstanceOf[Source[H]]
  inline def pipe[T, A, B, C, D, E, F, G, H, R](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]],
    op4: UnaryFn[Source[C], Source[D]],
    op5: UnaryFn[Source[D], Source[E]],
    op6: UnaryFn[Source[E], Source[F]],
    op7: UnaryFn[Source[F], Source[G]],
    op8: UnaryFn[Source[G], Source[H]],
    consumer: UnaryFn[Source[H], R]
  ): R = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], op1.asInstanceOf[js.Any], op2.asInstanceOf[js.Any], op3.asInstanceOf[js.Any], op4.asInstanceOf[js.Any], op5.asInstanceOf[js.Any], op6.asInstanceOf[js.Any], op7.asInstanceOf[js.Any], op8.asInstanceOf[js.Any], consumer.asInstanceOf[js.Any])).asInstanceOf[R]
  
  inline def pipe_TABCDEFGR_R[T, A, B, C, D, E, F, G, R](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]],
    op4: UnaryFn[Source[C], Source[D]],
    op5: UnaryFn[Source[D], Source[E]],
    op6: UnaryFn[Source[E], Source[F]],
    op7: UnaryFn[Source[F], Source[G]],
    consumer: UnaryFn[Source[G], R]
  ): R = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], op1.asInstanceOf[js.Any], op2.asInstanceOf[js.Any], op3.asInstanceOf[js.Any], op4.asInstanceOf[js.Any], op5.asInstanceOf[js.Any], op6.asInstanceOf[js.Any], op7.asInstanceOf[js.Any], consumer.asInstanceOf[js.Any])).asInstanceOf[R]
  
  inline def pipe_TABCDEFG_Source[T, A, B, C, D, E, F, G](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]],
    op4: UnaryFn[Source[C], Source[D]],
    op5: UnaryFn[Source[D], Source[E]],
    op6: UnaryFn[Source[E], Source[F]],
    op7: UnaryFn[Source[F], Source[G]]
  ): Source[G] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], op1.asInstanceOf[js.Any], op2.asInstanceOf[js.Any], op3.asInstanceOf[js.Any], op4.asInstanceOf[js.Any], op5.asInstanceOf[js.Any], op6.asInstanceOf[js.Any], op7.asInstanceOf[js.Any])).asInstanceOf[Source[G]]
  
  inline def pipe_TABCDER_R[T, A, B, C, D, E, R](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]],
    op4: UnaryFn[Source[C], Source[D]],
    op5: UnaryFn[Source[D], Source[E]],
    consumer: UnaryFn[Source[E], R]
  ): R = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], op1.asInstanceOf[js.Any], op2.asInstanceOf[js.Any], op3.asInstanceOf[js.Any], op4.asInstanceOf[js.Any], op5.asInstanceOf[js.Any], consumer.asInstanceOf[js.Any])).asInstanceOf[R]
  
  inline def pipe_TABCDE_Source[T, A, B, C, D, E](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]],
    op4: UnaryFn[Source[C], Source[D]],
    op5: UnaryFn[Source[D], Source[E]]
  ): Source[E] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], op1.asInstanceOf[js.Any], op2.asInstanceOf[js.Any], op3.asInstanceOf[js.Any], op4.asInstanceOf[js.Any], op5.asInstanceOf[js.Any])).asInstanceOf[Source[E]]
  
  inline def pipe_TABCD_Source[T, A, B, C, D](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]],
    op4: UnaryFn[Source[C], Source[D]]
  ): Source[D] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], op1.asInstanceOf[js.Any], op2.asInstanceOf[js.Any], op3.asInstanceOf[js.Any], op4.asInstanceOf[js.Any])).asInstanceOf[Source[D]]
  
  inline def pipe_TABR_R[T, A, B, R](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    consumer: UnaryFn[Source[B], R]
  ): R = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], op1.asInstanceOf[js.Any], op2.asInstanceOf[js.Any], consumer.asInstanceOf[js.Any])).asInstanceOf[R]
  
  inline def pipe_TAB_Source[T, A, B](source: Source[T], op1: UnaryFn[Source[T], Source[A]], op2: UnaryFn[Source[A], Source[B]]): Source[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], op1.asInstanceOf[js.Any], op2.asInstanceOf[js.Any])).asInstanceOf[Source[B]]
  
  inline def pipe_TR_R[T, R](source: Source[T], consumer: UnaryFn[Source[T], R]): R = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], consumer.asInstanceOf[js.Any])).asInstanceOf[R]
  
  inline def publish[T](source: Source[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("publish")(source.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def sample[S, T](notifier: Source[S]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("sample")(notifier.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  inline def scan[In, Out](reducer: js.Function2[/* acc */ Out, /* value */ In, Out], seed: Out): Operator[In, Out] = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(reducer.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Operator[In, Out]]
  
  inline def share[T](source: Source[T]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("share")(source.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def skip[T](wait: Double): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("skip")(wait.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  inline def skipUntil[S, T](notifier: Source[S]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("skipUntil")(notifier.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  inline def skipWhile[T](predicate: js.Function1[/* value */ T, Boolean]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("skipWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  inline def subscribe[T](subscriber: js.Function1[/* value */ T, Unit]): js.Function1[/* source */ Source[T], Subscription] = ^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(subscriber.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* source */ Source[T], Subscription]]
  
  inline def switchAll[T](source: Source[Source[T]]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchAll")(source.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def switchMap[In, Out](map: js.Function1[/* value */ In, Source[Out]]): Operator[In, Out] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchMap")(map.asInstanceOf[js.Any]).asInstanceOf[Operator[In, Out]]
  
  inline def take[T](max: Double): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("take")(max.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  inline def takeLast[T](max: Double): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeLast")(max.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  inline def takeUntil[S, T](notifier: Source[S]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeUntil")(notifier.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  inline def takeWhile[T](predicate: js.Function1[/* value */ T, Boolean]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  inline def tap[T](callback: js.Function1[/* value */ T, Unit]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("tap")(callback.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  inline def throttle[T](timing: js.Function1[/* value */ T, Double]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(timing.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  inline def toArray[T](source: Source[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(source.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def toCallbag[T](source: Source[T]): Callbag[Any, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toCallbag")(source.asInstanceOf[js.Any]).asInstanceOf[Callbag[Any, T]]
  
  inline def toObservable[T](source: Source[T]): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObservable")(source.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  
  inline def toPromise[T](source: Source[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toPromise")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  inline def zip[Sources /* <: StringDictionary[Source[Any]] */](sources: Sources): Source[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ Property in keyof Sources ]: wonka.wonka/dist/types/types.TypeOfSource<Sources[Property]>} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(sources.asInstanceOf[js.Any]).asInstanceOf[Source[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ Property in keyof Sources ]: wonka.wonka/dist/types/types.TypeOfSource<Sources[Property]>} */ js.Any
  ]]
  inline def zip[Sources /* <: Array[Source[Any]] */](
    sources: /* import warning: importer.ImportType#apply c repeated non-array type: Sources */ js.Array[Sources]
  ): Source[TypeOfSourceArray[Sources]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(sources.asInstanceOf[js.Any]).asInstanceOf[Source[TypeOfSourceArray[Sources]]]
}
