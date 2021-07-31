package typings.waterline.mod

import typings.bluebird.anon.FnCall
import typings.bluebird.mod.Bluebird
import typings.bluebird.mod.CatchFilter
import typings.bluebird.mod.ConcurrencyOption
import typings.bluebird.mod.Constructor
import typings.bluebird.mod.Disposer
import typings.bluebird.mod.Inspection
import typings.bluebird.mod.IterateFunction
import typings.bluebird.mod.Resolvable
import typings.bluebird.mod.SpreadOption
import typings.std.Error
import typings.std.Map
import typings.std.ReturnType
import typings.waterline.waterlineStrings.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined waterline.waterline.WaterlinePromise<T> & {fetch (): waterline.waterline.CRUDBuilder<T>} */
@js.native
trait CRUDBuilder[T] extends StObject {
  
  /**
    * Same as calling `Promise.all(thisPromise)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
    */
  def all(): Bluebird[scala.Nothing] = js.native
  @JSName("all")
  def all_R[R](): Bluebird[js.Array[R]] = js.native
  @JSName("all")
  def all_T1[T1](): Bluebird[js.Array[T1]] = js.native
  @JSName("all")
  def all_T1T2[T1, T2](): Bluebird[js.Tuple2[T1, T2]] = js.native
  @JSName("all")
  def all_T1T2T3[T1, T2, T3](): Bluebird[js.Tuple3[T1, T2, T3]] = js.native
  @JSName("all")
  def all_T1T2T3T4[T1, T2, T3, T4](): Bluebird[js.Tuple4[T1, T2, T3, T4]] = js.native
  /**
    * Same as calling `Promise.all(thisPromise)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
    */
  @JSName("all")
  def all_T1T2T3T4T5[T1, T2, T3, T4, T5](): Bluebird[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
  
  /**
    * Same as calling `Promise.any(thisPromise)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
    */
  def any(): Bluebird[scala.Nothing] = js.native
  /**
    * Same as calling `Promise.any(thisPromise)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
    */
  @JSName("any")
  def any_Q[Q](): Bluebird[Q] = js.native
  
  def asCallback(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[T], Unit]): this.type = js.native
  def asCallback(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[T], Unit], options: SpreadOption): this.type = js.native
  def asCallback(sink: js.Any*): this.type = js.native
  
  /**
    * Create a promise that follows this promise, but is bound to the given `thisArg` value.
    * A bound promise will call its handlers with the bound value set to `this`.
    *
    * Additionally promises derived from a bound promise will also be bound promises with the same `thisArg` binding as the original promise.
    */
  def bind(thisArg: js.Any): Bluebird[T] = js.native
  
  /**
    * This is a convenience method for doing:
    *
    * <code>
    * promise.then(function(obj){
    *     return obj[propertyName].call(obj, arg...);
    * });
    * </code>
    */
  def call[U /* <: /* keyof Q */ String */, Q](propertyName: U, args: js.Any*): Bluebird[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: Q[U] */ js.Any
    ]
  ] = js.native
  
  /**
    * Cancel this `promise`. Will not do anything if this promise is already settled or if the cancellation feature has not been enabled
    */
  def cancel(): Unit = js.native
  
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def `catch`[U](): Bluebird[U | T] = js.native
  def `catch`[U](onReject: js.Function1[/* error */ js.Any, Resolvable[U]]): Bluebird[U | T] = js.native
  def `catch`[U, E1](
    // tslint:disable-next-line:unified-signatures
  filter1: CatchFilter[E1],
    onReject: js.Function1[/* error */ E1, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1](filter1: Constructor[E1], onReject: js.Function1[/* error */ E1, Resolvable[U]]): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This extends `.catch` to work more like catch-clauses in languages like Java or C#.
    *
    * Instead of manually checking `instanceof` or `.name === "SomeError"`,
    * you may specify a number of error constructors which are eligible for this catch handler.
    * The catch handler that is first met that has eligible constructors specified, is the one that will be called.
    *
    * This method also supports predicate-based filters.
    * If you pass a predicate function instead of an error constructor, the predicate will receive the error as an argument.
    * The return result of the predicate will be used determine whether the error handler should be called.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def `catch`[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    filter5: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    filter5: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    filter5: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    filter5: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](filter1: CatchFilter[Error], filter2: CatchFilter[Error], filter3: CatchFilter[Error], value: U): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    filter5: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    filter5: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    filter5: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    filter5: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](filter1: CatchFilter[Error], filter2: CatchFilter[Error], filter3: Constructor[Error], value: U): Bluebird[T | U] = js.native
  def catchReturn[U](filter1: CatchFilter[Error], filter2: CatchFilter[Error], value: U): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    filter5: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    filter5: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    filter5: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    filter5: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](filter1: CatchFilter[Error], filter2: Constructor[Error], filter3: CatchFilter[Error], value: U): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    filter5: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    filter5: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    filter5: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    filter5: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](filter1: CatchFilter[Error], filter2: Constructor[Error], filter3: Constructor[Error], value: U): Bluebird[T | U] = js.native
  def catchReturn[U](filter1: CatchFilter[Error], filter2: Constructor[Error], value: U): Bluebird[T | U] = js.native
  def catchReturn[U](// tslint:disable-next-line:unified-signatures
  filter1: CatchFilter[Error], value: U): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    filter5: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    filter5: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    filter5: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    filter5: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](filter1: Constructor[Error], filter2: CatchFilter[Error], filter3: CatchFilter[Error], value: U): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    filter5: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    filter5: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    filter5: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    filter5: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](filter1: Constructor[Error], filter2: CatchFilter[Error], filter3: Constructor[Error], value: U): Bluebird[T | U] = js.native
  def catchReturn[U](filter1: Constructor[Error], filter2: CatchFilter[Error], value: U): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    filter5: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    filter5: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    filter5: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    filter5: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](filter1: Constructor[Error], filter2: Constructor[Error], filter3: CatchFilter[Error], value: U): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    filter5: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    filter5: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    filter5: CatchFilter[Error],
    value: U
  ): Bluebird[T | U] = js.native
  // No need to be specific about Error types in these overrides, since there's no handler function
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    filter5: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    value: U
  ): Bluebird[T | U] = js.native
  def catchReturn[U](filter1: Constructor[Error], filter2: Constructor[Error], filter3: Constructor[Error], value: U): Bluebird[T | U] = js.native
  def catchReturn[U](filter1: Constructor[Error], filter2: Constructor[Error], value: U): Bluebird[T | U] = js.native
  def catchReturn[U](filter1: Constructor[Error], value: U): Bluebird[T | U] = js.native
  /**
    * Convenience method for:
    *
    * <code>
    * .catch(function() {
    *    return value;
    * });
    * </code>
    *
    * in the case where `value` doesn't change its value. That means `value` is bound at the time of calling `.catchReturn()`
    */
  def catchReturn[U](value: U): Bluebird[T | U] = js.native
  
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    filter5: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    filter5: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    filter5: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    filter5: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    filter5: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    filter5: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    filter5: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    filter5: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(filter1: CatchFilter[Error], filter2: CatchFilter[Error], reason: Error): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    filter5: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    filter5: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    filter5: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    filter5: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    filter5: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    filter5: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    filter5: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    filter5: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: CatchFilter[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(filter1: CatchFilter[Error], filter2: Constructor[Error], reason: Error): Bluebird[T] = js.native
  def catchThrow(// tslint:disable-next-line:unified-signatures
  filter1: CatchFilter[Error], reason: Error): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    filter5: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    filter5: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    filter5: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    filter5: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    filter5: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    filter5: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    filter5: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    filter5: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: CatchFilter[Error],
    filter3: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(filter1: Constructor[Error], filter2: CatchFilter[Error], reason: Error): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    filter5: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    filter5: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    filter5: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    filter5: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    filter4: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    filter5: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    filter5: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    filter5: CatchFilter[Error],
    reason: Error
  ): Bluebird[T] = js.native
  // No need to be specific about Error types in these overrides, since there's no handler function
  def catchThrow(
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    filter5: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    filter4: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(
    filter1: Constructor[Error],
    filter2: Constructor[Error],
    filter3: Constructor[Error],
    reason: Error
  ): Bluebird[T] = js.native
  def catchThrow(filter1: Constructor[Error], filter2: Constructor[Error], reason: Error): Bluebird[T] = js.native
  def catchThrow(filter1: Constructor[Error], reason: Error): Bluebird[T] = js.native
  /**
    * Convenience method for:
    *
    * <code>
    * .catch(function() {
    *    throw reason;
    * });
    * </code>
    * Same limitations apply as with `.catchReturn()`.
    */
  def catchThrow(reason: Error): Bluebird[T] = js.native
  
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U](): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U](onReject: js.Function1[/* error */ js.Any, Resolvable[U]]): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1](
    // tslint:disable-next-line:unified-signatures
  filter1: CatchFilter[E1],
    onReject: js.Function1[/* error */ E1, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1](filter1: Constructor[E1], onReject: js.Function1[/* error */ E1, Resolvable[U]]): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  def caught[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | T] = js.native
  /**
    * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
    *
    * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
    *
    * Alias `.caught();` for compatibility with earlier ECMAScript version.
    */
  @JSName("caught")
  var caught_Original: FnCall[T] = js.native
  
  /**
    * Same as calling `Promise.delay(ms, this)`.
    */
  def delay(ms: Double): Bluebird[T] = js.native
  
  /**
    * A meta method used to specify the disposer method that cleans up a resource when using `Promise.using`.
    *
    * Returns a Disposer object which encapsulates both the resource as well as the method to clean it up.
    *  The user can pass this object to `Promise.using` to get access to the resource when it becomes available,
    *  as well as to ensure its automatically cleaned up.
    *
    * The second argument passed to a disposer is the result promise of the using block, which you can
    *  inspect synchronously.
    */
  def disposer(disposeFn: js.Function2[/* arg */ T, /* promise */ Bluebird[T], Resolvable[Unit]]): Disposer[T] = js.native
  
  /**
    * Like `.then()`, but any unhandled rejection that ends up here will be thrown as an error.
    */
  def done[U](): Unit = js.native
  def done[U](onFulfilled: js.Function1[/* value */ T, Resolvable[U]]): Unit = js.native
  def done[U](
    onFulfilled: js.Function1[/* value */ T, Resolvable[U]],
    onRejected: js.Function1[/* error */ js.Any, Resolvable[U]]
  ): Unit = js.native
  def done[U](onFulfilled: Unit, onRejected: js.Function1[/* error */ js.Any, Resolvable[U]]): Unit = js.native
  
  /**
    * Same as calling ``Bluebird.each(thisPromise, iterator)``. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
    */
  def each[Q](iterator: IterateFunction[Q, js.Any]): Bluebird[T] = js.native
  
  /**
    * Like `.catch` but instead of catching all types of exceptions,
    * it only catches those that don't originate from thrown errors but rather from explicit rejections.
    */
  def error[U](onReject: js.Function1[/* reason */ js.Any, Resolvable[U]]): Bluebird[U] = js.native
  
  def exec(cb: js.Function2[/* err */ Error, /* result */ T, js.Any]): Unit = js.native
  
  def fetch(): CRUDBuilder[T] = js.native
  
  /**
    * Same as calling ``Promise.filter(thisPromise, filterer)``. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
    */
  def filter[Q](filterer: IterateFunction[Q, Boolean]): Bluebird[T] = js.native
  def filter[Q](filterer: IterateFunction[Q, Boolean], options: ConcurrencyOption): Bluebird[T] = js.native
  
  /**
    * Pass a handler that will be called regardless of this promise's fate. Returns a new promise chained from this promise.
    *
    * There are special semantics for `.finally()` in that the final value cannot be modified from the handler.
    *
    * Alias `.lastly();` for compatibility with earlier ECMAScript version.
    */
  def `finally`(handler: js.Function0[Resolvable[js.Any]]): Bluebird[T] = js.native
  
  /**
    * This is a convenience method for doing:
    *
    * <code>
    * promise.then(function(obj){
    *     return obj[propertyName];
    * });
    * </code>
    */
  def get[U /* <: /* keyof T */ String */](key: U): Bluebird[
    /* import warning: importer.ImportType#apply Failed type conversion: T[U] */ js.Any
  ] = js.native
  
  /**
    * See if this `promise` has been cancelled.
    */
  def isCancelled(): Boolean = js.native
  
  /**
    * See if this `promise` has been fulfilled.
    */
  def isFulfilled(): Boolean = js.native
  
  /**
    * See if this `promise` is still defer.
    */
  def isPending(): Boolean = js.native
  
  /**
    * See if this `promise` has been rejected.
    */
  def isRejected(): Boolean = js.native
  
  /**
    * See if this `promise` is resolved -> either fulfilled or rejected.
    */
  def isResolved(): Boolean = js.native
  
  def lastly(handler: js.Function0[Resolvable[js.Any]]): Bluebird[T] = js.native
  @JSName("lastly")
  var lastly_Original: js.Function1[/* handler */ js.Function0[Resolvable[js.Any]], Bluebird[T]] = js.native
  
  /**
    * Same as calling `Bluebird.map(thisPromise, mapper)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
    */
  def map[U, Q](mapper: IterateFunction[Q, U]): Bluebird[js.Array[U]] = js.native
  def map[U, Q](mapper: IterateFunction[Q, U], options: ConcurrencyOption): Bluebird[js.Array[U]] = js.native
  
  /**
    * Same as calling ``Bluebird.mapSeries(thisPromise, iterator)``. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
    */
  def mapSeries[U, Q](iterator: IterateFunction[Q, U]): Bluebird[js.Array[U]] = js.native
  
  /**
    * Register a node-style callback on this promise.
    *
    * When this promise is is either fulfilled or rejected,
    * the node callback will be called back with the node.js convention
    * where error reason is the first argument and success value is the second argument.
    *
    * The error argument will be `null` in case of success.
    * If the `callback` argument is not a function, this method does not do anything.
    */
  def nodeify(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[T], Unit]): this.type = js.native
  def nodeify(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[T], Unit], options: SpreadOption): this.type = js.native
  def nodeify(sink: js.Any*): this.type = js.native
  
  def props[T](): Bluebird[T] = js.native
  /**
    * Same as calling `Promise.props(thisPromise)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
    */
  @JSName("props")
  def props_KV[K, V](): Bluebird[Map[K, V]] = js.native
  
  /**
    * Same as calling `Promise.race(thisPromise, count)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
    */
  def race(): Bluebird[scala.Nothing] = js.native
  /**
    * Same as calling `Promise.race(thisPromise, count)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
    */
  @JSName("race")
  def race_Q[Q](): Bluebird[Q] = js.native
  
  /**
    * Get the rejection reason for the underlying promise. Throws if the promise isn't rejected yet.
    *
    * throws `TypeError`
    */
  def reason(): js.Any = js.native
  
  /**
    * Same as calling `Promise.reduce(thisPromise, Function reducer, initialValue)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
    */
  def reduce[U, Q](
    reducer: js.Function4[/* memo */ U, /* item */ Q, /* index */ Double, /* arrayLength */ Double, Resolvable[U]]
  ): Bluebird[U] = js.native
  def reduce[U, Q](
    reducer: js.Function4[/* memo */ U, /* item */ Q, /* index */ Double, /* arrayLength */ Double, Resolvable[U]],
    initialValue: U
  ): Bluebird[U] = js.native
  
  /**
    * Synchronously inspect the state of this `promise`. The `PromiseInspection` will represent the state of
    * the promise as snapshotted at the time of calling `.reflect()`.
    */
  def reflect(): Bluebird[Inspection[T]] = js.native
  
  /**
    * Convenience method for:
    *
    * <code>
    * .then(function() {
    *    return value;
    * });
    * </code>
    *
    * in the case where `value` doesn't change its value. That means `value` is bound at the time of calling `.return()`
    *
    * Alias `.thenReturn();` for compatibility with earlier ECMAScript version.
    */
  def `return`(): Bluebird[Unit] = js.native
  def `return`[U](value: U): Bluebird[U] = js.native
  
  /**
    * Same as calling `Promise.some(thisPromise)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
    * Same as calling `Promise.some(thisPromise)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
    */
  def some(count: Double): Bluebird[scala.Nothing] = js.native
  /**
    * Same as calling `Promise.some(thisPromise)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
    * Same as calling `Promise.some(thisPromise)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
    */
  @JSName("some")
  def some_Q[Q](count: Double): Bluebird[T] = js.native
  
  /**
    * Like calling `.then`, but the fulfillment value or rejection reason is assumed to be an array, which is flattened to the formal parameters of the handlers.
    */
  def spread[U, Q](fulfilledHandler: js.Function1[/* repeated */ Q, Resolvable[U]]): Bluebird[U] = js.native
  
  /**
    * Basically sugar for doing: somePromise.catch(function(){});
    *
    * Which is needed in case error handlers are attached asynchronously to the promise later, which would otherwise result in premature unhandled rejection reporting.
    */
  def suppressUnhandledRejections(): Unit = js.native
  
  /**
    * Like `.finally()`, but not called for rejections.
    */
  def tap(onFulFill: js.Function1[/* value */ T, Resolvable[js.Any]]): Bluebird[T] = js.native
  
  /**
    * Like `.catch()` but rethrows the error
    */
  def tapCatch(onReject: js.Function1[/* error */ js.UndefOr[js.Any], Resolvable[js.Any]]): Bluebird[T] = js.native
  def tapCatch[E1](
    // tslint:disable-next-line:unified-signatures
  filter1: CatchFilter[E1],
    onReject: js.Function1[/* error */ E1, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1](filter1: Constructor[E1], onReject: js.Function1[/* error */ E1, Resolvable[js.Any]]): Bluebird[T] = js.native
  def tapCatch[E1, E2](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    onReject: js.Function1[/* error */ E1 | E2, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    onReject: js.Function1[/* error */ E1 | E2, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    onReject: js.Function1[/* error */ E1 | E2, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    onReject: js.Function1[/* error */ E1 | E2, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  def tapCatch[E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[js.Any]]
  ): Bluebird[T] = js.native
  
  /**
    * Promises/A+ `.then()`. Returns a new promise chained from this promise.
    *
    * The new promise will be rejected or resolved depending on the passed `fulfilledHandler`, `rejectedHandler` and the state of this promise.
    */
  // Based on PromiseLike.then, but returns a Bluebird instance.
  def `then`[U](): Bluebird[U] = js.native
  def `then`[U](onFulfill: js.Function1[/* value */ T, Resolvable[U]]): Bluebird[U] = js.native
  def `then`[U](
    onFulfill: js.Function1[/* value */ T, Resolvable[U]],
    onReject: js.Function1[/* error */ js.Any, Resolvable[U]]
  ): Bluebird[U] = js.native
  def `then`[U](onFulfill: Unit, onReject: js.Function1[/* error */ js.Any, Resolvable[U]]): Bluebird[U] = js.native
  def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, Resolvable[TResult2]]): Bluebird[TResult1 | TResult2] = js.native
  
  def thenReturn(): Bluebird[Unit] = js.native
  def thenReturn[U](value: U): Bluebird[U] = js.native
  
  def thenThrow(reason: Error): Bluebird[scala.Nothing] = js.native
  
  // For simpler signature help.
  @JSName("then")
  def then_TResult1TResult2[TResult1, TResult2](): Bluebird[TResult1 | TResult2] = js.native
  @JSName("then")
  def then_TResult1TResult2[TResult1, TResult2](onfulfilled: js.Function1[/* value */ T, Resolvable[TResult1]]): Bluebird[TResult1 | TResult2] = js.native
  @JSName("then")
  def then_TResult1TResult2[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ T, Resolvable[TResult1]],
    onrejected: js.Function1[/* reason */ js.Any, Resolvable[TResult2]]
  ): Bluebird[TResult1 | TResult2] = js.native
  @JSName("then")
  def then_TResult1TResult2[TResult1, TResult2](onfulfilled: Unit, onrejected: js.Function1[/* reason */ js.Any, Resolvable[TResult2]]): Bluebird[TResult1 | TResult2] = js.native
  /**
    * Attaches callbacks for the resolution and/or rejection of the Promise.
    * @param onfulfilled The callback to execute when the Promise is resolved.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of which ever callback is executed.
    */
  @JSName("then")
  def then_TResult1TResult2_Thenable[TResult1, TResult2](): js.Thenable[TResult1 | TResult2] = js.native
  @JSName("then")
  def then_TResult1TResult2_Thenable[TResult1, TResult2](onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]]): js.Thenable[TResult1 | TResult2] = js.native
  @JSName("then")
  def then_TResult1TResult2_Thenable[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): js.Thenable[TResult1 | TResult2] = js.native
  @JSName("then")
  def then_TResult1TResult2_Thenable[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): js.Thenable[TResult1 | TResult2] = js.native
  @JSName("then")
  def then_TResult1TResult2_Thenable[TResult1, TResult2](onfulfilled: Unit, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): js.Thenable[TResult1 | TResult2] = js.native
  
  /**
    * Convenience method for:
    *
    * <code>
    * .then(function() {
    *    throw reason;
    * });
    * </code>
    * Same limitations apply as with `.return()`.
    *
    * Alias `.thenThrow();` for compatibility with earlier ECMAScript version.
    */
  def `throw`(reason: Error): Bluebird[scala.Nothing] = js.native
  
  /**
    * Returns a promise that will be fulfilled with this promise's fulfillment value or rejection reason.
    *  However, if this promise is not fulfilled or rejected within ms milliseconds, the returned promise
    *  is rejected with a TimeoutError or the error as the reason.
    *
    * You may specify a custom error message with the `message` parameter.
    */
  def timeout(ms: Double): Bluebird[T] = js.native
  def timeout(ms: Double, message: String): Bluebird[T] = js.native
  def timeout(ms: Double, message: Error): Bluebird[T] = js.native
  
  /**
    * This is implicitly called by `JSON.stringify` when serializing the object. Returns a serialized representation of the `Promise`.
    */
  def toJSON(): js.Object = js.native
  
  @JSName(js.Symbol.toStringTag)
  val toStringTag: Object = js.native
  
  /**
    * Get the fulfillment value of the underlying promise. Throws if the promise isn't fulfilled yet.
    *
    * throws `TypeError`
    */
  def value(): T = js.native
}
