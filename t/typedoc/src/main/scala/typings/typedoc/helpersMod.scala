package typings.typedoc

import typings.typedoc.stackMod.Resource
import typings.typedoc.stackMod.ResourceStack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/output/utils/resources/helpers", JSImport.Namespace)
@js.native
object helpersMod extends js.Object {
  
  @js.native
  class Helper () extends Resource {
    
    def getHelpers(): js.Any = js.native
    
    var helpers: js.Any = js.native
  }
  
  @js.native
  class HelperStack () extends ResourceStack[Helper] {
    
    def addCoreHelpers(): Unit = js.native
    
    var registeredNames: js.Any = js.native
  }
}
