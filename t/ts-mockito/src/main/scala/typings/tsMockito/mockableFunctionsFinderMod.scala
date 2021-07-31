package typings.tsMockito

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mockableFunctionsFinderMod {
  
  @JSImport("ts-mockito/lib/utils/MockableFunctionsFinder", "MockableFunctionsFinder")
  @js.native
  class MockableFunctionsFinder () extends StObject {
    
    var cleanFunctionNameRegex: js.Any = js.native
    
    var excludedFunctionNames: js.Any = js.native
    
    def find(code: String): js.Array[String] = js.native
    
    var functionNameRegex: js.Any = js.native
    
    var isMockable: js.Any = js.native
  }
}
