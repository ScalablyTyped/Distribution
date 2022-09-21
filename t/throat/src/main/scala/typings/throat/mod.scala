package typings.throat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("throat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a throttle that only allows `size` calls in parallel.
    * Extra calls will be queued until one of the earlier calls completes.
    *
    * To create an exclusive lock, just use a `size` of `1`.
    */
  inline def default(size: Double): js.Function2[
    /* fn */ js.Function1[/* args */ js.Array[Any], js.Promise[Any]], 
    /* args */ js.Array[Any], 
    js.Promise[Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(size.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* fn */ js.Function1[/* args */ js.Array[Any], js.Promise[Any]], 
    /* args */ js.Array[Any], 
    js.Promise[Any]
  ]]
  /**
    * Throttle the given function to only run `size` times in parallel.
    * Extra calls will be queued until one of the earlier calls completes.
    */
  inline def default[TResult, TArgs /* <: js.Array[Any] */](fn: js.Function1[/* args */ TArgs, js.Promise[TResult]], size: Double): js.Function1[/* args */ TArgs, js.Promise[TResult]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ TArgs, js.Promise[TResult]]]
  inline def default[TResult, TArgs /* <: js.Array[Any] */](size: Double, fn: js.Function1[/* args */ TArgs, js.Promise[TResult]]): js.Function1[/* args */ TArgs, js.Promise[TResult]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(size.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ TArgs, js.Promise[TResult]]]
}
