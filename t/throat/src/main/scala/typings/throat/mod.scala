package typings.throat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(size: Double): js.Function1[/* fn */ js.Function0[js.Promise[js.Any]], js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].apply(size.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fn */ js.Function0[js.Promise[js.Any]], js.Promise[js.Any]]]
  @scala.inline
  def apply[TResult, TFn /* <: js.Function1[/* repeated */ js.Any, js.Promise[TResult]] */](fn: TFn, size: Double): TFn = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[TFn]
  @scala.inline
  def apply[TResult, TFn /* <: js.Function1[/* repeated */ js.Any, js.Promise[TResult]] */](size: Double, fn: TFn): TFn = (^.asInstanceOf[js.Dynamic].apply(size.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[TFn]
  
  @JSImport("throat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
