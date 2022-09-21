package typings.timeLimitPromise

import typings.timeLimitPromise.anon.RejectWith
import typings.timeLimitPromise.anon.ResolveWith
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](promise: js.Promise[T], timeout: Double): js.Promise[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].apply(promise.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[T]]]
  inline def apply[T](promise: js.Promise[T], timeout: Double, opts: RejectWith): js.Promise[T] = (^.asInstanceOf[js.Dynamic].apply(promise.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def apply[T, R](promise: js.Promise[T], timeout: Double, opts: ResolveWith[R]): js.Promise[T | R] = (^.asInstanceOf[js.Dynamic].apply(promise.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T | R]]
  
  @JSImport("time-limit-promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
