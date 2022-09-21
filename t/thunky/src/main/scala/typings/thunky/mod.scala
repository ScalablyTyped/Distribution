package typings.thunky

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Delay the evaluation of a paramless async function and cache the result
    * (see [thunk](http://en.wikipedia.org/wiki/Thunk_%28functional_programming%29)).
    *
    * If the thunk callback is called with an `Error` object as the first argument it will not cache the result.
    *
    * @param fn The function to execute.
    *
    * @example
    * import thunky = require('thunky');
    *
    * const test = thunky((callback) => { // the inner function should only accept a callback
    *   console.log('waiting 1s and returning random number');
    *   setTimeout(() => {
    *     callback(Math.random());
    *   }, 1000);
    * });
    *
    * test((num) => {  // inner function is called the first time we call test
    *   console.log(num); // prints random number
    * });
    *
    * test((num) => {  // subsequent calls waits for the first call to finish and return the same value
    *   console.log(num); // prints the same random number as above
    * });
    */
  inline def apply[TFn /* <: js.Function1[/* callback */ js.Function1[/* repeated */ Any, Any], Unit] */](fn: TFn): TFn = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[TFn]
  
  @JSImport("thunky", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
