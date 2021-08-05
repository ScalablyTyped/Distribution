package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapSapConnectionCredentialsOptionsMod {
  
  trait SapConnectionCredentialsOptions extends StObject {
    
    /**
      * Ca for encrypted connection
      */
    val ca: js.UndefOr[String] = js.undefined
    
    /**
      * Cert for encrypted connection
      */
    val cert: js.UndefOr[String] = js.undefined
    
    /**
      * Database name to connect to.
      */
    val database: js.UndefOr[String] = js.undefined
    
    /**
      * Encrypt database connection
      */
    val encrypt: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Database host.
      */
    val host: js.UndefOr[String] = js.undefined
    
    /**
      * Key for encrypted connection
      */
    val key: js.UndefOr[String] = js.undefined
    
    /**
      * Database password.
      */
    val password: js.UndefOr[String] = js.undefined
    
    /**
      * Database host port.
      */
    val port: js.UndefOr[Double] = js.undefined
    
    /**
      * Validate database certificate
      */
    val sslValidateCertificate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Database username.
      */
    val username: js.UndefOr[String] = js.undefined
  }
  object SapConnectionCredentialsOptions {
    
    inline def apply(): SapConnectionCredentialsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SapConnectionCredentialsOptions]
    }
    
    extension [Self <: SapConnectionCredentialsOptions](x: Self) {
      
      inline def setCa(value: String): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      inline def setEncrypt(value: Boolean): Self = StObject.set(x, "encrypt", value.asInstanceOf[js.Any])
      
      inline def setEncryptUndefined: Self = StObject.set(x, "encrypt", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setSslValidateCertificate(value: Boolean): Self = StObject.set(x, "sslValidateCertificate", value.asInstanceOf[js.Any])
      
      inline def setSslValidateCertificateUndefined: Self = StObject.set(x, "sslValidateCertificate", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}
