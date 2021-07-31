package typings.xmldsigjs

import typings.std.CryptoKey
import typings.std.Uint8Array
import typings.xmldsigjs.keyInfoClauseMod.KeyInfoClause
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spkiDataMod {
  
  @JSImport("xmldsigjs/build/types/xml/key_infos/spki_data", "SPKIData")
  @js.native
  class SPKIData () extends KeyInfoClause {
    def this(properties: js.Object) = this()
    
    @JSName("Key")
    var Key_SPKIData: CryptoKey = js.native
    
    var SPKIexp: Uint8Array | Null = js.native
  }
}
