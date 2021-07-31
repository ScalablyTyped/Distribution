package typings.wonka

import typings.std.HTMLElement
import typings.wonka.wonkaCallbagMod.Callbag
import typings.wonka.wonkaObservableMod.JsObservable
import typings.wonka.wonkaTypesMod.List
import typings.wonka.wonkaTypesMod.Observer
import typings.wonka.wonkaTypesMod.Operator
import typings.wonka.wonkaTypesMod.Source
import typings.wonka.wonkaTypesMod.Subject
import typings.wonka.wonkaTypesMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaMod {
  
  @JSImport("wonka/src/wonka", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def buffer[A](signal: Source[js.Any]): Operator[A, js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(signal.asInstanceOf[js.Any]).asInstanceOf[Operator[A, js.Array[A]]]
  
  @scala.inline
  def combine[A, B](a: Source[A]): js.Function1[/* b */ Source[B], Source[js.Tuple2[A, B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* b */ Source[B], Source[js.Tuple2[A, B]]]]
  
  @scala.inline
  def concat[A](sources: js.Array[Source[A]]): Source[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(sources.asInstanceOf[js.Any]).asInstanceOf[Source[A]]
  
  @scala.inline
  def concatAll[A](source: Source[Source[A]]): Source[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatAll")(source.asInstanceOf[js.Any]).asInstanceOf[Source[A]]
  
  @scala.inline
  def concatMap[A, B](f: js.Function1[/* value */ A, Source[B]]): Operator[A, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatMap")(f.asInstanceOf[js.Any]).asInstanceOf[Operator[A, B]]
  
  @scala.inline
  def debounce[A](f: js.Function1[/* x */ A, Double]): Operator[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(f.asInstanceOf[js.Any]).asInstanceOf[Operator[A, A]]
  
  @scala.inline
  def delay[A](duration: Double): Operator[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(duration.asInstanceOf[js.Any]).asInstanceOf[Operator[A, A]]
  
  @JSImport("wonka/src/wonka", "empty")
  @js.native
  val empty: Source[js.Object] = js.native
  
  @scala.inline
  def filter[A](f: js.Function1[/* value */ A, Boolean]): Operator[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(f.asInstanceOf[js.Any]).asInstanceOf[Operator[A, A]]
  
  @scala.inline
  def flatten[A](source: Source[Source[A]]): Source[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(source.asInstanceOf[js.Any]).asInstanceOf[Source[A]]
  
  @scala.inline
  def forEach[A](f: js.Function1[/* x */ A, Unit]): js.Function1[/* source */ Source[A], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* source */ Source[A], Unit]]
  
  @scala.inline
  def fromArray[A](array: js.Array[A]): Source[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[Source[A]]
  
  @scala.inline
  def fromCallbag[T](callbag: Callbag[Unit, T]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCallbag")(callbag.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  @scala.inline
  def fromDomEvent[E](element: HTMLElement, event: String): Source[E] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDomEvent")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Source[E]]
  
  @scala.inline
  def fromList[A](list: List[A]): Source[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromList")(list.asInstanceOf[js.Any]).asInstanceOf[Source[A]]
  
  @scala.inline
  def fromListener[E](
    addListener: js.Function1[/* cb */ js.Function1[/* event */ E, Unit], Unit],
    removeListener: js.Function1[/* cb */ js.Function1[/* event */ E, Unit], Unit]
  ): Source[E] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromListener")(addListener.asInstanceOf[js.Any], removeListener.asInstanceOf[js.Any])).asInstanceOf[Source[E]]
  
  @scala.inline
  def fromObservable[T](observable: JsObservable[T]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObservable")(observable.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  @scala.inline
  def fromPromise[A](promise: js.Promise[A]): Source[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPromise")(promise.asInstanceOf[js.Any]).asInstanceOf[Source[A]]
  
  @scala.inline
  def fromValue[A](value: A): Source[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any]).asInstanceOf[Source[A]]
  
  @scala.inline
  def interval(interval: Double): Source[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("interval")(interval.asInstanceOf[js.Any]).asInstanceOf[Source[Double]]
  
  @scala.inline
  def make[A](f: js.Function1[/* observer */ Observer[A], js.Function0[Unit]]): Source[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("make")(f.asInstanceOf[js.Any]).asInstanceOf[Source[A]]
  
  @scala.inline
  def makeSubject[A](): Subject[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSubject")().asInstanceOf[Subject[A]]
  
  @scala.inline
  def map[A, B](f: js.Function1[/* value */ A, B]): Operator[A, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[Operator[A, B]]
  
  @scala.inline
  def merge[A](sources: js.Array[Source[A]]): Source[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(sources.asInstanceOf[js.Any]).asInstanceOf[Source[A]]
  
  @scala.inline
  def mergeAll[A](source: Source[Source[A]]): Source[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeAll")(source.asInstanceOf[js.Any]).asInstanceOf[Source[A]]
  
  @scala.inline
  def mergeMap[A, B](f: js.Function1[/* value */ A, Source[B]]): Operator[A, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeMap")(f.asInstanceOf[js.Any]).asInstanceOf[Operator[A, B]]
  
  @JSImport("wonka/src/wonka", "never")
  @js.native
  val never: Source[js.Object] = js.native
  
  @scala.inline
  def onEnd[A](f: js.Function1[/* value */ A, Unit]): Operator[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("onEnd")(f.asInstanceOf[js.Any]).asInstanceOf[Operator[A, A]]
  
  @scala.inline
  def onPush[A](f: js.Function1[/* value */ A, Unit]): Operator[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("onPush")(f.asInstanceOf[js.Any]).asInstanceOf[Operator[A, A]]
  
  @scala.inline
  def onStart[A](f: js.Function1[/* value */ A, Unit]): Operator[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("onStart")(f.asInstanceOf[js.Any]).asInstanceOf[Operator[A, A]]
  
  @scala.inline
  def publish[A](source: Source[A]): Subscription = ^.asInstanceOf[js.Dynamic].applyDynamic("publish")(source.asInstanceOf[js.Any]).asInstanceOf[Subscription]
  
  @scala.inline
  def sample[A](signal: Source[js.Any]): Operator[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("sample")(signal.asInstanceOf[js.Any]).asInstanceOf[Operator[A, A]]
  
  @scala.inline
  def scan[A, B](f: js.Function2[/* acc */ B, /* value */ A, B], acc: B): Operator[A, B] = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(f.asInstanceOf[js.Any], acc.asInstanceOf[js.Any])).asInstanceOf[Operator[A, B]]
  
  @scala.inline
  def share[A](source: Source[A]): Source[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("share")(source.asInstanceOf[js.Any]).asInstanceOf[Source[A]]
  
  @scala.inline
  def skip[A](max: Double): Operator[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("skip")(max.asInstanceOf[js.Any]).asInstanceOf[Operator[A, A]]
  
  @scala.inline
  def skipUntil[A](signal: Source[js.Any]): Operator[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("skipUntil")(signal.asInstanceOf[js.Any]).asInstanceOf[Operator[A, A]]
  
  @scala.inline
  def skipWhile[A](f: js.Function1[/* x */ A, Boolean]): Operator[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("skipWhile")(f.asInstanceOf[js.Any]).asInstanceOf[Operator[A, A]]
  
  @scala.inline
  def subscribe[A](f: js.Function1[/* x */ A, Unit]): js.Function1[/* source */ Source[A], Subscription] = ^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* source */ Source[A], Subscription]]
  
  @scala.inline
  def switchAll[A](source: Source[Source[A]]): Source[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchAll")(source.asInstanceOf[js.Any]).asInstanceOf[Source[A]]
  
  @scala.inline
  def switchMap[A, B](f: js.Function1[/* value */ A, Source[B]]): Operator[A, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchMap")(f.asInstanceOf[js.Any]).asInstanceOf[Operator[A, B]]
  
  @scala.inline
  def take[A](max: Double): Operator[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("take")(max.asInstanceOf[js.Any]).asInstanceOf[Operator[A, A]]
  
  @scala.inline
  def takeLast[A](max: Double): Operator[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeLast")(max.asInstanceOf[js.Any]).asInstanceOf[Operator[A, A]]
  
  @scala.inline
  def takeUntil[A](signal: Source[js.Any]): Operator[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeUntil")(signal.asInstanceOf[js.Any]).asInstanceOf[Operator[A, A]]
  
  @scala.inline
  def takeWhile[A](f: js.Function1[/* x */ A, Boolean]): Operator[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(f.asInstanceOf[js.Any]).asInstanceOf[Operator[A, A]]
  
  @scala.inline
  def tap[A](f: js.Function1[/* value */ A, Unit]): Operator[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("tap")(f.asInstanceOf[js.Any]).asInstanceOf[Operator[A, A]]
  
  @scala.inline
  def throttle[A](f: js.Function1[/* x */ A, Double]): Operator[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(f.asInstanceOf[js.Any]).asInstanceOf[Operator[A, A]]
  
  @scala.inline
  def toArray[A](source: Source[A]): js.Array[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(source.asInstanceOf[js.Any]).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def toCallbag[T](source: Source[T]): Callbag[Unit, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toCallbag")(source.asInstanceOf[js.Any]).asInstanceOf[Callbag[Unit, T]]
  
  @scala.inline
  def toObservable[T](source: Source[T]): JsObservable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObservable")(source.asInstanceOf[js.Any]).asInstanceOf[JsObservable[T]]
  
  @scala.inline
  def toPromise[A](source: Source[A]): js.Promise[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("toPromise")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[A]]
}
