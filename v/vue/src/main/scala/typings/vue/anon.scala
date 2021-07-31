package typings.vue

import org.scalablytyped.runtime.Instantiable1
import typings.vue.optionsMod.AsyncComponentPromise
import typings.vue.optionsMod.DefaultComputed
import typings.vue.optionsMod.DefaultData
import typings.vue.optionsMod.DefaultMethods
import typings.vue.optionsMod.DefaultProps
import typings.vue.optionsMod.EsModuleComponent
import typings.vue.optionsMod.InjectKey
import typings.vue.optionsMod._Prop
import typings.vue.vnodeMod.VNode
import typings.vue.vueMod.CreateElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Component[Data, Methods, Computed, Props] extends StObject {
    
    def component(
      resolve: js.Function1[
          /* component */ typings.vue.optionsMod.Component[Data, Methods, Computed, Props], 
          Unit
        ],
      reject: js.Function1[/* reason */ js.UndefOr[js.Any], Unit]
    ): (js.Promise[
        (typings.vue.optionsMod.Component[
          DefaultData[scala.Nothing], 
          DefaultMethods[scala.Nothing], 
          DefaultComputed, 
          DefaultProps
        ]) | EsModuleComponent
      ]) | Unit
    @JSName("component")
    var component_Original: AsyncComponentPromise[Data, Methods, Computed, Props]
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var error: js.UndefOr[
        (typings.vue.optionsMod.Component[
          DefaultData[scala.Nothing], 
          DefaultMethods[scala.Nothing], 
          DefaultComputed, 
          DefaultProps
        ]) | EsModuleComponent
      ] = js.undefined
    
    var loading: js.UndefOr[
        (typings.vue.optionsMod.Component[
          DefaultData[scala.Nothing], 
          DefaultMethods[scala.Nothing], 
          DefaultComputed, 
          DefaultProps
        ]) | EsModuleComponent
      ] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Component {
    
    @scala.inline
    def apply[Data, Methods, Computed, Props](
      component: (/* resolve */ js.Function1[
          /* component */ typings.vue.optionsMod.Component[Data, Methods, Computed, Props], 
          Unit
        ], /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit]) => (js.Promise[
          (typings.vue.optionsMod.Component[
            DefaultData[scala.Nothing], 
            DefaultMethods[scala.Nothing], 
            DefaultComputed, 
            DefaultProps
          ]) | EsModuleComponent
        ]) | Unit
    ): Component[Data, Methods, Computed, Props] = {
      val __obj = js.Dynamic.literal(component = js.Any.fromFunction2(component))
      __obj.asInstanceOf[Component[Data, Methods, Computed, Props]]
    }
    
    @scala.inline
    implicit class ComponentMutableBuilder[Self <: Component[?, ?, ?, ?], Data, Methods, Computed, Props] (val x: Self & (Component[Data, Methods, Computed, Props])) extends AnyVal {
      
      @scala.inline
      def setComponent(
        value: (/* resolve */ js.Function1[
              /* component */ typings.vue.optionsMod.Component[Data, Methods, Computed, Props], 
              Unit
            ], /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit]) => (js.Promise[
              (typings.vue.optionsMod.Component[
                DefaultData[scala.Nothing], 
                DefaultMethods[scala.Nothing], 
                DefaultComputed, 
                DefaultProps
              ]) | EsModuleComponent
            ]) | Unit
      ): Self = StObject.set(x, "component", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setError(
        value: (typings.vue.optionsMod.Component[
              DefaultData[scala.Nothing], 
              DefaultMethods[scala.Nothing], 
              DefaultComputed, 
              DefaultProps
            ]) | EsModuleComponent
      ): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setLoading(
        value: (typings.vue.optionsMod.Component[
              DefaultData[scala.Nothing], 
              DefaultMethods[scala.Nothing], 
              DefaultComputed, 
              DefaultProps
            ]) | EsModuleComponent
      ): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait Default extends StObject {
    
    var default: js.UndefOr[js.Any] = js.undefined
    
    var from: js.UndefOr[InjectKey] = js.undefined
  }
  object Default {
    
    @scala.inline
    def apply(): Default = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Default]
    }
    
    @scala.inline
    implicit class DefaultMutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setFrom(value: InjectKey): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    }
  }
  
  trait Event extends StObject {
    
    var event: js.UndefOr[String] = js.undefined
    
    var prop: js.UndefOr[String] = js.undefined
  }
  object Event {
    
    @scala.inline
    def apply(): Event = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropUndefined: Self = StObject.set(x, "prop", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T](array: js.Array[T], key: Double, value: T): T = js.native
    def apply[T](`object`: js.Object, key: String, value: T): T = js.native
    def apply[T](`object`: js.Object, key: Double, value: T): T = js.native
  }
  
  @js.native
  trait FnCallObjectKey extends StObject {
    
    def apply(`object`: js.Object, key: String): Unit = js.native
    def apply(`object`: js.Object, key: Double): Unit = js.native
    def apply[T](array: js.Array[T], key: Double): Unit = js.native
  }
  
  @js.native
  trait Instantiable[T]
    extends StObject
       with Instantiable1[/* args (repeated) */ scala.Nothing, T & js.Object]
       with _Prop[T]
  
  @js.native
  trait InstantiableFunction
    extends StObject
       with Instantiable1[/* args (repeated) */ String, js.Function]
       with _Prop[js.Any]
  
  trait Render extends StObject {
    
    var render: js.Function
    
    var staticRenderFns: js.Array[js.Function]
  }
  object Render {
    
    @scala.inline
    def apply(render: js.Function, staticRenderFns: js.Array[js.Function]): Render = {
      val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any], staticRenderFns = staticRenderFns.asInstanceOf[js.Any])
      __obj.asInstanceOf[Render]
    }
    
    @scala.inline
    implicit class RenderMutableBuilder[Self <: Render] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRender(value: js.Function): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticRenderFns(value: js.Array[js.Function]): Self = StObject.set(x, "staticRenderFns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticRenderFnsVarargs(value: js.Function*): Self = StObject.set(x, "staticRenderFns", js.Array(value :_*))
    }
  }
  
  trait StaticRenderFns extends StObject {
    
    def render(createElement: CreateElement): VNode
    
    var staticRenderFns: js.Array[js.Function0[VNode]]
  }
  object StaticRenderFns {
    
    @scala.inline
    def apply(render: CreateElement => VNode, staticRenderFns: js.Array[js.Function0[VNode]]): StaticRenderFns = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render), staticRenderFns = staticRenderFns.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticRenderFns]
    }
    
    @scala.inline
    implicit class StaticRenderFnsMutableBuilder[Self <: StaticRenderFns] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRender(value: CreateElement => VNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStaticRenderFns(value: js.Array[js.Function0[VNode]]): Self = StObject.set(x, "staticRenderFns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticRenderFnsVarargs(value: js.Function0[VNode]*): Self = StObject.set(x, "staticRenderFns", js.Array(value :_*))
    }
  }
}
