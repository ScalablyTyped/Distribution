package typings.xmldsigjs

import typings.std.CryptoKey
import typings.std.Uint8Array
import typings.xmldsigjs.buildTypesXmlKeyUnderscoreInfosKeyUnderscoreInfoUnderscoreClauseMod.KeyInfoClause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/xml/key_infos/spki_data", JSImport.Namespace)
@js.native
object buildTypesXmlKeyUnderscoreInfosSpkiUnderscoreDataMod extends js.Object {
  @js.native
  class SPKIData () extends KeyInfoClause {
    @JSName("Key")
    var Key_SPKIData: CryptoKey = js.native
    var SPKIexp: Uint8Array | Null = js.native
  }
  
}

