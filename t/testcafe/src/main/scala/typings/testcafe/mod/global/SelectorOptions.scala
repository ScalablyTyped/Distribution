package typings.testcafe.mod.global

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectorOptions extends StObject {
  
  /**
    * If you need to call a selector from a Node.js callback, assign the current test
    * controller to the `boundTestRun` option.
    */
  var boundTestRun: js.UndefOr[TestController] = js.undefined
  
  /**
    * Use this option to pass functions, variables or objects to selectors initialized with a function.
    * The `dependencies` object's properties are added to the function's scope as variables.
    */
  var dependencies: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
    * The amount of time, in milliseconds, allowed for an element returned by the
    * selector to appear in the DOM before the test fails.
    */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /**
    * `true` to additionally require the returned element to become visible within `options.timeout`.
    */
  var visibilityCheck: js.UndefOr[Boolean] = js.undefined
}
object SelectorOptions {
  
  inline def apply(): SelectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectorOptions] (val x: Self) extends AnyVal {
    
    inline def setBoundTestRun(value: TestController): Self = StObject.set(x, "boundTestRun", value.asInstanceOf[js.Any])
    
    inline def setBoundTestRunUndefined: Self = StObject.set(x, "boundTestRun", js.undefined)
    
    inline def setDependencies(value: StringDictionary[Any]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setVisibilityCheck(value: Boolean): Self = StObject.set(x, "visibilityCheck", value.asInstanceOf[js.Any])
    
    inline def setVisibilityCheckUndefined: Self = StObject.set(x, "visibilityCheck", js.undefined)
  }
}
