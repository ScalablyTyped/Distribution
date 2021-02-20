package typings.winrt.Windows.Security.Cryptography.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMacAlgorithmNamesStatics extends StObject {
  
  var aesCmac: String = js.native
  
  var hmacMd5: String = js.native
  
  var hmacSha1: String = js.native
  
  var hmacSha256: String = js.native
  
  var hmacSha384: String = js.native
  
  var hmacSha512: String = js.native
}
object IMacAlgorithmNamesStatics {
  
  @scala.inline
  def apply(
    aesCmac: String,
    hmacMd5: String,
    hmacSha1: String,
    hmacSha256: String,
    hmacSha384: String,
    hmacSha512: String
  ): IMacAlgorithmNamesStatics = {
    val __obj = js.Dynamic.literal(aesCmac = aesCmac.asInstanceOf[js.Any], hmacMd5 = hmacMd5.asInstanceOf[js.Any], hmacSha1 = hmacSha1.asInstanceOf[js.Any], hmacSha256 = hmacSha256.asInstanceOf[js.Any], hmacSha384 = hmacSha384.asInstanceOf[js.Any], hmacSha512 = hmacSha512.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMacAlgorithmNamesStatics]
  }
  
  @scala.inline
  implicit class IMacAlgorithmNamesStaticsMutableBuilder[Self <: IMacAlgorithmNamesStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAesCmac(value: String): Self = StObject.set(x, "aesCmac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHmacMd5(value: String): Self = StObject.set(x, "hmacMd5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHmacSha1(value: String): Self = StObject.set(x, "hmacSha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHmacSha256(value: String): Self = StObject.set(x, "hmacSha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHmacSha384(value: String): Self = StObject.set(x, "hmacSha384", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHmacSha512(value: String): Self = StObject.set(x, "hmacSha512", value.asInstanceOf[js.Any])
  }
}
