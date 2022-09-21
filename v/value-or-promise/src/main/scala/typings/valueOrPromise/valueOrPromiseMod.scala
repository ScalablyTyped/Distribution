package typings.valueOrPromise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueOrPromiseMod {
  
  @JSImport("value-or-promise/build/main/ValueOrPromise", "ValueOrPromise")
  @js.native
  open class ValueOrPromise[T] protected () extends StObject {
    def this(executor: js.Function0[T | js.Thenable[T]]) = this()
    
    def `catch`[TResult](): ValueOrPromise[TResult] = js.native
    def `catch`[TResult](onRejected: js.Function1[/* reason */ Any, TResult | js.Thenable[TResult]]): ValueOrPromise[TResult] = js.native
    
    def resolve(): T | js.Promise[T] = js.native
    
    /* private */ val state: Any = js.native
    
    def `then`[TResult1, TResult2](): ValueOrPromise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onFulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]]): ValueOrPromise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onFulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]],
      onRejected: js.Function1[/* reason */ Any, TResult2 | js.Thenable[TResult2]]
    ): ValueOrPromise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onFulfilled: Null, onRejected: js.Function1[/* reason */ Any, TResult2 | js.Thenable[TResult2]]): ValueOrPromise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onFulfilled: Unit, onRejected: js.Function1[/* reason */ Any, TResult2 | js.Thenable[TResult2]]): ValueOrPromise[TResult1 | TResult2] = js.native
  }
  /* static members */
  object ValueOrPromise {
    
    @JSImport("value-or-promise/build/main/ValueOrPromise", "ValueOrPromise")
    @js.native
    val ^ : js.Any = js.native
    
    inline def all[T](valueOrPromises: js.Array[ValueOrPromise[T]]): ValueOrPromise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(valueOrPromises.asInstanceOf[js.Any]).asInstanceOf[ValueOrPromise[js.Array[T]]]
    inline def all[T1, T2](valueOrPromises: js.Tuple2[ValueOrPromise[T1], ValueOrPromise[T2]]): ValueOrPromise[js.Tuple2[T1, T2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(valueOrPromises.asInstanceOf[js.Any]).asInstanceOf[ValueOrPromise[js.Tuple2[T1, T2]]]
    inline def all[T1, T2, T3](valueOrPromises: js.Tuple3[ValueOrPromise[T1], ValueOrPromise[T2], ValueOrPromise[T3]]): ValueOrPromise[js.Tuple3[T1, T2, T3]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(valueOrPromises.asInstanceOf[js.Any]).asInstanceOf[ValueOrPromise[js.Tuple3[T1, T2, T3]]]
    inline def all[T1, T2, T3, T4](
      valueOrPromises: js.Tuple4[ValueOrPromise[T1], ValueOrPromise[T2], ValueOrPromise[T3], ValueOrPromise[T4]]
    ): ValueOrPromise[js.Tuple4[T1, T2, T3, T4]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(valueOrPromises.asInstanceOf[js.Any]).asInstanceOf[ValueOrPromise[js.Tuple4[T1, T2, T3, T4]]]
    inline def all[T1, T2, T3, T4, T5](
      valueOrPromises: js.Tuple5[
          ValueOrPromise[T1], 
          ValueOrPromise[T2], 
          ValueOrPromise[T3], 
          ValueOrPromise[T4], 
          ValueOrPromise[T5]
        ]
    ): ValueOrPromise[js.Tuple5[T1, T2, T3, T4, T5]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(valueOrPromises.asInstanceOf[js.Any]).asInstanceOf[ValueOrPromise[js.Tuple5[T1, T2, T3, T4, T5]]]
    inline def all[T1, T2, T3, T4, T5, T6](
      valueOrPromises: js.Tuple6[
          ValueOrPromise[T1], 
          ValueOrPromise[T2], 
          ValueOrPromise[T3], 
          ValueOrPromise[T4], 
          ValueOrPromise[T5], 
          ValueOrPromise[T6]
        ]
    ): ValueOrPromise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(valueOrPromises.asInstanceOf[js.Any]).asInstanceOf[ValueOrPromise[js.Tuple6[T1, T2, T3, T4, T5, T6]]]
    inline def all[T1, T2, T3, T4, T5, T6, T7](
      valueOrPromises: js.Tuple7[
          ValueOrPromise[T1], 
          ValueOrPromise[T2], 
          ValueOrPromise[T3], 
          ValueOrPromise[T4], 
          ValueOrPromise[T5], 
          ValueOrPromise[T6], 
          ValueOrPromise[T7]
        ]
    ): ValueOrPromise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(valueOrPromises.asInstanceOf[js.Any]).asInstanceOf[ValueOrPromise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]]]
    inline def all[T1, T2, T3, T4, T5, T6, T7, T8](
      valueOrPromises: js.Tuple8[
          ValueOrPromise[T1], 
          ValueOrPromise[T2], 
          ValueOrPromise[T3], 
          ValueOrPromise[T4], 
          ValueOrPromise[T5], 
          ValueOrPromise[T6], 
          ValueOrPromise[T7], 
          ValueOrPromise[T8]
        ]
    ): ValueOrPromise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(valueOrPromises.asInstanceOf[js.Any]).asInstanceOf[ValueOrPromise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]]]
    inline def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      valueOrPromises: js.Tuple9[
          ValueOrPromise[T1], 
          ValueOrPromise[T2], 
          ValueOrPromise[T3], 
          ValueOrPromise[T4], 
          ValueOrPromise[T5], 
          ValueOrPromise[T6], 
          ValueOrPromise[T7], 
          ValueOrPromise[T8], 
          ValueOrPromise[T9]
        ]
    ): ValueOrPromise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(valueOrPromises.asInstanceOf[js.Any]).asInstanceOf[ValueOrPromise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]]]
    inline def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      valueOrPromises: js.Tuple10[
          ValueOrPromise[T1], 
          ValueOrPromise[T2], 
          ValueOrPromise[T3], 
          ValueOrPromise[T4], 
          ValueOrPromise[T5], 
          ValueOrPromise[T6], 
          ValueOrPromise[T7], 
          ValueOrPromise[T8], 
          ValueOrPromise[T9], 
          ValueOrPromise[T10]
        ]
    ): ValueOrPromise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(valueOrPromises.asInstanceOf[js.Any]).asInstanceOf[ValueOrPromise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]]]
  }
}
