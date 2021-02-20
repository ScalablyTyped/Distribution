package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqlserverSqlServerConnectionCredentialsOptionsMod {
  
  @js.native
  trait SqlServerConnectionCredentialsOptions extends StObject {
    
    /**
      * Database name to connect to.
      */
    val database: js.UndefOr[String] = js.native
    
    /**
      * Once you set domain, driver will connect to SQL Server using domain login.
      */
    val domain: js.UndefOr[String] = js.native
    
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
      * Connection url where perform connection to.
      */
    val url: js.UndefOr[String] = js.native
    
    /**
      * Database username.
      */
    val username: js.UndefOr[String] = js.native
  }
  object SqlServerConnectionCredentialsOptions {
    
    @scala.inline
    def apply(): SqlServerConnectionCredentialsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SqlServerConnectionCredentialsOptions]
    }
    
    @scala.inline
    implicit class SqlServerConnectionCredentialsOptionsMutableBuilder[Self <: SqlServerConnectionCredentialsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
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
