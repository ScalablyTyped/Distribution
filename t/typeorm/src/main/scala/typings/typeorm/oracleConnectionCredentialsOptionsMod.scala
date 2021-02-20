package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oracleConnectionCredentialsOptionsMod {
  
  @js.native
  trait OracleConnectionCredentialsOptions extends StObject {
    
    /**
      * Embedded TNS Connection String
      */
    val connectString: js.UndefOr[String] = js.native
    
    /**
      * Database name to connect to.
      */
    val database: js.UndefOr[String] = js.native
    
    /**
      * Database host.
      */
    val host: js.UndefOr[String] = js.native
    
    /**
      * Database password.
      */
    val password: js.UndefOr[String] = js.native
    
    /**
      * Database host port.
      */
    val port: js.UndefOr[Double] = js.native
    
    /**
      * Connection SID.
      */
    val sid: js.UndefOr[String] = js.native
    
    /**
      * Connection url where perform connection to.
      */
    val url: js.UndefOr[String] = js.native
    
    /**
      * Database username.
      */
    val username: js.UndefOr[String] = js.native
  }
  object OracleConnectionCredentialsOptions {
    
    @scala.inline
    def apply(): OracleConnectionCredentialsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OracleConnectionCredentialsOptions]
    }
    
    @scala.inline
    implicit class OracleConnectionCredentialsOptionsMutableBuilder[Self <: OracleConnectionCredentialsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectString(value: String): Self = StObject.set(x, "connectString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectStringUndefined: Self = StObject.set(x, "connectString", js.undefined)
      
      @scala.inline
      def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSidUndefined: Self = StObject.set(x, "sid", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}
