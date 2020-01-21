package typings.winrtUwp.Windows.Security.Cryptography.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains static properties that enable you to retrieve algorithm names that can be used in the OpenAlgorithm method of the MacAlgorithmProvider class. */
@JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmNames")
@js.native
abstract class MacAlgorithmNames () extends js.Object

/* static members */
@JSGlobal("Windows.Security.Cryptography.Core.MacAlgorithmNames")
@js.native
object MacAlgorithmNames extends js.Object {
  /** Retrieves a string that contains "AES_CMAC". */
  var aesCmac: String = js.native
  /** Retrieves a string that contains "HMAC_MD5". */
  var hmacMd5: String = js.native
  /** Retrieves a string that contains "HMAC_SHA1". */
  var hmacSha1: String = js.native
  /** Retrieves a string that contains "HMAC_SHA256". */
  var hmacSha256: String = js.native
  /** Retrieves a string that contains "HMAC_SHA384". */
  var hmacSha384: String = js.native
  /** Retrieves a string that contains "HMAC_SHA512". */
  var hmacSha512: String = js.native
}

