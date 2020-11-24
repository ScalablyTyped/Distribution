package typings.xmldsigjs

import typings.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmldsigjs/build/types/xml/digest_method", JSImport.Namespace)
@js.native
object digestMethodMod extends js.Object {
  
  @js.native
  class DigestMethod () extends XmlObject {
    def this(hashNamespace: String) = this()
    
    var Algorithm: String = js.native
  }
}
