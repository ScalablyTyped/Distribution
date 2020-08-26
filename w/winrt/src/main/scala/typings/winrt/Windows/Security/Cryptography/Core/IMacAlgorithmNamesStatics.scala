package typings.winrt.Windows.Security.Cryptography.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMacAlgorithmNamesStatics extends js.Object {
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
  implicit class IMacAlgorithmNamesStaticsOps[Self <: IMacAlgorithmNamesStatics] (val x: Self) extends AnyVal {
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
    def setAesCmac(value: String): Self = this.set("aesCmac", value.asInstanceOf[js.Any])
    @scala.inline
    def setHmacMd5(value: String): Self = this.set("hmacMd5", value.asInstanceOf[js.Any])
    @scala.inline
    def setHmacSha1(value: String): Self = this.set("hmacSha1", value.asInstanceOf[js.Any])
    @scala.inline
    def setHmacSha256(value: String): Self = this.set("hmacSha256", value.asInstanceOf[js.Any])
    @scala.inline
    def setHmacSha384(value: String): Self = this.set("hmacSha384", value.asInstanceOf[js.Any])
    @scala.inline
    def setHmacSha512(value: String): Self = this.set("hmacSha512", value.asInstanceOf[js.Any])
  }
  
}

