package typings.typedoc

import typings.typedoc.stackMod.Resource
import typings.typedoc.stackMod.ResourceOrigin
import typings.typedoc.stackMod.ResourceStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("typedoc/dist/lib/output/utils/resources/helpers", "Helper")
  @js.native
  class Helper protected () extends Resource {
    def this(origin: ResourceOrigin[_], name: String, fileName: String) = this()
    
    def getHelpers(): js.Any = js.native
    
    var helpers: js.Any = js.native
  }
  
  @JSImport("typedoc/dist/lib/output/utils/resources/helpers", "HelperStack")
  @js.native
  class HelperStack () extends ResourceStack[Helper] {
    
    def addCoreHelpers(): Unit = js.native
    
    var registeredNames: js.Any = js.native
  }
}
