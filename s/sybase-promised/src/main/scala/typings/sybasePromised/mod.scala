package typings.sybasePromised

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sybase-promised", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with SybasePromised {
    def this(options: ConnectionOptions) = this()
    
    /* CompleteClass */
    override def connect(): js.Promise[this.type] = js.native
    
    /* CompleteClass */
    override def disconnect(): Unit = js.native
    
    /* CompleteClass */
    override def query(sql: String): js.Promise[js.Array[js.Any]] = js.native
  }
  
  trait ConnectionOptions extends StObject {
    
    var dbname: String
    
    var host: String
    
    var logTiming: js.UndefOr[Boolean] = js.undefined
    
    var password: String
    
    var pathToJavaBtidge: js.UndefOr[String] = js.undefined
    
    var port: Double
    
    var username: String
  }
  object ConnectionOptions {
    
    @scala.inline
    def apply(dbname: String, host: String, password: String, port: Double, username: String): ConnectionOptions = {
      val __obj = js.Dynamic.literal(dbname = dbname.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionOptions]
    }
    
    @scala.inline
    implicit class ConnectionOptionsMutableBuilder[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDbname(value: String): Self = StObject.set(x, "dbname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogTiming(value: Boolean): Self = StObject.set(x, "logTiming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogTimingUndefined: Self = StObject.set(x, "logTiming", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathToJavaBtidge(value: String): Self = StObject.set(x, "pathToJavaBtidge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathToJavaBtidgeUndefined: Self = StObject.set(x, "pathToJavaBtidge", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait SybasePromised extends StObject {
    
    def connect(): js.Promise[this.type]
    
    def disconnect(): Unit
    
    def query(sql: String): js.Promise[js.Array[js.Any]]
  }
  object SybasePromised {
    
    @scala.inline
    def apply(
      connect: () => js.Promise[SybasePromised],
      disconnect: () => Unit,
      query: String => js.Promise[js.Array[js.Any]]
    ): SybasePromised = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect), disconnect = js.Any.fromFunction0(disconnect), query = js.Any.fromFunction1(query))
      __obj.asInstanceOf[SybasePromised]
    }
    
    @scala.inline
    implicit class SybasePromisedMutableBuilder[Self <: SybasePromised] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnect(value: () => js.Promise[SybasePromised]): Self = StObject.set(x, "connect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setQuery(value: String => js.Promise[js.Array[js.Any]]): Self = StObject.set(x, "query", js.Any.fromFunction1(value))
    }
  }
}
