package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyAlgorithmNamesStatics extends js.Object {
  var dsa: java.lang.String
  var ecdh256: java.lang.String
  var ecdh384: java.lang.String
  var ecdh521: java.lang.String
  var ecdsa256: java.lang.String
  var ecdsa384: java.lang.String
  var ecdsa521: java.lang.String
  var rsa: java.lang.String
}

object IKeyAlgorithmNamesStatics {
  @scala.inline
  def apply(
    dsa: java.lang.String,
    ecdh256: java.lang.String,
    ecdh384: java.lang.String,
    ecdh521: java.lang.String,
    ecdsa256: java.lang.String,
    ecdsa384: java.lang.String,
    ecdsa521: java.lang.String,
    rsa: java.lang.String
  ): IKeyAlgorithmNamesStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dsa")(dsa)
    __obj.updateDynamic("ecdh256")(ecdh256)
    __obj.updateDynamic("ecdh384")(ecdh384)
    __obj.updateDynamic("ecdh521")(ecdh521)
    __obj.updateDynamic("ecdsa256")(ecdsa256)
    __obj.updateDynamic("ecdsa384")(ecdsa384)
    __obj.updateDynamic("ecdsa521")(ecdsa521)
    __obj.updateDynamic("rsa")(rsa)
    __obj.asInstanceOf[IKeyAlgorithmNamesStatics]
  }
}

