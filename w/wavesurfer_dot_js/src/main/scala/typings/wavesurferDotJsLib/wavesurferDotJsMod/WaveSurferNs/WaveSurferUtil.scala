package typings
package wavesurferDotJsLib.wavesurferDotJsMod.WaveSurferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaveSurferUtil extends js.Object {
  var Observer: wavesurferDotJsLib.wavesurferDotJsMod.Observer
  def ajax(options: wavesurferDotJsLib.Anon_Xhr): wavesurferDotJsLib.wavesurferDotJsMod.Observer
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
    Observer: wavesurferDotJsLib.wavesurferDotJsMod.Observer,
    ajax: js.Function1[wavesurferDotJsLib.Anon_Xhr, wavesurferDotJsLib.wavesurferDotJsMod.Observer],
    extend: js.Function2[js.Object, /* repeated */ js.Object, js.Object],
    frame: js.Function1[
      js.Function1[/* repeated */ js.Any, scala.Unit], 
      js.Function1[/* repeated */ js.Any, scala.Double]
    ],
    getId: js.Function0[java.lang.String],
    max: js.Function1[js.Array[scala.Double], scala.Double],
    min: js.Function1[js.Array[scala.Double], scala.Double],
    preventClick: js.Function0[scala.Unit],
    requestAnimationFrame: js.Function0[
      js.Function1[/* fn */ js.Function1[/* t */ scala.Double, scala.Unit], scala.Double]
    ],
    style: js.Function2[
      stdLib.HTMLElement, 
      org.scalablytyped.runtime.StringDictionary[java.lang.String], 
      stdLib.HTMLElement
    ]
  ): WaveSurferUtil = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Observer")(Observer)
    __obj.updateDynamic("ajax")(ajax)
    __obj.updateDynamic("extend")(extend)
    __obj.updateDynamic("frame")(frame)
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("min")(min)
    __obj.updateDynamic("preventClick")(preventClick)
    __obj.updateDynamic("requestAnimationFrame")(requestAnimationFrame)
    __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[WaveSurferUtil]
  }
}

