package typings.winrt.Windows.Security.Cryptography.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHashAlgorithmNamesStatics extends StObject {
  
  var md5: String
  
  var sha1: String
  
  var sha256: String
  
  var sha384: String
  
  var sha512: String
}
object IHashAlgorithmNamesStatics {
  
  @scala.inline
  def apply(md5: String, sha1: String, sha256: String, sha384: String, sha512: String): IHashAlgorithmNamesStatics = {
    val __obj = js.Dynamic.literal(md5 = md5.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any], sha256 = sha256.asInstanceOf[js.Any], sha384 = sha384.asInstanceOf[js.Any], sha512 = sha512.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHashAlgorithmNamesStatics]
  }
  
  @scala.inline
  implicit class IHashAlgorithmNamesStaticsMutableBuilder[Self <: IHashAlgorithmNamesStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMd5(value: String): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha1(value: String): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha384(value: String): Self = StObject.set(x, "sha384", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha512(value: String): Self = StObject.set(x, "sha512", value.asInstanceOf[js.Any])
  }
}
