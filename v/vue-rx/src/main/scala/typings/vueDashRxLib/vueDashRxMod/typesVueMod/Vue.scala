package typings
package vueDashRxLib.vueDashRxMod.typesVueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vue extends js.Object {
  @JSName("$observables")
  var $observables: vueDashRxLib.vueDashRxMod.Observables = js.native
  @JSName("$createObservableMethod")
  def $createObservableMethod(methodName: java.lang.String): rxjsLib.rxjsMod.Observable[_] = js.native
  @JSName("$eventToObservable")
  def $eventToObservable(event: java.lang.String): rxjsLib.rxjsMod.Observable[vueDashRxLib.Anon_Msg] = js.native
  @JSName("$fromDOMEvent")
  def $fromDOMEvent(selector: java.lang.String, event: java.lang.String): rxjsLib.rxjsMod.Observable[stdLib.Event] = js.native
  @JSName("$fromDOMEvent")
  def $fromDOMEvent(selector: scala.Null, event: java.lang.String): rxjsLib.rxjsMod.Observable[stdLib.Event] = js.native
  @JSName("$subscribeTo")
  def $subscribeTo[T](observable: rxjsLib.rxjsMod.Observable[T], next: js.Function1[/* t */ T, scala.Unit]): scala.Unit = js.native
  @JSName("$subscribeTo")
  def $subscribeTo[T](
    observable: rxjsLib.rxjsMod.Observable[T],
    next: js.Function1[/* t */ T, scala.Unit],
    error: js.Function1[/* e */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("$subscribeTo")
  def $subscribeTo[T](
    observable: rxjsLib.rxjsMod.Observable[T],
    next: js.Function1[/* t */ T, scala.Unit],
    error: js.Function1[/* e */ js.Any, scala.Unit],
    complete: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  @JSName("$watchAsObservable")
  def $watchAsObservable(expr: java.lang.String): rxjsLib.rxjsMod.Observable[vueDashRxLib.vueDashRxMod.WatchObservable[_]] = js.native
  @JSName("$watchAsObservable")
  def $watchAsObservable(expr: java.lang.String, options: vueLib.typesOptionsMod.WatchOptions): rxjsLib.rxjsMod.Observable[vueDashRxLib.vueDashRxMod.WatchObservable[_]] = js.native
  @JSName("$watchAsObservable")
  def $watchAsObservable[T](fn: js.ThisFunction0[/* this */ this.type, T]): rxjsLib.rxjsMod.Observable[vueDashRxLib.vueDashRxMod.WatchObservable[T]] = js.native
  @JSName("$watchAsObservable")
  def $watchAsObservable[T](fn: js.ThisFunction0[/* this */ this.type, T], options: vueLib.typesOptionsMod.WatchOptions): rxjsLib.rxjsMod.Observable[vueDashRxLib.vueDashRxMod.WatchObservable[T]] = js.native
}

