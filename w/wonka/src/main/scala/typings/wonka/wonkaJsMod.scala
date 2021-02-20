package typings.wonka

import typings.std.HTMLElement
import typings.wonka.wonkaCallbagMod.Callbag
import typings.wonka.wonkaObservableMod.JsObservable
import typings.wonka.wonkaTypesMod.Operator
import typings.wonka.wonkaTypesMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaJsMod {
  
  @JSImport("wonka/src/web/wonkaJs", "debounce")
  @js.native
  def debounce[A](f: js.Function1[/* x */ A, Double]): Operator[A, A] = js.native
  
  @JSImport("wonka/src/web/wonkaJs", "delay")
  @js.native
  def delay[A](duration: Double): Operator[A, A] = js.native
  
  @JSImport("wonka/src/web/wonkaJs", "fromCallbag")
  @js.native
  def fromCallbag[T](callbag: Callbag[Unit, T]): Source[T] = js.native
  
  @JSImport("wonka/src/web/wonkaJs", "fromDomEvent")
  @js.native
  def fromDomEvent[E](element: HTMLElement, event: String): Source[E] = js.native
  
  @JSImport("wonka/src/web/wonkaJs", "fromListener")
  @js.native
  def fromListener[E](
    addListener: js.Function1[/* cb */ js.Function1[/* event */ E, Unit], Unit],
    removeListener: js.Function1[/* cb */ js.Function1[/* event */ E, Unit], Unit]
  ): Source[E] = js.native
  
  @JSImport("wonka/src/web/wonkaJs", "fromObservable")
  @js.native
  def fromObservable[T](observable: JsObservable[T]): Source[T] = js.native
  
  @JSImport("wonka/src/web/wonkaJs", "fromPromise")
  @js.native
  def fromPromise[A](promise: js.Promise[A]): Source[A] = js.native
  
  @JSImport("wonka/src/web/wonkaJs", "interval")
  @js.native
  def interval(interval: Double): Source[Double] = js.native
  
  @JSImport("wonka/src/web/wonkaJs", "throttle")
  @js.native
  def throttle[A](f: js.Function1[/* x */ A, Double]): Operator[A, A] = js.native
  
  @JSImport("wonka/src/web/wonkaJs", "toCallbag")
  @js.native
  def toCallbag[T](source: Source[T]): Callbag[Unit, T] = js.native
  
  @JSImport("wonka/src/web/wonkaJs", "toObservable")
  @js.native
  def toObservable[T](source: Source[T]): JsObservable[T] = js.native
  
  @JSImport("wonka/src/web/wonkaJs", "toPromise")
  @js.native
  def toPromise[A](source: Source[A]): js.Promise[A] = js.native
}
