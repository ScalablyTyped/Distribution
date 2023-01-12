package typings.vaultAuthAws

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vault-auth-aws", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with typings.vaultAuthAws.mod.vaultAuthAws {
    def this(config: Config) = this()
    
    /* CompleteClass */
    override def authenticate(): js.Promise[Any] = js.native
    
    /* CompleteClass */
    override def getOptions(creds: Creds): Options = js.native
  }
  
  trait Config extends StObject {
    
    var apiVersion: js.UndefOr[String] = js.undefined
    
    var certFilePath: js.UndefOr[String] = js.undefined
    
    var followAllRedirects: js.UndefOr[Boolean] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var ssl: js.UndefOr[Boolean] = js.undefined
    
    var sslRejectUnAuthorized: js.UndefOr[Boolean] = js.undefined
    
    var vaultAppName: js.UndefOr[String] = js.undefined
    
    var vaultLoginUrl: js.UndefOr[String] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setCertFilePath(value: String): Self = StObject.set(x, "certFilePath", value.asInstanceOf[js.Any])
      
      inline def setCertFilePathUndefined: Self = StObject.set(x, "certFilePath", js.undefined)
      
      inline def setFollowAllRedirects(value: Boolean): Self = StObject.set(x, "followAllRedirects", value.asInstanceOf[js.Any])
      
      inline def setFollowAllRedirectsUndefined: Self = StObject.set(x, "followAllRedirects", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      inline def setSslRejectUnAuthorized(value: Boolean): Self = StObject.set(x, "sslRejectUnAuthorized", value.asInstanceOf[js.Any])
      
      inline def setSslRejectUnAuthorizedUndefined: Self = StObject.set(x, "sslRejectUnAuthorized", js.undefined)
      
      inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      inline def setVaultAppName(value: String): Self = StObject.set(x, "vaultAppName", value.asInstanceOf[js.Any])
      
      inline def setVaultAppNameUndefined: Self = StObject.set(x, "vaultAppName", js.undefined)
      
      inline def setVaultLoginUrl(value: String): Self = StObject.set(x, "vaultLoginUrl", value.asInstanceOf[js.Any])
      
      inline def setVaultLoginUrlUndefined: Self = StObject.set(x, "vaultLoginUrl", js.undefined)
    }
  }
  
  trait Creds extends StObject {
    
    var accessKeyId: js.UndefOr[String] = js.undefined
    
    var secretAccessKey: js.UndefOr[String] = js.undefined
    
    var sessionToken: js.UndefOr[String] = js.undefined
  }
  object Creds {
    
    inline def apply(): Creds = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Creds]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Creds] (val x: Self) extends AnyVal {
      
      inline def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyIdUndefined: Self = StObject.set(x, "accessKeyId", js.undefined)
      
      inline def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
      
      inline def setSecretAccessKeyUndefined: Self = StObject.set(x, "secretAccessKey", js.undefined)
      
      inline def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
      
      inline def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var body: String
    
    var cert: js.UndefOr[Buffer] = js.undefined
    
    var followAllRedirects: Boolean
    
    var url: String
  }
  object Options {
    
    inline def apply(body: String, followAllRedirects: Boolean, url: String): Options = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], followAllRedirects = followAllRedirects.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setCert(value: Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setFollowAllRedirects(value: Boolean): Self = StObject.set(x, "followAllRedirects", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait vaultAuthAws extends StObject {
    
    def authenticate(): js.Promise[Any]
    
    def getOptions(creds: Creds): Options
  }
  object vaultAuthAws {
    
    inline def apply(authenticate: () => js.Promise[Any], getOptions: Creds => Options): typings.vaultAuthAws.mod.vaultAuthAws = {
      val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction0(authenticate), getOptions = js.Any.fromFunction1(getOptions))
      __obj.asInstanceOf[typings.vaultAuthAws.mod.vaultAuthAws]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.vaultAuthAws.mod.vaultAuthAws] (val x: Self) extends AnyVal {
      
      inline def setAuthenticate(value: () => js.Promise[Any]): Self = StObject.set(x, "authenticate", js.Any.fromFunction0(value))
      
      inline def setGetOptions(value: Creds => Options): Self = StObject.set(x, "getOptions", js.Any.fromFunction1(value))
    }
  }
}
