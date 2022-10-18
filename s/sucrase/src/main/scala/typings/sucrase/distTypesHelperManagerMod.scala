package typings.sucrase

import typings.sucrase.distTypesNameManagerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHelperManagerMod {
  
  @JSImport("sucrase/dist/types/HelperManager", "HelperManager")
  @js.native
  open class HelperManager protected () extends StObject {
    def this(nameManager: default) = this()
    
    var createRequireName: String | Null = js.native
    
    def emitHelpers(): String = js.native
    
    def getHelperName(baseName: /* keyof {[name: string] : string} */ String): String = js.native
    
    val nameManager: default = js.native
  }
}
