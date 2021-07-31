package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapConnectionCredentialsOptionsMod {
  
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
    
    @scala.inline
    def apply(): SapConnectionCredentialsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SapConnectionCredentialsOptions]
    }
    
    @scala.inline
    implicit class SapConnectionCredentialsOptionsMutableBuilder[Self <: SapConnectionCredentialsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCa(value: String): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      @scala.inline
      def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      @scala.inline
      def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      @scala.inline
      def setEncrypt(value: Boolean): Self = StObject.set(x, "encrypt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptUndefined: Self = StObject.set(x, "encrypt", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setSslValidateCertificate(value: Boolean): Self = StObject.set(x, "sslValidateCertificate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslValidateCertificateUndefined: Self = StObject.set(x, "sslValidateCertificate", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}
