package typings.winrt.Windows.Security.Cryptography.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKeyDerivationAlgorithmNamesStatics extends js.Object {
  
  var pbkdf2Md5: String = js.native
  
  var pbkdf2Sha1: String = js.native
  
  var pbkdf2Sha256: String = js.native
  
  var pbkdf2Sha384: String = js.native
  
  var pbkdf2Sha512: String = js.native
  
  var sp800108CtrHmacMd5: String = js.native
  
  var sp800108CtrHmacSha1: String = js.native
  
  var sp800108CtrHmacSha256: String = js.native
  
  var sp800108CtrHmacSha384: String = js.native
  
  var sp800108CtrHmacSha512: String = js.native
  
  var sp80056aConcatMd5: String = js.native
  
  var sp80056aConcatSha1: String = js.native
  
  var sp80056aConcatSha256: String = js.native
  
  var sp80056aConcatSha384: String = js.native
  
  var sp80056aConcatSha512: String = js.native
}
object IKeyDerivationAlgorithmNamesStatics {
  
  @scala.inline
  def apply(
    pbkdf2Md5: String,
    pbkdf2Sha1: String,
    pbkdf2Sha256: String,
    pbkdf2Sha384: String,
    pbkdf2Sha512: String,
    sp800108CtrHmacMd5: String,
    sp800108CtrHmacSha1: String,
    sp800108CtrHmacSha256: String,
    sp800108CtrHmacSha384: String,
    sp800108CtrHmacSha512: String,
    sp80056aConcatMd5: String,
    sp80056aConcatSha1: String,
    sp80056aConcatSha256: String,
    sp80056aConcatSha384: String,
    sp80056aConcatSha512: String
  ): IKeyDerivationAlgorithmNamesStatics = {
    val __obj = js.Dynamic.literal(pbkdf2Md5 = pbkdf2Md5.asInstanceOf[js.Any], pbkdf2Sha1 = pbkdf2Sha1.asInstanceOf[js.Any], pbkdf2Sha256 = pbkdf2Sha256.asInstanceOf[js.Any], pbkdf2Sha384 = pbkdf2Sha384.asInstanceOf[js.Any], pbkdf2Sha512 = pbkdf2Sha512.asInstanceOf[js.Any], sp800108CtrHmacMd5 = sp800108CtrHmacMd5.asInstanceOf[js.Any], sp800108CtrHmacSha1 = sp800108CtrHmacSha1.asInstanceOf[js.Any], sp800108CtrHmacSha256 = sp800108CtrHmacSha256.asInstanceOf[js.Any], sp800108CtrHmacSha384 = sp800108CtrHmacSha384.asInstanceOf[js.Any], sp800108CtrHmacSha512 = sp800108CtrHmacSha512.asInstanceOf[js.Any], sp80056aConcatMd5 = sp80056aConcatMd5.asInstanceOf[js.Any], sp80056aConcatSha1 = sp80056aConcatSha1.asInstanceOf[js.Any], sp80056aConcatSha256 = sp80056aConcatSha256.asInstanceOf[js.Any], sp80056aConcatSha384 = sp80056aConcatSha384.asInstanceOf[js.Any], sp80056aConcatSha512 = sp80056aConcatSha512.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyDerivationAlgorithmNamesStatics]
  }
  
  @scala.inline
  implicit class IKeyDerivationAlgorithmNamesStaticsOps[Self <: IKeyDerivationAlgorithmNamesStatics] (val x: Self) extends AnyVal {
    
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
    def setPbkdf2Md5(value: String): Self = this.set("pbkdf2Md5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPbkdf2Sha1(value: String): Self = this.set("pbkdf2Sha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPbkdf2Sha256(value: String): Self = this.set("pbkdf2Sha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPbkdf2Sha384(value: String): Self = this.set("pbkdf2Sha384", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPbkdf2Sha512(value: String): Self = this.set("pbkdf2Sha512", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSp800108CtrHmacMd5(value: String): Self = this.set("sp800108CtrHmacMd5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSp800108CtrHmacSha1(value: String): Self = this.set("sp800108CtrHmacSha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSp800108CtrHmacSha256(value: String): Self = this.set("sp800108CtrHmacSha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSp800108CtrHmacSha384(value: String): Self = this.set("sp800108CtrHmacSha384", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSp800108CtrHmacSha512(value: String): Self = this.set("sp800108CtrHmacSha512", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSp80056aConcatMd5(value: String): Self = this.set("sp80056aConcatMd5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSp80056aConcatSha1(value: String): Self = this.set("sp80056aConcatSha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSp80056aConcatSha256(value: String): Self = this.set("sp80056aConcatSha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSp80056aConcatSha384(value: String): Self = this.set("sp80056aConcatSha384", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSp80056aConcatSha512(value: String): Self = this.set("sp80056aConcatSha512", value.asInstanceOf[js.Any])
  }
}
