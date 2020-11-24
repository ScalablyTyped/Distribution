package typings.xmldsigjs

import typings.xmlCore.mod.XmlCollection
import typings.xmldsigjs.keyInfosMod.KeyInfoClause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmldsigjs/build/types/xml/key_info", JSImport.Namespace)
@js.native
object keyInfoMod extends js.Object {
  
  @js.native
  class KeyInfo () extends XmlCollection[KeyInfoClause] {
    
    var Id: String = js.native
  }
}
