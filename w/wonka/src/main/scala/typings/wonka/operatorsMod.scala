package typings.wonka

import typings.wonka.typesMod.Operator
import typings.wonka.typesMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsMod {
  
  @JSImport("wonka/dist/types/operators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buffer[S, T](notifier: Source[S]): Operator[T, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(notifier.asInstanceOf[js.Any]).asInstanceOf[Operator[T, js.Array[T]]]
  
  inline def concat[T](sources: js.Array[Source[T]]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(sources.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def concatAll[T](source: Source[Source[T]]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatAll")(source.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def concatMap[In, Out](map: js.Function1[/* value */ In, Source[Out]]): Operator[In, Out] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatMap")(map.asInstanceOf[js.Any]).asInstanceOf[Operator[In, Out]]
  
  inline def debounce[T](timing: js.Function1[/* value */ T, Double]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(timing.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  inline def delay[T](wait: Double): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(wait.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  inline def filter[T](predicate: js.Function1[/* value */ T, Boolean]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  inline def flatten[T](source: Source[Source[T]]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(source.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def map[In, Out](map: js.Function1[/* value */ In, Out]): Operator[In, Out] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(map.asInstanceOf[js.Any]).asInstanceOf[Operator[In, Out]]
  
  inline def merge[T](sources: js.Array[Source[T]]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(sources.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def mergeAll[T](source: Source[Source[T]]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeAll")(source.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def mergeMap[In, Out](map: js.Function1[/* value */ In, Source[Out]]): Operator[In, Out] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeMap")(map.asInstanceOf[js.Any]).asInstanceOf[Operator[In, Out]]
  
  inline def onEnd[T](callback: js.Function0[Unit]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("onEnd")(callback.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  inline def onPush[T](callback: js.Function1[/* value */ T, Unit]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("onPush")(callback.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  inline def onStart[T](callback: js.Function0[Unit]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("onStart")(callback.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  inline def sample[S, T](notifier: Source[S]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("sample")(notifier.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  inline def scan[In, Out](reducer: js.Function2[/* acc */ Out, /* value */ In, Out], seed: Out): Operator[In, Out] = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(reducer.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Operator[In, Out]]
  
  inline def share[T](source: Source[T]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("share")(source.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def skip[T](wait: Double): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("skip")(wait.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  inline def skipUntil[S, T](notifier: Source[S]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("skipUntil")(notifier.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  inline def skipWhile[T](predicate: js.Function1[/* value */ T, Boolean]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("skipWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  inline def switchAll[T](source: Source[Source[T]]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchAll")(source.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def switchMap[In, Out](map: js.Function1[/* value */ In, Source[Out]]): Operator[In, Out] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchMap")(map.asInstanceOf[js.Any]).asInstanceOf[Operator[In, Out]]
  
  inline def take[T](max: Double): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("take")(max.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  inline def takeLast[T](max: Double): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeLast")(max.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  inline def takeUntil[S, T](notifier: Source[S]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeUntil")(notifier.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  inline def takeWhile[T](predicate: js.Function1[/* value */ T, Boolean]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  inline def tap[T](callback: js.Function1[/* value */ T, Unit]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("tap")(callback.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
  
  inline def throttle[T](timing: js.Function1[/* value */ T, Double]): Operator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(timing.asInstanceOf[js.Any]).asInstanceOf[Operator[T, T]]
}
