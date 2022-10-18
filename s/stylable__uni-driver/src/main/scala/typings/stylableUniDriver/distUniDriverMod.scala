package typings.stylableUniDriver

import typings.stylableUniDriver.distTypesMod.ElementRemoteApi
import typings.stylableUniDriver.distTypesMod.MinimalStylesheet
import typings.stylableUniDriver.distTypesMod.StateValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUniDriverMod {
  
  @JSImport("@stylable/uni-driver/dist/uni-driver", "StylableUnidriverUtil")
  @js.native
  open class StylableUnidriverUtil protected () extends StObject {
    def this(stylesheet: MinimalStylesheet) = this()
    
    /* private */ var getBaseStateWithParam: Any = js.native
    
    def getStateValueFromClassName(cls: String, baseState: String): String = js.native
    
    def getStyleState(base: ElementRemoteApi, stateName: String): js.Promise[String | Boolean | Null] = js.native
    
    def hasStyleState(base: ElementRemoteApi, stateName: String): js.Promise[Boolean] = js.native
    def hasStyleState(base: ElementRemoteApi, stateName: String, param: StateValue): js.Promise[Boolean] = js.native
    
    /* private */ var stylesheet: Any = js.native
  }
}
