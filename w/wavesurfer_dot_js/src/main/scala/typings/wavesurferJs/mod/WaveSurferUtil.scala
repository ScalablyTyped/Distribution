package typings.wavesurferJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.wavesurferJs.AnonXhr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaveSurferUtil extends js.Object {
  var Observer: typings.wavesurferJs.mod.Observer
  def ajax(options: AnonXhr): Observer
  def extend(dest: js.Object, sources: js.Object*): js.Object
  def frame(fn: js.Function1[/* repeated */ js.Any, Unit]): js.Function1[/* repeated */ js.Any, Double]
  def getId(): String
  def max(values: js.Array[Double]): Double
  def min(values: js.Array[Double]): Double
  def preventClick(): Unit
  def requestAnimationFrame(): js.Function1[/* fn */ js.Function1[/* t */ Double, Unit], Double]
  def style(el: HTMLElement, styles: StringDictionary[String]): HTMLElement
}

object WaveSurferUtil {
  @scala.inline
  def apply(
    Observer: Observer,
    ajax: AnonXhr => Observer,
    extend: (js.Object, /* repeated */ js.Object) => js.Object,
    frame: js.Function1[/* repeated */ js.Any, Unit] => js.Function1[/* repeated */ js.Any, Double],
    getId: () => String,
    max: js.Array[Double] => Double,
    min: js.Array[Double] => Double,
    preventClick: () => Unit,
    requestAnimationFrame: () => js.Function1[/* fn */ js.Function1[/* t */ Double, Unit], Double],
    style: (HTMLElement, StringDictionary[String]) => HTMLElement
  ): WaveSurferUtil = {
    val __obj = js.Dynamic.literal(Observer = Observer.asInstanceOf[js.Any], ajax = js.Any.fromFunction1(ajax), extend = js.Any.fromFunction2(extend), frame = js.Any.fromFunction1(frame), getId = js.Any.fromFunction0(getId), max = js.Any.fromFunction1(max), min = js.Any.fromFunction1(min), preventClick = js.Any.fromFunction0(preventClick), requestAnimationFrame = js.Any.fromFunction0(requestAnimationFrame), style = js.Any.fromFunction2(style))
  
    __obj.asInstanceOf[WaveSurferUtil]
  }
}

