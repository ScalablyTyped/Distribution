package typings.tapable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type TapFunction[T /* <: typings.tapable.mod.TapType */, TArg1, TArg2, TArg3, TResult] = js.Function4[
    /* arg1 */ TArg1, 
    /* arg2 */ TArg2, 
    /* arg3 */ TArg3, 
    /* repeated */ js.Any, 
    js.Promise[TResult] | TResult | scala.Unit
  ]
  type TapOptions[TTapType /* <: typings.tapable.mod.TapType */, TArg1, TArg2, TArg3, THookResult] = typings.tapable.anon.Before with ((typings.tapable.anon.`0`[TTapType, TArg1, TArg2, TArg3, THookResult]) | (typings.tapable.anon.FnType[TArg1, TArg2, TArg3, THookResult]) | (typings.tapable.anon.Type[TArg1, TArg2, TArg3, THookResult]) | (typings.tapable.anon.Fn[TArg1, TArg2, TArg3, THookResult]))
  type Tapable = typings.tapable.mod.Tapable_
}
