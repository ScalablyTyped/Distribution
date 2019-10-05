package typings.winrt.Windows.Security.Cryptography.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHashAlgorithmNamesStatics extends js.Object {
  var md5: String
  var sha1: String
  var sha256: String
  var sha384: String
  var sha512: String
}

object IHashAlgorithmNamesStatics {
  @scala.inline
  def apply(md5: String, sha1: String, sha256: String, sha384: String, sha512: String): IHashAlgorithmNamesStatics = {
    val __obj = js.Dynamic.literal(md5 = md5, sha1 = sha1, sha256 = sha256, sha384 = sha384, sha512 = sha512)
  
    __obj.asInstanceOf[IHashAlgorithmNamesStatics]
  }
}

