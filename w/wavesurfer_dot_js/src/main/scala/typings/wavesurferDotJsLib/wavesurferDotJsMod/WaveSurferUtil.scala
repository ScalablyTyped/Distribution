package typings
package wavesurferDotJsLib.wavesurferDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaveSurferUtil extends js.Object {
  var Observer: wavesurferDotJsLib.wavesurferDotJsMod.Observer
  def ajax(options: wavesurferDotJsLib.Anon_Xhr): Observer
  def extend(dest: js.Object, sources: js.Object*): js.Object
  def frame(fn: js.Function1[/* repeated */ js.Any, scala.Unit]): js.Function1[/* repeated */ js.Any, scala.Double]
  def getId(): java.lang.String
  def max(values: js.Array[scala.Double]): scala.Double
  def min(values: js.Array[scala.Double]): scala.Double
  def preventClick(): scala.Unit
  def requestAnimationFrame(): js.Function1[/* fn */ js.Function1[/* t */ scala.Double, scala.Unit], scala.Double]
  def style(el: stdLib.HTMLElement, styles: org.scalablytyped.runtime.StringDictionary[java.lang.String]): stdLib.HTMLElement
}

object WaveSurferUtil {
  @scala.inline
  def apply(
    Observer: Observer,
    ajax: wavesurferDotJsLib.Anon_Xhr => Observer,
    extend: (js.Object, /* repeated */ js.Object) => js.Object,
    frame: js.Function1[/* repeated */ js.Any, scala.Unit] => js.Function1[/* repeated */ js.Any, scala.Double],
    getId: () => java.lang.String,
    max: js.Array[scala.Double] => scala.Double,
    min: js.Array[scala.Double] => scala.Double,
    preventClick: () => scala.Unit,
    requestAnimationFrame: () => js.Function1[/* fn */ js.Function1[/* t */ scala.Double, scala.Unit], scala.Double],
    style: (stdLib.HTMLElement, org.scalablytyped.runtime.StringDictionary[java.lang.String]) => stdLib.HTMLElement
  ): WaveSurferUtil = {
    val __obj = js.Dynamic.literal(Observer = Observer, ajax = js.Any.fromFunction1(ajax), extend = js.Any.fromFunction2(extend), frame = js.Any.fromFunction1(frame), getId = js.Any.fromFunction0(getId), max = js.Any.fromFunction1(max), min = js.Any.fromFunction1(min), preventClick = js.Any.fromFunction0(preventClick), requestAnimationFrame = js.Any.fromFunction0(requestAnimationFrame), style = js.Any.fromFunction2(style))
  
    __obj.asInstanceOf[WaveSurferUtil]
  }
}

