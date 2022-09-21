package typings.wavesurferJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.wavesurferJs.anon.Typeofdebounce
import typings.wavesurferJs.utilMod.Observer
import typings.wavesurferJs.xhrMod.XHROptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilMod {
  
  trait DrawingContextAttributes extends StObject {
    
    var desynchronized: Boolean
  }
  object DrawingContextAttributes {
    
    inline def apply(desynchronized: Boolean): DrawingContextAttributes = {
      val __obj = js.Dynamic.literal(desynchronized = desynchronized.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawingContextAttributes]
    }
    
    extension [Self <: DrawingContextAttributes](x: Self) {
      
      inline def setDesynchronized(value: Boolean): Self = StObject.set(x, "desynchronized", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EventHandler extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
  
  trait ListenerDescriptor extends StObject {
    
    /** The callback. */
    def callback(args: Any*): Unit
    
    /** The name of the event. */
    var name: String
    
    /** The function to call to remove the listener. */
    def un(): Unit
  }
  object ListenerDescriptor {
    
    inline def apply(callback: /* repeated */ Any => Unit, name: String, un: () => Unit): ListenerDescriptor = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), name = name.asInstanceOf[js.Any], un = js.Any.fromFunction0(un))
      __obj.asInstanceOf[ListenerDescriptor]
    }
    
    extension [Self <: ListenerDescriptor](x: Self) {
      
      inline def setCallback(value: /* repeated */ Any => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUn(value: () => Unit): Self = StObject.set(x, "un", js.Any.fromFunction0(value))
    }
  }
  
  type Styles = StringDictionary[String]
  
  trait WaveSurferUtil extends StObject {
    
    var Observer: Instantiable0[typings.wavesurferJs.utilMod.Observer]
    
    def absMax(values: js.Array[Double]): Double
    
    def clamp(`val`: Double, min: Double, max: Double): Double
    
    val debounce: Typeofdebounce
    
    def fetchFile(options: XHROptions): Observer
    
    def frame[T](fn: js.Function1[/* arg */ T, Unit]): js.Function1[/* arg */ T, Unit]
    
    def getId(prefix: String): String
    
    def ignoreSilenceMode(): Unit
    
    def max(values: js.Array[Double]): Double
    
    def min(values: js.Array[Double]): Double
    
    def preventClick(): Unit
    
    def requestAnimationFrame(): js.Function1[/* fn */ js.Function1[/* t */ Double, Unit], Double]
    
    def style[T /* <: HTMLElement */](el: T, styles: Styles): T
    
    def withOrientation(target: HTMLElement, vertical: Boolean): HTMLElement
  }
  object WaveSurferUtil {
    
    inline def apply(
      Observer: Instantiable0[Observer],
      absMax: js.Array[Double] => Double,
      clamp: (Double, Double, Double) => Double,
      debounce: Typeofdebounce,
      fetchFile: XHROptions => Observer,
      frame: js.Function1[Any, Unit] => js.Function1[Any, Unit],
      getId: String => String,
      ignoreSilenceMode: () => Unit,
      max: js.Array[Double] => Double,
      min: js.Array[Double] => Double,
      preventClick: () => Unit,
      requestAnimationFrame: () => js.Function1[/* fn */ js.Function1[/* t */ Double, Unit], Double],
      style: (Any, Styles) => Any,
      withOrientation: (HTMLElement, Boolean) => HTMLElement
    ): WaveSurferUtil = {
      val __obj = js.Dynamic.literal(Observer = Observer.asInstanceOf[js.Any], absMax = js.Any.fromFunction1(absMax), clamp = js.Any.fromFunction3(clamp), debounce = debounce.asInstanceOf[js.Any], fetchFile = js.Any.fromFunction1(fetchFile), frame = js.Any.fromFunction1(frame), getId = js.Any.fromFunction1(getId), ignoreSilenceMode = js.Any.fromFunction0(ignoreSilenceMode), max = js.Any.fromFunction1(max), min = js.Any.fromFunction1(min), preventClick = js.Any.fromFunction0(preventClick), requestAnimationFrame = js.Any.fromFunction0(requestAnimationFrame), style = js.Any.fromFunction2(style), withOrientation = js.Any.fromFunction2(withOrientation))
      __obj.asInstanceOf[WaveSurferUtil]
    }
    
    extension [Self <: WaveSurferUtil](x: Self) {
      
      inline def setAbsMax(value: js.Array[Double] => Double): Self = StObject.set(x, "absMax", js.Any.fromFunction1(value))
      
      inline def setClamp(value: (Double, Double, Double) => Double): Self = StObject.set(x, "clamp", js.Any.fromFunction3(value))
      
      inline def setDebounce(value: Typeofdebounce): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
      
      inline def setFetchFile(value: XHROptions => Observer): Self = StObject.set(x, "fetchFile", js.Any.fromFunction1(value))
      
      inline def setFrame(value: js.Function1[Any, Unit] => js.Function1[Any, Unit]): Self = StObject.set(x, "frame", js.Any.fromFunction1(value))
      
      inline def setGetId(value: String => String): Self = StObject.set(x, "getId", js.Any.fromFunction1(value))
      
      inline def setIgnoreSilenceMode(value: () => Unit): Self = StObject.set(x, "ignoreSilenceMode", js.Any.fromFunction0(value))
      
      inline def setMax(value: js.Array[Double] => Double): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
      
      inline def setMin(value: js.Array[Double] => Double): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
      
      inline def setObserver(value: Instantiable0[Observer]): Self = StObject.set(x, "Observer", value.asInstanceOf[js.Any])
      
      inline def setPreventClick(value: () => Unit): Self = StObject.set(x, "preventClick", js.Any.fromFunction0(value))
      
      inline def setRequestAnimationFrame(value: () => js.Function1[/* fn */ js.Function1[/* t */ Double, Unit], Double]): Self = StObject.set(x, "requestAnimationFrame", js.Any.fromFunction0(value))
      
      inline def setStyle(value: (Any, Styles) => Any): Self = StObject.set(x, "style", js.Any.fromFunction2(value))
      
      inline def setWithOrientation(value: (HTMLElement, Boolean) => HTMLElement): Self = StObject.set(x, "withOrientation", js.Any.fromFunction2(value))
    }
  }
}
