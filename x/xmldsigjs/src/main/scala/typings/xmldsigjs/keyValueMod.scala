package typings.xmldsigjs

import typings.xmldsigjs.keyInfoClauseMod.KeyInfoClause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmldsigjs/build/types/xml/key_infos/key_value", JSImport.Namespace)
@js.native
object keyValueMod extends js.Object {
  
  @js.native
  class KeyValue () extends KeyInfoClause {
    def this(value: KeyInfoClause) = this()
    
    def Value: KeyInfoClause = js.native
    def Value_=(v: KeyInfoClause): Unit = js.native
    
    var value: KeyInfoClause = js.native
  }
}
