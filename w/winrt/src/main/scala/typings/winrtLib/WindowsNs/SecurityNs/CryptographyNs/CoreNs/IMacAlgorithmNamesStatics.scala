package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMacAlgorithmNamesStatics extends js.Object {
  var aesCmac: java.lang.String
  var hmacMd5: java.lang.String
  var hmacSha1: java.lang.String
  var hmacSha256: java.lang.String
  var hmacSha384: java.lang.String
  var hmacSha512: java.lang.String
}

object IMacAlgorithmNamesStatics {
  @scala.inline
  def apply(
    aesCmac: java.lang.String,
    hmacMd5: java.lang.String,
    hmacSha1: java.lang.String,
    hmacSha256: java.lang.String,
    hmacSha384: java.lang.String,
    hmacSha512: java.lang.String
  ): IMacAlgorithmNamesStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aesCmac")(aesCmac)
    __obj.updateDynamic("hmacMd5")(hmacMd5)
    __obj.updateDynamic("hmacSha1")(hmacSha1)
    __obj.updateDynamic("hmacSha256")(hmacSha256)
    __obj.updateDynamic("hmacSha384")(hmacSha384)
    __obj.updateDynamic("hmacSha512")(hmacSha512)
    __obj.asInstanceOf[IMacAlgorithmNamesStatics]
  }
}

