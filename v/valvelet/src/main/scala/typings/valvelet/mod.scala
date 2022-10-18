package typings.valvelet

import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Limits the execution rate of a function.
    *
    * It is useful for scenarios such as REST APIs consumption where the amount of requests per unit of time
    * should not exceed a given threshold.
    *
    * @param fn The function to rate limit calls to.
    * @param limit The maximum number of allowed calls per `interval`.
    * @param interval The timespan where `limit` is calculated.
    * @param size The maximum size of the internal queue. Defaults to `2^32 - 1` which is the maximum array size in JavaScript.
    * @returns A function that returns a promise which resolves to the value returned by the original fn function.
    *          When the internal queue is at capacity the returned promise is rejected.
    *
    * @example
    * import valvelet = require('valvelet');
    *
    * const get = valvelet(
    *   function request(i: number): Promise<string> {
    *     return Promise.resolve(`${i} - ${new Date().toISOString()}`);
    *   },
    *   2,
    *   1000
    * );
    *
    * function log(data: any) {
    *   console.log(data);
    * }
    *
    * for (let i = 0; i < 10; i++) {
    *   get(i).then(log);
    * }
    *
    * // 0 - 2016-06-02T20:07:33.843Z
    * // 1 - 2016-06-02T20:07:33.844Z
    * // 2 - 2016-06-02T20:07:34.846Z
    * // 3 - 2016-06-02T20:07:34.846Z
    * // 4 - 2016-06-02T20:07:35.846Z
    * // 5 - 2016-06-02T20:07:35.846Z
    * // 6 - 2016-06-02T20:07:36.848Z
    * // 7 - 2016-06-02T20:07:36.848Z
    * // 8 - 2016-06-02T20:07:37.851Z
    * // 9 - 2016-06-02T20:07:37.851Z
    */
  inline def apply[TFn /* <: js.Function1[/* repeated */ Any, Any] */](fn: TFn, limit: Double, interval: Double): js.Function1[
    /* args */ Parameters[TFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<TFn> extends std.PromiseLike<infer TRetVal> ? std.Promise<TRetVal> : std.Promise<std.ReturnType<TFn>> */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* args */ Parameters[TFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<TFn> extends std.PromiseLike<infer TRetVal> ? std.Promise<TRetVal> : std.Promise<std.ReturnType<TFn>> */ js.Any
  ]]
  inline def apply[TFn /* <: js.Function1[/* repeated */ Any, Any] */](fn: TFn, limit: Double, interval: Double, size: Double): js.Function1[
    /* args */ Parameters[TFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<TFn> extends std.PromiseLike<infer TRetVal> ? std.Promise<TRetVal> : std.Promise<std.ReturnType<TFn>> */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* args */ Parameters[TFn], 
    /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<TFn> extends std.PromiseLike<infer TRetVal> ? std.Promise<TRetVal> : std.Promise<std.ReturnType<TFn>> */ js.Any
  ]]
  
  @JSImport("valvelet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
