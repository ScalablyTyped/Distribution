package typings.tlsKeygen

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tls-keygen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tls-keygen", "defaultCert")
  @js.native
  val defaultCert: String = js.native
  
  @JSImport("tls-keygen", "defaultCommonName")
  @js.native
  val defaultCommonName: String = js.native
  
  @JSImport("tls-keygen", "defaultKey")
  @js.native
  val defaultKey: String = js.native
  
  @JSImport("tls-keygen", "defaultSubjectAltName")
  @js.native
  val defaultSubjectAltName: js.Array[String] = js.native
  
  inline def ephemeral(options: KeyGenOptions): js.Promise[EphemeralResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("ephemeral")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[EphemeralResult]]
  
  inline def keygen(options: KeyGenOptions): js.Promise[KeyGenResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("keygen")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[KeyGenResult]]
  
  trait EphemeralResult extends StObject {
    
    var cert: Buffer
    
    var key: Buffer
  }
  object EphemeralResult {
    
    inline def apply(cert: Buffer, key: Buffer): EphemeralResult = {
      val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[EphemeralResult]
    }
    
    extension [Self <: EphemeralResult](x: Self) {
      
      inline def setCert(value: Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyGenOptions extends StObject {
    
    var cert: js.UndefOr[String] = js.undefined
    
    var commonName: js.UndefOr[String] = js.undefined
    
    var entrust: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var subjectAltName: js.UndefOr[js.Array[String]] = js.undefined
  }
  object KeyGenOptions {
    
    inline def apply(): KeyGenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyGenOptions]
    }
    
    extension [Self <: KeyGenOptions](x: Self) {
      
      inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setCommonName(value: String): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
      
      inline def setCommonNameUndefined: Self = StObject.set(x, "commonName", js.undefined)
      
      inline def setEntrust(value: Boolean): Self = StObject.set(x, "entrust", value.asInstanceOf[js.Any])
      
      inline def setEntrustUndefined: Self = StObject.set(x, "entrust", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setSubjectAltName(value: js.Array[String]): Self = StObject.set(x, "subjectAltName", value.asInstanceOf[js.Any])
      
      inline def setSubjectAltNameUndefined: Self = StObject.set(x, "subjectAltName", js.undefined)
      
      inline def setSubjectAltNameVarargs(value: String*): Self = StObject.set(x, "subjectAltName", js.Array(value :_*))
    }
  }
  
  trait KeyGenResult extends StObject {
    
    var cert: String
    
    var key: String
  }
  object KeyGenResult {
    
    inline def apply(cert: String, key: String): KeyGenResult = {
      val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyGenResult]
    }
    
    extension [Self <: KeyGenResult](x: Self) {
      
      inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
}
