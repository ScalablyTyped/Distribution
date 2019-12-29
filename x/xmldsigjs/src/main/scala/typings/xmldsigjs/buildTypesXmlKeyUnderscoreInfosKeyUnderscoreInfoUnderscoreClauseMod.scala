package typings.xmldsigjs

import typings.std.Algorithm
import typings.std.CryptoKey
import typings.xmlDashCore.xmlDashCoreMod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/xml/key_infos/key_info_clause", JSImport.Namespace)
@js.native
object buildTypesXmlKeyUnderscoreInfosKeyUnderscoreInfoUnderscoreClauseMod extends js.Object {
  @js.native
  abstract class KeyInfoClause () extends XmlObject {
    var Key: CryptoKey | Null = js.native
    def exportKey(alg: Algorithm): js.Promise[CryptoKey] = js.native
    def importKey(key: CryptoKey): js.Promise[this.type] = js.native
  }
  
}

