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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonka/src/wonka", JSImport.Namespace)
@js.native
object wonkaMod extends js.Object {
  
  def buffer[A](signal: Source[_]): Operator[A, js.Array[A]] = js.native
  
  def combine[A, B](a: Source[A]): js.Function1[/* b */ Source[B], Source[js.Tuple2[A, B]]] = js.native
  
  def concat[A](sources: js.Array[Source[A]]): Source[A] = js.native
  
  def concatAll[A](source: Source[Source[A]]): Source[A] = js.native
  
  def concatMap[A, B](f: js.Function1[/* value */ A, Source[B]]): Operator[A, B] = js.native
  
  def debounce[A](f: js.Function1[/* x */ A, Double]): Operator[A, A] = js.native
  
  def delay[A](duration: Double): Operator[A, A] = js.native
  
  val empty: Source[js.Object] = js.native
  
  def filter[A](f: js.Function1[/* value */ A, Boolean]): Operator[A, A] = js.native
  
  def flatten[A](source: Source[Source[A]]): Source[A] = js.native
  
  def forEach[A](f: js.Function1[/* x */ A, Unit]): js.Function1[/* source */ Source[A], Unit] = js.native
  
  def fromArray[A](array: js.Array[A]): Source[A] = js.native
  
  def fromCallbag[T](callbag: Callbag[Unit, T]): Source[T] = js.native
  
  def fromDomEvent[E](element: HTMLElement, event: String): Source[E] = js.native
  
  def fromList[A](list: List[A]): Source[A] = js.native
  
  def fromListener[E](
    addListener: js.Function1[/* cb */ js.Function1[/* event */ E, Unit], Unit],
    removeListener: js.Function1[/* cb */ js.Function1[/* event */ E, Unit], Unit]
  ): Source[E] = js.native
  
  def fromObservable[T](observable: JsObservable[T]): Source[T] = js.native
  
  def fromPromise[A](promise: js.Promise[A]): Source[A] = js.native
  
  def fromValue[A](value: A): Source[A] = js.native
  
  def interval(interval: Double): Source[Double] = js.native
  
  def make[A](f: js.Function1[/* observer */ Observer[A], js.Function0[Unit]]): Source[A] = js.native
  
  def makeSubject[A](): Subject[A] = js.native
  
  def map[A, B](f: js.Function1[/* value */ A, B]): Operator[A, B] = js.native
  
  def merge[A](sources: js.Array[Source[A]]): Source[A] = js.native
  
  def mergeAll[A](source: Source[Source[A]]): Source[A] = js.native
  
  def mergeMap[A, B](f: js.Function1[/* value */ A, Source[B]]): Operator[A, B] = js.native
  
  val never: Source[js.Object] = js.native
  
  def onEnd[A](f: js.Function1[/* value */ A, Unit]): Operator[A, A] = js.native
  
  def onPush[A](f: js.Function1[/* value */ A, Unit]): Operator[A, A] = js.native
  
  def onStart[A](f: js.Function1[/* value */ A, Unit]): Operator[A, A] = js.native
  
  def publish[A](source: Source[A]): Subscription = js.native
  
  def sample[A](signal: Source[_]): Operator[A, A] = js.native
  
  def scan[A, B](f: js.Function2[/* acc */ B, /* value */ A, B], acc: B): Operator[A, B] = js.native
  
  def share[A](source: Source[A]): Source[A] = js.native
  
  def skip[A](max: Double): Operator[A, A] = js.native
  
  def skipUntil[A](signal: Source[_]): Operator[A, A] = js.native
  
  def skipWhile[A](f: js.Function1[/* x */ A, Boolean]): Operator[A, A] = js.native
  
  def subscribe[A](f: js.Function1[/* x */ A, Unit]): js.Function1[/* source */ Source[A], Subscription] = js.native
  
  def switchAll[A](source: Source[Source[A]]): Source[A] = js.native
  
  def switchMap[A, B](f: js.Function1[/* value */ A, Source[B]]): Operator[A, B] = js.native
  
  def take[A](max: Double): Operator[A, A] = js.native
  
  def takeLast[A](max: Double): Operator[A, A] = js.native
  
  def takeUntil[A](signal: Source[_]): Operator[A, A] = js.native
  
  def takeWhile[A](f: js.Function1[/* x */ A, Boolean]): Operator[A, A] = js.native
  
  def tap[A](f: js.Function1[/* value */ A, Unit]): Operator[A, A] = js.native
  
  def throttle[A](f: js.Function1[/* x */ A, Double]): Operator[A, A] = js.native
  
  def toArray[A](source: Source[A]): js.Array[A] = js.native
  
  def toCallbag[T](source: Source[T]): Callbag[Unit, T] = js.native
  
  def toObservable[T](source: Source[T]): JsObservable[T] = js.native
  
  def toPromise[A](source: Source[A]): js.Promise[A] = js.native
}
