package typings.stylableUniDriver

import typings.stylableUniDriver.typesMod.ElementRemoteApi
import typings.stylableUniDriver.typesMod.MinimalStylesheet
import typings.stylableUniDriver.typesMod.StateValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/uni-driver/cjs/uni-driver", JSImport.Namespace)
@js.native
object uniDriverMod extends js.Object {
  
  @js.native
  class StylableUnidriverUtil protected () extends js.Object {
    def this(stylesheet: MinimalStylesheet) = this()
    
    var getBaseStateWithParam: js.Any = js.native
    
    def getStateValueFromClassName(cls: String, baseState: String): String = js.native
    
    def getStyleState(base: ElementRemoteApi, stateName: String): js.Promise[String | Boolean | Null] = js.native
    
    def hasStyleState(base: ElementRemoteApi, stateName: String): js.Promise[Boolean] = js.native
    def hasStyleState(base: ElementRemoteApi, stateName: String, param: StateValue): js.Promise[Boolean] = js.native
    
    var stylesheet: js.Any = js.native
  }
}
