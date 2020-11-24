package typings.unimodulesReactNativeAdapter.eventEmitterMod

import typings.reactNative.mod.NativeEventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@unimodules/react-native-adapter/build/EventEmitter", "EventEmitter")
@js.native
class EventEmitter protected () extends js.Object {
  def this(nativeModule: NativeModule) = this()
  
  var _eventEmitter: NativeEventEmitter = js.native
  
  var _listenerCount: Double = js.native
  
  var _nativeModule: NativeModule = js.native
  
  def addListener[T](eventName: String, listener: js.Function1[/* event */ T, Unit]): Subscription = js.native
  
  def emit(eventName: String, params: js.Any*): Unit = js.native
  
  def removeAllListeners(eventName: String): Unit = js.native
  
  def removeSubscription(subscription: Subscription): Unit = js.native
}
