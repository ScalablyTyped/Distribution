package typings.tsMockito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-mockito/lib/utils/MockableFunctionsFinder", JSImport.Namespace)
@js.native
object mockableFunctionsFinderMod extends js.Object {
  
  @js.native
  class MockableFunctionsFinder () extends js.Object {
    
    var cleanFunctionNameRegex: js.Any = js.native
    
    var excludedFunctionNames: js.Any = js.native
    
    def find(code: String): js.Array[String] = js.native
    
    var functionNameRegex: js.Any = js.native
    
    var isMockable: js.Any = js.native
  }
}
