package typings.wavesurferJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.wavesurferJs.anon.Xhr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaveSurferUtil extends js.Object {
  
  var Observer: typings.wavesurferJs.mod.Observer = js.native
  
  def ajax(options: Xhr): Observer = js.native
  
  def extend(dest: js.Object, sources: js.Object*): js.Object = js.native
  
  def frame(fn: js.Function1[/* repeated */ js.Any, Unit]): js.Function1[/* repeated */ js.Any, Double] = js.native
  
  def getId(): String = js.native
  
  def max(values: js.Array[Double]): Double = js.native
  
  def min(values: js.Array[Double]): Double = js.native
  
  def preventClick(): Unit = js.native
  
  def requestAnimationFrame(): js.Function1[/* fn */ js.Function1[/* t */ Double, Unit], Double] = js.native
  
  def style(el: HTMLElement, styles: StringDictionary[String]): HTMLElement = js.native
}
object WaveSurferUtil {
  
  @scala.inline
  def apply(
    Observer: Observer,
    ajax: Xhr => Observer,
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
  
  @scala.inline
  implicit class WaveSurferUtilOps[Self <: WaveSurferUtil] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setObserver(value: Observer): Self = this.set("Observer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAjax(value: Xhr => Observer): Self = this.set("ajax", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtend(value: (js.Object, /* repeated */ js.Object) => js.Object): Self = this.set("extend", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFrame(value: js.Function1[/* repeated */ js.Any, Unit] => js.Function1[/* repeated */ js.Any, Double]): Self = this.set("frame", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetId(value: () => String): Self = this.set("getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMax(value: js.Array[Double] => Double): Self = this.set("max", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMin(value: js.Array[Double] => Double): Self = this.set("min", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPreventClick(value: () => Unit): Self = this.set("preventClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRequestAnimationFrame(value: () => js.Function1[/* fn */ js.Function1[/* t */ Double, Unit], Double]): Self = this.set("requestAnimationFrame", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStyle(value: (HTMLElement, StringDictionary[String]) => HTMLElement): Self = this.set("style", js.Any.fromFunction2(value))
  }
}
