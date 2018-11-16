package typings
package wavesurferDotJsLib.wavesurferDotJsMod.WaveSurferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WaveSurferUtil extends js.Object {
  var Observer: wavesurferDotJsLib.wavesurferDotJsMod.Observer
  def ajax(options: wavesurferDotJsLib.Anon_Xhr): wavesurferDotJsLib.wavesurferDotJsMod.Observer
  def extend(dest: js.Object, sources: js.Object*): js.Object
  def frame(fn: js.Function1[/* repeated */js.Any, scala.Unit]): js.Function1[/* repeated */js.Any, scala.Double]
  def getId(): java.lang.String
  def max(values: js.Array[scala.Double]): scala.Double
  def min(values: js.Array[scala.Double]): scala.Double
  def preventClick(): scala.Unit
  def requestAnimationFrame(): js.Function1[/* fn */ js.Function1[/* t */ scala.Double, scala.Unit], scala.Double]
  def style(el: stdLib.HTMLElement, styles: ScalablyTyped.runtime.StringDictionary[java.lang.String]): stdLib.HTMLElement
}

