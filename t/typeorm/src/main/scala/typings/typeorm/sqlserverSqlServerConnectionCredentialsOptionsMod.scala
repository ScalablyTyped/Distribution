package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqlserverSqlServerConnectionCredentialsOptionsMod {
  
  trait SqlServerConnectionCredentialsOptions extends StObject {
    
    /**
      * Database name to connect to.
      */
    val database: js.UndefOr[String] = js.undefined
    
    /**
      * Once you set domain, driver will connect to SQL Server using domain login.
      */
    val domain: js.UndefOr[String] = js.undefined
    
    /**
      * Database host.
      */
    val host: js.UndefOr[String] = js.undefined
    
    /**
      * Database password.
      */
    val password: js.UndefOr[String] = js.undefined
    
    /**
      * Database host port.
      */
    val port: js.UndefOr[Double] = js.undefined
    
    /**
      * Connection url where perform connection to.
      */
    val url: js.UndefOr[String] = js.undefined
    
    /**
      * Database username.
      */
    val username: js.UndefOr[String] = js.undefined
  }
  object SqlServerConnectionCredentialsOptions {
    
    inline def apply(): SqlServerConnectionCredentialsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SqlServerConnectionCredentialsOptions]
    }
    
    extension [Self <: SqlServerConnectionCredentialsOptions](x: Self) {
      
      inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}
