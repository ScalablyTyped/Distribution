package typings.wavesurferJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.wavesurferJs.anon.Typeofdebounce
import typings.wavesurferJs.srcUtilMod.Observer
import typings.wavesurferJs.typesXhrMod.XHROptions
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawingContextAttributes] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListenerDescriptor] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: /* repeated */ Any => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUn(value: () => Unit): Self = StObject.set(x, "un", js.Any.fromFunction0(value))
    }
  }
  
  type Styles = StringDictionary[String]
  
  @js.native
  trait WaveSurferUtil extends StObject {
    
    var Observer: Instantiable0[typings.wavesurferJs.srcUtilMod.Observer] = js.native
    
    def absMax(values: js.Array[Double]): Double = js.native
    
    def clamp(`val`: Double, min: Double, max: Double): Double = js.native
    
    val debounce: Typeofdebounce = js.native
    
    def fetchFile(options: XHROptions): Observer = js.native
    
    def frame[T](fn: js.Function1[/* arg */ T, Unit]): js.Function1[/* arg */ T, Unit] = js.native
    
    def getId(): String = js.native
    def getId(prefix: String): String = js.native
    
    def ignoreSilenceMode(): Unit = js.native
    
    def max(values: js.Array[Double]): Double = js.native
    
    def min(values: js.Array[Double]): Double = js.native
    
    def preventClick(): Unit = js.native
    
    def requestAnimationFrame(): js.Function1[/* fn */ js.Function1[/* t */ Double, Unit], Double] = js.native
    
    def style[T /* <: HTMLElement */](el: T, styles: Styles): T = js.native
    
    def withOrientation(target: HTMLElement, vertical: Boolean): HTMLElement = js.native
  }
}
