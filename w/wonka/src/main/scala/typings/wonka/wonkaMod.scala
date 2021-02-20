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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaMod {
  
  @JSImport("wonka/src/wonka", "buffer")
  @js.native
  def buffer[A](signal: Source[_]): Operator[A, js.Array[A]] = js.native
  
  @JSImport("wonka/src/wonka", "combine")
  @js.native
  def combine[A, B](a: Source[A]): js.Function1[/* b */ Source[B], Source[js.Tuple2[A, B]]] = js.native
  
  @JSImport("wonka/src/wonka", "concat")
  @js.native
  def concat[A](sources: js.Array[Source[A]]): Source[A] = js.native
  
  @JSImport("wonka/src/wonka", "concatAll")
  @js.native
  def concatAll[A](source: Source[Source[A]]): Source[A] = js.native
  
  @JSImport("wonka/src/wonka", "concatMap")
  @js.native
  def concatMap[A, B](f: js.Function1[/* value */ A, Source[B]]): Operator[A, B] = js.native
  
  @JSImport("wonka/src/wonka", "debounce")
  @js.native
  def debounce[A](f: js.Function1[/* x */ A, Double]): Operator[A, A] = js.native
  
  @JSImport("wonka/src/wonka", "delay")
  @js.native
  def delay[A](duration: Double): Operator[A, A] = js.native
  
  @JSImport("wonka/src/wonka", "empty")
  @js.native
  val empty: Source[js.Object] = js.native
  
  @JSImport("wonka/src/wonka", "filter")
  @js.native
  def filter[A](f: js.Function1[/* value */ A, Boolean]): Operator[A, A] = js.native
  
  @JSImport("wonka/src/wonka", "flatten")
  @js.native
  def flatten[A](source: Source[Source[A]]): Source[A] = js.native
  
  @JSImport("wonka/src/wonka", "forEach")
  @js.native
  def forEach[A](f: js.Function1[/* x */ A, Unit]): js.Function1[/* source */ Source[A], Unit] = js.native
  
  @JSImport("wonka/src/wonka", "fromArray")
  @js.native
  def fromArray[A](array: js.Array[A]): Source[A] = js.native
  
  @JSImport("wonka/src/wonka", "fromCallbag")
  @js.native
  def fromCallbag[T](callbag: Callbag[Unit, T]): Source[T] = js.native
  
  @JSImport("wonka/src/wonka", "fromDomEvent")
  @js.native
  def fromDomEvent[E](element: HTMLElement, event: String): Source[E] = js.native
  
  @JSImport("wonka/src/wonka", "fromList")
  @js.native
  def fromList[A](list: List[A]): Source[A] = js.native
  
  @JSImport("wonka/src/wonka", "fromListener")
  @js.native
  def fromListener[E](
    addListener: js.Function1[/* cb */ js.Function1[/* event */ E, Unit], Unit],
    removeListener: js.Function1[/* cb */ js.Function1[/* event */ E, Unit], Unit]
  ): Source[E] = js.native
  
  @JSImport("wonka/src/wonka", "fromObservable")
  @js.native
  def fromObservable[T](observable: JsObservable[T]): Source[T] = js.native
  
  @JSImport("wonka/src/wonka", "fromPromise")
  @js.native
  def fromPromise[A](promise: js.Promise[A]): Source[A] = js.native
  
  @JSImport("wonka/src/wonka", "fromValue")
  @js.native
  def fromValue[A](value: A): Source[A] = js.native
  
  @JSImport("wonka/src/wonka", "interval")
  @js.native
  def interval(interval: Double): Source[Double] = js.native
  
  @JSImport("wonka/src/wonka", "make")
  @js.native
  def make[A](f: js.Function1[/* observer */ Observer[A], js.Function0[Unit]]): Source[A] = js.native
  
  @JSImport("wonka/src/wonka", "makeSubject")
  @js.native
  def makeSubject[A](): Subject[A] = js.native
  
  @JSImport("wonka/src/wonka", "map")
  @js.native
  def map[A, B](f: js.Function1[/* value */ A, B]): Operator[A, B] = js.native
  
  @JSImport("wonka/src/wonka", "merge")
  @js.native
  def merge[A](sources: js.Array[Source[A]]): Source[A] = js.native
  
  @JSImport("wonka/src/wonka", "mergeAll")
  @js.native
  def mergeAll[A](source: Source[Source[A]]): Source[A] = js.native
  
  @JSImport("wonka/src/wonka", "mergeMap")
  @js.native
  def mergeMap[A, B](f: js.Function1[/* value */ A, Source[B]]): Operator[A, B] = js.native
  
  @JSImport("wonka/src/wonka", "never")
  @js.native
  val never: Source[js.Object] = js.native
  
  @JSImport("wonka/src/wonka", "onEnd")
  @js.native
  def onEnd[A](f: js.Function1[/* value */ A, Unit]): Operator[A, A] = js.native
  
  @JSImport("wonka/src/wonka", "onPush")
  @js.native
  def onPush[A](f: js.Function1[/* value */ A, Unit]): Operator[A, A] = js.native
  
  @JSImport("wonka/src/wonka", "onStart")
  @js.native
  def onStart[A](f: js.Function1[/* value */ A, Unit]): Operator[A, A] = js.native
  
  @JSImport("wonka/src/wonka", "publish")
  @js.native
  def publish[A](source: Source[A]): Subscription = js.native
  
  @JSImport("wonka/src/wonka", "sample")
  @js.native
  def sample[A](signal: Source[_]): Operator[A, A] = js.native
  
  @JSImport("wonka/src/wonka", "scan")
  @js.native
  def scan[A, B](f: js.Function2[/* acc */ B, /* value */ A, B], acc: B): Operator[A, B] = js.native
  
  @JSImport("wonka/src/wonka", "share")
  @js.native
  def share[A](source: Source[A]): Source[A] = js.native
  
  @JSImport("wonka/src/wonka", "skip")
  @js.native
  def skip[A](max: Double): Operator[A, A] = js.native
  
  @JSImport("wonka/src/wonka", "skipUntil")
  @js.native
  def skipUntil[A](signal: Source[_]): Operator[A, A] = js.native
  
  @JSImport("wonka/src/wonka", "skipWhile")
  @js.native
  def skipWhile[A](f: js.Function1[/* x */ A, Boolean]): Operator[A, A] = js.native
  
  @JSImport("wonka/src/wonka", "subscribe")
  @js.native
  def subscribe[A](f: js.Function1[/* x */ A, Unit]): js.Function1[/* source */ Source[A], Subscription] = js.native
  
  @JSImport("wonka/src/wonka", "switchAll")
  @js.native
  def switchAll[A](source: Source[Source[A]]): Source[A] = js.native
  
  @JSImport("wonka/src/wonka", "switchMap")
  @js.native
  def switchMap[A, B](f: js.Function1[/* value */ A, Source[B]]): Operator[A, B] = js.native
  
  @JSImport("wonka/src/wonka", "take")
  @js.native
  def take[A](max: Double): Operator[A, A] = js.native
  
  @JSImport("wonka/src/wonka", "takeLast")
  @js.native
  def takeLast[A](max: Double): Operator[A, A] = js.native
  
  @JSImport("wonka/src/wonka", "takeUntil")
  @js.native
  def takeUntil[A](signal: Source[_]): Operator[A, A] = js.native
  
  @JSImport("wonka/src/wonka", "takeWhile")
  @js.native
  def takeWhile[A](f: js.Function1[/* x */ A, Boolean]): Operator[A, A] = js.native
  
  @JSImport("wonka/src/wonka", "tap")
  @js.native
  def tap[A](f: js.Function1[/* value */ A, Unit]): Operator[A, A] = js.native
  
  @JSImport("wonka/src/wonka", "throttle")
  @js.native
  def throttle[A](f: js.Function1[/* x */ A, Double]): Operator[A, A] = js.native
  
  @JSImport("wonka/src/wonka", "toArray")
  @js.native
  def toArray[A](source: Source[A]): js.Array[A] = js.native
  
  @JSImport("wonka/src/wonka", "toCallbag")
  @js.native
  def toCallbag[T](source: Source[T]): Callbag[Unit, T] = js.native
  
  @JSImport("wonka/src/wonka", "toObservable")
  @js.native
  def toObservable[T](source: Source[T]): JsObservable[T] = js.native
  
  @JSImport("wonka/src/wonka", "toPromise")
  @js.native
  def toPromise[A](source: Source[A]): js.Promise[A] = js.native
}
