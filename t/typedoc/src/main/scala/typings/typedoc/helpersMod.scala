package typings.typedoc

import typings.typedoc.stackMod.Resource
import typings.typedoc.stackMod.ResourceStack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/utils/resources/helpers", JSImport.Namespace)
@js.native
object helpersMod extends js.Object {
  @js.native
  class Helper () extends Resource {
    var helpers: js.Any = js.native
    def getHelpers(): js.Any = js.native
  }
  
  @js.native
  class HelperStack () extends ResourceStack[Helper] {
    var registeredNames: js.Any = js.native
    def addCoreHelpers(): Unit = js.native
  }
  
}

