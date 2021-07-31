package typings.xmldsigjs

import typings.std.Algorithm
import typings.std.CryptoKey
import typings.xmldsigjs.xmlObjectMod.XmlSignatureObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyInfoClauseMod {
  
  @JSImport("xmldsigjs/build/types/xml/key_infos/key_info_clause", "KeyInfoClause")
  @js.native
  abstract class KeyInfoClause () extends XmlSignatureObject {
    def this(properties: js.Object) = this()
    
    var Key: CryptoKey | Null = js.native
    
    def exportKey(alg: Algorithm): js.Promise[CryptoKey] = js.native
    
    def importKey(key: CryptoKey): js.Promise[this.type] = js.native
  }
}
