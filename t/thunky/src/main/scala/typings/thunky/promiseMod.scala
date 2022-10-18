package typings.thunky

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
  inline def apply[TFn /* <: js.Function1[/* repeated */ Any, Any] */](fn: TFn): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<TFn> extends std.Promise<any> ? TFn : (args : std.Parameters<TFn>): std.Promise<std.ReturnType<TFn>> */ js.Any = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<TFn> extends std.Promise<any> ? TFn : (args : std.Parameters<TFn>): std.Promise<std.ReturnType<TFn>> */ js.Any]
  
  @JSImport("thunky/promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
