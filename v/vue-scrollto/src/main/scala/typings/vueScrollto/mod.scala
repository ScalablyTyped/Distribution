package typings.vueScrollto

import org.scalablytyped.runtime.Shortcut
import typings.std.Element
import typings.std.Event
import typings.vueScrollto.anon.ScrollTo
import typings.vueScrollto.vueScrolltoBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vue-scrollto", JSImport.Default)
  @js.native
  val default: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginObject<ScrollOptions> */ Any) & ScrollTo = js.native
  
  type ElementDescriptor = Element | String
  
  trait ScrollOptions extends StObject {
    
    var cancelable: js.UndefOr[Boolean] = js.undefined
    
    var container: js.UndefOr[ElementDescriptor] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[String | (js.Tuple4[Double, Double, Double, Double])] = js.undefined
    
    var el: js.UndefOr[ElementDescriptor] = js.undefined
    
    var element: js.UndefOr[ElementDescriptor] = js.undefined
    
    var force: js.UndefOr[Boolean] = js.undefined
    
    var offset: js.UndefOr[
        Double | (js.Function2[/* element */ ElementDescriptor, /* container */ ElementDescriptor, Double])
      ] = js.undefined
    
    var onCancel: js.UndefOr[(js.Function2[/* event */ Event, /* element */ Element, Any]) | `false`] = js.undefined
    
    var onDone: js.UndefOr[(js.Function1[/* element */ Element, Any]) | `false`] = js.undefined
    
    var onStart: js.UndefOr[(js.Function1[/* element */ Element, Any]) | `false`] = js.undefined
    
    var x: js.UndefOr[Boolean] = js.undefined
    
    var y: js.UndefOr[Boolean] = js.undefined
  }
  object ScrollOptions {
    
    inline def apply(): ScrollOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollOptions] (val x: Self) extends AnyVal {
      
      inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      inline def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
      
      inline def setContainer(value: ElementDescriptor): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: String | (js.Tuple4[Double, Double, Double, Double])): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setEl(value: ElementDescriptor): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setElUndefined: Self = StObject.set(x, "el", js.undefined)
      
      inline def setElement(value: ElementDescriptor): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setOffset(
        value: Double | (js.Function2[/* element */ ElementDescriptor, /* container */ ElementDescriptor, Double])
      ): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetFunction2(value: (/* element */ ElementDescriptor, /* container */ ElementDescriptor) => Double): Self = StObject.set(x, "offset", js.Any.fromFunction2(value))
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOnCancel(value: (js.Function2[/* event */ Event, /* element */ Element, Any]) | `false`): Self = StObject.set(x, "onCancel", value.asInstanceOf[js.Any])
      
      inline def setOnCancelFunction2(value: (/* event */ Event, /* element */ Element) => Any): Self = StObject.set(x, "onCancel", js.Any.fromFunction2(value))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnDone(value: (js.Function1[/* element */ Element, Any]) | `false`): Self = StObject.set(x, "onDone", value.asInstanceOf[js.Any])
      
      inline def setOnDoneFunction1(value: /* element */ Element => Any): Self = StObject.set(x, "onDone", js.Any.fromFunction1(value))
      
      inline def setOnDoneUndefined: Self = StObject.set(x, "onDone", js.undefined)
      
      inline def setOnStart(value: (js.Function1[/* element */ Element, Any]) | `false`): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
      
      inline def setOnStartFunction1(value: /* element */ Element => Any): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      inline def setX(value: Boolean): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Boolean): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait ScrollToFunction extends StObject {
    
    def apply(element: ElementDescriptor): js.Function0[Unit] = js.native
    def apply(element: ElementDescriptor, duration: Double): js.Function0[Unit] = js.native
    def apply(element: ElementDescriptor, duration: Double, options: ScrollOptions): js.Function0[Unit] = js.native
    def apply(element: ElementDescriptor, options: ScrollOptions): js.Function0[Unit] = js.native
    def apply(options: ScrollOptions): js.Function0[Unit] = js.native
  }
  
  type _To = (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginObject<ScrollOptions> */ Any) & ScrollTo
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginObject<ScrollOptions> */ Any) & ScrollTo = default
  
  /* augmented module */
  object vueTypesVueAugmentingMod {
    
    trait Vue extends StObject {
      
      @JSName("$scrollTo")
      def $scrollTo(element: ElementDescriptor): js.Function0[Unit]
      @JSName("$scrollTo")
      def $scrollTo(element: ElementDescriptor, duration: Double): js.Function0[Unit]
      @JSName("$scrollTo")
      def $scrollTo(element: ElementDescriptor, duration: Double, options: ScrollOptions): js.Function0[Unit]
      @JSName("$scrollTo")
      def $scrollTo(element: ElementDescriptor, options: ScrollOptions): js.Function0[Unit]
      @JSName("$scrollTo")
      def $scrollTo(options: ScrollOptions): js.Function0[Unit]
      @JSName("$scrollTo")
      var $scrollTo_Original: ScrollToFunction
    }
    object Vue {
      
      inline def apply($scrollTo: ScrollToFunction): Vue = {
        val __obj = js.Dynamic.literal($scrollTo = $scrollTo.asInstanceOf[js.Any])
        __obj.asInstanceOf[Vue]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Vue] (val x: Self) extends AnyVal {
        
        inline def set$scrollTo(value: ScrollToFunction): Self = StObject.set(x, "$scrollTo", value.asInstanceOf[js.Any])
      }
    }
  }
}
