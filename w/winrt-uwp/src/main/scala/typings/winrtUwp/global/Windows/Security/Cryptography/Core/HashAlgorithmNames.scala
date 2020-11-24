package typings.winrtUwp.global.Windows.Security.Cryptography.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains static properties that enable you to retrieve algorithm names that can be used in the OpenAlgorithm method of the HashAlgorithmProvider class. */
@JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmNames")
@js.native
abstract class HashAlgorithmNames ()
  extends typings.winrtUwp.Windows.Security.Cryptography.Core.HashAlgorithmNames
/* static members */
@JSGlobal("Windows.Security.Cryptography.Core.HashAlgorithmNames")
@js.native
object HashAlgorithmNames extends js.Object {
  
  /** Retrieves a string that contains "MD5". */
  var md5: String = js.native
  
  /** Retrieves a string that contains "SHA1". */
  var sha1: String = js.native
  
  /** Retrieves a string that contains "SHA256". */
  var sha256: String = js.native
  
  /** Retrieves a string that contains "SHA384". */
  var sha384: String = js.native
  
  /** Retrieves a string that contains "SHA512". */
  var sha512: String = js.native
}
