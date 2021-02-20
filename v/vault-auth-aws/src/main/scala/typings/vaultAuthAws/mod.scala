package typings.vaultAuthAws

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vault-auth-aws", JSImport.Namespace)
  @js.native
  class ^ ()
    extends typings.vaultAuthAws.mod.vaultAuthAws {
    def this(config: Config) = this()
  }
  
  @js.native
  trait Config extends StObject {
    
    var apiVersion: js.UndefOr[String] = js.native
    
    var certFilePath: js.UndefOr[String] = js.native
    
    var followAllRedirects: js.UndefOr[Boolean] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var ssl: js.UndefOr[Boolean] = js.native
    
    var sslRejectUnAuthorized: js.UndefOr[Boolean] = js.native
    
    var vaultAppName: js.UndefOr[String] = js.native
    
    var vaultLoginUrl: js.UndefOr[String] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setCertFilePath(value: String): Self = StObject.set(x, "certFilePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertFilePathUndefined: Self = StObject.set(x, "certFilePath", js.undefined)
      
      @scala.inline
      def setFollowAllRedirects(value: Boolean): Self = StObject.set(x, "followAllRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowAllRedirectsUndefined: Self = StObject.set(x, "followAllRedirects", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslRejectUnAuthorized(value: Boolean): Self = StObject.set(x, "sslRejectUnAuthorized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslRejectUnAuthorizedUndefined: Self = StObject.set(x, "sslRejectUnAuthorized", js.undefined)
      
      @scala.inline
      def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      @scala.inline
      def setVaultAppName(value: String): Self = StObject.set(x, "vaultAppName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVaultAppNameUndefined: Self = StObject.set(x, "vaultAppName", js.undefined)
      
      @scala.inline
      def setVaultLoginUrl(value: String): Self = StObject.set(x, "vaultLoginUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVaultLoginUrlUndefined: Self = StObject.set(x, "vaultLoginUrl", js.undefined)
    }
  }
  
  @js.native
  trait Creds extends StObject {
    
    var accessKeyId: js.UndefOr[String] = js.native
    
    var secretAccessKey: js.UndefOr[String] = js.native
    
    var sessionToken: js.UndefOr[String] = js.native
  }
  object Creds {
    
    @scala.inline
    def apply(): Creds = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Creds]
    }
    
    @scala.inline
    implicit class CredsMutableBuilder[Self <: Creds] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessKeyIdUndefined: Self = StObject.set(x, "accessKeyId", js.undefined)
      
      @scala.inline
      def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretAccessKeyUndefined: Self = StObject.set(x, "secretAccessKey", js.undefined)
      
      @scala.inline
      def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var body: String = js.native
    
    var cert: js.UndefOr[Buffer] = js.native
    
    var followAllRedirects: Boolean = js.native
    
    var url: String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(body: String, followAllRedirects: Boolean, url: String): Options = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], followAllRedirects = followAllRedirects.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCert(value: Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      @scala.inline
      def setFollowAllRedirects(value: Boolean): Self = StObject.set(x, "followAllRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait vaultAuthAws extends StObject {
    
    def authenticate(): js.Promise[_] = js.native
    
    def getOptions(creds: Creds): Options = js.native
  }
  object vaultAuthAws {
    
    @scala.inline
    def apply(authenticate: () => js.Promise[_], getOptions: Creds => Options): typings.vaultAuthAws.mod.vaultAuthAws = {
      val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction0(authenticate), getOptions = js.Any.fromFunction1(getOptions))
      __obj.asInstanceOf[typings.vaultAuthAws.mod.vaultAuthAws]
    }
    
    @scala.inline
    implicit class vaultAuthAwsMutableBuilder[Self <: typings.vaultAuthAws.mod.vaultAuthAws] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthenticate(value: () => js.Promise[_]): Self = StObject.set(x, "authenticate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOptions(value: Creds => Options): Self = StObject.set(x, "getOptions", js.Any.fromFunction1(value))
    }
  }
}
