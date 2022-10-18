package typings.testcafe.mod.global

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientFunctionOptions extends StObject {
  
  /**
    * If you need to call a client function from a Node.js callback, assign the current test controller to the `boundTestRun` option.
    */
  var boundTestRun: js.UndefOr[TestController] = js.undefined
  
  /**
    *  Contains functions, variables or objects used by the client function internally.
    *  Properties of the `dependencies` object will be added to the client function's scope as variables.
    */
  var dependencies: js.UndefOr[StringDictionary[Any]] = js.undefined
}
object ClientFunctionOptions {
  
  inline def apply(): ClientFunctionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientFunctionOptions]
  }
  
  extension [Self <: ClientFunctionOptions](x: Self) {
    
    inline def setBoundTestRun(value: TestController): Self = StObject.set(x, "boundTestRun", value.asInstanceOf[js.Any])
    
    inline def setBoundTestRunUndefined: Self = StObject.set(x, "boundTestRun", js.undefined)
    
    inline def setDependencies(value: StringDictionary[Any]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
  }
}
