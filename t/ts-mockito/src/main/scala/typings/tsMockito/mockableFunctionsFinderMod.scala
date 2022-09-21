package typings.tsMockito

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mockableFunctionsFinderMod {
  
  @JSImport("ts-mockito/lib/utils/MockableFunctionsFinder", "MockableFunctionsFinder")
  @js.native
  open class MockableFunctionsFinder () extends StObject {
    
    /* private */ var cleanFunctionNameRegex: Any = js.native
    
    /* private */ var excludedFunctionNames: Any = js.native
    
    def find(code: String): js.Array[String] = js.native
    
    /* private */ var functionNameRegex: Any = js.native
    
    /* private */ var isMockable: Any = js.native
  }
}
