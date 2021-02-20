package typings.vueScrollto

import typings.std.Element
import typings.std.Event
import typings.vue.optionsMod.DirectiveFunction
import typings.vue.pluginMod.PluginFunction
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import typings.vueScrollto.vueScrolltoBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Inlined vue.vue.PluginObject<vue-scrollto.vue-scrollto.ScrollOptions> & vue.vue.DirectiveOptions & {  scrollTo :vue-scrollto.vue-scrollto.ScrollToFunction,   setDefaults :vue-scrollto.vue-scrollto.ScrollToFunction} */
  object default {
    
    @JSImport("vue-scrollto", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vue-scrollto", "default.bind")
    @js.native
    def bind: js.UndefOr[DirectiveFunction] = js.native
    @scala.inline
    def bind_=(x: js.UndefOr[DirectiveFunction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bind")(x.asInstanceOf[js.Any])
    
    @JSImport("vue-scrollto", "default.componentUpdated")
    @js.native
    def componentUpdated: js.UndefOr[DirectiveFunction] = js.native
    @scala.inline
    def componentUpdated_=(x: js.UndefOr[DirectiveFunction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("componentUpdated")(x.asInstanceOf[js.Any])
    
    @JSImport("vue-scrollto", "default.inserted")
    @js.native
    def inserted: js.UndefOr[DirectiveFunction] = js.native
    @scala.inline
    def inserted_=(x: js.UndefOr[DirectiveFunction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inserted")(x.asInstanceOf[js.Any])
    
    @JSImport("vue-scrollto", "default.install")
    @js.native
    def install: PluginFunction[ScrollOptions] = js.native
    @JSImport("vue-scrollto", "default.install")
    @js.native
    def install(Vue: VueConstructor[Vue]): Unit = js.native
    @JSImport("vue-scrollto", "default.install")
    @js.native
    def install(Vue: VueConstructor[Vue], options: ScrollOptions): Unit = js.native
    @scala.inline
    def install_=(x: PluginFunction[ScrollOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("install")(x.asInstanceOf[js.Any])
    
    @JSImport("vue-scrollto", "default.scrollTo")
    @js.native
    def scrollTo: ScrollToFunction = js.native
    @JSImport("vue-scrollto", "default.scrollTo")
    @js.native
    def scrollTo(element: ElementDescriptor): js.Function0[Unit] = js.native
    @JSImport("vue-scrollto", "default.scrollTo")
    @js.native
    def scrollTo(element: ElementDescriptor, duration: Double): js.Function0[Unit] = js.native
    @JSImport("vue-scrollto", "default.scrollTo")
    @js.native
    def scrollTo(element: ElementDescriptor, duration: Double, options: ScrollOptions): js.Function0[Unit] = js.native
    @JSImport("vue-scrollto", "default.scrollTo")
    @js.native
    def scrollTo(element: ElementDescriptor, options: ScrollOptions): js.Function0[Unit] = js.native
    @JSImport("vue-scrollto", "default.scrollTo")
    @js.native
    def scrollTo(options: ScrollOptions): js.Function0[Unit] = js.native
    @scala.inline
    def scrollTo_=(x: ScrollToFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(x.asInstanceOf[js.Any])
    
    @JSImport("vue-scrollto", "default.setDefaults")
    @js.native
    def setDefaults: ScrollToFunction = js.native
    @JSImport("vue-scrollto", "default.setDefaults")
    @js.native
    def setDefaults(element: ElementDescriptor): js.Function0[Unit] = js.native
    @JSImport("vue-scrollto", "default.setDefaults")
    @js.native
    def setDefaults(element: ElementDescriptor, duration: Double): js.Function0[Unit] = js.native
    @JSImport("vue-scrollto", "default.setDefaults")
    @js.native
    def setDefaults(element: ElementDescriptor, duration: Double, options: ScrollOptions): js.Function0[Unit] = js.native
    @JSImport("vue-scrollto", "default.setDefaults")
    @js.native
    def setDefaults(element: ElementDescriptor, options: ScrollOptions): js.Function0[Unit] = js.native
    @JSImport("vue-scrollto", "default.setDefaults")
    @js.native
    def setDefaults(options: ScrollOptions): js.Function0[Unit] = js.native
    @scala.inline
    def setDefaults_=(x: ScrollToFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setDefaults")(x.asInstanceOf[js.Any])
    
    @JSImport("vue-scrollto", "default.unbind")
    @js.native
    def unbind: js.UndefOr[DirectiveFunction] = js.native
    @scala.inline
    def unbind_=(x: js.UndefOr[DirectiveFunction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unbind")(x.asInstanceOf[js.Any])
    
    @JSImport("vue-scrollto", "default.update")
    @js.native
    def update: js.UndefOr[DirectiveFunction] = js.native
    @scala.inline
    def update_=(x: js.UndefOr[DirectiveFunction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("update")(x.asInstanceOf[js.Any])
  }
  
  type ElementDescriptor = Element | String
  
  @js.native
  trait ScrollOptions extends StObject {
    
    var cancelable: js.UndefOr[Boolean] = js.native
    
    var container: js.UndefOr[ElementDescriptor] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var easing: js.UndefOr[String | (js.Tuple4[Double, Double, Double, Double])] = js.native
    
    var el: js.UndefOr[ElementDescriptor] = js.native
    
    var element: js.UndefOr[ElementDescriptor] = js.native
    
    var force: js.UndefOr[Boolean] = js.native
    
    var offset: js.UndefOr[
        Double | (js.Function2[/* element */ ElementDescriptor, /* container */ ElementDescriptor, Double])
      ] = js.native
    
    var onCancel: js.UndefOr[(js.Function2[/* event */ Event, /* element */ Element, _]) | `false`] = js.native
    
    var onDone: js.UndefOr[(js.Function1[/* element */ Element, _]) | `false`] = js.native
    
    var onStart: js.UndefOr[(js.Function1[/* element */ Element, _]) | `false`] = js.native
    
    var x: js.UndefOr[Boolean] = js.native
    
    var y: js.UndefOr[Boolean] = js.native
  }
  object ScrollOptions {
    
    @scala.inline
    def apply(): ScrollOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollOptions]
    }
    
    @scala.inline
    implicit class ScrollOptionsMutableBuilder[Self <: ScrollOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
      
      @scala.inline
      def setContainer(value: ElementDescriptor): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: String | (js.Tuple4[Double, Double, Double, Double])): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setEl(value: ElementDescriptor): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElUndefined: Self = StObject.set(x, "el", js.undefined)
      
      @scala.inline
      def setElement(value: ElementDescriptor): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      @scala.inline
      def setOffset(
        value: Double | (js.Function2[/* element */ ElementDescriptor, /* container */ ElementDescriptor, Double])
      ): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetFunction2(value: (/* element */ ElementDescriptor, /* container */ ElementDescriptor) => Double): Self = StObject.set(x, "offset", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOnCancel(value: (js.Function2[/* event */ Event, /* element */ Element, _]) | `false`): Self = StObject.set(x, "onCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCancelFunction2(value: (/* event */ Event, /* element */ Element) => _): Self = StObject.set(x, "onCancel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnDone(value: (js.Function1[/* element */ Element, _]) | `false`): Self = StObject.set(x, "onDone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDoneFunction1(value: /* element */ Element => _): Self = StObject.set(x, "onDone", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDoneUndefined: Self = StObject.set(x, "onDone", js.undefined)
      
      @scala.inline
      def setOnStart(value: (js.Function1[/* element */ Element, _]) | `false`): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnStartFunction1(value: /* element */ Element => _): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      @scala.inline
      def setX(value: Boolean): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Boolean): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
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
  
  object vueTypesVueAugmentingMod {
    
    @js.native
    trait Vue extends StObject {
      
      @JSName("$scrollTo")
      def $scrollTo(element: ElementDescriptor): js.Function0[Unit] = js.native
      @JSName("$scrollTo")
      def $scrollTo(element: ElementDescriptor, duration: Double): js.Function0[Unit] = js.native
      @JSName("$scrollTo")
      def $scrollTo(element: ElementDescriptor, duration: Double, options: ScrollOptions): js.Function0[Unit] = js.native
      @JSName("$scrollTo")
      def $scrollTo(element: ElementDescriptor, options: ScrollOptions): js.Function0[Unit] = js.native
      @JSName("$scrollTo")
      def $scrollTo(options: ScrollOptions): js.Function0[Unit] = js.native
      @JSName("$scrollTo")
      var $scrollTo_Original: ScrollToFunction = js.native
    }
  }
}
