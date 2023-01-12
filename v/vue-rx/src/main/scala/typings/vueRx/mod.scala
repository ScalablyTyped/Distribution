package typings.vueRx

import typings.rxjs.mod.Observable_
import typings.std.Event
import typings.std.Record
import typings.vueRuntimeCore.mod.WatchOptions
import typings.vueRx.anon.Msg
import typings.vueRx.anon.TypeofVue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vue-rx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(V: TypeofVue): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(V.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type Observables = Record[String, Observable_[Any]]
  
  trait WatchObservable[T] extends StObject {
    
    var newValue: T
    
    var oldValue: T
  }
  object WatchObservable {
    
    inline def apply[T](newValue: T, oldValue: T): WatchObservable[T] = {
      val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[WatchObservable[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WatchObservable[?], T] (val x: Self & WatchObservable[T]) extends AnyVal {
      
      inline def setNewValue(value: T): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setOldValue(value: T): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object vueTypesOptionsAugmentingMod {
    
    trait ComponentOptions[V /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any */] extends StObject {
      
      var domStreams: js.UndefOr[js.Array[String]] = js.undefined
      
      var observableMethods: js.UndefOr[js.Array[String] | (Record[String, String])] = js.undefined
      
      var subscriptions: js.UndefOr[Observables | (js.ThisFunction0[/* this */ V, Observables])] = js.undefined
    }
    object ComponentOptions {
      
      inline def apply[V /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any */](): ComponentOptions[V] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ComponentOptions[V]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ComponentOptions[?], V /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any */] (val x: Self & ComponentOptions[V]) extends AnyVal {
        
        inline def setDomStreams(value: js.Array[String]): Self = StObject.set(x, "domStreams", value.asInstanceOf[js.Any])
        
        inline def setDomStreamsUndefined: Self = StObject.set(x, "domStreams", js.undefined)
        
        inline def setDomStreamsVarargs(value: String*): Self = StObject.set(x, "domStreams", js.Array(value*))
        
        inline def setObservableMethods(value: js.Array[String] | (Record[String, String])): Self = StObject.set(x, "observableMethods", value.asInstanceOf[js.Any])
        
        inline def setObservableMethodsUndefined: Self = StObject.set(x, "observableMethods", js.undefined)
        
        inline def setObservableMethodsVarargs(value: String*): Self = StObject.set(x, "observableMethods", js.Array(value*))
        
        inline def setSubscriptions(value: Observables | (js.ThisFunction0[/* this */ V, Observables])): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
        
        inline def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
      }
    }
  }
  
  /* augmented module */
  object vueTypesVueAugmentingMod {
    
    @js.native
    trait Vue extends StObject {
      
      @JSName("$createObservableMethod")
      def $createObservableMethod(methodName: String): Observable_[Any] = js.native
      
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
        error: js.Function1[/* e */ Any, Unit]
      ): Unit = js.native
      @JSName("$subscribeTo")
      def $subscribeTo[T](
        observable: Observable_[T],
        next: js.Function1[/* t */ T, Unit],
        error: js.Function1[/* e */ Any, Unit],
        complete: js.Function0[Unit]
      ): Unit = js.native
      @JSName("$subscribeTo")
      def $subscribeTo[T](
        observable: Observable_[T],
        next: js.Function1[/* t */ T, Unit],
        error: Unit,
        complete: js.Function0[Unit]
      ): Unit = js.native
      
      @JSName("$watchAsObservable")
      def $watchAsObservable(expr: String): Observable_[WatchObservable[Any]] = js.native
      @JSName("$watchAsObservable")
      def $watchAsObservable(expr: String, options: WatchOptions[Boolean]): Observable_[WatchObservable[Any]] = js.native
      @JSName("$watchAsObservable")
      def $watchAsObservable[T](fn: js.ThisFunction0[/* this */ this.type, T]): Observable_[WatchObservable[T]] = js.native
      @JSName("$watchAsObservable")
      def $watchAsObservable[T](fn: js.ThisFunction0[/* this */ this.type, T], options: WatchOptions[Boolean]): Observable_[WatchObservable[T]] = js.native
    }
  }
}
