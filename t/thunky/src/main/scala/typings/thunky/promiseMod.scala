package typings.thunky

import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promiseMod {
  
  /**
    * Delay the evaluation of an async function and cache the result.
    *
    * @param fn The async function to execute.
    *
    * @example
    * import thunkyp = require('thunky/promise');
    *
    * const ready = thunkyp(async () => {
    *   // ... do async stuff
    *   return 42;
    * });
    *
    * // same semantics as the callback version
    * await ready();
    */
  inline def apply[TFn /* <: js.Function1[/* repeated */ Any, Any] */](fn: TFn): (js.Function1[/* args */ Parameters[TFn], js.Promise[ReturnType[TFn]]]) | TFn = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[(js.Function1[/* args */ Parameters[TFn], js.Promise[ReturnType[TFn]]]) | TFn]
  
  @JSImport("thunky/promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
