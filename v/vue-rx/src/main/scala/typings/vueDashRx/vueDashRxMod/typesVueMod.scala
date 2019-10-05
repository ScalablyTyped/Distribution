package typings.vueDashRx.vueDashRxMod

import typings.rxjs.rxjsMod.Observable
import typings.std.Event
import typings.vue.typesOptionsMod.WatchOptions
import typings.vueDashRx.Anon_Msg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue/types/vue", JSImport.Namespace)
@js.native
object typesVueMod extends js.Object {
  @js.native
  trait Vue extends js.Object {
    @JSName("$observables")
    var $observables: Observables = js.native
    @JSName("$createObservableMethod")
    def $createObservableMethod(methodName: String): Observable[_] = js.native
    @JSName("$eventToObservable")
    def $eventToObservable(event: String): Observable[Anon_Msg] = js.native
    @JSName("$fromDOMEvent")
    def $fromDOMEvent(selector: String, event: String): Observable[Event] = js.native
    @JSName("$fromDOMEvent")
    def $fromDOMEvent(selector: Null, event: String): Observable[Event] = js.native
    @JSName("$subscribeTo")
    def $subscribeTo[T](observable: Observable[T], next: js.Function1[/* t */ T, Unit]): Unit = js.native
    @JSName("$subscribeTo")
    def $subscribeTo[T](
      observable: Observable[T],
      next: js.Function1[/* t */ T, Unit],
      error: js.Function1[/* e */ js.Any, Unit]
    ): Unit = js.native
    @JSName("$subscribeTo")
    def $subscribeTo[T](
      observable: Observable[T],
      next: js.Function1[/* t */ T, Unit],
      error: js.Function1[/* e */ js.Any, Unit],
      complete: js.Function0[Unit]
    ): Unit = js.native
    @JSName("$watchAsObservable")
    def $watchAsObservable(expr: String): Observable[WatchObservable[_]] = js.native
    @JSName("$watchAsObservable")
    def $watchAsObservable(expr: String, options: WatchOptions): Observable[WatchObservable[_]] = js.native
    @JSName("$watchAsObservable")
    def $watchAsObservable[T](fn: js.ThisFunction0[/* this */ this.type, T]): Observable[WatchObservable[T]] = js.native
    @JSName("$watchAsObservable")
    def $watchAsObservable[T](fn: js.ThisFunction0[/* this */ this.type, T], options: WatchOptions): Observable[WatchObservable[T]] = js.native
  }
  
}

