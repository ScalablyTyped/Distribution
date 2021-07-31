package typings.tinyAsyncPool

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Runs multiple promise-returning & async functions in a limited concurrency pool.
    * It rejects immediately as soon as one of the promises rejects.
    * It resolves when all the promises completes.
    * It calls the iterator function as soon as possible (under concurrency limit).
    *
    * @param poolLimit The pool limit number (>= 1).
    * @param array Input array.
    * @param iteratorFn Iterator function that takes two arguments (array item and the array itself).
    *                   The iterator function should either return a promise or be an async function.
    *
    * @template IN Type of the input array
    * @template OUT Type of the resolves of the promises
    */
  @scala.inline
  def apply[IN, OUT](
    poolLimit: Double,
    array: js.Array[IN],
    iteratorFn: js.Function1[/* generator */ IN, js.Promise[OUT]]
  ): js.Promise[js.Array[OUT]] = (^.asInstanceOf[js.Dynamic].apply(poolLimit.asInstanceOf[js.Any], array.asInstanceOf[js.Any], iteratorFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[OUT]]]
  
  @JSImport("tiny-async-pool", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
