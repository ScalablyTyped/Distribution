package typings.xmldsigjs

import typings.std.Algorithm
import typings.std.CryptoKey
import typings.xmldsigjs.buildTypesXmlXmlObjectMod.XmlSignatureObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesXmlKeyInfosKeyInfoClauseMod {
  
  /* note: abstract class */ @JSImport("xmldsigjs/build/types/xml/key_infos/key_info_clause", "KeyInfoClause")
  @js.native
  open class KeyInfoClause () extends XmlSignatureObject {
    def this(properties: js.Object) = this()
    
    var Key: CryptoKey | Null = js.native
    
    def exportKey(): js.Promise[CryptoKey] = js.native
    def exportKey(alg: Algorithm): js.Promise[CryptoKey] = js.native
    
    def importKey(key: CryptoKey): js.Promise[this.type] = js.native
  }
}
