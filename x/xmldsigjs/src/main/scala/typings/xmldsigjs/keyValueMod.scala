package typings.xmldsigjs

import typings.xmldsigjs.keyInfoClauseMod.KeyInfoClause
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyValueMod {
  
  @JSImport("xmldsigjs/build/types/xml/key_infos/key_value", "KeyValue")
  @js.native
  class KeyValue () extends KeyInfoClause {
    def this(value: KeyInfoClause) = this()
    
    def Value: KeyInfoClause = js.native
    def Value_=(v: KeyInfoClause): Unit = js.native
    
    var value: KeyInfoClause = js.native
  }
}
