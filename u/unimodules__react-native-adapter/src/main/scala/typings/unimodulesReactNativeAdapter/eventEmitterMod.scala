package typings.unimodulesReactNativeAdapter

import typings.reactNative.mod.NativeEventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventEmitterMod {
  
  @JSImport("@unimodules/react-native-adapter/build/EventEmitter", "EventEmitter")
  @js.native
  class EventEmitter protected () extends StObject {
    def this(nativeModule: NativeModule) = this()
    
    var _eventEmitter: NativeEventEmitter = js.native
    
    var _listenerCount: Double = js.native
    
    var _nativeModule: NativeModule = js.native
    
    def addListener[T](eventName: String, listener: js.Function1[/* event */ T, Unit]): Subscription = js.native
    
    def emit(eventName: String, params: js.Any*): Unit = js.native
    
    def removeAllListeners(eventName: String): Unit = js.native
    
    def removeSubscription(subscription: Subscription): Unit = js.native
  }
  
  @js.native
  trait NativeModule extends StObject {
    
    def addListener(eventName: String): Unit = js.native
    
    def removeListeners(count: Double): Unit = js.native
    
    var startObserving: js.UndefOr[js.Function0[Unit]] = js.native
    
    var stopObserving: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object NativeModule {
    
    @scala.inline
    def apply(addListener: String => Unit, removeListeners: Double => Unit): NativeModule = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), removeListeners = js.Any.fromFunction1(removeListeners))
      __obj.asInstanceOf[NativeModule]
    }
    
    @scala.inline
    implicit class NativeModuleMutableBuilder[Self <: NativeModule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddListener(value: String => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveListeners(value: Double => Unit): Self = StObject.set(x, "removeListeners", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartObserving(value: () => Unit): Self = StObject.set(x, "startObserving", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStartObservingUndefined: Self = StObject.set(x, "startObserving", js.undefined)
      
      @scala.inline
      def setStopObserving(value: () => Unit): Self = StObject.set(x, "stopObserving", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopObservingUndefined: Self = StObject.set(x, "stopObserving", js.undefined)
    }
  }
  
  @js.native
  trait Subscription extends StObject {
    
    def remove(): Unit = js.native
  }
  object Subscription {
    
    @scala.inline
    def apply(remove: () => Unit): Subscription = {
      val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
      __obj.asInstanceOf[Subscription]
    }
    
    @scala.inline
    implicit class SubscriptionMutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    }
  }
}
