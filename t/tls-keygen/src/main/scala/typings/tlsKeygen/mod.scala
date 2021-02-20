package typings.tlsKeygen

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  
  @JSImport("tls-keygen", "ephemeral")
  @js.native
  def ephemeral(options: KeyGenOptions): js.Promise[EphemeralResult] = js.native
  
  @JSImport("tls-keygen", "keygen")
  @js.native
  def keygen(options: KeyGenOptions): js.Promise[KeyGenResult] = js.native
  
  @js.native
  trait EphemeralResult extends StObject {
    
    var cert: Buffer = js.native
    
    var key: Buffer = js.native
  }
  object EphemeralResult {
    
    @scala.inline
    def apply(cert: Buffer, key: Buffer): EphemeralResult = {
      val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[EphemeralResult]
    }
    
    @scala.inline
    implicit class EphemeralResultMutableBuilder[Self <: EphemeralResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCert(value: Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait KeyGenOptions extends StObject {
    
    var cert: js.UndefOr[String] = js.native
    
    var commonName: js.UndefOr[String] = js.native
    
    var entrust: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var subjectAltName: js.UndefOr[js.Array[String]] = js.native
  }
  object KeyGenOptions {
    
    @scala.inline
    def apply(): KeyGenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyGenOptions]
    }
    
    @scala.inline
    implicit class KeyGenOptionsMutableBuilder[Self <: KeyGenOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      @scala.inline
      def setCommonName(value: String): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommonNameUndefined: Self = StObject.set(x, "commonName", js.undefined)
      
      @scala.inline
      def setEntrust(value: Boolean): Self = StObject.set(x, "entrust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntrustUndefined: Self = StObject.set(x, "entrust", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setSubjectAltName(value: js.Array[String]): Self = StObject.set(x, "subjectAltName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectAltNameUndefined: Self = StObject.set(x, "subjectAltName", js.undefined)
      
      @scala.inline
      def setSubjectAltNameVarargs(value: String*): Self = StObject.set(x, "subjectAltName", js.Array(value :_*))
    }
  }
  
  @js.native
  trait KeyGenResult extends StObject {
    
    var cert: String = js.native
    
    var key: String = js.native
  }
  object KeyGenResult {
    
    @scala.inline
    def apply(cert: String, key: String): KeyGenResult = {
      val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyGenResult]
    }
    
    @scala.inline
    implicit class KeyGenResultMutableBuilder[Self <: KeyGenResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
}
