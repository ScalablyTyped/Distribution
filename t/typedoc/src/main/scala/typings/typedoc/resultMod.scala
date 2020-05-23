package typings.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/result", JSImport.Namespace)
@js.native
object resultMod extends js.Object {
  @js.native
  class Result[T, E] protected () extends js.Object {
    var _data: js.Any = js.native
    def expect(message: String): T = js.native
    def map[T2](func: js.Function1[/* data */ T, T2]): Result[T2, E] = js.native
    def mapErr[E2](func: js.Function1[/* err */ E, E2]): Result[T, E2] = js.native
    def `match`[T2, E2](funcs: typings.typedoc.anon.Err[T, T2, E, E2]): T2 | E2 = js.native
    def unwrap(): T = js.native
    def unwrapErr(): E = js.native
  }
  
  val Err: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Result.Err */ js.Any = js.native
  val Ok: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Result.Ok */ js.Any = js.native
  /* static members */
  @js.native
  object Result extends js.Object {
    def Err[E, T](err: E): Result[T, E] = js.native
    def Ok[T, E](data: T): Result[T, E] = js.native
  }
  
}

