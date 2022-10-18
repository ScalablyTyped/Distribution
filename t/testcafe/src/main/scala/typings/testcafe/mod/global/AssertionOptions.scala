package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssertionOptions extends StObject {
  
  /**
    * By default, a Promise is not allowed to be passed to an assertion unless it is a selector property
    * or the result of a client function. Setting this property to `true` overrides that default.
    */
  var allowUnawaitedPromise: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The amount of time, in milliseconds, allowed for an assertion to pass before the test fails if a
    * selector property or a client function was used in assertion.
    */
  var timeout: js.UndefOr[Double] = js.undefined
}
object AssertionOptions {
  
  inline def apply(): AssertionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssertionOptions]
  }
  
  extension [Self <: AssertionOptions](x: Self) {
    
    inline def setAllowUnawaitedPromise(value: Boolean): Self = StObject.set(x, "allowUnawaitedPromise", value.asInstanceOf[js.Any])
    
    inline def setAllowUnawaitedPromiseUndefined: Self = StObject.set(x, "allowUnawaitedPromise", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
