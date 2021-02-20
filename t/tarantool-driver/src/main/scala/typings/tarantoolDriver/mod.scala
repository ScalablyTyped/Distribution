package typings.tarantoolDriver

import typings.node.eventsMod.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tarantool-driver", JSImport.Namespace)
  @js.native
  class ^ protected () extends TarantoolConnection {
    def this(options: TarantoolOptions) = this()
  }
  
  @js.native
  trait TarantoolConnection extends EventEmitter {
    
    def call(functionName: String, args: js.Any*): js.Promise[_] = js.native
    
    /* Connection */
    def connect(): js.Promise[Unit] = js.native
    
    def delete(spaceId: String, indexId: String, key: js.Array[_]): js.Promise[_] = js.native
    def delete(spaceId: String, indexId: Double, key: js.Array[_]): js.Promise[_] = js.native
    def delete(spaceId: Double, indexId: String, key: js.Array[_]): js.Promise[_] = js.native
    def delete(spaceId: Double, indexId: Double, key: js.Array[_]): js.Promise[_] = js.native
    
    def destroy(): Unit = js.native
    
    def disconnect(): Unit = js.native
    def disconnect(reconnect: Boolean): Unit = js.native
    
    def eval(expression: String, args: js.Any*): js.Promise[_] = js.native
    
    def flushQueue(cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
    
    def insert(spaceId: String, tuple: js.Array[_]): js.Promise[_] = js.native
    def insert(spaceId: Double, tuple: js.Array[_]): js.Promise[_] = js.native
    
    def replace(spaceId: String, tuple: js.Array[_]): js.Promise[_] = js.native
    def replace(spaceId: Double, tuple: js.Array[_]): js.Promise[_] = js.native
    
    def select(
      spaceId: String,
      indexId: String,
      limit: Double,
      offset: Double,
      iterator: String,
      key: js.Array[_]
    ): js.Promise[_] = js.native
    def select(
      spaceId: String,
      indexId: Double,
      limit: Double,
      offset: Double,
      iterator: String,
      key: js.Array[_]
    ): js.Promise[_] = js.native
    def select(
      spaceId: Double,
      indexId: String,
      limit: Double,
      offset: Double,
      iterator: String,
      key: js.Array[_]
    ): js.Promise[_] = js.native
    /* Commands */
    def select(
      spaceId: Double,
      indexId: Double,
      limit: Double,
      offset: Double,
      iterator: String,
      key: js.Array[_]
    ): js.Promise[_] = js.native
    
    def update(spaceId: String, indexId: String, key: js.Array[_], ops: js.Array[_]): js.Promise[_] = js.native
    def update(spaceId: String, indexId: Double, key: js.Array[_], ops: js.Array[_]): js.Promise[_] = js.native
    def update(spaceId: Double, indexId: String, key: js.Array[_], ops: js.Array[_]): js.Promise[_] = js.native
    def update(spaceId: Double, indexId: Double, key: js.Array[_], ops: js.Array[_]): js.Promise[_] = js.native
    
    def upsert(spaceId: String, ops: js.Array[_], tuple: js.Array[_]): js.Promise[_] = js.native
    def upsert(spaceId: Double, ops: js.Array[_], tuple: js.Array[_]): js.Promise[_] = js.native
  }
  
  @js.native
  trait TarantoolOptions extends StObject {
    
    var beforeReserve: js.UndefOr[Double] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var lazyConnect: js.UndefOr[Boolean] = js.native
    
    var password: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var reserveHosts: js.UndefOr[js.Array[String]] = js.native
    
    var retryStrategy: js.UndefOr[js.Function1[/* times */ Double, Double]] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var username: js.UndefOr[String] = js.native
  }
  object TarantoolOptions {
    
    @scala.inline
    def apply(): TarantoolOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TarantoolOptions]
    }
    
    @scala.inline
    implicit class TarantoolOptionsMutableBuilder[Self <: TarantoolOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeforeReserve(value: Double): Self = StObject.set(x, "beforeReserve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeReserveUndefined: Self = StObject.set(x, "beforeReserve", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setLazyConnect(value: Boolean): Self = StObject.set(x, "lazyConnect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyConnectUndefined: Self = StObject.set(x, "lazyConnect", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setReserveHosts(value: js.Array[String]): Self = StObject.set(x, "reserveHosts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReserveHostsUndefined: Self = StObject.set(x, "reserveHosts", js.undefined)
      
      @scala.inline
      def setReserveHostsVarargs(value: String*): Self = StObject.set(x, "reserveHosts", js.Array(value :_*))
      
      @scala.inline
      def setRetryStrategy(value: /* times */ Double => Double): Self = StObject.set(x, "retryStrategy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRetryStrategyUndefined: Self = StObject.set(x, "retryStrategy", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}
