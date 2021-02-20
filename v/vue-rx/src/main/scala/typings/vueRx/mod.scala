package typings.vueRx

import typings.rxjs.mod.Observable_
import typings.std.Event
import typings.std.Record
import typings.vue.optionsMod.WatchOptions
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import typings.vueRx.anon.Msg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vue-rx", JSImport.Default)
  @js.native
  def default(V: VueConstructor[Vue]): Unit = js.native
  
  type Observables = Record[String, Observable_[js.Any]]
  
  @js.native
  trait WatchObservable[T] extends StObject {
    
    var newValue: T = js.native
    
    var oldValue: T = js.native
  }
  object WatchObservable {
    
    @scala.inline
    def apply[T](newValue: T, oldValue: T): WatchObservable[T] = {
      val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[WatchObservable[T]]
    }
    
    @scala.inline
    implicit class WatchObservableMutableBuilder[Self <: WatchObservable[_], T] (val x: Self with WatchObservable[T]) extends AnyVal {
      
      @scala.inline
      def setNewValue(value: T): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldValue(value: T): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    }
  }
  
  object vueTypesOptionsAugmentingMod {
    
    @js.native
    trait ComponentOptions[V /* <: Vue */] extends StObject {
      
      var domStreams: js.UndefOr[js.Array[String]] = js.native
      
      var observableMethods: js.UndefOr[js.Array[String] | (Record[String, String])] = js.native
      
      var subscriptions: js.UndefOr[Observables | (js.ThisFunction0[/* this */ V, Observables])] = js.native
    }
    object ComponentOptions {
      
      @scala.inline
      def apply[V /* <: Vue */](): ComponentOptions[V] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ComponentOptions[V]]
      }
      
      @scala.inline
      implicit class ComponentOptionsMutableBuilder[Self <: ComponentOptions[_], V /* <: Vue */] (val x: Self with ComponentOptions[V]) extends AnyVal {
        
        @scala.inline
        def setDomStreams(value: js.Array[String]): Self = StObject.set(x, "domStreams", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDomStreamsUndefined: Self = StObject.set(x, "domStreams", js.undefined)
        
        @scala.inline
        def setDomStreamsVarargs(value: String*): Self = StObject.set(x, "domStreams", js.Array(value :_*))
        
        @scala.inline
        def setObservableMethods(value: js.Array[String] | (Record[String, String])): Self = StObject.set(x, "observableMethods", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObservableMethodsUndefined: Self = StObject.set(x, "observableMethods", js.undefined)
        
        @scala.inline
        def setObservableMethodsVarargs(value: String*): Self = StObject.set(x, "observableMethods", js.Array(value :_*))
        
        @scala.inline
        def setSubscriptions(value: Observables | (js.ThisFunction0[/* this */ V, Observables])): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
      }
    }
  }
  
  object vueTypesVueAugmentingMod {
    
    @js.native
    trait Vue extends StObject {
      
      @JSName("$createObservableMethod")
      def $createObservableMethod(methodName: String): Observable_[_] = js.native
      
      @JSName("$eventToObservable")
      def $eventToObservable(event: String): Observable_[Msg] = js.native
      
      @JSName("$fromDOMEvent")
      def $fromDOMEvent(selector: String, event: String): Observable_[Event] = js.native
      @JSName("$fromDOMEvent")
      def $fromDOMEvent(selector: Null, event: String): Observable_[Event] = js.native
      
      @JSName("$observables")
      var $observables: Observables = js.native
      
      @JSName("$subscribeTo")
      def $subscribeTo[T](observable: Observable_[T], next: js.Function1[/* t */ T, Unit]): Unit = js.native
      @JSName("$subscribeTo")
      def $subscribeTo[T](
        observable: Observable_[T],
        next: js.Function1[/* t */ T, Unit],
        error: js.UndefOr[scala.Nothing],
        complete: js.Function0[Unit]
      ): Unit = js.native
      @JSName("$subscribeTo")
      def $subscribeTo[T](
        observable: Observable_[T],
        next: js.Function1[/* t */ T, Unit],
        error: js.Function1[/* e */ js.Any, Unit]
      ): Unit = js.native
      @JSName("$subscribeTo")
      def $subscribeTo[T](
        observable: Observable_[T],
        next: js.Function1[/* t */ T, Unit],
        error: js.Function1[/* e */ js.Any, Unit],
        complete: js.Function0[Unit]
      ): Unit = js.native
      
      @JSName("$watchAsObservable")
      def $watchAsObservable(expr: String): Observable_[WatchObservable[_]] = js.native
      @JSName("$watchAsObservable")
      def $watchAsObservable(expr: String, options: WatchOptions): Observable_[WatchObservable[_]] = js.native
      @JSName("$watchAsObservable")
      def $watchAsObservable[T](fn: js.ThisFunction0[/* this */ this.type, T]): Observable_[WatchObservable[T]] = js.native
      @JSName("$watchAsObservable")
      def $watchAsObservable[T](fn: js.ThisFunction0[/* this */ this.type, T], options: WatchOptions): Observable_[WatchObservable[T]] = js.native
    }
  }
}
