package typings.winrt.Windows.Security.Cryptography.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMacAlgorithmNamesStatics extends js.Object {
  var aesCmac: String
  var hmacMd5: String
  var hmacSha1: String
  var hmacSha256: String
  var hmacSha384: String
  var hmacSha512: String
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
    val __obj = js.Dynamic.literal(aesCmac = aesCmac, hmacMd5 = hmacMd5, hmacSha1 = hmacSha1, hmacSha256 = hmacSha256, hmacSha384 = hmacSha384, hmacSha512 = hmacSha512)
  
    __obj.asInstanceOf[IMacAlgorithmNamesStatics]
  }
}

