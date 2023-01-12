package typings.svelte

import typings.svelte.typesRuntimeStoreMod.Readable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRuntimeMotionTweenedMod {
  
  @JSImport("svelte/types/runtime/motion/tweened", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tweened[T](): Tweened_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("tweened")().asInstanceOf[Tweened_[T]]
  inline def tweened[T](value: T): Tweened_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("tweened")(value.asInstanceOf[js.Any]).asInstanceOf[Tweened_[T]]
  inline def tweened[T](value: T, defaults: Options[T]): Tweened_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tweened")(value.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Tweened_[T]]
  inline def tweened[T](value: Unit, defaults: Options[T]): Tweened_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tweened")(value.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Tweened_[T]]
  
  trait Options[T] extends StObject {
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var duration: js.UndefOr[Double | (js.Function2[/* from */ T, /* to */ T, Double])] = js.undefined
    
    var easing: js.UndefOr[js.Function1[/* t */ Double, Double]] = js.undefined
    
    var interpolate: js.UndefOr[js.Function2[/* a */ T, /* b */ T, js.Function1[/* t */ Double, T]]] = js.undefined
  }
  object Options {
    
    inline def apply[T](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], T] (val x: Self & Options[T]) extends AnyVal {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDuration(value: Double | (js.Function2[/* from */ T, /* to */ T, Double])): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationFunction2(value: (/* from */ T, /* to */ T) => Double): Self = StObject.set(x, "duration", js.Any.fromFunction2(value))
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setInterpolate(value: (/* a */ T, /* b */ T) => js.Function1[/* t */ Double, T]): Self = StObject.set(x, "interpolate", js.Any.fromFunction2(value))
      
      inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
    }
  }
  
  @js.native
  trait Tweened_[T]
    extends StObject
       with Readable_[T] {
    
    def set(value: T): js.Promise[Unit] = js.native
    def set(value: T, opts: Options[T]): js.Promise[Unit] = js.native
    
    def update(updater: Updater[T]): js.Promise[Unit] = js.native
    def update(updater: Updater[T], opts: Options[T]): js.Promise[Unit] = js.native
  }
  
  type Updater[T] = js.Function2[/* target_value */ T, /* value */ T, T]
}
