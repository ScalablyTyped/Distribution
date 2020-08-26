package typings.throat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("throat", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Create a throttle that only allows `size` calls in parallel.
    * Extra calls will be queued until one of the earlier calls completes.
    *
    * To create an exclusive lock, just use a `size` of `1`.
    */
  def default(size: Double): js.Function2[
    /* fn */ js.Function1[/* args */ js.Array[js.Any], js.Promise[_]], 
    /* args */ js.Array[js.Any], 
    js.Promise[_]
  ] = js.native
  /**
    * Throttle the given function to only run `size` times in parallel.
    * Extra calls will be queued until one of the earlier calls completes.
    */
  def default[TResult, TArgs /* <: js.Array[_] */](fn: js.Function1[/* args */ TArgs, js.Promise[TResult]], size: Double): js.Function1[/* args */ TArgs, js.Promise[TResult]] = js.native
  def default[TResult, TArgs /* <: js.Array[_] */](size: Double, fn: js.Function1[/* args */ TArgs, js.Promise[TResult]]): js.Function1[/* args */ TArgs, js.Promise[TResult]] = js.native
}

