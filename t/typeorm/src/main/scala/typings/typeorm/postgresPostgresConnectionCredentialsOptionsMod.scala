package typings.typeorm

import typings.node.tlsMod.TlsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postgresPostgresConnectionCredentialsOptionsMod {
  
  @js.native
  trait PostgresConnectionCredentialsOptions extends StObject {
    
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
    val password: js.UndefOr[String | (js.Function0[js.Promise[String] | String])] = js.native
    
    /**
      * Database host port.
      */
    val port: js.UndefOr[Double] = js.native
    
    /**
      * Object with ssl parameters
      */
    val ssl: js.UndefOr[Boolean | TlsOptions] = js.native
    
    /**
      * Connection url where perform connection to.
      */
    val url: js.UndefOr[String] = js.native
    
    /**
      * Database username.
      */
    val username: js.UndefOr[String] = js.native
  }
  object PostgresConnectionCredentialsOptions {
    
    @scala.inline
    def apply(): PostgresConnectionCredentialsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PostgresConnectionCredentialsOptions]
    }
    
    @scala.inline
    implicit class PostgresConnectionCredentialsOptionsMutableBuilder[Self <: PostgresConnectionCredentialsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPassword(value: String | (js.Function0[js.Promise[String] | String])): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordFunction0(value: () => js.Promise[String] | String): Self = StObject.set(x, "password", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setSsl(value: Boolean | TlsOptions): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
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
