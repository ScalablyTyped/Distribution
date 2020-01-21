package typings.vueRx.mod

import typings.rxjs.mod.Observable_
import typings.std.Event_
import typings.vue.optionsMod.WatchOptions
import typings.vueRx.AnonMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue/types/vue", JSImport.Namespace)
@js.native
object vueTypesVueAugmentingMod extends js.Object {
  @js.native
  trait Vue extends js.Object {
    @JSName("$observables")
    var $observables: Observables = js.native
    @JSName("$createObservableMethod")
    def $createObservableMethod(methodName: String): Observable_[_] = js.native
    @JSName("$eventToObservable")
    def $eventToObservable(event: String): Observable_[AnonMsg] = js.native
    @JSName("$fromDOMEvent")
    def $fromDOMEvent(selector: String, event: String): Observable_[Event_] = js.native
    @JSName("$fromDOMEvent")
    def $fromDOMEvent(selector: Null, event: String): Observable_[Event_] = js.native
    @JSName("$subscribeTo")
    def $subscribeTo[T](observable: Observable_[T], next: js.Function1[/* t */ T, Unit]): Unit = js.native
    @JSName("$subscribeTo")
    def $subscribeTo[T](
      observable: Observable_[T],
      next: js.Function1[/* t */ T, Unit],
      error: js.Function1[/* e */ js.Any, Unit]
    ): Unit = js.native
    @JSName("$subscribeTo")
    def $subscribeTo[T](
      observable: Observable_[T],
      next: js.Function1[/* t */ T, Unit],
      error: js.Function1[/* e */ js.Any, Unit],
      complete: js.Function0[Unit]
    ): Unit = js.native
    @JSName("$watchAsObservable")
    def $watchAsObservable(expr: String): Observable_[WatchObservable[_]] = js.native
    @JSName("$watchAsObservable")
    def $watchAsObservable(expr: String, options: WatchOptions): Observable_[WatchObservable[_]] = js.native
    @JSName("$watchAsObservable")
    def $watchAsObservable[T](fn: js.ThisFunction0[/* this */ this.type, T]): Observable_[WatchObservable[T]] = js.native
    @JSName("$watchAsObservable")
    def $watchAsObservable[T](fn: js.ThisFunction0[/* this */ this.type, T], options: WatchOptions): Observable_[WatchObservable[T]] = js.native
  }
  
}

