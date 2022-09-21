package typings.wavesurferJs

import typings.debounce.anon.Clear
import typings.std.HTMLElement
import typings.wavesurferJs.observerMod.default
import typings.wavesurferJs.typesUtilMod.Styles
import typings.wavesurferJs.xhrMod.XHROptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("wavesurfer.js/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wavesurfer.js/src/util", "Observer")
  @js.native
  open class Observer () extends default
  
  inline def absMax(values: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("absMax")(values.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def clamp(`val`: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(`val`.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  object debounce {
    
    inline def apply[A /* <: js.Function */](f: A): Clear & A = ^.asInstanceOf[js.Dynamic].apply(f.asInstanceOf[js.Any]).asInstanceOf[Clear & A]
    inline def apply[A /* <: js.Function */](f: A, interval: Double): Clear & A = (^.asInstanceOf[js.Dynamic].apply(f.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[Clear & A]
    inline def apply[A /* <: js.Function */](f: A, interval: Double, immediate: Boolean): Clear & A = (^.asInstanceOf[js.Dynamic].apply(f.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[Clear & A]
    inline def apply[A /* <: js.Function */](f: A, interval: Unit, immediate: Boolean): Clear & A = (^.asInstanceOf[js.Dynamic].apply(f.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[Clear & A]
    
    @JSImport("wavesurfer.js/src/util", "debounce")
    @js.native
    val ^ : js.Any = js.native
    @JSImport("wavesurfer.js/src/util", "debounce.debounce")
    @js.native
    val debounce: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _debounce */ Any = js.native
  }
  
  inline def fetchFile(options: XHROptions): Observer = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchFile")(options.asInstanceOf[js.Any]).asInstanceOf[Observer]
  
  inline def frame[T](fn: js.Function1[/* arg */ T, Unit]): js.Function1[/* arg */ T, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("frame")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arg */ T, Unit]]
  
  inline def getId(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def ignoreSilenceMode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ignoreSilenceMode")().asInstanceOf[Unit]
  
  inline def max(values: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(values.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def min(values: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(values.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def preventClick(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preventClick")().asInstanceOf[Unit]
  
  inline def requestAnimationFrame(): js.Function1[/* fn */ js.Function1[/* t */ Double, Unit], Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAnimationFrame")().asInstanceOf[js.Function1[/* fn */ js.Function1[/* t */ Double, Unit], Double]]
  
  inline def style[T /* <: HTMLElement */](el: T, styles: Styles): T = (^.asInstanceOf[js.Dynamic].applyDynamic("style")(el.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def withOrientation(target: HTMLElement, vertical: Boolean): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("withOrientation")(target.asInstanceOf[js.Any], vertical.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
}
