package typings.wonka

import typings.std.HTMLElement
import typings.wonka.wonkaCallbagMod.Callbag
import typings.wonka.wonkaObservableMod.JsObservable
import typings.wonka.wonkaTypesMod.Operator
import typings.wonka.wonkaTypesMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaJsMod {
  
  @JSImport("wonka/src/web/wonkaJs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def debounce[A](f: js.Function1[/* x */ A, Double]): Operator[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(f.asInstanceOf[js.Any]).asInstanceOf[Operator[A, A]]
  
  inline def delay[A](duration: Double): Operator[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(duration.asInstanceOf[js.Any]).asInstanceOf[Operator[A, A]]
  
  inline def fromCallbag[T](callbag: Callbag[Unit, T]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCallbag")(callbag.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def fromDomEvent[E](element: HTMLElement, event: String): Source[E] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDomEvent")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Source[E]]
  
  inline def fromListener[E](
    addListener: js.Function1[/* cb */ js.Function1[/* event */ E, Unit], Unit],
    removeListener: js.Function1[/* cb */ js.Function1[/* event */ E, Unit], Unit]
  ): Source[E] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromListener")(addListener.asInstanceOf[js.Any], removeListener.asInstanceOf[js.Any])).asInstanceOf[Source[E]]
  
  inline def fromObservable[T](observable: JsObservable[T]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObservable")(observable.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def fromPromise[A](promise: js.Promise[A]): Source[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPromise")(promise.asInstanceOf[js.Any]).asInstanceOf[Source[A]]
  
  inline def interval(interval: Double): Source[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("interval")(interval.asInstanceOf[js.Any]).asInstanceOf[Source[Double]]
  
  inline def throttle[A](f: js.Function1[/* x */ A, Double]): Operator[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(f.asInstanceOf[js.Any]).asInstanceOf[Operator[A, A]]
  
  inline def toCallbag[T](source: Source[T]): Callbag[Unit, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toCallbag")(source.asInstanceOf[js.Any]).asInstanceOf[Callbag[Unit, T]]
  
  inline def toObservable[T](source: Source[T]): JsObservable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObservable")(source.asInstanceOf[js.Any]).asInstanceOf[JsObservable[T]]
  
  inline def toPromise[A](source: Source[A]): js.Promise[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("toPromise")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[A]]
}
