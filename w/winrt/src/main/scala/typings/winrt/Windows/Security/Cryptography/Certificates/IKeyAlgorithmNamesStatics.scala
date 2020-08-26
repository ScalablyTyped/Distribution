package typings.winrt.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeyAlgorithmNamesStatics extends js.Object {
  var dsa: String = js.native
  var ecdh256: String = js.native
  var ecdh384: String = js.native
  var ecdh521: String = js.native
  var ecdsa256: String = js.native
  var ecdsa384: String = js.native
  var ecdsa521: String = js.native
  var rsa: String = js.native
}

object IKeyAlgorithmNamesStatics {
  @scala.inline
  def apply(
    dsa: String,
    ecdh256: String,
    ecdh384: String,
    ecdh521: String,
    ecdsa256: String,
    ecdsa384: String,
    ecdsa521: String,
    rsa: String
  ): IKeyAlgorithmNamesStatics = {
    val __obj = js.Dynamic.literal(dsa = dsa.asInstanceOf[js.Any], ecdh256 = ecdh256.asInstanceOf[js.Any], ecdh384 = ecdh384.asInstanceOf[js.Any], ecdh521 = ecdh521.asInstanceOf[js.Any], ecdsa256 = ecdsa256.asInstanceOf[js.Any], ecdsa384 = ecdsa384.asInstanceOf[js.Any], ecdsa521 = ecdsa521.asInstanceOf[js.Any], rsa = rsa.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyAlgorithmNamesStatics]
  }
  @scala.inline
  implicit class IKeyAlgorithmNamesStaticsOps[Self <: IKeyAlgorithmNamesStatics] (val x: Self) extends AnyVal {
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
    def setDsa(value: String): Self = this.set("dsa", value.asInstanceOf[js.Any])
    @scala.inline
    def setEcdh256(value: String): Self = this.set("ecdh256", value.asInstanceOf[js.Any])
    @scala.inline
    def setEcdh384(value: String): Self = this.set("ecdh384", value.asInstanceOf[js.Any])
    @scala.inline
    def setEcdh521(value: String): Self = this.set("ecdh521", value.asInstanceOf[js.Any])
    @scala.inline
    def setEcdsa256(value: String): Self = this.set("ecdsa256", value.asInstanceOf[js.Any])
    @scala.inline
    def setEcdsa384(value: String): Self = this.set("ecdsa384", value.asInstanceOf[js.Any])
    @scala.inline
    def setEcdsa521(value: String): Self = this.set("ecdsa521", value.asInstanceOf[js.Any])
    @scala.inline
    def setRsa(value: String): Self = this.set("rsa", value.asInstanceOf[js.Any])
  }
  
}

