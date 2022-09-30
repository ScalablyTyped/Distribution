package typings.xmldsigjs

import typings.xmldsigjs.keyInfosMod.KeyInfoClause
import typings.xmldsigjs.xmlObjectMod.XmlSignatureCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyInfoMod {
  
  @JSImport("xmldsigjs/build/types/xml/key_info", "KeyInfo")
  @js.native
  open class KeyInfo () extends XmlSignatureCollection[KeyInfoClause] {
    def this(properties: js.Object) = this()
    
    var Id: String = js.native
  }
}
