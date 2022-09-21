package typings.sweetPubsub

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("sweet-pubsub", JSImport.Namespace)
  @js.native
  val ^ : SweetPubsub = js.native
  
  @js.native
  trait SweetPubsub extends StObject {
    
    def emit(topic: String, arguments: Any*): Any = js.native
    
    def emits(topic: String, arguments: Any*): Any = js.native
    
    def off(callback: js.Function1[/* repeated */ Any, Any]): js.Array[Any] = js.native
    def off(topicOrUnsubscribeLabel: String): js.Array[Any] = js.native
    def off(topicOrUnsubscribeLabel: String, callback: js.Function1[/* repeated */ Any, Any]): js.Array[Any] = js.native
    def off(topic: String, unsubscribeLabel: String): js.Array[Any] = js.native
    
    def on[CBFn /* <: js.Function1[/* repeated */ Any, Any] */](topic: String, callback: CBFn): CBFn = js.native
    def on[CBFn /* <: js.Function1[/* repeated */ Any, Any] */](topic: String, callback: CBFn, priority: Double): CBFn = js.native
    def on[CBFn /* <: js.Function1[/* repeated */ Any, Any] */](topic: String, unsubscribeLabel: String, callback: CBFn): CBFn = js.native
    def on[CBFn /* <: js.Function1[/* repeated */ Any, Any] */](topic: String, unsubscribeLabel: String, callback: CBFn, priority: Double): CBFn = js.native
    
    def once[CBFn /* <: js.Function1[/* repeated */ Any, Any] */](topic: String, callback: CBFn): CBFn = js.native
    def once[CBFn /* <: js.Function1[/* repeated */ Any, Any] */](topic: String, callback: CBFn, priority: Double): CBFn = js.native
    def once[CBFn /* <: js.Function1[/* repeated */ Any, Any] */](topic: String, unsubscribeLabel: String, callback: CBFn): CBFn = js.native
    def once[CBFn /* <: js.Function1[/* repeated */ Any, Any] */](topic: String, unsubscribeLabel: String, callback: CBFn, priority: Double): CBFn = js.native
    
    def pub(topic: String, arguments: Any*): Any = js.native
    
    def pubs(topic: String, arguments: Any*): Any = js.native
    
    def sub[CBFn /* <: js.Function1[/* repeated */ Any, Any] */](topic: String, callback: CBFn): CBFn = js.native
    def sub[CBFn /* <: js.Function1[/* repeated */ Any, Any] */](topic: String, callback: CBFn, priority: Double): CBFn = js.native
    def sub[CBFn /* <: js.Function1[/* repeated */ Any, Any] */](topic: String, unsubscribeLabel: String, callback: CBFn): CBFn = js.native
    def sub[CBFn /* <: js.Function1[/* repeated */ Any, Any] */](topic: String, unsubscribeLabel: String, callback: CBFn, priority: Double): CBFn = js.native
    
    def subOnce[CBFn /* <: js.Function1[/* repeated */ Any, Any] */](topic: String, callback: CBFn): CBFn = js.native
    def subOnce[CBFn /* <: js.Function1[/* repeated */ Any, Any] */](topic: String, callback: CBFn, priority: Double): CBFn = js.native
    def subOnce[CBFn /* <: js.Function1[/* repeated */ Any, Any] */](topic: String, unsubscribeLabel: String, callback: CBFn): CBFn = js.native
    def subOnce[CBFn /* <: js.Function1[/* repeated */ Any, Any] */](topic: String, unsubscribeLabel: String, callback: CBFn, priority: Double): CBFn = js.native
    
    def unsub(callback: js.Function1[/* repeated */ Any, Any]): js.Array[Any] = js.native
    def unsub(topicOrUnsubscribeLabel: String): js.Array[Any] = js.native
    def unsub(topicOrUnsubscribeLabel: String, callback: js.Function1[/* repeated */ Any, Any]): js.Array[Any] = js.native
    def unsub(topic: String, unsubscribeLabel: String): js.Array[Any] = js.native
  }
  
  type _To = SweetPubsub
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: SweetPubsub = ^
}
