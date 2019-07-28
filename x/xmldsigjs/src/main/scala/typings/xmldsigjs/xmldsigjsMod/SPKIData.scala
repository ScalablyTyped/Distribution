package typings.xmldsigjs.xmldsigjsMod

import typings.std.CryptoKey
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "SPKIData")
@js.native
class SPKIData () extends KeyInfoClause {
  @JSName("Key")
  var Key_SPKIData: CryptoKey = js.native
  var SPKIexp: Uint8Array | Null = js.native
}

