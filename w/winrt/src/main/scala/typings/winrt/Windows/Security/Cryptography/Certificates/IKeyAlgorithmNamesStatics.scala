package typings.winrt.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyAlgorithmNamesStatics extends js.Object {
  var dsa: String
  var ecdh256: String
  var ecdh384: String
  var ecdh521: String
  var ecdsa256: String
  var ecdsa384: String
  var ecdsa521: String
  var rsa: String
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
}

