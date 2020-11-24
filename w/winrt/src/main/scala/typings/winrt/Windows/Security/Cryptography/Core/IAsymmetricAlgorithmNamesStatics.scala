package typings.winrt.Windows.Security.Cryptography.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAsymmetricAlgorithmNamesStatics extends js.Object {
  
  var dsaSha1: String = js.native
  
  var dsaSha256: String = js.native
  
  var ecdsaP256Sha256: String = js.native
  
  var ecdsaP384Sha384: String = js.native
  
  var ecdsaP521Sha512: String = js.native
  
  var rsaOaepSha1: String = js.native
  
  var rsaOaepSha256: String = js.native
  
  var rsaOaepSha384: String = js.native
  
  var rsaOaepSha512: String = js.native
  
  var rsaPkcs1: String = js.native
  
  var rsaSignPkcs1Sha1: String = js.native
  
  var rsaSignPkcs1Sha256: String = js.native
  
  var rsaSignPkcs1Sha384: String = js.native
  
  var rsaSignPkcs1Sha512: String = js.native
  
  var rsaSignPssSha1: String = js.native
  
  var rsaSignPssSha256: String = js.native
  
  var rsaSignPssSha384: String = js.native
  
  var rsaSignPssSha512: String = js.native
}
object IAsymmetricAlgorithmNamesStatics {
  
  @scala.inline
  def apply(
    dsaSha1: String,
    dsaSha256: String,
    ecdsaP256Sha256: String,
    ecdsaP384Sha384: String,
    ecdsaP521Sha512: String,
    rsaOaepSha1: String,
    rsaOaepSha256: String,
    rsaOaepSha384: String,
    rsaOaepSha512: String,
    rsaPkcs1: String,
    rsaSignPkcs1Sha1: String,
    rsaSignPkcs1Sha256: String,
    rsaSignPkcs1Sha384: String,
    rsaSignPkcs1Sha512: String,
    rsaSignPssSha1: String,
    rsaSignPssSha256: String,
    rsaSignPssSha384: String,
    rsaSignPssSha512: String
  ): IAsymmetricAlgorithmNamesStatics = {
    val __obj = js.Dynamic.literal(dsaSha1 = dsaSha1.asInstanceOf[js.Any], dsaSha256 = dsaSha256.asInstanceOf[js.Any], ecdsaP256Sha256 = ecdsaP256Sha256.asInstanceOf[js.Any], ecdsaP384Sha384 = ecdsaP384Sha384.asInstanceOf[js.Any], ecdsaP521Sha512 = ecdsaP521Sha512.asInstanceOf[js.Any], rsaOaepSha1 = rsaOaepSha1.asInstanceOf[js.Any], rsaOaepSha256 = rsaOaepSha256.asInstanceOf[js.Any], rsaOaepSha384 = rsaOaepSha384.asInstanceOf[js.Any], rsaOaepSha512 = rsaOaepSha512.asInstanceOf[js.Any], rsaPkcs1 = rsaPkcs1.asInstanceOf[js.Any], rsaSignPkcs1Sha1 = rsaSignPkcs1Sha1.asInstanceOf[js.Any], rsaSignPkcs1Sha256 = rsaSignPkcs1Sha256.asInstanceOf[js.Any], rsaSignPkcs1Sha384 = rsaSignPkcs1Sha384.asInstanceOf[js.Any], rsaSignPkcs1Sha512 = rsaSignPkcs1Sha512.asInstanceOf[js.Any], rsaSignPssSha1 = rsaSignPssSha1.asInstanceOf[js.Any], rsaSignPssSha256 = rsaSignPssSha256.asInstanceOf[js.Any], rsaSignPssSha384 = rsaSignPssSha384.asInstanceOf[js.Any], rsaSignPssSha512 = rsaSignPssSha512.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAsymmetricAlgorithmNamesStatics]
  }
  
  @scala.inline
  implicit class IAsymmetricAlgorithmNamesStaticsOps[Self <: IAsymmetricAlgorithmNamesStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDsaSha1(value: String): Self = this.set("dsaSha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDsaSha256(value: String): Self = this.set("dsaSha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEcdsaP256Sha256(value: String): Self = this.set("ecdsaP256Sha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEcdsaP384Sha384(value: String): Self = this.set("ecdsaP384Sha384", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEcdsaP521Sha512(value: String): Self = this.set("ecdsaP521Sha512", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRsaOaepSha1(value: String): Self = this.set("rsaOaepSha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRsaOaepSha256(value: String): Self = this.set("rsaOaepSha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRsaOaepSha384(value: String): Self = this.set("rsaOaepSha384", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRsaOaepSha512(value: String): Self = this.set("rsaOaepSha512", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRsaPkcs1(value: String): Self = this.set("rsaPkcs1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRsaSignPkcs1Sha1(value: String): Self = this.set("rsaSignPkcs1Sha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRsaSignPkcs1Sha256(value: String): Self = this.set("rsaSignPkcs1Sha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRsaSignPkcs1Sha384(value: String): Self = this.set("rsaSignPkcs1Sha384", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRsaSignPkcs1Sha512(value: String): Self = this.set("rsaSignPkcs1Sha512", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRsaSignPssSha1(value: String): Self = this.set("rsaSignPssSha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRsaSignPssSha256(value: String): Self = this.set("rsaSignPssSha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRsaSignPssSha384(value: String): Self = this.set("rsaSignPssSha384", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRsaSignPssSha512(value: String): Self = this.set("rsaSignPssSha512", value.asInstanceOf[js.Any])
  }
}
