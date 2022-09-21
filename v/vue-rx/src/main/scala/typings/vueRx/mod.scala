package typings.vueRx

import typings.std.Record
import typings.vueRuntimeCore.mod.WatchOptions
import typings.vueRx.anon.TypeofVue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vue-rx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(V: TypeofVue): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(V.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type Observables = Record[
    String, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ Any
  ]
  
  trait WatchObservable[T] extends StObject {
    
    var newValue: T
    
    var oldValue: T
  }
  object WatchObservable {
    
    inline def apply[T](newValue: T, oldValue: T): WatchObservable[T] = {
      val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[WatchObservable[T]]
    }
    
    extension [Self <: WatchObservable[?], T](x: Self & WatchObservable[T]) {
      
      inline def setNewValue(value: T): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setOldValue(value: T): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    }
  }
  
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
      
      extension [Self <: ComponentOptions[?], V /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any */](x: Self & ComponentOptions[V]) {
        
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
  
  object vueTypesVueAugmentingMod {
    
    @js.native
    trait Vue extends StObject {
      
      @JSName("$createObservableMethod")
      def $createObservableMethod(methodName: String): Any = js.native
      
      @JSName("$eventToObservable")
      def $eventToObservable(event: String): Any = js.native
      
      @JSName("$fromDOMEvent")
      def $fromDOMEvent(selector: String, event: String): Any = js.native
      @JSName("$fromDOMEvent")
      def $fromDOMEvent(selector: Null, event: String): Any = js.native
      
      @JSName("$observables")
      var $observables: Observables = js.native
      
      @JSName("$subscribeTo")
      def $subscribeTo[T](
        observable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ Any,
        next: js.Function1[/* t */ T, Unit]
      ): Unit = js.native
      @JSName("$subscribeTo")
      def $subscribeTo[T](
        observable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ Any,
        next: js.Function1[/* t */ T, Unit],
        error: js.Function1[/* e */ Any, Unit]
      ): Unit = js.native
      @JSName("$subscribeTo")
      def $subscribeTo[T](
        observable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ Any,
        next: js.Function1[/* t */ T, Unit],
        error: js.Function1[/* e */ Any, Unit],
        complete: js.Function0[Unit]
      ): Unit = js.native
      @JSName("$subscribeTo")
      def $subscribeTo[T](
        observable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ Any,
        next: js.Function1[/* t */ T, Unit],
        error: Unit,
        complete: js.Function0[Unit]
      ): Unit = js.native
      
      @JSName("$watchAsObservable")
      def $watchAsObservable(expr: String): Any = js.native
      @JSName("$watchAsObservable")
      def $watchAsObservable(expr: String, options: WatchOptions[Boolean]): Any = js.native
      @JSName("$watchAsObservable")
      def $watchAsObservable[T](fn: js.ThisFunction0[/* this */ this.type, T]): Any = js.native
      @JSName("$watchAsObservable")
      def $watchAsObservable[T](fn: js.ThisFunction0[/* this */ this.type, T], options: WatchOptions[Boolean]): Any = js.native
    }
  }
}
